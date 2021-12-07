package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCExpItems extends X_C_ExpItems {

	public MCExpItems(Properties ctx, int C_ExpItems_ID, String trxName) {
		super(ctx, C_ExpItems_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCExpItems(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
