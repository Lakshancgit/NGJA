package org.topra.callouts;

import java.util.Properties;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MInvoice;
import org.topra.model.MCReceivingNote;

//Auther Lakshan

public class LoadBpartnerOnInvoiceByRNote extends CalloutEngine {

public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		
		MInvoice invoice = new MInvoice(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		//int sId = mTab.get_ValueAsInt("C_ReceivingNote_ID");
		int sId = (int) mTab.getValue("C_ReceivingNote_ID");
		MCReceivingNote mcReceivingNote = new MCReceivingNote(ctx, sId, mTab.getTrxInfo());
		
		if (mcReceivingNote.get_ID() == -1 || mcReceivingNote==null) {
			return "";
		}
		
		invoice.setC_BPartner_ID(mcReceivingNote.getC_BPartner_ID());
	
		System.out.println("Excuted");
		
		return "";}
}

