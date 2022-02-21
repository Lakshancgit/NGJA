package org.topra.callouts;

import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MSequence;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.compiere.wf.MWFActivity;
import org.compiere.wf.MWFProcess;
import org.topra.model.HardCoded;
import org.topra.model.MCGemMining;
import org.topra.model.MDDealerLicense;

import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.session.NullSessionException;

//Auther Lakshan
//December 5, 2018 at 5:30:58 PM
//
public class DealerLicenseAproval extends CalloutEngine {

	public String processWhenPrintIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MDDealerLicense mdDealerLicense = new MDDealerLicense(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		MWFActivity[] activity = this.getWorkFLowActivity(mdDealerLicense);

		if (activity != null) {

			this.processWorkFlow(mdDealerLicense);

		}

		mTab.dataRefresh(true);
		return "";
	}

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MDDealerLicense mdDealerLicense = new MDDealerLicense(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		MWFActivity[] activity = this.getWorkFLowActivity(mdDealerLicense);

		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			mdDealerLicense = new MDDealerLicense(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

			activity = this.getWorkFLowActivity(mdDealerLicense);
			// first node
			if (activity == null) {
				if (mdDealerLicense.getC_Payment_ID() != 0) {
					mdDealerLicense.setLicenseStatus("SA");
					mdDealerLicense.setProcessed(true);
					mdDealerLicense.save();
				} else {
					throw new AdempiereException("Please add the Payment");
				}
			} else if (activity.length == 2) { // first node pass

				this.processWorkFlow(mdDealerLicense);
				mdDealerLicense.setLicenseStatus("SDA");
				mdDealerLicense.setProcessed(true);
				mdDealerLicense.save();
			} else if (activity.length == 3) { // second node pass

				if (mdDealerLicense.getC_DocType_ID() == HardCoded.JewelleryLicenseDocType_ID) {

					Calendar ce = Calendar.getInstance();
					ce.setTime(mdDealerLicense.getLicenseStartDate());
					int year = ce.get(Calendar.YEAR);
					int month = ce.get(Calendar.MONTH) + 1;
					MSequence mSequence = new MSequence(ctx, HardCoded.JewelleryBusinessDocSequence_ID,
							mTab.getTrxInfo());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					mdDealerLicense.setDocumentNo(
							year + "" + month + prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

					mdDealerLicense.setLicenseStatus("A");
					mdDealerLicense.setProcessed(true);
					mdDealerLicense.save();
					mTab.dataRefresh(true);
					try {
						sendMsg("Dealer License", ctx, mTab, mdDealerLicense);
					} catch (Exception e) {
						throw new AdempiereException("SMS not sent!");
					}
				} else {
					mdDealerLicense.setLicenseStatus("SCA");
					mdDealerLicense.setProcessed(true);
					mdDealerLicense.save();
				}
				this.processWorkFlow(mdDealerLicense);
			} else if (activity.length == 4) { // third node pass
				if (mdDealerLicense.getC_Payment_ID() != 0) {
					this.processWorkFlow(mdDealerLicense);
					mdDealerLicense.setLicenseStatus("A");
					mdDealerLicense.setProcessed(true);

					mdDealerLicense.save();

					Calendar ce = Calendar.getInstance();
					ce.setTime(mdDealerLicense.getLicenseStartDate());
					int year = ce.get(Calendar.YEAR);
					// genarate License numbers
					if (mdDealerLicense.getLicenseStatus().equalsIgnoreCase("A")) {

						int month = ce.get(Calendar.MONTH) + 1;
						// TODO Auto-generated method stub

						if (mdDealerLicense.getC_DocType_ID() == HardCoded.GemDealerLicenseDocType_ID) {

							MSequence mSequence = new MSequence(ctx, HardCoded.DealerLicenseDocSequence_ID,
									mTab.getTrxInfo());
							String prefix, sufix;

							if (mSequence.getPrefix() == null) {
								prefix = "";
							} else {
								prefix = mSequence.getPrefix();
							}

							if (mSequence.getSuffix() == null) {
								sufix = "";
							} else {
								sufix = mSequence.getSuffix();
							}
							mdDealerLicense.setDocumentNo(
									year + "" + month + prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
							mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
							mSequence.save();

						} else if (mdDealerLicense.getC_DocType_ID() == HardCoded.LapidaristLicenseDocType_ID) {

							MSequence mSequence = new MSequence(ctx, HardCoded.LapidarisLicenseDocSequence_ID,
									mTab.getTrxInfo());
							String prefix, sufix;

							if (mSequence.getPrefix() == null) {
								prefix = "";
							} else {
								prefix = mSequence.getPrefix();
							}

							if (mSequence.getSuffix() == null) {
								sufix = "";
							} else {
								sufix = mSequence.getSuffix();
							}
							mdDealerLicense.setDocumentNo(
									year + "" + month + prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
							mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
							mSequence.save();

						}
						mdDealerLicense.save();
						mTab.dataRefresh(true);
						try{
							sendMsg("Dealer License", ctx, mTab, mdDealerLicense);
						} catch (Exception e) {
							throw new AdempiereException("SMS not sent!");
						}
						}
					}
				} else {
					throw new AdempiereException("Please add the Payment");
				}
			}

			mdDealerLicense.save();

		
		mTab.dataRefresh(true);
		return "";
	}

	private MWFActivity[] getWorkFLowActivity(MDDealerLicense mdDealerLicense) {

		// get workflow process
		MWFProcess process = new Query(mdDealerLicense.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", mdDealerLicense.get_TrxName())
						.setParameters(mdDealerLicense.get_Table_ID(), mdDealerLicense.get_ID())
						.setOnlyActiveRecords(true).first();

		if (process == null)
			return null;

		List<MWFActivity> activity = new Query(mdDealerLicense.getCtx(), MWFActivity.Table_Name, "AD_WF_Process_ID=? ",
				mdDealerLicense.get_TrxName()).setParameters(process.get_ID()).setOnlyActiveRecords(true).list();

		return activity.toArray(new MWFActivity[activity.size()]);
	}

	private void processWorkFlow(MDDealerLicense mdDealerLicense) {

		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();

		// get workflow process
		MWFProcess process = new Query(mdDealerLicense.getCtx(), MWFProcess.Table_Name,
				"AD_Table_ID = ? AND  Record_ID=? AND wfstate='OS'", trx.getTrxName())
						.setParameters(mdDealerLicense.get_Table_ID(), mdDealerLicense.get_ID())
						.setOnlyActiveRecords(true).first();

		MWFActivity activity = new Query(mdDealerLicense.getCtx(), MWFActivity.Table_Name,
				"AD_WF_Process_ID=? AND wfstate='OS'", trx.getTrxName()).setParameters(process.get_ID())
						.setOnlyActiveRecords(true).first();

		activity.setUserConfirmation(Env.getAD_User_ID(mdDealerLicense.getCtx()), "");
		activity.save();

		trx.commit();
		trx.close();
	}

	private void sendMsg(String license, Properties ctx, GridTab mTab, MDDealerLicense licence) {

		String mobileNo = "";

		// get Business Partner

		MBPartner mbPartner = new MBPartner(ctx, licence.getC_BPartner_ID(), mTab.getTrxInfo());
		MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(ctx, mbPartner.get_ID(), mTab.getTrxInfo());

		// VALIDATE THE BUSINESS PARTNER lOCATION
		if (bpls == null || bpls.length == 0)
			throw new AdempiereException("No Business partner Location found!");

		for (MBPartnerLocation bpl : bpls) {
			if (!bpl.getPhone().equalsIgnoreCase("")) {
				mobileNo = bpl.getPhone();
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
		msg.setMessage("Dear Sir/Madam,\r\n" + "\r\n"
				+ "We are happy to inform that your license is ready.Please Collect it from the Regional office. Thank you - NGJA ");
		msg.setSender("NGJA");
		msg.setMessageType(1);
		msg.getRecipients().add(mobileNo);
		SMSManager smsMgr = new SMSManager();

		try {
			System.out.println(smsMgr.sendMessage(msg)); // Send alphanumeric message
		} catch (NullSessionException ex) {

//			 Logger.getLogger(ESMSV3Client.class.getName()).log(Level.SEVERE, null, ex);

		}

	}
}
