package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCExpMetal extends X_C_ExpMetal {

	public MCExpMetal(Properties ctx, int C_ExpMetal_ID, String trxName) {
		super(ctx, C_ExpMetal_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCExpMetal(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

}
