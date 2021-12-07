package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;

public class MExpReturnSale extends X_ExpReturnSale {

	public MExpReturnSale(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MExpReturnSale(Properties ctx, int ExpReturnSale_ID, String trxName) {
		super(ctx, ExpReturnSale_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		
		MCExportNGJA mcExportNGJA = new MCExportNGJA(this.getCtx(), this.getC_ExportNGJA_ID(), this.get_TrxName());
		System.out.println(mcExportNGJA.getC_ExportNGJA_ID());
		if (newRecord) {
			if (mcExportNGJA.getReturnStatus().equalsIgnoreCase("Pending")) {

				
//				Timestamp currentTime = new Timestamp(System.currentTimeMillis());
//				Calendar ce = Calendar.getInstance();
//				ce.setTime(mcExportNGJA.getExpExpireDate());
//				ce.add(Calendar.DATE, 1);
//				ce.set(Calendar.HOUR_OF_DAY, 0);
//				ce.set(Calendar.MINUTE, 0);
//				ce.set(Calendar.SECOND, 0);
//				ce.set(Calendar.MILLISECOND, 0);
//				Timestamp ts = new Timestamp(ce.getTimeInMillis());
//				
//
//				// check the date is expired
//				if (currentTime.before(ts)) {
//
//					return true;
//
//				} else {
//					// penalty Invoice
//					return true;
//				}
				
				return true;
			} else if (mcExportNGJA.getReturnStatus().equalsIgnoreCase("Full")) {

				// fully Returned
				throw new AdempiereException("This export has fully returned!");
			} else {
				return false;
			}
		} else {
			return true;
		}

	}
}
