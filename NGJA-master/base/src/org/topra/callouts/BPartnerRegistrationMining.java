package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;

public class BPartnerRegistrationMining extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MBPartner mbPartner = new MBPartner(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if (mbPartner.getC_BP_Group_ID() == 1000009) {
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

//				String status = mbPartner.get_ValueAsString("ApplicationStatus");
//				if (status.equals("P")) {
//					mbPartner.set_ValueOfColumn("ApplicationStatus", "RM");
//					mbPartner.set_ValueOfColumn("Processed", "Y");
//				} else if (status.equals("RM")) {
//					mbPartner.set_ValueOfColumn("ApplicationStatus", "EO");
//					mbPartner.set_ValueOfColumn("Processed", "Y");
//				} else if (status.equals("EO")) {
//					mbPartner.set_ValueOfColumn("ApplicationStatus", "EOA");
//					mbPartner.set_ValueOfColumn("Processed", "Y");
//				} else if (status.equals("EOA")) {
//					mbPartner.set_ValueOfColumn("ApplicationStatus", "RLE");
//					mbPartner.set_ValueOfColumn("Processed", "Y");
//				} else {
//					mbPartner.set_ValueOfColumn("Processed", "Y");
//				}

				MWFActivity[] activity = this.getWorkFLowActivity(mbPartner);
				// first node
				if (activity == null) {
					mbPartner.set_ValueOfColumn("ApplicationStatus", "RM");
					mbPartner.set_ValueOfColumn("Processed", "Y");
				} else if (activity.length == 2) { // first node pass

					this.processWorkFlow(mbPartner);
					mbPartner.set_ValueOfColumn("ApplicationStatus", "EO");
					mbPartner.set_ValueOfColumn("Processed", "Y");
				} else if (activity.length == 3) { // second node pass
					this.processWorkFlow(mbPartner);
					mbPartner.set_ValueOfColumn("ApplicationStatus", "EOA");
					mbPartner.set_ValueOfColumn("Processed", "Y");
				} else if (activity.length == 4) { // third node pass
					this.processWorkFlow(mbPartner);
					mbPartner.set_ValueOfColumn("ApplicationStatus", "RLE");
					mbPartner.set_ValueOfColumn("Processed", "Y");
				} else if (activity.length == 5) { // third node pass
					this.processWorkFlow(mbPartner);
					mbPartner.set_ValueOfColumn("Processed", "Y");
				}
				mbPartner.save();

			}
			mbPartner.save();
			mTab.dataRefresh(true);
		}

		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MBPartner mbPartner) {

		// get workflow process
		MWFProcess process = new Query(mbPartner.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mbPartner.get_TrxName())
						.setParameters(mbPartner.get_Table_ID(), mbPartner.get_ID()).setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mbPartner.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mbPartner.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MBPartner mbPartner) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mbPartner.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mbPartner.get_Table_ID(), mbPartner.get_ID()).setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mbPartner.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mbPartner.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
}
