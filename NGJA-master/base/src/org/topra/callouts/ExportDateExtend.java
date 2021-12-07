package org.topra.callouts;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.topra.model.MCExportNGJA;

//org.topra.callouts.ExportDateExtend.processIt
public class ExportDateExtend extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return ;

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I Extend the Expire Date?")) {
			
			MCExportNGJA mcExportNGJA = new MCExportNGJA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
			
			if ((boolean)value){
				
				Calendar ce = Calendar.getInstance();
				ce.setTime(mcExportNGJA.getExpDate());
				ce.add(Calendar.DATE, 150);
				Timestamp ts = new Timestamp(ce.getTimeInMillis());
				mTab.setValue("ExpExpireDate", ts);
				mTab.dataSave(true);
				mTab.dataRefresh();
			}
		}
	}

}
