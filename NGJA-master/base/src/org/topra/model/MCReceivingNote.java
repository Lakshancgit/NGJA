package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCReceivingNote extends X_C_ReceivingNote {

	public MCReceivingNote(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCReceivingNote(Properties ctx, int C_ReceivingNote_ID, String trxName) {
		super(ctx, C_ReceivingNote_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean beforeSave(boolean newRecord)
	{
		
		
		
		return true;
	}

}
