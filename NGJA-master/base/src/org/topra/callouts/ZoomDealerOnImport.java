package org.topra.callouts;

import java.util.Properties;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.topra.model.MCDealerFile;
import org.topra.model.MCImportNGA;
import org.topra.model.MDDealerLicense;

public class ZoomDealerOnImport extends CalloutEngine {

public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		
		 MCImportNGA importNGA = new MCImportNGA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		 int dealerLicense_ID = importNGA.getLicenseNumber_ID();
		 
		 MDDealerLicense dealerLicense = new MDDealerLicense(ctx, dealerLicense_ID, mTab.getTrxInfo());
		 MBPartner mbPartner = new MBPartner(ctx, dealerLicense.getC_BPartner_ID(), mTab.getTrxInfo());
		 MCDealerFile dealerFile = new MCDealerFile(ctx, dealerLicense.getC_DealerFile_ID(), mTab.getTrxInfo());
			
		 
		 importNGA.setLogo_ID(mbPartner.getLogo_ID());
		 importNGA.setLicenseEndDate(dealerLicense.getLicenseEndDate());
		 importNGA.setNICPassNo(mbPartner.getValue());
		 importNGA.setFileNumber(dealerFile.getFileNo());
		 importNGA.setC_BPartner_ID(mbPartner.getC_BPartner_ID());
		 
		 importNGA.save();
		 mTab.dataRefresh(true);
		
		 return "";}
}
