package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.util.DB;

public class MOverTenReturnSale extends X_OverTenReturnSale {

	public MOverTenReturnSale(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MOverTenReturnSale(Properties ctx, int OverTenReturnSale_ID, String trxName) {
		super(ctx, OverTenReturnSale_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		
		MCOverTen mcOverTen = new MCOverTen(this.getCtx(), this.getC_OverTen_ID(), this.get_TrxName());
		MExpReturnSaleLine mExpReturnSaleLine = new MExpReturnSaleLine(this.getCtx(), this.getExpReturnSaleLine_ID(), this.get_TrxName());
		StringBuffer stringBuffer = new StringBuffer("SELECT  COUNT(OverTenReturnSale_ID) FROM OverTenReturnSale" + 
				" WHERE OverTenReturnSale.c_overten_id=" + mcOverTen.getC_OverTen_ID());
		
		int over10Count = DB.getSQLValue(get_TrxName(), stringBuffer.toString());
		System.out.println(over10Count);
		if (over10Count<=0) {
			
			if (mExpReturnSaleLine.getReturnSale().equalsIgnoreCase("R")) {
				mcOverTen.setReturnStatus("Returned");
			}else {
				mcOverTen.setReturnStatus("Sold");
			}
			mcOverTen.save();
			
			return true;
		}else {
			throw new AdempiereException("Already Returned or Sold this!");
		}
		
		
	}

}
