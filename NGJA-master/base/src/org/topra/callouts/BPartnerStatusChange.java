package org.topra.callouts;

import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.topra.model.MCBPStatusLog;

public class BPartnerStatusChange extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if (mTab.getRecord_ID() == -1) {
			return;
		}

		MCBPStatusLog mcbpStatusLog = new MCBPStatusLog(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {
			MBPartner mbPartner = (MBPartner) mcbpStatusLog.getC_BPartner();
			mbPartner.set_ValueOfColumn("bp_status", mcbpStatusLog.getbp_status());
			mbPartner.save();
			mcbpStatusLog.setProcessed(true);
			mcbpStatusLog.save();
		}
	}

}
