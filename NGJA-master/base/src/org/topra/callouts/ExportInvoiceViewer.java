package org.topra.callouts;

import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.AEnv;
import org.compiere.apps.AWindow;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MQuery;
import org.topra.model.MCExportNGJA;

/**
 * org.topra.callouts.ExportInvoiceViewer
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 29th of jan 2019
 */
public class ExportInvoiceViewer extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCExportNGJA exportNGJA = new MCExportNGJA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if (exportNGJA.getC_Invoice_ID() == 0) {
			throw new AdempiereException("No any Invoice");
		}

		int Record_ID = (Integer) mTab.getValue("C_Invoice_ID");

		// Open Invoice
		int AD_Window_ID = 1000149;
		String ColumnName = "C_Invoice_ID";
		MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

		@SuppressWarnings("deprecation")
		AWindow frame = new AWindow();
		if (!frame.initWindow(AD_Window_ID, query))
			return;

		AEnv.addToWindowManager(frame);
		AEnv.showCenterScreen(frame);
		frame = null;

		mTab.dataRefresh(true);
		return;
	}

}
