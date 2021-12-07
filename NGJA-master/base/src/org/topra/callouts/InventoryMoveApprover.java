package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MMovement;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;


public class InventoryMoveApprover extends CalloutEngine {

	
	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		
		MMovement movement = new MMovement(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		
			if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

				MWFActivity[] activity = this.getWorkFLowActivity(movement);
				// first node
				if (activity == null) {
					movement.set_ValueOfColumn("WF_State", "PO");
					movement.setProcessed(true);
					movement.save();
					System.out.println("null");
				} else if (activity.length == 1) { // first node pass
					System.out.println(activity.length);
					if (movement.get_ValueAsString("WF_State").equalsIgnoreCase("CO")) {
						movement.processIt(MMovement.DOCACTION_Complete);
					}else if (movement.get_ValueAsString("WF_State").equalsIgnoreCase("VO")) {
						movement.processIt(MMovement.DOCACTION_Void);
					}
					this.processWorkFlow(movement);
					movement.setProcessed(true);
					movement.save();
				} 

			mTab.dataRefresh(true);
			
		}return "";}

		
	

	private MWFActivity[] getWorkFLowActivity(MMovement movement) {

		// get workflow process
		MWFProcess process = new Query(movement.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", movement.get_TrxName())
						.setParameters(movement.get_Table_ID(), movement.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(movement.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? ", movement.get_TrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MMovement movement) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(movement.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(movement.get_Table_ID(), movement.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(movement.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(movement.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}
	
	
}
