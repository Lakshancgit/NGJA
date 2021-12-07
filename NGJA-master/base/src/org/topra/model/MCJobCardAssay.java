package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCJobCardAssay extends X_C_JobCardAssay {

	public MCJobCardAssay(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCJobCardAssay(Properties ctx, int C_JobCardAssay_ID, String trxName) {
		super(ctx, C_JobCardAssay_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean beforeSave(boolean newRecord)
	{
		
		return true;
	}

}
