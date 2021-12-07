package org.topra.callouts;

import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MInvoice;
import org.compiere.model.MPayment;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;

//org.topra.callouts.VendorInvoice.processIt

public class VendorInvoice extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MInvoice mInvoice = new MInvoice(ctx, mTab.getRecord_ID(), null);
		if (mInvoice.getC_DocTypeTarget_ID() == HardCoded.PettyCashPayment_Doctype_ID )
			return "";

		if (mInvoice.get_ValueAsBoolean("IsRegional")) {
			if (!ADialog.ask(WindowNo, null, "Process Confirmation (Vendor)", "Do I process this?"))
				return "";
			
			MWFActivity[] activity = this.getWorkFLowActivity(mInvoice);
			if (activity == null) { // Workflow initialization
				mInvoice.set_CustomColumn("IsSendWF", true);
				// mInvoice.setProcessed(true);
				mInvoice.setIsActive(false);
			} else if (activity.length == 2) // first node pass
			{
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("RM")) {
					throw new AdempiereException("Please Check the Status!");
				}
				// If Rejected
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("VO")) {
					mInvoice.setDescription(mInvoice.getDocumentNo());
					mInvoice.setDocumentNo("** Voided | ** Voided");
					mInvoice.processIt(MPayment.DOCACTION_Void);
					this.processWorkFlow(mInvoice);
				} else if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("CO")) {
					mInvoice.processIt(MPayment.DOCACTION_Complete);
					mInvoice.set_ValueOfColumn("Status", "CO");
					this.processWorkFlow(mInvoice);
				}
			} else if (activity.length == 3) { // second node pass
				this.processWorkFlow(mInvoice);
			}
			
		}else {
		if (!ADialog.ask(WindowNo, null, "Process Confirmation (Vendor)", "Do I process this?"))
			return "";
		{

			MWFActivity[] activity = this.getWorkFLowActivity(mInvoice);
			// System.out.println(activity.length);

			if (activity == null) { // Workflow initialization
				mInvoice.set_CustomColumn("IsSendWF", true);
				// mInvoice.setProcessed(true);
				mInvoice.setIsActive(false);
			} else if (activity.length == 2) // first node pass
			{
				mInvoice.set_ValueOfColumn("Status", "SO");
				this.processWorkFlow(mInvoice);
				mInvoice.setIsActive(false);
			} else if (activity.length == 3) { // second node pass
				// Validate the status
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("SO")) {
					throw new AdempiereException("Please Check the Status!");
				}
				// If Rejected
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("R")) {
					mInvoice.setDescription(mInvoice.getDocumentNo());
					mInvoice.setDocumentNo("** Voided | ** Voided");
					mInvoice.processIt(MPayment.DOCACTION_Void);
					this.processWorkFlow(mInvoice);
				} else if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("AD")) {
					this.processWorkFlow(mInvoice);
					mInvoice.setIsActive(false);
				}

			} else if (activity.length == 4) {

				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("AD")) {
					throw new AdempiereException("Please Check the Status!");
				}
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("CO")) {

					if (mInvoice.getGrandTotal().compareTo(new BigDecimal("50000")) == -1) {
						mInvoice.processIt(MPayment.DOCACTION_Complete);
						mInvoice.set_ValueOfColumn("Status", "CO");
						this.processWorkFlow(mInvoice);// Complete the document
					} else {
						throw new AdempiereException("The amount is more than 50,000!!");
					}

				} else if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("D")) {
					this.processWorkFlow(mInvoice);
					mInvoice.setIsActive(false);
					mInvoice.set_ValueOfColumn("Status", "D");
				}
			} else if (activity.length == 5 && !mInvoice.get_ValueAsString("Status").equalsIgnoreCase("R"))// forth node
																											// pass
			{
				// Validate the status
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("D")) {
					throw new AdempiereException("Please Check the Status!");
				}
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("CO")) {

					if (mInvoice.getGrandTotal().compareTo(new BigDecimal("200000")) == -1) {
						mInvoice.processIt(MPayment.DOCACTION_Complete);
						mInvoice.set_ValueOfColumn("Status", "CO");
						this.processWorkFlow(mInvoice);// Complete the document
					} else {
						throw new AdempiereException("The amount is more than 200,000!!");
					}

				} else if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("DG")) {
					this.processWorkFlow(mInvoice);
					mInvoice.setIsActive(false);
					mInvoice.set_ValueOfColumn("Status", "DG");
				}
			} else if (activity.length == 6) { // forth node pass
				// Validate the status
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("DG")) {
					throw new AdempiereException("Please Check the Status!");
				}
				if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("CO")) {

					if (mInvoice.getGrandTotal().compareTo(new BigDecimal("3000000")) == -1) {
						mInvoice.processIt(MPayment.DOCACTION_Complete);
						mInvoice.set_ValueOfColumn("Status", "CO");
						this.processWorkFlow(mInvoice);// Complete the document
					} else {
						throw new AdempiereException("The amount is more than 3,000,000!!");
					}

				} else if (mInvoice.get_ValueAsString("Status").equalsIgnoreCase("CEO")) {
					this.processWorkFlow(mInvoice);
					mInvoice.setIsActive(false);
					mInvoice.set_ValueOfColumn("Status", "CEO");
				}
				// this.processWorkFlow(mInvoice);
			} else if (activity.length == 7) { // forth node pass
				mInvoice.set_ValueOfColumn("Status", "CO");
				mInvoice.processIt(MPayment.DOCACTION_Complete); // Complete the document
				this.processWorkFlow(mInvoice);
			}

			mInvoice.save();

			mTab.dataRefresh(true);
		}}
		return "";
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
