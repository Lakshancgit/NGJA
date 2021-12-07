package org.topra.callouts;

import java.util.List;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.apps.AEnv;
import org.compiere.apps.AWindow;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MOrder;
import org.compiere.model.MQuery;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCBackhoeService;
import org.topra.model.MCBackhoeServiceFee;

/**
 * org.topra.callouts.BackhoeServiceApproval.ProcessServiceFeeWF
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 22nd of jan 2019
 */
public class BackhoeServiceApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MCBackhoeService mcBackhoeService = new MCBackhoeService(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

			MWFActivity[] activity = this.getWorkFLowActivity(mcBackhoeService);
			// first node
			if (activity == null) {
				mcBackhoeService.setLicenseStatus("SIA");
				mcBackhoeService.setProcessed(true);
				mcBackhoeService.save();
			} else if (activity.length == 2) { // first node pass

				this.processWorkFlow(mcBackhoeService);
				mcBackhoeService.setLicenseStatus("SDA");
				mcBackhoeService.setProcessed(true);
				mcBackhoeService.save();
			} else if (activity.length == 3) { // second node pass
				this.processWorkFlow(mcBackhoeService);
				mcBackhoeService.setLicenseStatus("A");
				mcBackhoeService.setProcessed(true);
				mcBackhoeService.save();
			} else if (activity.length == 4) { // third node pass
				this.processWorkFlow(mcBackhoeService);

			}
			mcBackhoeService.save();

		}
		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MCBackhoeService mcBackhoeService) {

		// get workflow process
		MWFProcess process = new Query(mcBackhoeService.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mcBackhoeService.get_TrxName())
						.setParameters(mcBackhoeService.get_Table_ID(), mcBackhoeService.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mcBackhoeService.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mcBackhoeService.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCBackhoeService mcBackhoeService) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mcBackhoeService.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mcBackhoeService.get_Table_ID(), mcBackhoeService.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mcBackhoeService.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mcBackhoeService.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}

	public String createOrder(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Order Confirmation", "Do I Create Order?")) {

			MCBackhoeServiceFee backhoeServiceFee = new MCBackhoeServiceFee(ctx, mTab.getRecord_ID(),
					mTab.getTrxInfo());
			MOrder mOrder = new MOrder(ctx, backhoeServiceFee.getC_Order_ID(), mTab.getTrxInfo());

			if (mOrder.getC_Order_ID() == 0 || mOrder.getDocStatus().equalsIgnoreCase("VO")) {

				MBPartner mbPartner = (MBPartner) backhoeServiceFee.getC_BPartner();
				MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(ctx, mbPartner.get_ID(), mTab.getTrxInfo());

				// VALIDATE THE BUSINESS PARTNER lOCATION
				if (bpls == null || bpls.length == 0)
					throw new AdempiereException("No Business partner Location found!");

				for (MBPartnerLocation bpl : bpls) {
					if (bpl.isShipTo()) {
						mOrder.setC_BPartner_Location_ID(bpl.get_ID());
						break;
					}
				}

				// VALIDATE THE BUSINESS PARTNER lOCATION
				if (mOrder.getC_BPartner_Location_ID() == 0)
					throw new AdempiereException("No Business partner Location found!");

				mOrder.setBPartner(mbPartner);
				mOrder.setC_DocTypeTarget_ID(1000039);
				mOrder.setSalesRep_ID(Env.getAD_User_ID(ctx));
				mOrder.setOrderType(String.valueOf(backhoeServiceFee.getC_BackhoeService_ID()));
				mOrder.save();
				backhoeServiceFee.setC_Order_ID(mOrder.getC_Order_ID());
				backhoeServiceFee.save();

				// Open The Window
				if (backhoeServiceFee.getC_Order_ID() == 0) {
					throw new AdempiereException("No any Order");
				}

				int Record_ID = backhoeServiceFee.getC_Order_ID();

				int AD_Window_ID = 1000181;
				String ColumnName = "C_Order_ID";
				MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

				@SuppressWarnings("deprecation")
				AWindow frame = new AWindow();
				if (!frame.initWindow(AD_Window_ID, query))

					AEnv.addToWindowManager(frame);
				AEnv.showCenterScreen(frame);
				frame = null;
			}

		}
		mTab.dataRefresh(true);
		return "";
	}

	public void openOrder(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCBackhoeServiceFee backhoeServiceFee = new MCBackhoeServiceFee(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (backhoeServiceFee.getC_Order_ID() == 0) {
			throw new AdempiereException("No any Order");
		}

		int Record_ID = backhoeServiceFee.getC_Order_ID();

		// Open Invoice
		int AD_Window_ID = 1000181;
		String ColumnName = "C_Order_ID";
		MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

		@SuppressWarnings("deprecation")
		AWindow frame = new AWindow();
		if (!frame.initWindow(AD_Window_ID, query))
			return;

		AEnv.addToWindowManager(frame);
		AEnv.showCenterScreen(frame);
		frame = null;

		mTab.dataRefresh(true);
		return;

	}

}
