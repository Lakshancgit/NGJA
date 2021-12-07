package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MPayment;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;
import org.topra.model.MDDealerLicense;

//org.topra.callouts.PaymentVoucherApprover.processWhenPrintIt
public class PaymentVoucherApprover extends CalloutEngine {

	public String processWhenPrintIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MPayment mPayment = new MPayment(ctx, mTab.getRecord_ID(), null);

		MWFActivity[] activity = this.getWorkFLowActivity(mPayment);
		
		if (activity != null) {
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {
				this.processWorkFlow(mPayment);

			}
		}
		mTab.dataRefresh(true);

		
		return "";
	}

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MPayment mPayment = new MPayment(ctx, mTab.getRecord_ID(), null);

		if (mPayment.getC_DocType_ID() != HardCoded.AdvancePayment_Doctype_ID
				&& mPayment.getC_DocType_ID() != HardCoded.PettyCashPayment_Doctype_ID) {
		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MWFActivity[] activity = this.getWorkFLowActivity(mPayment);
			// first node
			if (activity == null) {
				mPayment.setProcessed(true);
				mPayment.save();
				System.out.println("null");
			} else if (activity.length == 1) { // first node pass
				System.out.println(activity.length);
				this.processWorkFlow(mPayment);
				if (this.getNextNode(mPayment) != null) {// second node is available
					mPayment.processIt(MPayment.DOCACTION_Prepare);
					mPayment.setIsActive(false);
				}
				if (mPayment.getDocStatus().equalsIgnoreCase("VO")) {
					mPayment.setDescription(mPayment.getDocumentNo());
				}
				mPayment.setProcessed(true);
				mPayment.save();

			} else if (activity.length == 2) { // second node pass
				System.out.println(activity.length);
				this.processWorkFlow(mPayment);
				mPayment.set_ValueOfColumn("Status", "CO");
				mPayment.setProcessed(true);
				mPayment.save();
			}
			mPayment.save();
		}

		mTab.dataRefresh(true);}
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MPayment mPayment) {

		// get workflow process
		MWFProcess process = new Query(mPayment.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mPayment.get_TrxName())
						.setParameters(mPayment.get_Table_ID(), mPayment.get_ID()).setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mPayment.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mPayment.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private MWFActivity getNextNode(MPayment po) {

		// get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", po.get_TrxName())
						.setParameters(po.get_Table_ID(), po.get_ID()).setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		MWFActivity activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? AND wfstate='OS'",
				po.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).first();

		return activity;
	}

	private void processWorkFlow(MPayment mPayment) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mPayment.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mPayment.get_Table_ID(), mPayment.get_ID()).setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mPayment.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mPayment.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
}
