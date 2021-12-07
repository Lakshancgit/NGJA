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
import org.topra.model.MCLandOfShares;

public class AuctionLandShareApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		MCLandOfShares landOfShares = new MCLandOfShares(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MWFActivity[] activity = this.getWorkFLowActivity(landOfShares);
			// first node
			if (activity == null) {
				landOfShares.setStatus("IO");
				landOfShares.setProcessed(true);
				landOfShares.save();
			} else if (activity.length == 2) { // first node pass

				this.processWorkFlow(landOfShares);
				landOfShares.setStatus("RM");
				landOfShares.setProcessed(true);
				landOfShares.save();
			} else if (activity.length == 3) { // second node pass
				this.processWorkFlow(landOfShares);
				landOfShares.setStatus("A");
				landOfShares.setProcessed(true);
				landOfShares.save();
			} else if (activity.length == 4) { // third node pass
				this.processWorkFlow(landOfShares);

			}
			landOfShares.save();

		}

		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MCLandOfShares landOfShares) {

		// get workflow process
		MWFProcess process = new Query(landOfShares.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", landOfShares.get_TrxName())
						.setParameters(landOfShares.get_Table_ID(), landOfShares.get_ID()).setOnlyActiveRecords(true)
						.first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(landOfShares.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				landOfShares.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCLandOfShares landOfShares) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(landOfShares.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(landOfShares.get_Table_ID(), landOfShares.get_ID()).setOnlyActiveRecords(true)
						.first();

		MWFActivity activity = new Query(landOfShares.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(landOfShares.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}

}
