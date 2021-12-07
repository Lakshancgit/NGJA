package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
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

/**
 * org.topra.callouts.PaymentApprover.processIt
 * ADVANCE PAYMENT APPROVER
 * @author Lakshan - Topra
 * @version 1.0
 * @date 6th of jan 2021
 */
public class PaymentApprover extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MPayment payment = new MPayment(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		// AP payment approval
		if (payment.getC_DocType_ID() == HardCoded.AdvancePayment_Doctype_ID) {

			if (ADialog.ask(WindowNo, null, "Process Confirmation (Advance Payment)", "Are you sure to send this for workflow?")) {

				MWFActivity[] activity = this.getWorkFLowActivity(payment);
				// first node
				if (activity == null) {
					if (payment.get_ValueAsBoolean("IsRegionalAdvancePayment")) {
						payment.set_ValueOfColumn("WFState", "RM");
					} else {
						payment.set_ValueOfColumn("WFState", "AD");
					}
					payment.setProcessed(true);
				} else if (activity.length == 2) {
					if (payment.get_ValueAsBoolean("IsRegionalAdvancePayment")) {
						payment.set_ValueOfColumn("WFState", "ADF");
					} else {
						payment.set_ValueOfColumn("WFState", "MAFA");
					}
					payment.setProcessed(true);
					this.processWorkFlow(payment);
					
				} else if (activity.length == 3) {
					if (payment.get_ValueAsBoolean("IsRegionalAdvancePayment")) {
						if (payment.get_ValueAsString("WFState").equalsIgnoreCase("VO")) {
							payment.setDescription(payment.getDocumentNo());
							payment.setDocumentNo("** Voided | ** Voided");
							payment.processIt(MPayment.DOCACTION_Void);
							this.processWorkFlow(payment);
						} else if (payment.get_ValueAsString("WFState").equalsIgnoreCase("CO")) {
							payment.processIt(MPayment.DOCACTION_Complete);
							this.processWorkFlow(payment);
						} else {
							throw new AdempiereException("Please Check the Status!");
						}
					} else {
						payment.set_ValueOfColumn("WFState", "ADF");
						this.processWorkFlow(payment);
					}
					
					
					payment.setProcessed(true);
				} else if (activity.length == 4) {
					if (payment.get_ValueAsBoolean("IsRegionalAdvancePayment")) {
						this.processWorkFlow(payment);
					} else {
						if (payment.get_ValueAsString("WFState").equalsIgnoreCase("VO")) {
							payment.setDescription(payment.getDocumentNo());
							payment.setDocumentNo("** Voided | ** Voided");
							payment.processIt(MPayment.DOCACTION_Void);
							this.processWorkFlow(payment);
						} else if (payment.get_ValueAsString("WFState").equalsIgnoreCase("CO")) {
							payment.processIt(MPayment.DOCACTION_Complete);
							this.processWorkFlow(payment);
						} else {
							throw new AdempiereException("Please Check the Status!");
						}
					}

				} else {
					value = false;
				}
			}
		}

		payment.set_ValueOfColumn("SendForApproval", value);
		payment.save();
		mTab.dataRefresh(true);
	}

	private MWFActivity[] getWorkFLowActivity(MPayment po) {

		// get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", po.get_TrxName())
						.setParameters(po.get_Table_ID(), po.get_ID()).setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				po.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

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

	private void processWorkFlow(MPayment po) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(po.get_Table_ID(), po.get_ID()).setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? AND wfstate='OS'",
				trx.getTrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(po.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
}
