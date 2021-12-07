package org.topra.callouts;

import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.topra.model.MCExportDetails;

//org.topra.callouts.ExportVoid.processIt
public class ExportVoid extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCExportDetails exportDetails = new MCExportDetails(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (exportDetails.getDocStatus().equalsIgnoreCase("CO")) {

			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I void this?")) {
				exportDetails.setDocStatus("VO");
				exportDetails.save();

			}
		} else {
			throw new AdempiereException("Document is not completed!");
		}

		mTab.dataRefresh(true);
	}
}
