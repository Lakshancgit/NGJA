package org.topra.callouts;

import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.topra.model.MCValuationCertificate;


//Auther Lakshan 
public class CertificateCancellation extends CalloutEngine {

	
public String detailedCacellation (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		
	    MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo()); 
	    
		String status=  (String) mTab.getValue("DetailCertStatus");
	    if (status.equalsIgnoreCase("CN")) {
	    	
	    	if(!ADialog.ask(WindowNo, null, "Confirm cancellation", "Are you sure?")){
	    			mcValuationCertificate.set_ValueOfColumn("DetailCertStatus", "O");
				}else {
					mcValuationCertificate.set_ValueOfColumn("DetailCertStatus", "CN");
				}
	    	
	    }else if(status.equalsIgnoreCase("C")){
	    	
	    	if(!ADialog.ask(WindowNo, null, "Confirm Completion", "Are you sure?")){
	    			mcValuationCertificate.set_ValueOfColumn("DetailCertStatus", "O");
				}else {
					mcValuationCertificate.set_ValueOfColumn("DetailCertStatus", "C");
				}
					
	    }
	    
	    mcValuationCertificate.save();    
	    mTab.dataRefresh(true);
	    return "";
	}



public String memoCancellation (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
	if(mTab.getRecord_ID() == -1) return "";
	MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo()); 
	String status=  (String) mTab.getValue("MemoCertStatus");
	
	if (status.equalsIgnoreCase("CN")) {
		
		if(!ADialog.ask(WindowNo, null, "Confirm cancellation", "Are you sure?")){
			mcValuationCertificate.set_ValueOfColumn("MemoCertStatus", "O");	
		}else {
			mcValuationCertificate.set_ValueOfColumn("MemoCertStatus", "CN");
		}	
		
	}else if(status.equalsIgnoreCase("C")){
	    	
	    if(!ADialog.ask(WindowNo, null, "Confirm Completion", "Are you sure?")) {
	    	
	    	mcValuationCertificate.set_ValueOfColumn("MemoCertStatus", "O");
		}else {
			mcValuationCertificate.set_ValueOfColumn("MemoCertStatus", "C");
				}
		}
		
	mcValuationCertificate.save();
	mTab.dataRefresh(true);
	return "";
}


public String  photoCancellation (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
	if(mTab.getRecord_ID() == -1) return "";
	
    MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo()); 
	String status= (String) mTab.getValue("PhotoCertStatus");
    
    if (status.equalsIgnoreCase("CN")) {
		
		if(!ADialog.ask(WindowNo, null, "Confirm cancellation", "Are you sure?")){
			mcValuationCertificate.set_ValueOfColumn("PhotoCertStatus", "O");
		}else {
			mcValuationCertificate.set_ValueOfColumn("PhotoCertStatus", "CN");
		}	
	}else if(status.equalsIgnoreCase("C")){
	    	
	    if(!ADialog.ask(WindowNo, null, "Confirm Completion", "Are you sure?")){
	    	mcValuationCertificate.set_ValueOfColumn("PhotoCertStatus", "O");
		}else {
			mcValuationCertificate.set_ValueOfColumn("PhotoCertStatus", "C");
				}
		}
    
    mcValuationCertificate.save();
    mTab.dataRefresh(true);
    return "";
}



public String PhotoMemoCacellation (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
	if(mTab.getRecord_ID() == -1) return "";
	
    MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo()); 
    
	String status=  (String) mTab.getValue("PhotoMemoCertStatus");
    if (status.equalsIgnoreCase("CN")) {
    	
    	if(!ADialog.ask(WindowNo, null, "Confirm cancellation", "Are you sure?")){
    			mcValuationCertificate.set_ValueOfColumn("PhotoMemoCertStatus", "O");
			}else {
				mcValuationCertificate.set_ValueOfColumn("PhotoMemoCertStatus", "CN");
			}
    	
    }else if(status.equalsIgnoreCase("C")){
    	
    	if(!ADialog.ask(WindowNo, null, "Confirm Completion", "Are you sure?")){
    			mcValuationCertificate.set_ValueOfColumn("PhotoMemoCertStatus", "O");
			}else {
				mcValuationCertificate.set_ValueOfColumn("PhotoMemoCertStatus", "C");
			}
				
    }
    
    mcValuationCertificate.save();    
    mTab.dataRefresh(true);
    return "";
}
	
	
}
