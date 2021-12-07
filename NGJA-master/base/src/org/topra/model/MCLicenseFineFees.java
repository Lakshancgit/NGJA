package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCLicenseFineFees extends X_C_LicenseFineFees {

	public MCLicenseFineFees(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCLicenseFineFees(Properties ctx, int C_LicenseFineFees_ID, String trxName) {
		super(ctx, C_LicenseFineFees_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		return true;
	}

}
