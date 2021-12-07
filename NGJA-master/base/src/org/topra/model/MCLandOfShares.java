package org.topra.model;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;

public class MCLandOfShares extends X_C_LandOfShares {

	public MCLandOfShares(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCLandOfShares(Properties ctx, int C_LandOfShares_ID, String trxName) {
		super(ctx, C_LandOfShares_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		MCAuctionLicense auctionLicense = new MCAuctionLicense(this.getCtx(), this.getC_AuctionLicense_ID(),
				this.get_TrxName());

		StringBuffer buffer3 = new StringBuffer(
				"SELECT  max(C_AuctionLicenseFinal_ID)  FROM C_AuctionLicenseFinal WHERE C_AuctionLicense_ID="
						+ auctionLicense.get_ID());
		int C_AuctionLicenseFinal_ID = DB.getSQLValue(get_TrxName(), buffer3.toString());

		MCAuctionLicenseFinal licenseFinal = new MCAuctionLicenseFinal(this.getCtx(), C_AuctionLicenseFinal_ID,
				this.get_TrxName());

		this.setC_BPartner_ID(auctionLicense.getC_BPartner_ID());
		this.setTotalGemValue(auctionLicense.getTotalGemValue());
		this.setTotalGemSale(licenseFinal.getTotalGemSale());
		return true;
	}

}
