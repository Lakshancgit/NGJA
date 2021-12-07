package org.topra.callouts;

import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.AEnv;
import org.compiere.apps.AWindow;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MQuery;
import org.topra.model.MCGemMining;



public class MiningBPartnerViewer extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;
		MCGemMining mcGemMining = new MCGemMining(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		int Record_ID = mcGemMining.getC_BPartner_ID();
		System.out.println(Record_ID);
		if (Record_ID!=0) {
			//Open Bpartner 
			int AD_Window_ID = 1000168;
			String ColumnName = "C_BPartner_ID";
			MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

			@SuppressWarnings("deprecation")
			AWindow frame = new AWindow();
			if (!frame.initWindow(AD_Window_ID, query))
				return;

			AEnv.addToWindowManager(frame);
			AEnv.showCenterScreen(frame);
			frame = null;
	
		}else {
			throw new AdempiereException("No any BPartner");
		}
		
		mTab.dataRefresh(true);
		return;
	}
	
	public void landViewer(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;
		MCGemMining mcGemMining = new MCGemMining(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		int Record_ID = mcGemMining.getC_LandDetails_ID();
		System.out.println(Record_ID);
		if (Record_ID!=0) {
			//Open Bpartner 
			int AD_Window_ID = 1000108;
			String ColumnName = "C_LandDetails_ID";
			MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

			@SuppressWarnings("deprecation")
			AWindow frame = new AWindow();
			if (!frame.initWindow(AD_Window_ID, query))
				return;

			AEnv.addToWindowManager(frame);
			AEnv.showCenterScreen(frame);
			frame = null;
	
		}else {
			throw new AdempiereException("No any lands");
		}
		
		mTab.dataRefresh(true);
		return;
	}
	
}
