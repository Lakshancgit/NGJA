package org.topra.callouts;

import java.util.Properties;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.topra.model.MCExportNGJA;
import org.topra.model.MDDealerLicense;


public class ZoomDealerOnExport extends CalloutEngine {

public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		
		 MCExportNGJA mcExportNGJA = new MCExportNGJA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		 int dealerLicense_ID = mcExportNGJA.getLicenseNumber_ID();
		 
		 MDDealerLicense dealerLicense = new MDDealerLicense(ctx, dealerLicense_ID, mTab.getTrxInfo());
		 MBPartner mbPartner = new MBPartner(ctx, dealerLicense.getC_BPartner_ID(), mTab.getTrxInfo());
		 
		 mcExportNGJA.setLogo_ID(mbPartner.getLogo_ID());
		 mcExportNGJA.setStockValue(dealerLicense.getgem_stock_value());
		 mcExportNGJA.setLicenseEndDate(dealerLicense.getLicenseEndDate());
		 mcExportNGJA.setNICPassNo(mbPartner.getValue());
		 mcExportNGJA.setC_DealerFile_ID(dealerLicense.getC_DealerFile_ID());
		 mcExportNGJA.setC_BPartner_ID(mbPartner.getC_BPartner_ID());
		 
		 mcExportNGJA.save();
		 mTab.dataRefresh(true);
		
		 return "";}
}
