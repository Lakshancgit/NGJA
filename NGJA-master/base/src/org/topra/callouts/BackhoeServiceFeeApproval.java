package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MOrder;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCBackhoeServiceFee;


//org.topra.callouts.BackhoeServiceFeeApproval.processIt

public class BackhoeServiceFeeApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		MCBackhoeServiceFee backhoeServiceFee = new MCBackhoeServiceFee(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MWFActivity[] activity = this.getWorkFLowActivity(backhoeServiceFee);
			// first node
			if (activity == null) {
				backhoeServiceFee.setStatus("RM");
				backhoeServiceFee.setProcessed(true);
				backhoeServiceFee.save();
			} else if (activity.length == 2) { // first node pass

				this.processWorkFlow(backhoeServiceFee);
				backhoeServiceFee.setStatus("Cash");
				backhoeServiceFee.setProcessed(true);
				backhoeServiceFee.save();
			} else if (activity.length == 3) { // second node pass
				this.processWorkFlow(backhoeServiceFee);
				MOrder mOrder = new MOrder(ctx, backhoeServiceFee.getC_Order_ID(), mTab.getTrxInfo());

				if (mOrder.getDocStatus().equalsIgnoreCase("CO")) {
					backhoeServiceFee.setStatus("PAID");
					backhoeServiceFee.setProcessed(true);
					backhoeServiceFee.save();
				} else {
					ADialog.error(WindowNo, null, "You have to complete the order first");
				}
			} else if (activity.length == 4) { // third node pass
				this.processWorkFlow(backhoeServiceFee);

			}
			backhoeServiceFee.save();

		}

		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MCBackhoeServiceFee backhoeServiceFee) {

		// get workflow process
		MWFProcess process = new Query(backhoeServiceFee.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", backhoeServiceFee.get_TrxName())
						.setParameters(backhoeServiceFee.get_Table_ID(), backhoeServiceFee.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(backhoeServiceFee.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? ", backhoeServiceFee.get_TrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCBackhoeServiceFee backhoeServiceFee) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(backhoeServiceFee.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(backhoeServiceFee.get_Table_ID(), backhoeServiceFee.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(backhoeServiceFee.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(backhoeServiceFee.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}

}
