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
import org.eevolution.model.MDDOrder;

//org.topra.callouts.ItemRequesisionApprover.processIt
public class ItemRequesisionApprover extends CalloutEngine {


	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		
		MDDOrder mddOrder = new MDDOrder(ctx, mTab.getRecord_ID(), null);
		
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

				MWFActivity[] activity = this.getWorkFLowActivity(mddOrder);
				// first node
				if (activity == null) {
					mddOrder.setProcessed(true);
					mddOrder.save();
					System.out.println("null");
				} else if (activity.length == 1) { // first node pass
					System.out.println(activity.length);
					this.processWorkFlow(mddOrder);
					mddOrder.setProcessed(true);
					mddOrder.save();
				}
				mddOrder.save();
			}

			mTab.dataRefresh(true);
			return "";
		}

		
	

	private MWFActivity[] getWorkFLowActivity(MDDOrder mddOrder) {

		// get workflow process
		MWFProcess process = new Query(mddOrder.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mddOrder.get_TrxName())
						.setParameters(mddOrder.get_Table_ID(), mddOrder.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mddOrder.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? ", mddOrder.get_TrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MDDOrder mddOrder) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mddOrder.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mddOrder.get_Table_ID(), mddOrder.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mddOrder.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mddOrder.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
}
