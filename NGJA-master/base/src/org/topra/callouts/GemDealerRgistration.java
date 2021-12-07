package org.topra.callouts;

import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;

//Auther Lakshan org.topra.callouts.GemDealerRgistration.processIt

public class GemDealerRgistration extends CalloutEngine {
	
public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		
		MBPartner mbPartner = new MBPartner(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if (mbPartner.getC_BP_Group_ID() == 1000010 || mbPartner.getC_BP_Group_ID() == 1000005) {
		if(ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")){
			
			System.out.println("Executed");
			mbPartner.set_ValueOfColumn("Processed", "Y");
			mbPartner.save();	
		}}
	mTab.dataRefresh(true);
	return "";
	}

}
