package org.topra.callouts;

import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.apps.ProcessCtl;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MProcess;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.topra.model.HardCoded;
import org.topra.model.MCColorCard;

//Auther Lakshan 

public class ColorCardAproval extends CalloutEngine {

public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		MCColorCard mcColorCard = new MCColorCard(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if(mcColorCard.getCCStatus().equals("P")) {
			if(ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")){
				mcColorCard.setCCStatus("A");
				mcColorCard.setProcessed(true);
				mcColorCard.save();}
		}else if (mcColorCard.getCCStatus().equals("A")) {
			if(ADialog.ask(WindowNo, null, "Print Confirmation", "Do I print this?")){
				int table_ID = mTab.getAD_Table_ID();
				int record_ID = mTab.getRecord_ID();
				int AD_Process_ID = HardCoded.ColorCard_ID;
				MProcess process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());
				ProcessInfo pi = new ProcessInfo ("Color Card", AD_Process_ID, table_ID, record_ID);
				pi.setAD_User_ID (Env.getAD_User_ID(ctx));
				pi.setAD_Client_ID (Env.getAD_Client_ID(ctx));
				pi.setPrintPreview(!process.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), pi, null);
				mcColorCard.setPrinted(true);
				mcColorCard.save();}
		}
		mTab.dataRefresh(true);
		return "";}
	
	
}