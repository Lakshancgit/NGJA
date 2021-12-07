package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCLicenseStatusChange extends X_C_LicenseStatusChange {

	public MCLicenseStatusChange(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCLicenseStatusChange(Properties ctx, int C_LicenseStatusChange_ID, String trxName) {
		super(ctx, C_LicenseStatusChange_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	protected boolean beforeSave(boolean newRecord) {

		if (this.isDLJ()) {
			MDDealerLicense dealerLicense = new MDDealerLicense(this.getCtx(), this.getD_DealerLicense_ID(),
					this.get_TrxName());
			this.setLicenseStatus(dealerLicense.getLicenseStatus());
			this.setC_BPartner_ID(dealerLicense.getC_BPartner_ID());

		} else if (this.isMining()) {
			MCGemMining gemMining = new MCGemMining(this.getCtx(), this.getC_GemMining_ID(), this.get_TrxName());
			this.setLicenseStatus(gemMining.getLicenseStatus());
			this.setC_BPartner_ID(gemMining.getC_BPartner_ID());

		} else if (this.isBackhoe()) {
			MCBackhoeService backhoeService = new MCBackhoeService(this.getCtx(), this.getC_BackhoeService_ID(),
					this.get_TrxName());
			this.setLicenseStatus(backhoeService.getLicenseStatus());
			this.setC_BPartner_ID(backhoeService.getC_BPartner_ID());

		}
		return true;
	} // beforeSave

}
