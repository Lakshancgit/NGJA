package org.topra.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MExpReturnSaleLine extends X_ExpReturnSaleLine {

	public MExpReturnSaleLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MExpReturnSaleLine(Properties ctx, int ExpReturnSaleLine_ID, String trxName) {
		super(ctx, ExpReturnSaleLine_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		MExpReturnSale mExpReturnSale = new MExpReturnSale(this.getCtx(), this.getExpReturnSale_ID(),
				this.get_TrxName());
		MCExportNGJALine mcExportNGJALine = new MCExportNGJALine(this.getCtx(), this.getC_ExportNGJALine_ID(),
				this.get_TrxName());
		MCExportNGJA exportNGJA = new MCExportNGJA(this.getCtx(), mExpReturnSale.getC_ExportNGJA_ID(),
				this.get_TrxName());

		// Querry >> get Return or Sold SUM Quantity
		StringBuffer stringBuffer = new StringBuffer("SELECT SUM" + "	( ExpReturnSaleLine.returnedquantity ) "
				+ "FROM" + "	ExpReturnSaleLine"
				+ "	LEFT JOIN ExpReturnSale ON ExpReturnSaleLine.expreturnsale_id = ExpReturnSale.expreturnsale_id "
				+ "WHERE" + "	ExpReturnSaleLine.c_exportngjaline_id=" + this.getC_ExportNGJALine_ID()
				+ "AND ExpReturnSale.c_exportngja_id=" + mExpReturnSale.getC_ExportNGJA_ID());

		// Querry >> get Return or Sold SUM weight
		StringBuffer stringBuffer1 = new StringBuffer("SELECT SUM" + "	( ExpReturnSaleLine.returnedtotalweight ) "
				+ "FROM" + "	ExpReturnSaleLine"
				+ "	LEFT JOIN ExpReturnSale ON ExpReturnSale.expreturnsale_id= ExpReturnSaleLine.expreturnsale_id  "
				+ "WHERE" + "	ExpReturnSaleLine.c_exportngjaline_id=" + this.getC_ExportNGJALine_ID()
				+ "AND ExpReturnSale.c_exportngja_id=" + mExpReturnSale.getC_ExportNGJA_ID());

		int rsQuantity = DB.getSQLValue(get_TrxName(), stringBuffer.toString());
		double returnedWeight = DB.getSQLValue(get_TrxName(), stringBuffer1.toString());

		int pendingQuantity = mcExportNGJALine.getNoOfPCSLOT() - rsQuantity;
		double pendingWieght = mcExportNGJALine.getWeight().doubleValue() - returnedWeight;

		BigDecimal itemIncome = null;
		// Validate the No of Pc's
		if (this.getReturnedQuantity() > 0 && this.getReturnedQuantity() <= pendingQuantity) {

			// Validate the Weight
			if (this.getReturnedTotalWeight().doubleValue() > 0.0
					&& this.getReturnedTotalWeight().doubleValue() <= pendingWieght) {
				pendingQuantity = pendingQuantity - this.getReturnedQuantity();
				pendingWieght = pendingWieght - this.getReturnedTotalWeight().doubleValue();

				// Update Export if fully Returned
				if (pendingQuantity == 0) {

					mcExportNGJALine.setReturnStatus("Full");
					mcExportNGJALine.save();

					// Querry >> get all Items count in NGJALines
					StringBuffer allItems = new StringBuffer(
							"SELECT count(c_exportngjaline_id) from c_exportngjaline where"
									+ " c_exportngja_id=" + mExpReturnSale.getC_ExportNGJA_ID());
					// Querry >> get Full Items count in NGJALines
					StringBuffer allFullItems = new StringBuffer(
							"SELECT count(c_exportngjaline_id) from c_exportngjaline where "
									+ " returnstatus='Full' AND c_exportngja_id="
									+ mExpReturnSale.getC_ExportNGJA_ID());

					int allItemsCount = DB.getSQLValue(get_TrxName(), allItems.toString());
					int fullItemsCount = DB.getSQLValue(get_TrxName(), allFullItems.toString());
					
					if (allItemsCount == fullItemsCount) {
						exportNGJA.setReturnStatus("Full");
						exportNGJA.save();
					}
				} else {
					
					System.out.println(returnedWeight);
					System.out.println(pendingWieght);
					mcExportNGJALine.setReturnStatus(
							"Pending Quantity = " + pendingQuantity + " Pending Weight = " + pendingWieght);
					mcExportNGJALine.save();
				}
				// get data from exportLine
				this.setNoOfPCSLOT(mcExportNGJALine.getNoOfPCSLOT());
				this.setItemType(mcExportNGJALine.getItemType());
				this.setJewelleryType(mcExportNGJALine.getJewelleryType());
				this.setJewelleryWeight(mcExportNGJALine.getJewelleryWeight());
				this.setCaraOfMetVeri(mcExportNGJALine.getCaraOfMetVeri());
				this.setStonesWeight(mcExportNGJALine.getStonesWeight());
				this.setWeightCategory(mcExportNGJALine.getWeightCategory());
				this.setWeight(mcExportNGJALine.getWeight());
				this.setRateMeasureType(mcExportNGJALine.getRateMeasureType());
				this.setRatePerUnit(mcExportNGJALine.getRatePerUnit());
				this.setAmountInFC(mcExportNGJALine.getAmountInFC());
				this.setAmountInRs(mcExportNGJALine.getAmountInRs());
				if (this.getRateMeasureType().equalsIgnoreCase("C")) {

					itemIncome = this.getRatePerUnit().multiply(this.getReturnedTotalWeight());

				} else {
					itemIncome = BigDecimal.valueOf(this.getRatePerUnit().doubleValue() * this.getReturnedQuantity());

				}
				this.setItemValueInForeign(itemIncome);
				this.setItemValueInRs(itemIncome.multiply(exportNGJA.getRateFC()));

//////////////////////////////////////////////////////////////////////////////////////////////////////////				
//				// If Expired >> generate fine Invoice
//				if (exportNGJA.getExpExpireDate().before(new Timestamp(System.currentTimeMillis()))) {
//					MInvoice mInvoice;
//					if (mExpReturnSale.getC_Invoice_ID() == 0) {
//						mInvoice = new MInvoice(this.getCtx(), 0, this.get_TrxName());
//					} else {
//						mInvoice = new MInvoice(this.getCtx(), mExpReturnSale.getC_Invoice_ID(), this.get_TrxName());
//					}
//
//					MInvoiceLine mInvoiceLine = new MInvoiceLine(this.getCtx(), 0, this.get_TrxName());
//					MBPartner mbPartner = (MBPartner) exportNGJA.getC_BPartner();
//					MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(this.getCtx(), mbPartner.get_ID(),
//							this.get_TrxName());
//
//					// VALIDATE THE BUSINESS PARTNER lOCATION
//					if (bpls == null || bpls.length == 0)
//						throw new AdempiereException("No Business partner Location found!");
//
//					for (MBPartnerLocation bpl : bpls) {
//						if (bpl.isShipTo()) {
//							mInvoice.setC_BPartner_Location_ID(bpl.get_ID());
//							break;
//						}
//					}
//
//					// VALIDATE THE BUSINESS PARTNER lOCATION
//					if (mInvoice.getC_BPartner_Location_ID() == 0)
//						throw new AdempiereException("No Business partner Location found!");
//
//					mInvoice.setBPartner(mbPartner);
//					mInvoice.setC_DocTypeTarget_ID(1000002);
//					mInvoice.setC_Currency_ID(313);
//					mInvoice.setC_DocType_ID(0);
//					mInvoice.setM_PriceList_ID(1000011);
//					mInvoice.setAD_Org_ID(Env.getAD_Org_ID(this.getCtx()));
//					mInvoice.save();
//
//					if (exportNGJA.getC_ExportServiceType_ID() == 1000012) {
//
//						mInvoiceLine.setC_Invoice_ID(mInvoice.get_ID());
//						mInvoiceLine.setM_Product_ID(1002086);
//						mInvoiceLine.setQty(this.getReturnedQuantity());
//
//					} else {
//						mInvoiceLine.setC_Invoice_ID(mInvoice.get_ID());
//						mInvoiceLine.setM_Product_ID(1002086);
//						BigDecimal price = null;
//						price = itemIncome.multiply(BigDecimal.valueOf(0.005));
//						mInvoiceLine.setPriceActual(price);
//						mInvoiceLine.setPriceEntered(price);
//
//					}
//					mInvoiceLine.save();
//					mExpReturnSale.setC_Invoice_ID(mInvoice.getC_Invoice_ID());
//					mExpReturnSale.save();
//					this.setExpFineStatus("F");
//					ADialog.info(1000152, null, "Invoice Created on fine : " + mInvoice.getC_Invoice_ID());
//
//				}
//////////////////////////////////////////////////////////////////////////////////////////////////
				return true;

			} else if (this.getReturnedTotalWeight().doubleValue() == 0.0) {
				throw new AdempiereException("Weight cannot be 0!");
			} else {
				throw new AdempiereException("only " + pendingWieght + " weight is Available");
			}

		} else if (this.getReturnedQuantity() == 0) {
			throw new AdempiereException("Quantity cannot be 0!");
		} else {
			throw new AdempiereException("only " + pendingQuantity + " Pc's is Available");
		}

	}

}
