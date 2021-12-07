package org.topra.callouts;

import java.math.BigDecimal;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.topra.model.MCExpServiceTypeLine;
import org.topra.model.MCExportNGJA;
import org.topra.model.MCExportServiceType;

/**
 * ExportInvoiceCreator
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 21th of jan 2019
 */
public class ExportInvoiceCreator extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		
		System.out.println("check");
		if (mTab.getRecord_ID() == -1)
			return "";

		MCExportNGJA mcExportNGJA = new MCExportNGJA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MInvoice existInvoice = new MInvoice(ctx, mcExportNGJA.getC_Invoice_ID(), mTab.getTrxInfo());

		if (mcExportNGJA.getC_Invoice_ID() == 0 || existInvoice.getDocStatus().equalsIgnoreCase("VO")) {

			if (mcExportNGJA.getDocumentStatus().equalsIgnoreCase("MAC")) {

				if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I genarate invoice?")) {

					MCExportServiceType mcExportServiceType = new MCExportServiceType(ctx,
							mcExportNGJA.getC_ExportServiceType_ID(), mTab.getTrxInfo());

					MCExpServiceTypeLine mcExpServiceTypeLine = new MCExpServiceTypeLine(ctx,
							mcExportNGJA.getC_ExpServiceTypeLine_ID(), mTab.getTrxInfo());

					BigDecimal price = null;
					int M_Product_ID = mcExpServiceTypeLine.getM_Product_ID();
					BigDecimal qty = null;
					BigDecimal amountInRS = null;
					StringBuffer sqlCountBuffer = null;
					StringBuffer sqlSumBuffer = null;
					sqlCountBuffer = new StringBuffer(
							"SELECT  count(C_ExportNGJALine_ID)  FROM C_ExportNGJALine WHERE C_ExportNGJA_ID ="
									+ mcExportNGJA.get_ID());
					qty = new BigDecimal(DB.getSQLValue(mTab.getTrxInfo(), sqlCountBuffer.toString()));

					sqlSumBuffer = new StringBuffer(
							"SELECT  sum(amountinrs)  FROM C_ExportNGJALine WHERE C_ExportNGJA_ID ="
									+ mcExportNGJA.get_ID());
					amountInRS = new BigDecimal(DB.getSQLValue(mTab.getTrxInfo(), sqlSumBuffer.toString()));

					// calculate the price
					if (mcExportServiceType.isFOBCal()) {
						price = amountInRS.multiply(mcExportServiceType.getPercentageAmount());
						price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
					} else if (mcExportServiceType.isImported()) {
						price = mcExportNGJA.getAdeddValue().multiply(mcExportServiceType.getImportPercentage());
						price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
						System.out.println("Check" + mcExportNGJA.getAdeddValue() + "  imp "
								+ mcExportServiceType.getImportPercentage() + "  price " + price);
					}

					// check if the price < DicisionMakingPrice
					if (mcExportServiceType.isImported() || mcExportServiceType.isFOBCal()) {
						if (price.compareTo(mcExportServiceType.getDicisionMakingPrice()) < 0) {
							price = mcExportServiceType.getDicisionMakingPrice();
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

					if (qty.intValue() >= 1) {
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

						MInvoiceLine line = new MInvoiceLine(mInvoice);
						line.setM_Product_ID(M_Product_ID);
						line.setQty(qty);
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

					} else {
						throw new AdempiereException("No record lines have found");
					}
				}

			}else {
				throw new AdempiereException("Invoice not Exported yet");
			}

		} else {
			throw new AdempiereException("Already have an Invoice");
		}

		return "";
	}

}