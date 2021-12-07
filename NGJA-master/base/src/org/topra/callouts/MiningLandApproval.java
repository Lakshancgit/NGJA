package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCLandDetails;


/**
 * org.topra.callouts.MiningLandApproval.processIt
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 14th of Jun 2019
 */

public class MiningLandApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCLandDetails mcLandDetails = new MCLandDetails(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		StringBuffer stringBuffer = new StringBuffer(
				"SELECT  count(C_MiningObjection_ID)  FROM C_MiningObjection WHERE ObjectionResult='O' AND C_LandDetails_ID="
						+ mcLandDetails.get_ID());
		int count = DB.getSQLValue(mTab.getTrxInfo(), stringBuffer.toString());

		System.out.println(count);
		if (count <= 0) {
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

				MWFActivity[] activity = this.getWorkFLowActivity(mcLandDetails);
				// first node
				if (activity == null) {
					mcLandDetails.setApplicationStatus("RM");
					mcLandDetails.setProcessed(true);
					mcLandDetails.save();
				} else if (activity.length == 2) { // first node pass
					this.processWorkFlow(mcLandDetails);
					mcLandDetails.setApplicationStatus("EO");
					mcLandDetails.setProcessed(true);
					mcLandDetails.save();
				} else if (activity.length == 3) { // second node pass
					this.processWorkFlow(mcLandDetails);
					if (mcLandDetails.getEOCheckedDate()!=null || mcLandDetails.getISEditedByEO()!=null) {
					mcLandDetails.setApplicationStatus("EOA");
					mcLandDetails.setProcessed(true);
					mcLandDetails.save();
					}else {
						throw new AdempiereException("You must fill the mandatory fields!");
					}
				} else if (activity.length == 4) { // third node pass
					
						this.processWorkFlow(mcLandDetails);
						mcLandDetails.setApplicationStatus("RLE");
						mcLandDetails.setProcessed(true);
						mcLandDetails.save();
					
					
				} else if (activity.length == 5) { // third node pass
					this.processWorkFlow(mcLandDetails);

				}
				mcLandDetails.save();

				mTab.dataRefresh();

			} else {

				throw new AdempiereException("Objection has open!");

			}
		}
		return "";

	}

	private MWFActivity[] getWorkFLowActivity(MCLandDetails mcLandDetails) {

		// get workflow process
		MWFProcess process = new Query(mcLandDetails.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mcLandDetails.get_TrxName())
						.setParameters(mcLandDetails.get_Table_ID(), mcLandDetails.get_ID()).setOnlyActiveRecords(true)
						.first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mcLandDetails.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mcLandDetails.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCLandDetails mcLandDetails) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mcLandDetails.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mcLandDetails.get_Table_ID(), mcLandDetails.get_ID()).setOnlyActiveRecords(true)
						.first();

		MWFActivity activity = new Query(mcLandDetails.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mcLandDetails.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
}
