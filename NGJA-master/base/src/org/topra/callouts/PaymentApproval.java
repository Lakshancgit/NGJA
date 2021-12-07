package org.topra.callouts;

import java.util.List;
import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MPayment;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;

//org.topra.callouts.PaymentApproval.processIt
public class PaymentApproval extends CalloutEngine{
	
	public void processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1 || !(boolean) value) return;
		
		MPayment payment = new MPayment(ctx , mTab.getRecord_ID() ,mTab.getTrxInfo());
		
		//AP payment approval
		if(!payment.isReceipt() && HardCoded.APPayment_Doctype_ID == payment.getC_DocType_ID()) {
			
			if(ADialog.ask(WindowNo, null, "Process Confirmation", "Are you sure to send this for workflow?")) {
					
					MWFActivity [] activity = this.getWorkFLowActivity(payment);
					//first node
					if(activity == null)
						payment.setIsActive(false);
					else if(activity.length == 1) { // first node pass
						
						this.processWorkFlow(payment);
						if(this.getNextNode(payment)!=null) {//second node is available
							payment.processIt(MPayment.DOCACTION_Prepare);
							payment.setIsActive(false);
						}
						
					}else if(activity.length == 2) { //complete the workflow
						this.processWorkFlow(payment);
					}
			}else {
					value = false;
			}
		}
		
		payment.set_ValueOfColumn("SendForApproval", value);
		payment.save();
		mTab.dataRefresh(true);
	}
	
	private MWFActivity [] getWorkFLowActivity(MPayment po) {
		
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
	
	private MWFActivity getNextNode(MPayment po) {
		
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
	
	private void processWorkFlow(MPayment po) {
		
		Trx trx = Trx.get(Trx.createTrxName(),true);
		trx.start();
		
		//get workflow process
		MWFProcess process = new Query(po.getCtx(), MWFProcess.Table_Name, "AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
		.setParameters(po.get_Table_ID() , po.get_ID())
		.setOnlyActiveRecords(true)
		.first();
		
		MWFActivity activity = new Query(po.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName())
		.setParameters(process.get_ID())
		.setOnlyActiveRecords(true)
		.first();
		
		activity.setUserConfirmation(Env.getAD_User_ID(po.getCtx()), "");
		activity.save();
		
		trx.commit();
		trx.close();
	}
	
	

}
