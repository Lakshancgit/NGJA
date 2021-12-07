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
import org.topra.model.HardCoded;

/**
 * org.topra.callouts.PettyCashInvoiceApprover.processIt 
 * PETTY CASH INVOICE APPROVER
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 6th of jan 2021
 */
public class PettyCashInvoiceApprover extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MInvoice invoice = new MInvoice(ctx, mTab.getRecord_ID(), null);
		if (invoice.getC_DocTypeTarget_ID() == HardCoded.PettyCashPayment_Doctype_ID) {

			if (ADialog.ask(WindowNo, null, "Process Confirmation (Petty Cash)",
					"Are you sure to send this for workflow?")) {

				MWFActivity[] activity = this.getWorkFLowActivity(invoice);
				// first node
				if (activity == null) {
					invoice.set_CustomColumn("IsSendWF", true);
					if (invoice.get_ValueAsBoolean("IsRegionalPettyCash")) {
						invoice.set_ValueOfColumn("Status", "RM");
					} else {
						invoice.set_ValueOfColumn("Status", "AD");
					}
					invoice.setIsActive(false);
				} else if (activity.length == 2) {
					if (invoice.get_ValueAsBoolean("IsRegionalPettyCash")) {
						invoice.set_ValueOfColumn("Status", "ADF");
					} else {
						invoice.set_ValueOfColumn("Status", "MAFA");
					}
					this.processWorkFlow(invoice);
					invoice.setIsActive(false);
				} else if (activity.length == 3) {
					if (invoice.get_ValueAsBoolean("IsRegionalPettyCash")) {
						if (invoice.get_ValueAsString("Status").equalsIgnoreCase("VO")) {
							invoice.setDescription(invoice.getDocumentNo());
							invoice.setDocumentNo("** Voided | ** Voided");
							invoice.processIt(MInvoice.DOCACTION_Void);
							this.processWorkFlow(invoice);
						} else if (invoice.get_ValueAsString("Status").equalsIgnoreCase("CO")) {
							invoice.processIt(MInvoice.DOCACTION_Complete);
							this.processWorkFlow(invoice);
						} else {
							throw new AdempiereException("Please Check the Status!");
						}
					} else {
						invoice.set_ValueOfColumn("Status", "ADF");
					}
					
					invoice.setIsActive(false);
				} else if (activity.length == 4) {
					if (invoice.get_ValueAsBoolean("IsRegionalPettyCash")) {
						this.processWorkFlow(invoice);
					} else {
						if (invoice.get_ValueAsString("Status").equalsIgnoreCase("VO")) {
							invoice.setDescription(invoice.getDocumentNo());
							invoice.setDocumentNo("** Voided | ** Voided");
							invoice.processIt(MInvoice.DOCACTION_Void);
							this.processWorkFlow(invoice);
						} else if (invoice.get_ValueAsString("Status").equalsIgnoreCase("CO")) {
							invoice.processIt(MInvoice.DOCACTION_Complete);
							this.processWorkFlow(invoice);
						} else {
							throw new AdempiereException("Please Check the Status!");
						}
					}

				} else if (activity.length == 5) {
					this.processWorkFlow(invoice);
				} else {
					invoice.setIsActive(false);
				}
			}
		}

		invoice.save();
		mTab.dataRefresh(true);
		return;
	}

	private MWFActivity[] getWorkFLowActivity(MInvoice mInvoice) {

		// get workflow process
		MWFProcess process = new Query(mInvoice.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mInvoice.get_TrxName())
						.setParameters(mInvoice.get_Table_ID(), mInvoice.get_ID()).setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mInvoice.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mInvoice.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MInvoice mInvoice) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();
		// get workflow process
		MWFProcess process = new Query(mInvoice.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mInvoice.get_TrxName())
						.setParameters(mInvoice.get_Table_ID(), mInvoice.get_ID()).setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mInvoice.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=?  AND wfstate='OS'", mInvoice.get_TrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mInvoice.getCtx()), "");

		activity.save();

		trx.commit();
		trx.close();
	}

}
