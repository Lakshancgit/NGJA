package org.topra.callouts;

import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.topra.model.MDDealerLicense;

//Auther Lskshan
//27th of Dec 2018
public class InactiveDealerLicense extends CalloutEngine {
	
public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		
	
		if(ADialog.ask(WindowNo, null, "Inactive Confirmation", "Do I Inactive this license?")){
			MDDealerLicense mdDealerLicense = new MDDealerLicense(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
			mdDealerLicense.setLicenseStatus("I");
			mdDealerLicense.save();
			
		}

		mTab.dataRefresh(true);
		return "";}}
