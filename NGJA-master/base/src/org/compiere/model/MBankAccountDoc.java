package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MBankAccountDoc extends X_C_BankAccountDoc{

	public MBankAccountDoc(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MBankAccountDoc(Properties ctx, int C_BankAccountDoc_ID, String trxName) {
		super(ctx, C_BankAccountDoc_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
