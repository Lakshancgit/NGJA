package org.topra.callouts;

import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.AWindow;
import org.compiere.apps.ProcessCtl;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MProcess;
import org.compiere.model.MQuery;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.form.AuctionLicenseSinhalaInput;
import org.topra.model.HardCoded;
import org.topra.model.MCAuctionLicense;
import org.topra.model.MCAuctionLicenseFinal;

/**
 * org.topra.callouts.AuctionLicenseApproval.print
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 8th of May 2019
 */

public class AuctionLicenseApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MCAuctionLicense mcAuctionLicense = new MCAuctionLicense(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

			MWFActivity[] activity = this.getWorkFLowActivity(mcAuctionLicense);
			// first node
			if (activity == null) {
				mcAuctionLicense.setAuctionLicesneStatus("SIA");
				mcAuctionLicense.setProcessed(true);
				mcAuctionLicense.save();
			} else if (activity.length == 2) { // first node pass

				this.processWorkFlow(mcAuctionLicense);
				mcAuctionLicense.setAuctionLicesneStatus("SFRA");
				mcAuctionLicense.setProcessed(true);
				mcAuctionLicense.save();
			} else if (activity.length == 3) { // second node pass
				this.processWorkFlow(mcAuctionLicense);
				mcAuctionLicense.setAuctionLicesneStatus("A");
				mcAuctionLicense.setProcessed(true);
				mcAuctionLicense.save();
			} else if (activity.length == 4) { // third node pass
				this.processWorkFlow(mcAuctionLicense);

			}
			mcAuctionLicense.save();

		}

		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MCAuctionLicense mcAuctionLicense) {

		// get workflow process
		MWFProcess process = new Query(mcAuctionLicense.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mcAuctionLicense.get_TrxName())
						.setParameters(mcAuctionLicense.get_Table_ID(), mcAuctionLicense.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mcAuctionLicense.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mcAuctionLicense.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCAuctionLicense mcAuctionLicense) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mcAuctionLicense.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mcAuctionLicense.get_Table_ID(), mcAuctionLicense.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mcAuctionLicense.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mcAuctionLicense.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}

	public void printLicense(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCAuctionLicense auctionLicense = new MCAuctionLicense(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		new AuctionLicenseSinhalaInput().initComponents(auctionLicense);
	}

	public String print(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCAuctionLicense licence = new MCAuctionLicense(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		int AD_Process_ID = HardCoded.AuctionLicenseSinhalaProcess_ID;
		MProcess process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());
		int table_ID = 1000065;
		int record_ID = licence.getC_AuctionLicense_ID();

		ProcessInfo processInfo = new ProcessInfo("Auction License", AD_Process_ID, table_ID, record_ID);
		processInfo.setAD_User_ID(Env.getAD_User_ID(ctx));
		processInfo.setAD_Client_ID(Env.getAD_Client_ID(ctx));
		processInfo.setPrintPreview(!process.isDirectPrint());
		ProcessCtl.process(null, mTab.getWindowNo(), processInfo, null);
		licence.setProcessed(true);
		licence.setPrinted(true);

		licence.save();
		mTab.dataRefresh();

		return "";

	}

	public void createInvoice(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCAuctionLicenseFinal auctionLicenseFinal = new MCAuctionLicenseFinal(ctx, mTab.getRecord_ID(),
				mTab.getTrxInfo());
		BigDecimal price = null;

		if (auctionLicenseFinal.getC_AuctionInvoice_ID() == 0) {
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I genarate invoice?")) {
				price = auctionLicenseFinal.getTotalGemSale().divide(BigDecimal.valueOf(100))
						.multiply(BigDecimal.valueOf(Double.valueOf(auctionLicenseFinal.getValueNumber())));

				// Creating Invoice
				MInvoice mInvoice = new MInvoice(ctx, 0, mTab.getTrxInfo());

				MBPartner mbPartner = (MBPartner) auctionLicenseFinal.getC_BPartner();
				MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(ctx, mbPartner.get_ID(), mTab.getTrxInfo());

				// VALIDATE THE BUSINESS PARTNER lOCATION
				if (bpls == null || bpls.length == 0)
					throw new AdempiereException("No Business partner Location found!");

				for (MBPartnerLocation bpl : bpls) {
					if (bpl.isShipTo()) {
						mInvoice.setC_BPartner_Location_ID(bpl.get_ID());
						break;
					}
				}

				// VALIDATE THE BUSINESS PARTNER lOCATION
				if (mInvoice.getC_BPartner_Location_ID() == 0)
					throw new AdempiereException("No Business partner Location found!");

				mInvoice.setBPartner(mbPartner);
				mInvoice.setC_DocTypeTarget_ID(1000105);
				mInvoice.setM_PriceList_ID(1000017);
				mInvoice.save();

				MInvoiceLine line = new MInvoiceLine(mInvoice);
				line.setM_Product_ID(1002091);
				line.setQty(1);
				line.setPrice(price);
				line.setPriceEntered(price);
				line.save();

				auctionLicenseFinal.setTaxValue(String.valueOf(price.setScale(2, BigDecimal.ROUND_HALF_UP)));
				auctionLicenseFinal.setC_AuctionInvoice_ID(mInvoice.get_ID());
				auctionLicenseFinal.save();

				mTab.dataRefresh();

			}
		} else {
			throw new AdempiereException("Already have an Invoice");
		}

	}

	public void ViweInvoice(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCAuctionLicenseFinal auctionLicenseFinal = new MCAuctionLicenseFinal(ctx, mTab.getRecord_ID(),
				mTab.getTrxInfo());

		if (auctionLicenseFinal.getC_AuctionInvoice_ID() != 0) {
			// Open Invoice
			int AD_Window_ID = 1000184;
			String ColumnName = "C_Invoice_ID";
			MQuery query = MQuery.getEqualQuery(ColumnName, auctionLicenseFinal.getC_AuctionInvoice_ID());

			@SuppressWarnings("deprecation")
			AWindow frame = new AWindow();
			if (!frame.initWindow(AD_Window_ID, query))
				return;

			AEnv.addToWindowManager(frame);
			AEnv.showCenterScreen(frame);
			frame = null;
		} else {
			throw new AdempiereException("No any Invoice!");
		}

		return;
	}

}
