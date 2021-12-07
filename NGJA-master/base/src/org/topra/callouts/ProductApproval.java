package org.topra.callouts;

import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MProduct;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;

//org.topra.callouts.ProductApproval.processIt
public class ProductApproval extends CalloutEngine{
	
	public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
		if(mTab.getRecord_ID() == -1) return "";
		
		MProduct product = new MProduct(ctx , mTab.getRecord_ID() ,mTab.getTrxInfo());
		
		if(!ADialog.ask(WindowNo, null, "Process Confirmation", "Are you sure to process this record?")) {
			product.setIsActive(false);
		}else {
			if(HardCoded.tempProduct_Group_ID ==  product.getM_Product_Group_ID()) {
				
				String status =  product.get_ValueAsString("Status");
				
				//Initial point : sent to the workflow
				if(status.equalsIgnoreCase("DR") || status.equalsIgnoreCase("")) {
					
					product.set_ValueOfColumn("Status", "MA");//Send For Manager Approval
					product.set_ValueOfColumn("Processed", "Y");
					product.setIsActive(false);
					
				}else if(status.equalsIgnoreCase("MA")) {
					
					product.set_ValueOfColumn("Status", "AP");//Send For Manager Approval
					product.set_ValueOfColumn("Processed", "N");
					product.setM_Product_Group_ID(HardCoded.product_Group_ID);
					this.processWorkFlow(product);
				}
			}
		}
		
		product.save();
		mTab.dataRefresh(true);
		return "";
	}
	
	private void processWorkFlow(MProduct po) {
		
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
	}
}
