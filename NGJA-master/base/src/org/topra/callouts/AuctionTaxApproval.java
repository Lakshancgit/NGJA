package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MInvoice;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCAuctionLicenseFinal;

//org.topra.callouts.AuctionTaxApproval.processIt

public class AuctionTaxApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		MCAuctionLicenseFinal auctionLicenseFinal = new MCAuctionLicenseFinal(ctx, mTab.getRecord_ID(),
				mTab.getTrxInfo());
		MInvoice invoice = new MInvoice(ctx, auctionLicenseFinal.getC_AuctionInvoice_ID(), mTab.getTrxInfo());
		if (invoice.getDocStatus().equalsIgnoreCase("CO")) {
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

				MWFActivity[] activity = this.getWorkFLowActivity(auctionLicenseFinal);
				// first node
				if (activity == null) {
					auctionLicenseFinal.setStatus("SRMA");
					auctionLicenseFinal.setProcessed(true);
					auctionLicenseFinal.save();
				} else if (activity.length == 1) { // first node pass
					this.processWorkFlow(auctionLicenseFinal);
					auctionLicenseFinal.setProcessed(true);
					auctionLicenseFinal.save();
				} else if (activity.length == 2) { // second node pass
					this.processWorkFlow(auctionLicenseFinal);
					auctionLicenseFinal.setStatus("SAC");
					auctionLicenseFinal.setProcessed(true);
					auctionLicenseFinal.save();
				} else if (activity.length == 3) { // third node pass
					this.processWorkFlow(auctionLicenseFinal);
					auctionLicenseFinal.setStatus("PAID");
					auctionLicenseFinal.setProcessed(true);
					auctionLicenseFinal.save();
				}
				auctionLicenseFinal.save();
			}

		} else {
			throw new AdempiereException("Invoice must be completed");
		}

		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MCAuctionLicenseFinal auctionLicenseFinal) {

		// get workflow process
		MWFProcess process = new Query(auctionLicenseFinal.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", auctionLicenseFinal.get_TrxName())
						.setParameters(auctionLicenseFinal.get_Table_ID(), auctionLicenseFinal.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(auctionLicenseFinal.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? ", auctionLicenseFinal.get_TrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCAuctionLicenseFinal auctionLicenseFinal) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(auctionLicenseFinal.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(auctionLicenseFinal.get_Table_ID(), auctionLicenseFinal.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(auctionLicenseFinal.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(auctionLicenseFinal.getCtx()), "");
		activity.save();
	trx.commit();
		trx.close();
	}

}
