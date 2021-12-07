package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

//Auther Lakshan
public class MCColorCard extends X_C_ColorCard {

	public MCColorCard(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCColorCard(Properties ctx, int C_ColorCard_ID, String trxName) {
		super(ctx, C_ColorCard_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
