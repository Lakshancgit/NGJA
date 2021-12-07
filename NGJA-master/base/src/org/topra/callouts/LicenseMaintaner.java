package org.topra.callouts;

import java.util.Properties;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.topra.model.MCBackhoeService;
import org.topra.model.MCGemMining;
import org.topra.model.MCLicenseStatusChange;
import org.topra.model.MDDealerLicense;

//org.topra.callouts.LicenseMaintaner.processIt
public class LicenseMaintaner extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (mTab.getRecord_ID() == -1) {
			return;
		}
		MCLicenseStatusChange licenseStatusChange = new MCLicenseStatusChange(ctx, mTab.getRecord_ID(),
				mTab.getTrxInfo());
		if (licenseStatusChange.isDLJ()) {
			MDDealerLicense dealerLicense = new MDDealerLicense(ctx, licenseStatusChange.getD_DealerLicense_ID(),
					mTab.getTrxInfo());
			dealerLicense.setLicenseStatus(licenseStatusChange.getDLJ_NextStatus());
			dealerLicense.save();
		}
		if (licenseStatusChange.isMining()) {
			MCGemMining gemMining = new MCGemMining(ctx, licenseStatusChange.getC_GemMining_ID(), mTab.getTrxInfo());
			gemMining.setLicenseStatus(licenseStatusChange.getMining_NextStatus());
			gemMining.save();
		}
		if (licenseStatusChange.isBackhoe()) {
			MCBackhoeService backhoeService = new MCBackhoeService(ctx, licenseStatusChange.getC_BackhoeService_ID(),
					mTab.getTrxInfo());
			backhoeService.setLicenseStatus(licenseStatusChange.getBackhoe_NextStatus());
			backhoeService.save();
		}
	}
}
