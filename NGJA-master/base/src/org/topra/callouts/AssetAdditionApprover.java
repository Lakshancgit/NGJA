package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MAssetAddition;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;

//org.topra.callouts.AssetAdditionApprover.processIt
public class AssetAdditionApprover extends CalloutEngine {


	
	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		
		MAssetAddition assetAddition = new MAssetAddition(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

				MWFActivity[] activity = this.getWorkFLowActivity(assetAddition);
				// first node
				if (activity == null) {
					assetAddition.set_ValueOfColumn("WF_State", "DR");
					assetAddition.setProcessed(true);
					assetAddition.save();
					System.out.println("null");
				} else if (activity.length == 1) { // first node pass
					System.out.println(activity.length);
					if (assetAddition.get_ValueAsString("WF_State").equalsIgnoreCase("CO")) {
						assetAddition.processIt(MAssetAddition.DOCACTION_Complete);
					}else if (assetAddition.get_ValueAsString("WF_State").equalsIgnoreCase("VO")) {
						assetAddition.processIt(MAssetAddition.DOCACTION_Void);
					}
					this.processWorkFlow(assetAddition);
					assetAddition.setProcessed(true);
					assetAddition.save();
				} 

			mTab.dataRefresh(true);
			
		}return "";}

		
	

	private MWFActivity[] getWorkFLowActivity(MAssetAddition assetAddition) {

		// get workflow process
		MWFProcess process = new Query(assetAddition.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", assetAddition.get_TrxName())
						.setParameters(assetAddition.get_Table_ID(), assetAddition.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(assetAddition.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? ", assetAddition.get_TrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MAssetAddition assetAddition) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(assetAddition.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(assetAddition.get_Table_ID(), assetAddition.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(assetAddition.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(assetAddition.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
	
}
