package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MRMA;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;

//org.topra.callouts.RMAApproval.processIt
public class RMAApproval extends CalloutEngine{
	
	public void processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1 || !(boolean) value) return;
		
		Trx trx = Trx.get(Trx.createTrxName(),true);
		trx.start();
		
		MRMA po = new MRMA(ctx , mTab.getRecord_ID() ,trx.getTrxName());
		
		//Purchase order approval
		if(!po.isSOTrx() && HardCoded.VendorRMADocType_ID == po.getC_DocType_ID() && !po.isSOTrx()) {
			
			if(ADialog.ask(WindowNo, null, "Process Confirmation", "Are you sure to send this for workflow?")) {
				
				MWFActivity [] activity = this.getWorkFLowActivity(po);
				
				if(activity == null)
					po.setIsActive(false);
				else if(activity.length == 1) { // first node pass
					this.processWorkFlow(po);
					if(this.getNextNode(po)!=null) {//second node is available
						po.setIsActive(false);
					}
					
				}else{ //complete the workflow
					this.processWorkFlow(po);	
				}
				
				
			}else {
				value = false;
			}
		}
		
		po.set_ValueOfColumn("SendForApproval", value);
		po.save();
		
		trx.commit();
		trx.close();
		
		mTab.dataRefresh(true);
	}
	
	private MWFActivity [] getWorkFLowActivity(MRMA po) {
		
		//get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name, "AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", po.get_TrxName())
		.setParameters(po.get_Table_ID() , po.get_ID())
		.setOnlyActiveRecords(true)
		.first();
		
		if(process == null)
			return null;
		
		List<MWFActivity> activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ", po.get_TrxName())
		.setParameters(process.get_ID())
		.setOnlyActiveRecords(true)
		.list();
		
		return activity.toArray(new MWFActivity[activity.size()]);
	}	
	
	private void processWorkFlow(MRMA po) {
		
		Trx trx = Trx.get(Trx.createTrxName(),true);
		trx.start();
		//get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name, "AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", po.get_TrxName())
		.setParameters(po.get_Table_ID() , po.get_ID())
		.setOnlyActiveRecords(true)
		.first();
		
		MWFActivity activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? AND wfstate='OS'", po.get_TrxName())
		.setParameters(process.get_ID())
		.setOnlyActiveRecords(true)
		.first();
		
		activity.setUserConfirmation(Env.getAD_User_ID(po.getCtx()), "");
		activity.save();
		
		trx.commit();
		trx.close();
	}
	
	private MWFActivity getNextNode(MRMA po) {
		
		//get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name, "AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", po.get_TrxName())
		.setParameters(po.get_Table_ID() , po.get_ID())
		.setOnlyActiveRecords(true)
		.first();
		
		if(process == null)
			return null;
		
		MWFActivity activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? AND wfstate='OS'", po.get_TrxName())
				.setParameters(process.get_ID())
				.setOnlyActiveRecords(true)
				.first();
		
		return activity;
	}

}
