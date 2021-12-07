package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MProduct;


public class MCExpServiceTypeLine extends X_C_ExpServiceTypeLine {

	public MCExpServiceTypeLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCExpServiceTypeLine(Properties ctx, int C_ExpServiceTypeLine_ID, String trxName) {
		super(ctx, C_ExpServiceTypeLine_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {

		MProduct mProduct = new MProduct(this.getCtx(), this.getM_Product_ID(), this.get_TrxName());
		this.setproductname(mProduct.getName());

		return true;
	}

}
