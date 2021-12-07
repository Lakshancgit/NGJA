package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MInvoice;

public class MCLandDetails extends X_C_LandDetails {

	
	public MCLandDetails(Properties ctx, int C_LandDetails_ID, String trxName) {
		super(ctx, C_LandDetails_ID, trxName);
		
	}

	public MCLandDetails(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		
	}
	
	
	@Override
	protected boolean beforeSave(boolean newRecord) {
		
		MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());
		this.setC_BPartner_ID(invoice.getC_BPartner_ID());
		System.out.println(invoice.getC_BPartner_ID());
		
		return true;
		
		
	}
	@Override
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		MCLandSpecialConditions landSpecialConditions = new MCLandSpecialConditions(this.getCtx(), 0, this.get_TrxName());
		landSpecialConditions.setC_LandDetails_ID(this.get_ID());
		landSpecialConditions.save();
		return success;
	}

}
