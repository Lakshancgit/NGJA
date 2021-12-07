package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.DB;

public class MCAuctionLicenseFinal extends X_C_AuctionLicenseFinal {

	public MCAuctionLicenseFinal(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCAuctionLicenseFinal(Properties ctx, int C_AuctionLicenseFinal_ID, String trxName) {
		super(ctx, C_AuctionLicenseFinal_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected boolean beforeSave(boolean newRecord) {

		StringBuffer buffer = new StringBuffer(
				"SELECT  max(C_AuctionLicense_ID)  FROM C_AuctionLicense WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
		int C_AuctionLicense_ID = DB.getSQLValue(get_TrxName(), buffer.toString());
		MCAuctionLicense auctionLicense = new MCAuctionLicense(this.getCtx(), C_AuctionLicense_ID, this.get_TrxName());
	
		this.setC_AuctionLicense_ID(auctionLicense.getC_AuctionLicense_ID());
		this.setC_BPartner_ID(auctionLicense.getC_BPartner_ID());
		
		
		return true;
	}

}
