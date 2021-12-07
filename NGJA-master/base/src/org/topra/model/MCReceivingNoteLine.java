package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

//Auther Lakshan
public class MCReceivingNoteLine extends X_C_ReceivingNoteLine {

	public MCReceivingNoteLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCReceivingNoteLine(Properties ctx, int C_ReceivingNoteLine_ID, String trxName) {
		super(ctx, C_ReceivingNoteLine_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
