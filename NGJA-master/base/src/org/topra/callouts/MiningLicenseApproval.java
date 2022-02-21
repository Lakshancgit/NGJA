package org.topra.callouts;

import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.apps.ProcessCtl;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MPayment;
import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfo;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;
import org.topra.model.MCGemMining;
import org.topra.model.MCLandDetails;
import org.topra.model.MCLandSpecialConditions;
import org.topra.model.MCMiningLicenseUpgrade;
import org.topra.model.MDDealerLicense;

import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.session.NullSessionException;

import org.topra.form.MiningLicenSinhapaInput;

/**
 * org.topra.callouts.MiningLicenseApproval
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date January 10, 2019 at 12:59:26 PM
 */

public class MiningLicenseApproval extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			MCGemMining mcGemMining = new MCGemMining(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

			MWFActivity[] activity = this.getWorkFLowActivity(mcGemMining);
			mcGemMining.save();
			mTab.dataRefresh(true);
			
			// first node
			if (activity == null) {
				mcGemMining.setLicenseStatus("SIA");
				mcGemMining.setProcessed(true);
				mcGemMining.save();

				MCLandDetails landDetails = new MCLandDetails(ctx, mcGemMining.getC_LandDetails_ID(),
						mTab.getTrxInfo());
				landDetails.setApplicationStatus("LIP");
				landDetails.save();
			} else if (activity.length == 2) { // first node pass
				mcGemMining.setLicenseStatus("SDDA");
				mcGemMining.setProcessed(true);
				mcGemMining.save();
				this.processWorkFlow(mcGemMining);
			} else if (activity.length == 3) { // second node pass

				if (mcGemMining.getLicenseStatus().equals("SDDA") && mTab.getAD_Window_ID() == 1000147) {
					ADialog.error(0, null, "Invalid Status");
					throw new AdempiereException("Invalid Status");
				} else {

					mcGemMining.setProcessed(true);
					mcGemMining.save();
					this.processWorkFlow(mcGemMining);
				}
			} else if (activity.length == 4) { // third node pass

				if (mcGemMining.getLicenseStatus().equals("SCA") && mTab.getAD_Window_ID() == 1000148) {
					mcGemMining.setLicenseStatus("A");
					mcGemMining.setDateConfirm(new Timestamp(System.currentTimeMillis()));
					mcGemMining.setProcessed(true);
					mcGemMining.save();

				} else {
					mcGemMining.setProcessed(true);
					mcGemMining.save();
				}
				this.processWorkFlow(mcGemMining);
			} else if (activity.length == 5) { // third node pass
				mcGemMining.setProcessed(true);
				mcGemMining.save();
				this.processWorkFlow(mcGemMining);

			}else if (activity.length == 6) { // third node pass
				mcGemMining.setProcessed(true);
				mcGemMining.save();
				this.processWorkFlow(mcGemMining);

			}else if (activity.length == 7) { // third node pass
				mcGemMining.setProcessed(true);
				mcGemMining.save();
				this.processWorkFlow(mcGemMining);

			}
			mcGemMining.save();
			mTab.dataRefresh(true);
		}
		
		mTab.dataRefresh(true);
		return "";
	}
	
	public String compeleteIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

			MCGemMining mcGemMining = new MCGemMining(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

			MWFActivity[] activity = this.getWorkFLowActivity(mcGemMining);
			mcGemMining.save();
			mTab.dataRefresh(true);
			
			if (activity.length == 7) { // third node pass
				mcGemMining.setProcessed(true);
				mcGemMining.save();
				this.processWorkFlow(mcGemMining);

			}
			mcGemMining.save();
			mTab.dataRefresh(true);
		
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MCGemMining mcGemMining) {

		// get workflow process
		MWFProcess process = new Query(mcGemMining.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mcGemMining.get_TrxName())
						.setParameters(mcGemMining.get_Table_ID(), mcGemMining.get_ID()).setOnlyActiveRecords(true)
						.first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mcGemMining.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mcGemMining.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MCGemMining mcGemMining) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mcGemMining.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mcGemMining.get_Table_ID(), mcGemMining.get_ID()).setOnlyActiveRecords(true)
						.first();

		MWFActivity activity = new Query(mcGemMining.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mcGemMining.getCtx()), "");
		activity.save();
		

		trx.commit();
		trx.close();
	}

	public void printLicense(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;
		MCGemMining licence = new MCGemMining(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		new MiningLicenSinhapaInput().initComponents(licence);
	}

	public void printLicenseUpgrade(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCMiningLicenseUpgrade licenseUpgrade = new MCMiningLicenseUpgrade(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MCGemMining licence = new MCGemMining(ctx, licenseUpgrade.getC_GemMining_ID(), mTab.getTrxInfo());

		new MiningLicenSinhapaInput().initComponents(licence);
	}

	

	public String print(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCGemMining licence = new MCGemMining(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		int AD_Process_ID = HardCoded.MiningLicenseSinhalaProcess_ID;
		MProcess process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());
		int table_ID = 1000145;
		int record_ID = licence.getC_GemMining_ID();

		ProcessInfo processInfo = new ProcessInfo("Mining License", AD_Process_ID, table_ID, record_ID);
		processInfo.setAD_User_ID(Env.getAD_User_ID(ctx));
		processInfo.setAD_Client_ID(Env.getAD_Client_ID(ctx));
		processInfo.setPrintPreview(!process.isDirectPrint());
		ProcessCtl.process(null, mTab.getWindowNo(), processInfo, null);
		licence.setProcessed(true);
		licence.setPrinted(true);
		licence.save();
		//sendMsg("Mining License", ctx, mTab, licence);
		mTab.dataRefresh();

		return "";

	}

	public String Upgradeprint(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";
		MCMiningLicenseUpgrade licenseUpgrade = new MCMiningLicenseUpgrade(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		MCGemMining licence = new MCGemMining(ctx, licenseUpgrade.getC_GemMining_ID(), mTab.getTrxInfo());
		int AD_Process_ID = HardCoded.MiningLicenseSinhalaProcess_ID;
		MProcess process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());
		int table_ID = 1000145;
		int record_ID = licence.getC_GemMining_ID();

		ProcessInfo processInfo = new ProcessInfo("Mining License", AD_Process_ID, table_ID, record_ID);
		processInfo.setAD_User_ID(Env.getAD_User_ID(ctx));
		processInfo.setAD_Client_ID(Env.getAD_Client_ID(ctx));
		processInfo.setPrintPreview(!process.isDirectPrint());
		ProcessCtl.process(null, mTab.getWindowNo(), processInfo, null);
		licence.setProcessed(true);
		licence.setPrinted(true);
		licence.save();
		//sendMsg("Mining License", ctx, mTab, licence);
		mTab.dataRefresh();

		return "";

	}
	
	
	private void sendMsg(String license, Properties ctx,GridTab mTab,MCGemMining licence) {

		String mobileNo= "";
		
		//get Business Partner

		MBPartner mbPartner= new MBPartner(ctx, licence.getC_BPartner_ID(), mTab.getTrxInfo());
		MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(ctx, mbPartner.get_ID(),
				mTab.getTrxInfo());

		// VALIDATE THE BUSINESS PARTNER lOCATION
		if (bpls == null || bpls.length == 0)
			throw new AdempiereException("No Business partner Location found!");

		for (MBPartnerLocation bpl : bpls) {
			if (!bpl.getPhone().equalsIgnoreCase("")) {
				mobileNo=bpl.getPhone();
				break;
			}
		}
		
		lk.mobitel.esms.ws.User user = new lk.mobitel.esms.ws.User();
		user.setUsername("esmsusr_5go");
		user.setPassword("Test@123");

		lk.mobitel.esms.test.ServiceTest st = new lk.mobitel.esms.test.ServiceTest(); // To test if the service is
		System.out.println(st.testService(user));

		lk.mobitel.esms.session.SessionManager sm = lk.mobitel.esms.session.SessionManager.getInstance();

		sm.login(user); // Create session

		System.out.println(sm.isSession());

		lk.mobitel.esms.ws.SmsMessage msg = new lk.mobitel.esms.ws.SmsMessage();
		msg.setMessage("Dear "+mbPartner.getName()+"\\Your certificate is ready, Please collect.\n"+license +" "+licence.getDocumentNo());
		msg.setSender("NGJA");
		msg.setMessageType(1);
		msg.getRecipients().add(mobileNo);
		SMSManager smsMgr = new SMSManager();

		try{
			System.out.println(smsMgr.sendMessage(msg)); // Send alphanumeric message
		}catch (NullSessionException ex)
		{

//			 Logger.getLogger(ESMSV3Client.class.getName()).log(Level.SEVERE, null, ex);

		}
		
	}

}

//(select filenumber from c_bpartner where c_bpartner.c_bpartner_id=c_gemmining.c_bpartner_id)
