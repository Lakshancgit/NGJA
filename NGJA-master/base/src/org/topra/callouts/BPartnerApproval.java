package org.topra.callouts;

import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;

//org.topra.callouts.BPartnerApproval.processIt
public class BPartnerApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MBPartner bp = new MBPartner(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (!ADialog.ask(WindowNo, null, "Process Confirmation", "Are you sure to process this record?")) {
			bp.setIsActive(false);
		} else {

			//process Customer Registration (Valuation)
			bp.set_ValueOfColumn("Processed", "Y");

			// Supplier Approval
			if (HardCoded.tempVendor_Group_ID == bp.getC_BP_Group_ID()
					|| HardCoded.vendor_Group_ID == bp.getC_BP_Group_ID()) {

				String status = bp.get_ValueAsString("Status");

				// Initial point : sent to the workflow
				if (status.equalsIgnoreCase("DR") || status.equalsIgnoreCase("")) {
					bp.set_ValueOfColumn("Status", "MA");// Send For Manager Approval
					bp.set_ValueOfColumn("Processed", "Y");
					bp.setIsActive(false);

				} else if (status.equalsIgnoreCase("MA")) {
					bp.set_ValueOfColumn("Status", "AP");// Send For Manager Approval
					bp.set_ValueOfColumn("Processed", "N");
					bp.setC_BP_Group_ID(HardCoded.vendor_Group_ID);
					bp.setIsVendor(true);
					this.processWorkFlow(bp);
				}
			}
		}

		bp.save();
		mTab.dataRefresh(true);
		return "";
	}

	private void processWorkFlow(MBPartner po) {

		// get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", po.get_TrxName())
						.setParameters(po.get_Table_ID(), po.get_ID()).setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? AND wfstate='OS'",
				po.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(po.getCtx()), "");
		activity.save();
	}
}
