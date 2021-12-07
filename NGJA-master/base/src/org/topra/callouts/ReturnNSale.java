package org.topra.callouts;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.AWindow;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MQuery;
import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCAuctionLicense;
import org.topra.model.MCExportNGJA;
import org.topra.model.MCExportServiceType;
import org.topra.model.MExpReturnSale;

/**
 * org.topra.callouts.ReturnNSale
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 29th of Mar 2019
 */

public class ReturnNSale extends CalloutEngine {

	public String Approval(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MExpReturnSale expReturnSale = new MExpReturnSale(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

			MWFActivity[] activity = this.getWorkFLowActivity(expReturnSale);
			// first node
			if (activity == null) {
				expReturnSale.setDocumentStatus("MA");
				expReturnSale.setProcessed(true);
				expReturnSale.save();
			} else if (activity.length == 1) { // first node pass
				this.processWorkFlow(expReturnSale);
				System.out.println("activity.length  " + activity.length);
				expReturnSale.setDocumentStatus("AD");
				expReturnSale.setProcessed(true);
				expReturnSale.save();
			} else if (activity.length == 2) { // second node pass
				this.processWorkFlow(expReturnSale);
				System.out.println("activity.length  " + activity.length);
				expReturnSale.setDocumentStatus("SIOA");
				expReturnSale.setProcessed(true);
				expReturnSale.save();
			} else if (activity.length == 3) { // second node pass
				this.processWorkFlow(expReturnSale);
				System.out.println("activity.length  " + activity.length);
				expReturnSale.setDocumentStatus("MAC");
				expReturnSale.setProcessed(true);
				expReturnSale.save();
			} else if (activity.length == 4) { // second node pass
				this.processWorkFlow(expReturnSale);
				expReturnSale.setDocumentStatus("ADF");
				expReturnSale.setProcessed(true);
				expReturnSale.save();
			} else if (activity.length == 5) { // second node pass
				this.processWorkFlow(expReturnSale);
				expReturnSale.setDocumentStatus("R");
				expReturnSale.setProcessed(true);
				expReturnSale.save();
			}
			expReturnSale.save();

		}

		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MExpReturnSale expReturnSale) {

		// get workflow process
		MWFProcess process = new Query(expReturnSale.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", expReturnSale.get_TrxName())
						.setParameters(expReturnSale.get_Table_ID(), expReturnSale.get_ID()).setOnlyActiveRecords(true)
						.first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(expReturnSale.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				expReturnSale.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MExpReturnSale expReturnSale) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(expReturnSale.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(expReturnSale.get_Table_ID(), expReturnSale.get_ID()).setOnlyActiveRecords(true)
						.first();

		MWFActivity activity = new Query(expReturnSale.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(expReturnSale.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MExpReturnSale expReturnSale = new MExpReturnSale(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MCExportNGJA exportNGJA = new MCExportNGJA(ctx, expReturnSale.getC_ExportNGJA_ID(), mTab.getTrxInfo());
		MCExportServiceType exportServiceType = new MCExportServiceType(ctx, exportNGJA.getC_ExportServiceType_ID(),
				mTab.getTrxInfo());
		int expired = 0;

		// Querry >> get Return or Sold SUM Quantity
		StringBuffer stringBuffer = new StringBuffer("SELECT COUNT(ExpReturnSaleLine_ID)" + "FROM"
				+ "	ExpReturnSaleLine " + "WHERE 	ExpReturnSaleLine.ReturnSale= 'S'"
				+ "AND ExpReturnSaleLine.ExpReturnSale_ID = " + expReturnSale.get_ID());
		int count = DB.getSQLValue(mTab.getTrxInfo(), stringBuffer.toString());

		if (exportNGJA.getExpExpireDate().before(new Timestamp(System.currentTimeMillis()))) {
			expired = 1;
		}
		System.out.println(count + "  " + expired + "  " + exportNGJA.getReturnStatus());

		// check if the invoicing scenarios met
		if (!exportNGJA.getReturnStatus().equalsIgnoreCase("Full") && count == 0 && expired == 0) {
			throw new AdempiereException("You cannot Create Invoice");
		}

		if (ADialog.ask(WindowNo, null, "Invoice Creation", "Do I genarate invoice??")) {

			MInvoice mInvoice;
			if (expReturnSale.getC_Invoice_ID() == 0) {
				mInvoice = new MInvoice(ctx, 0, mTab.getTrxInfo());
			} else {
				mInvoice = new MInvoice(ctx, expReturnSale.getC_Invoice_ID(), mTab.getTrxInfo());
			}

			MBPartner mbPartner = (MBPartner) exportNGJA.getC_BPartner();
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

			int M_Product_ID = 0;
			BigDecimal total = new BigDecimal("0");
			BigDecimal income = new BigDecimal("0");
			BigDecimal price = new BigDecimal("0");

			if (exportNGJA.getReturnStatus().equalsIgnoreCase("Full") && count == 0) {

				if (exportNGJA.getC_ExportServiceType_ID() == 1000012) {

					throw new AdempiereException("Can't create Invoice (certification is not allowed for create"
							+ " fully returned invoice)");
				}
				M_Product_ID = 1002050;

			} else if (count != 0) {

				M_Product_ID = 1002049;
				total = new BigDecimal("0");
				income = new BigDecimal("0");
				price = new BigDecimal("0");

				String sql = "SELECT * FROM ExpReturnSaleline " + "WHERE ExpReturnSaleline.expreturnsale_id ="
						+ expReturnSale.getExpReturnSale_ID() + "AND ExpReturnSaleline.returnsale='S'";

				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					pstmt = DB.prepareStatement(sql, mTab.getTrxInfo());
					// pstmt.setInt (1, M_InOut_ID);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						income = rs.getBigDecimal("ItemValueInRs");
						total = total.add(income);

					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					DB.close(rs, pstmt);
					rs = null;
					pstmt = null;
				}

				price = total.multiply(exportServiceType.getPercentageAmountReturn());

			}

			mInvoice.setBPartner(mbPartner);
			mInvoice.setC_DocTypeTarget_ID(1000002);
			mInvoice.setC_Currency_ID(313);
			mInvoice.setC_DocType_ID(0);
			mInvoice.setM_PriceList_ID(1000011);
			mInvoice.setAD_Org_ID(Env.getAD_Org_ID(ctx));
			mInvoice.save();

			MInvoiceLine line = new MInvoiceLine(mInvoice);
			line.setM_Product_ID(M_Product_ID);
			line.setQty(1);
			if (!exportNGJA.getReturnStatus().equalsIgnoreCase("Full")) {
				line.setPriceEntered(price);
				line.setPriceActual(price);
				line.setPrice(price);
			}
			line.save();

			// If Expired >> generate fine Invoice
			if (exportNGJA.getExpExpireDate().before(new Timestamp(System.currentTimeMillis()))) {
				BigDecimal quantity = new BigDecimal("1");
				BigDecimal itemIncome = new BigDecimal("0");
				BigDecimal finePrice = new BigDecimal("0");
				MInvoiceLine mInvoiceLine = new MInvoiceLine(mInvoice);

				if (exportNGJA.getC_ExportServiceType_ID() == 1000012) {

					// Querry >> get Sum of all the returned Quantity
					StringBuffer returnedQuantity = new StringBuffer(
							"SELECT SUM(expreturnsaleline.returnedquantity) FROM "
									+ "expreturnsaleline WHERE expreturnsale_id = "
									+ expReturnSale.getExpReturnSale_ID());
					quantity = BigDecimal.valueOf(DB.getSQLValue(mTab.getTrxInfo(), returnedQuantity.toString()));
					System.out.println("Quantity" + quantity);

				} else {

					// Querry >> get Sum of all the Item Income by Returned
					StringBuffer IncomeByreturned = new StringBuffer("SELECT SUM(expreturnsaleline.ItemValueInRs) FROM "
							+ "expreturnsaleline WHERE expreturnsale_id = " + expReturnSale.getExpReturnSale_ID());
					itemIncome = BigDecimal.valueOf(DB.getSQLValue(mTab.getTrxInfo(), IncomeByreturned.toString()));
					System.out.println("Item Income " + itemIncome);
					finePrice = itemIncome.multiply(exportServiceType.getPercentageAmount());
					System.out.println("PR" + exportServiceType.getPercentageAmount());
					System.out.println("Fine Price " + finePrice);
				}

				// Add Invoice line >> Fine
				mInvoiceLine.setM_Product_ID(1002086);
				if (exportNGJA.getC_ExportServiceType_ID() != 1000012) {
					mInvoiceLine.setPriceEntered(finePrice);
					mInvoiceLine.setPriceActual(finePrice);
					mInvoiceLine.setPrice(finePrice);
				}
				mInvoiceLine.setQty(quantity);
				mInvoiceLine.save();

			}

			expReturnSale.setC_Invoice_ID(mInvoice.get_ID());
			expReturnSale.save();
			ADialog.info(1000152, null, "Invoice Created : " + mInvoice.getC_Invoice_ID());
		}

		mTab.dataRefresh(true);
		return "";
	}

	public void ViewInvoice(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MExpReturnSale expReturnSale = new MExpReturnSale(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if (expReturnSale.getC_Invoice_ID() == 0) {
			throw new AdempiereException("No any Invoice");
		}
		int Record_ID = expReturnSale.getC_Invoice_ID();

		// Open Invoice
		int AD_Window_ID = 1000149;
		String ColumnName = "C_Invoice_ID";
		MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

		@SuppressWarnings("deprecation")
		AWindow frame = new AWindow();
		if (!frame.initWindow(AD_Window_ID, query))
			return;

		AEnv.addToWindowManager(frame);
		AEnv.showCenterScreen(frame);
		frame = null;

		mTab.dataRefresh(true);
		return;
	}
}
