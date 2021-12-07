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
import org.compiere.model.MPayment;
import org.compiere.model.MQuery;
import org.compiere.model.MTab;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.MCAuctionLicense;
import org.topra.model.MCBackhoeService;
import org.topra.model.MCDepositRelease;
import org.topra.model.MCGemMining;
import org.topra.model.MCLandDetails;



//org.topra.callouts.DepositRelease
public class DepositRelease extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MCDepositRelease depositRelease = new MCDepositRelease(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
			MCGemMining gemMining = new MCGemMining(ctx, depositRelease.getC_GemMining_ID(), mTab.getTrxInfo());
			MCLandDetails landDetails = new MCLandDetails(ctx, gemMining.getC_LandDetails_ID(), mTab.getTrxInfo());

			
			MWFActivity[] activity = this.getWorkFLowActivity(depositRelease);
			// first node
			if (activity == null) {
				depositRelease.setDepositReleaseStatus("SIA");
				depositRelease.setProcessed(true);
				depositRelease.save();
				landDetails.save();
				landDetails.setApplicationStatus("CL");
				
				
				if (depositRelease.getLicenseTypeMining().equalsIgnoreCase("AL")) {
					MCAuctionLicense auctionLicense = new MCAuctionLicense(ctx, depositRelease.getC_AuctionLicense_ID(),
							mTab.getTrxInfo());
					auctionLicense.setAuctionLicesneStatus("CL");
					auctionLicense.save();

				} else if (depositRelease.getLicenseTypeMining().equalsIgnoreCase("BL")) {
					MCBackhoeService mcBackhoeService = new MCBackhoeService(ctx,
							depositRelease.getC_BackhoeService_ID(), mTab.getTrxInfo());
					mcBackhoeService.setLicenseStatus("CL");
					mcBackhoeService.save();

				} else if (depositRelease.getLicenseTypeMining().equalsIgnoreCase("ML")) {
					gemMining.setLicenseStatus("CL");
					gemMining.save();

				}
				
			} else if (activity.length == 2) { // first node pass
				if (depositRelease.getDepositReleaseStatus().equalsIgnoreCase("SIA")) {
					depositRelease.setDepositReleaseStatus("SDDA");
					// depositRelease.setMiningLicenseStatus("CL");
					depositRelease.setProcessed(true);
					depositRelease.save();}
				
				this.processWorkFlow(depositRelease);
				
			} else if (activity.length == 3) { // second node pass
				
				if (depositRelease.getDepositReleaseStatus().equalsIgnoreCase("SDDA")) {
					depositRelease.setDepositReleaseStatus("RFA");
					depositRelease.setProcessed(true);
					depositRelease.save();}
				
				this.processWorkFlow(depositRelease);
				
			} else if (activity.length == 4) { // third node pass
				
				if (depositRelease.getDepositReleaseStatus().equalsIgnoreCase("SDDA")) {
					depositRelease.setDepositReleaseStatus("RFA");
					depositRelease.setProcessed(true);
					depositRelease.save();}
				
				this.processWorkFlow(depositRelease);

			} else if (activity.length == 5) { // third node pass

				if (depositRelease.getC_Payment_ID() == 0) {

					System.out.println("pay");
					throw new AdempiereException("No any Payment");
				} else {
					depositRelease.setDepositReleaseStatus("REL");
					depositRelease.setProcessed(true);
					depositRelease.save();
					System.out.println("else");
				}

				this.processWorkFlow(depositRelease);

			}
			depositRelease.save();
			
		}
			
		mTab.dataRefresh(true);
		return "";

		}
	




