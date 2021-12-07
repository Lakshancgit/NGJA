package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCExportNGJA;

//org.topra.callouts.ExportWorkflowApproval.processIt
public class ExportWorkflowApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		MCExportNGJA mcExportNGJA = new MCExportNGJA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MWFActivity[] activity = this.getWorkFLowActivity(mcExportNGJA);
			// first node
			if (activity == null) {
				
			} else if (activity.length == 1) { // first node pass
				if (mcExportNGJA.getDocumentStatus().equalsIgnoreCase("")) {
					
				}
				mcExportNGJA.setDocumentStatus("AD");
				mcExportNGJA.setProcessed(true);
				this.processWorkFlow(mcExportNGJA);

			} else if (activity.length == 2) { // second node pass
				mcExportNGJA.setDocumentStatus("SIOA");
				mcExportNGJA.setProcessed(true);
				this.processWorkFlow(mcExportNGJA);

			} else if (activity.length == 3) { // third node pass
				mcExportNGJA.setDocumentStatus("MAC");
				mcExportNGJA.setProcessed(true);
				this.processWorkFlow(mcExportNGJA);

			} else if (activity.length == 4) { // third node pass
				mcExportNGJA.setDocumentStatus("ADF");
				mcExportNGJA.setProcessed(true);
				this.processWorkFlow(mcExportNGJA);

			} else if (activity.length == 5) { // third node pass
				mcExportNGJA.setDocumentStatus("E");
				mcExportNGJA.setProcessed(true);
				this.processWorkFlow(mcExportNGJA);

			}
			mcExportNGJA.setProcessed(true);
			mcExportNGJA.save();
		}

		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MCExportNGJA mcExportNGJA) {

		// get workflow process
		MWFProcess process = new Query(mcExportNGJA.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mcExportNGJA.get_TrxName())
						.setParameters(mcExportNGJA.get_Table_ID(), mcExportNGJA.get_ID()).setOnlyActiveRecords(true)
						.first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mcExportNGJA.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mcExportNGJA.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCExportNGJA mcExportNGJA) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mcExportNGJA.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mcExportNGJA.get_Table_ID(), mcExportNGJA.get_ID()).setOnlyActiveRecords(true)
						.first();

		MWFActivity activity = new Query(mcExportNGJA.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mcExportNGJA.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
}
