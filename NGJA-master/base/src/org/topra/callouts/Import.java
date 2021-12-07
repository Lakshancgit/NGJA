package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MSequence;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;
import org.topra.model.MCImportNGA;
import org.topra.model.MExpReturnSale;

/**
 * org.topra.callouts.Import
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 28th of Mar 2019
 */

public class Import extends CalloutEngine {

	public void GenerateNo(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCImportNGA importNGA = new MCImportNGA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (importNGA.getImportDocStatus().equalsIgnoreCase("IM")) {
			if (importNGA.getC_DocType_ID() == HardCoded.TempImportDocType_ID) {

				if (importNGA.getC_ExportItemType_ID() == HardCoded.ImpTypeRIEJewellaryImport_ID) {

					System.out.println("RIEJ in");
					MSequence mSequence = new MSequence(importNGA.getCtx(), HardCoded.RIEJewellaryImportSeq_ID,
							importNGA.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					importNGA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				} else if (importNGA.getC_ExportItemType_ID() == HardCoded.ImpTypeRIEGemImport_ID) {
					System.out.println("RIEG in");
					MSequence mSequence = new MSequence(importNGA.getCtx(), HardCoded.RIEGemImportSeq_ID,
							importNGA.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					importNGA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				} else if (importNGA.getC_ExportItemType_ID() == HardCoded.ImpTypeRODIMPORT_IM) {
					System.out.println("RODIMPORT in");
					MSequence mSequence = new MSequence(importNGA.getCtx(), HardCoded.RODIMPORTSeq_IM,
							importNGA.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					importNGA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				System.out.println("Import doc no" + importNGA.getDocumentNo());
				importNGA.setC_DocType_ID(HardCoded.RegImportDocType_ID);
				importNGA.save();
			}
		}

	}

	public void Approval(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

//		if (mTab.getRecord_ID() == -1)
//			return;
//
//		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {
//
//			MCImportNGA importNGA = new MCImportNGA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
//
//			if (importNGA.getImportDocStatus().equals("PR")) {
//				importNGA.setImportDocStatus("MA");
//				importNGA.setProcessed(true);
//				importNGA.save();
//			} else if (importNGA.getImportDocStatus().equals("MA")) {
//				importNGA.setImportDocStatus("AD");
//				importNGA.setProcessed(true);
//				importNGA.save();
//			} else if (importNGA.getImportDocStatus().equals("AD")) {
//				importNGA.setImportDocStatus("SIOA");
//				importNGA.setProcessed(true);
//				importNGA.save();
//			} else if (importNGA.getImportDocStatus().equals("SIOA")) {
//				importNGA.setImportDocStatus("MAC");
//				importNGA.setProcessed(true);
//				importNGA.save();
//			} else if (importNGA.getImportDocStatus().equals("MAC")) {
//				importNGA.setImportDocStatus("ADF");
//				importNGA.setProcessed(true);
//				importNGA.save();
//			} else if (importNGA.getImportDocStatus().equals("ADF")) {
//				importNGA.setImportDocStatus("IM");
//				importNGA.setProcessed(true);
//				importNGA.save();
//			}
//			mTab.dataRefresh();
//		}
//		return;

		if (mTab.getRecord_ID() == -1)
			return;

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MCImportNGA importNGA = new MCImportNGA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
			MWFActivity[] activity = this.getWorkFLowActivity(importNGA);
			// first node
			if (activity == null) {
				importNGA.setImportDocStatus("MA");
				importNGA.setProcessed(true);
				importNGA.save();
			} else if (activity.length == 1) { // first node pass
				this.processWorkFlow(importNGA);
				System.out.println("activity.length  " + activity.length);
				importNGA.setImportDocStatus("AD");
				importNGA.setProcessed(true);
				importNGA.save();
			} else if (activity.length == 2) { // second node pass
				this.processWorkFlow(importNGA);
				System.out.println("activity.length  " + activity.length);
				importNGA.setImportDocStatus("SIOA");
				importNGA.setProcessed(true);
				importNGA.save();
			} else if (activity.length == 3) { // second node pass
				this.processWorkFlow(importNGA);
				System.out.println("activity.length  " + activity.length);
				importNGA.setImportDocStatus("MAC");
				importNGA.setProcessed(true);
				importNGA.save();
			} else if (activity.length == 4) { // second node pass
				this.processWorkFlow(importNGA);
				importNGA.setImportDocStatus("ADF");
				importNGA.setProcessed(true);
				importNGA.save();
			} else if (activity.length == 5) { // second node pass
				this.processWorkFlow(importNGA);
				importNGA.setImportDocStatus("IM");
				importNGA.setProcessed(true);
				importNGA.save();
			}
			importNGA.save();

		}

		mTab.dataRefresh(true);
		return;
	}

	private MWFActivity[] getWorkFLowActivity(MCImportNGA importNGA) {

		// get workflow process
		MWFProcess process = new Query(importNGA.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", importNGA.get_TrxName())
						.setParameters(importNGA.get_Table_ID(), importNGA.get_ID()).setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(importNGA.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				importNGA.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCImportNGA importNGA) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(importNGA.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(importNGA.get_Table_ID(), importNGA.get_ID()).setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(importNGA.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(importNGA.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
}
