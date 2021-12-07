package org.topra.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;

public class MCDepositRelease extends X_C_DepositRelease {

	public MCDepositRelease(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCDepositRelease(Properties ctx, int C_DepositRelease_ID, String trxName) {
		super(ctx, C_DepositRelease_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		StringBuffer buffer2 = new StringBuffer(
				"SELECT  count(C_GemMining_ID)  FROM C_GemMining WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
		int count = DB.getSQLValue(get_TrxName(), buffer2.toString());

		if (count >= 1) {
			MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());

			// License No check Validation
			if (this.getLicenseTypeMining().equalsIgnoreCase("AL")) {
				if (this.getC_AuctionLicense_ID() == 0) {
					throw new AdempiereException("Please Select The Auction License");
				}

			} else if (this.getLicenseTypeMining().equalsIgnoreCase("BL")) {
				if (this.getC_BackhoeService_ID() == 0) {
					throw new AdempiereException("Please Select The Backhoe License");
				}

			} else if (this.getLicenseTypeMining().equalsIgnoreCase("ML")) {
				if (this.getC_GemMining_ID() == 0) {
					throw new AdempiereException("Please Select The Mining License");
				}

			}

			this.setC_BPartner_ID(invoice.getC_BPartner_ID());

			return true;
		} else {
			throw new AdempiereException("No Any Mining License");
		}

	}

}
