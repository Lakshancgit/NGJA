package org.topra.callouts;

import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.DB;
import org.topra.model.MCDealerFile;

public class ProcessFile extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {
			MCDealerFile dealerFile = new MCDealerFile(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
			dealerFile.setProcessed(true);
			dealerFile.save();

			mTab.dataRefresh(true);
		}
		return "";
	}

	public String reactivateIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I unprocess this?")) {
			MCDealerFile dealerFile = new MCDealerFile(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
			dealerFile.setProcessed(false);
			dealerFile.save();

			mTab.dataRefresh(true);
		}
		return "";
	}

}
