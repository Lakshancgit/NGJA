package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.util.DB;

public class MPaymentMining extends X_PaymentMining {

	public MPaymentMining(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MPaymentMining(Properties ctx, int PaymentMining_ID, String trxName) {
		super(ctx, PaymentMining_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		StringBuffer stringBuffer = new StringBuffer(
				"SELECT  count(C_Payment_ID)  FROM PaymentMining WHERE C_Payment_ID=" + this.getC_Payment_ID());
		int count = DB.getSQLValue(get_TrxName(), stringBuffer.toString());

		if (count < 1) {
			return true;
		} else {
			throw new AdempiereException("Cannot Use this Payment!");
		}

	}
}
