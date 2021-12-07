package org.topra.callouts;

import java.math.BigDecimal;
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
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.topra.model.MCExpServiceTypeLine;
import org.topra.model.MCExportDetails;
import org.topra.model.MCExportNGJA;
import org.topra.model.MCExportServiceType;

//org.topra.callouts.ExportInvoiceCreatorTemp.viewInvoice
public class ExportInvoiceCreatorTemp extends CalloutEngine {



	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		
		System.out.println("check");
		if (mTab.getRecord_ID() == -1)
			return "";

		MCExportDetails mcExportNGJA = new MCExportDetails(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MInvoice existInvoice = new MInvoice(ctx, mcExportNGJA.getC_Invoice_ID(), mTab.getTrxInfo());

		if (mcExportNGJA.getC_Invoice_ID() == 0 || existInvoice.getDocStatus().equalsIgnoreCase("VO")) {
	if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I genarate invoice?")) {

					MCExportServiceType mcExportServiceType = new MCExportServiceType(ctx,
							mcExportNGJA.getC_ExportServiceType_ID(), mTab.getTrxInfo());

					MCExpServiceTypeLine mcExpServiceTypeLine = new MCExpServiceTypeLine(ctx,
							mcExportNGJA.getC_ExpServiceTypeLine_ID(), mTab.getTrxInfo());

					BigDecimal price = null;
					int M_Product_ID = mcExpServiceTypeLine.getM_Product_ID();
					BigDecimal amountInRS = null;
					BigDecimal qty = null;
					
					
					amountInRS = mcExportNGJA.getFOBInRS();

					// calculate the price
					if (mcExportServiceType.isFOBCal()) {
						price = amountInRS.multiply(mcExportServiceType.getPercentageAmount());
						price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
					} 
					
					else if (mcExportServiceType.isImported()) {
						price = mcExportNGJA.getAddedValue().multiply(mcExportServiceType.getImportPercentage());
						price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
						System.out.println("Check" + mcExportNGJA.getAddedValue() + "  imp "
								+ mcExportServiceType.getImportPercentage() + "  price " + price);}
					

					// check if the price < DicisionMakingPrice
					if ( mcExportServiceType.isFOBCal()) {
					if (price.compareTo(mcExportServiceType.getDicisionMakingPrice()) < 0) {
						price = mcExportServiceType.getDicisionMakingPrice();
					}}else if (mcExportServiceType.isImported()) {
						if (price.compareTo(mcExportServiceType.getDicisionMakingAddedValue()) < 0) {
							price = mcExportServiceType.getDicisionMakingAddedValue();
						}	
					}

					MInvoice mInvoice = new MInvoice(ctx, 0, mTab.getTrxInfo());
					MBPartner mbPartner = (MBPartner) mcExportNGJA.getC_BPartner();
					MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(ctx, mbPartner.get_ID(),
							mTab.getTrxInfo());

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
						mInvoice.setC_DocTypeTarget_ID(1000002);
						mInvoice.setM_PriceList_ID(1000011);
						mInvoice.setAD_Org_ID(Env.getAD_Org_ID(ctx));
						mInvoice.save();

						// setup quantity
						if (!mcExportServiceType.isFOBCal() && mcExportServiceType.isQuantityBased())
							;
						else
							qty = new BigDecimal(1);

						// setup price

						System.out.println("Price   "+price);
						MInvoiceLine line = new MInvoiceLine(mInvoice);
						line.setM_Product_ID(M_Product_ID);
						line.setQty(1);
						if (mcExportServiceType.isFOBCal()) {
							line.setPrice(price);
						}
						if (mcExportServiceType.isImported()) {
							line.setPrice(price);
						}

						line.save();

						mcExportNGJA.setC_Invoice_ID(mInvoice.get_ID());
						mcExportNGJA.save();
						mTab.dataRefresh();
						ADialog.info(1, null, "Invoice Created : " + mInvoice.getC_Invoice_ID());

					
				}

			

		} else {
			throw new AdempiereException("Already have an Invoice");
		}

		return "";
	}
	
	public void viewInvoice(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCExportDetails mcExportNGJA = new MCExportDetails(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if (mcExportNGJA.getC_Invoice_ID() == 0) {
			throw new AdempiereException("No any Invoice");
		}

		int Record_ID = (Integer) mTab.getValue("C_Invoice_ID");

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