private MWFActivity[] getWorkFLowActivity(MCDepositRelease depositRelease) {

	// get workflow process
	MWFProcess process = new Query(depositRelease.getCtx(), MWFProcess.Table_Name,
			"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", depositRelease.get_TrxName())
					.setParameters(depositRelease.get_Table_ID(), depositRelease.get_ID())
					.setOnlyActiveRecords(true).first();

	if (process == null)
		return null;

	List<MWFActivity> activity = new Query(depositRelease.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
			depositRelease.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

	return activity.toArray(new MWFActivity[activity.size()]);
}

private void processWorkFlow(MCDepositRelease depositRelease) {

	Trx trx = Trx.get(Trx.createTrxName(), true);
	trx.start();

	// get workflow process
	MWFProcess process = new Query(depositRelease.getCtx(), MWFProcess.Table_Name,
			"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
					.setParameters(depositRelease.get_Table_ID(), depositRelease.get_ID())
					.setOnlyActiveRecords(true).first();

	MWFActivity activity = new Query(depositRelease.getCtx(), MWFActivity.Table_Name,
			"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
					.setOnlyActiveRecords(true).first();

	activity.setUserConfirmation(Env.getAD_User_ID(depositRelease.getCtx()), "");
	activity.save();

	trx.commit();
	trx.close();
}

	public void viewLicense(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCDepositRelease depositRelease = new MCDepositRelease(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MCGemMining mcGemMining = new MCGemMining(ctx, depositRelease.getC_GemMining_ID(), mTab.getTrxInfo());

		int Record_ID = mcGemMining.get_ID();

		if (Record_ID != 0) {
			// Open Bpartner
			int AD_Window_ID = 1000131;
			String ColumnName = "C_GemMining_ID";
			MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

			@SuppressWarnings("deprecation")
			AWindow frame = new AWindow();
			if (!frame.initWindow(AD_Window_ID, query))
				return;

			AEnv.addToWindowManager(frame);
			AEnv.showCenterScreen(frame);
			frame = null;

		}
		mTab.dataRefresh(true);
		return;
	}

	public void viewLand(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCDepositRelease depositRelease = new MCDepositRelease(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MCGemMining mcGemMining = new MCGemMining(ctx, depositRelease.getC_GemMining_ID(), mTab.getTrxInfo());

		int Record_ID = mcGemMining.getC_LandDetails_ID();
		System.out.println(Record_ID);
		if (Record_ID != 0) {
			// Open Bpartner
			int AD_Window_ID = 1000108;
			String ColumnName = "C_LandDetails_ID";
			MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

			@SuppressWarnings("deprecation")
			AWindow frame = new AWindow();
			if (!frame.initWindow(AD_Window_ID, query))
				return;

			AEnv.addToWindowManager(frame);
			AEnv.showCenterScreen(frame);
			frame = null;

		} else {
			throw new AdempiereException("No any lands");
		}

		mTab.dataRefresh(true);
		return;

	}

	public void addPayment(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCDepositRelease depositRelease = new MCDepositRelease(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MPayment payment;

		if (depositRelease.getC_Payment_ID() == 0) {
			payment = new MPayment(ctx, 0, mTab.getTrxInfo());
			payment.setC_BPartner_ID(depositRelease.getC_BPartner_ID());
			payment.setC_DocType_ID(1000009);
			payment.setTenderType("X");
			payment.setC_CashBook_ID(1000003);
			payment.setC_Currency_ID(313);
			
			payment.save();
			depositRelease.setC_Payment_ID(payment.getC_Payment_ID());
			depositRelease.save();
			
			int Record_ID = depositRelease.getC_Payment_ID();
			System.out.println(Record_ID);
			if (Record_ID != 0) {
				// Open Bpartner
				int AD_Window_ID = 1000189;
				String ColumnName = "C_Payment_ID";
				MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

				@SuppressWarnings("deprecation")
				AWindow frame = new AWindow();
				if (!frame.initWindow(AD_Window_ID, query))
					return;

				AEnv.addToWindowManager(frame);
				AEnv.showCenterScreen(frame);
				frame = null;

			}

		} else {
			payment = new MPayment(ctx, depositRelease.getC_Payment_ID(), mTab.getTrxInfo());
			int Record_ID = depositRelease.getC_Payment_ID();
			System.out.println(Record_ID);
			if (Record_ID != 0) {
				// Open Bpartner
				int AD_Window_ID = 1000189;
				String ColumnName = "C_Payment_ID";
				MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

				@SuppressWarnings("deprecation")
				AWindow frame = new AWindow();
				if (!frame.initWindow(AD_Window_ID, query))
					return;

				AEnv.addToWindowManager(frame);
				AEnv.showCenterScreen(frame);
				frame = null;

			}
		}
		mTab.dataRefresh(true);
		return;

	}
}
