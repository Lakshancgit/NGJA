package org.topra.process;

import java.sql.Timestamp;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

public class InactiveMiningLicense extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		

		StringBuffer sqlDealerLicense = null;
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		sqlDealerLicense = new StringBuffer ("UPDATE C_GemMining "
				+ "SET LicenseStatus = 'IN' WHERE LicenseStatus = 'A' AND DateTo < '" + currentTime +"'");
		int a = DB.executeUpdateEx(sqlDealerLicense.toString(), get_TrxName());
		
		return a + " Mining Licenses Affected";
		
	}

}
