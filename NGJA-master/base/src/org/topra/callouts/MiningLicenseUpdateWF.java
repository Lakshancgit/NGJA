package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.Query;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCLandSpecialConditions;
import org.topra.model.MCMiningLicenseUpgrade;

public class MiningLicenseUpdateWF extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MCMiningLicenseUpgrade mcMiningLicenseUpgrade = new MCMiningLicenseUpgrade(ctx, mTab.getRecord_ID(),
					mTab.getTrxInfo());

			MWFActivity[] activity = this.getWorkFLowActivity(mcMiningLicenseUpgrade);
			// first node
			if (activity == null) {
				if (mcMiningLicenseUpgrade.getStatus().equalsIgnoreCase("SIA") && mTab.getAD_Window_ID() == 1000162) {
					mcMiningLicenseUpgrade.setProcessed(true);
					mcMiningLicenseUpgrade.save();
				}

			} else if (activity.length == 2) {
				System.out.println(activity.length);// first node pass
				if (mcMiningLicenseUpgrade.getStatus().equalsIgnoreCase("SRA") && mTab.getAD_Window_ID() == 1000163) {
					mcMiningLicenseUpgrade.setProcessed(true);
					mcMiningLicenseUpgrade.save();

					this.processWorkFlow(mcMiningLicenseUpgrade);}
				} else if (activity.length == 3) { // second node pass

					System.out.println(activity.length);
					if (mcMiningLicenseUpgrade.getStatus().equalsIgnoreCase("U") ) {
						mcMiningLicenseUpgrade.setProcessed(true);
						mcMiningLicenseUpgrade.save();

						StringBuffer buffer = new StringBuffer(
								"SELECT  max(C_LandDetails_ID)  FROM C_LandDetails WHERE C_Invoice_ID="
										+ mcMiningLicenseUpgrade.getC_Invoice_ID());
						int C_LandDetails_ID = DB.getSQLValue(mTab.getTrxInfo(), buffer.toString());
						if (mcMiningLicenseUpgrade.getUpgradeMethod().equalsIgnoreCase("RC")) {
							StringBuffer stringBuffer = new StringBuffer(
									"SELECT  max(C_LandSpecialConditions_ID)  FROM C_LandSpecialConditions WHERE C_LandDetails_ID="
											+ C_LandDetails_ID);
							int C_LandSpecialConditions_ID = DB.getSQLValue(mTab.getTrxInfo(), stringBuffer.toString());

							MCLandSpecialConditions specialConditions = new MCLandSpecialConditions(ctx,
									C_LandSpecialConditions_ID, mTab.getTrxInfo());
							specialConditions.setStatus("IN");
							specialConditions.save();
							System.out.println(specialConditions.getStatus());
						}
						this.processWorkFlow(mcMiningLicenseUpgrade);
					} else {
						ADialog.error(WindowNo, null, "Incorrect Status!");
					}

				} else if (activity.length == 4) {
					System.out.println(activity.length);// first node pass
					mcMiningLicenseUpgrade.setProcessed(true);
					mcMiningLicenseUpgrade.save();

					this.processWorkFlow(mcMiningLicenseUpgrade);
				}
			}
		mTab.dataRefresh(true);
		return "";
		}



	private MWFActivity[] getWorkFLowActivity(MCMiningLicenseUpgrade mcMiningLicenseUpgrade) {

		// get workflow process
		MWFProcess process = new Query(mcMiningLicenseUpgrade.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mcMiningLicenseUpgrade.get_TrxName())
						.setParameters(mcMiningLicenseUpgrade.get_Table_ID(), mcMiningLicenseUpgrade.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mcMiningLicenseUpgrade.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? ", mcMiningLicenseUpgrade.get_TrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCMiningLicenseUpgrade mcMiningLicenseUpgrade) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mcMiningLicenseUpgrade.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mcMiningLicenseUpgrade.get_Table_ID(), mcMiningLicenseUpgrade.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mcMiningLicenseUpgrade.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mcMiningLicenseUpgrade.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}

}
