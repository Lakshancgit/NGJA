package org.topra.process;

import java.sql.Timestamp;

import org.compiere.model.MProcess;
import org.compiere.model.MProcessPara;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;

//Auther Lakshan
public class DealerLicense extends SvrProcess {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	protected String doIt() throws Exception {
		StringBuffer sqlDealerLicense = null;
		StringBuffer sqlColorCard = null;
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
//		MProcess mProcess = new MProcess(getCtx(),1000034,get_TrxName() );
//		MProcessPara mProcessPara = new MProcessPara(mProcess);
//		mProcessPara.get
		sqlDealerLicense = new StringBuffer ("UPDATE D_DealerLicense "
				+ "SET LicenseStatus = 'I' WHERE LicenseStatus in ('A', 'M') AND LicenseEndDate < '" + currentTime +"'");
		int a = DB.executeUpdateEx(sqlDealerLicense.toString(), get_TrxName());


		sqlColorCard = new StringBuffer ("UPDATE C_ColorCard SET ccStatus = 'I' "
				+ "FROM d_dealerlicense WHERE C_ColorCard.ccStatus = 'A' and "
				+ "d_dealerlicense.d_dealerlicense_id = C_ColorCard.d_dealerlicense_id "
				+ "AND d_dealerlicense.LicenseEndDate < '" + currentTime +"'");
		int b = DB.executeUpdateEx(sqlColorCard.toString(), get_TrxName());
		
		return a + " Dealer Licenses & "+b+" Color Cards Affected";
		
	}

}
