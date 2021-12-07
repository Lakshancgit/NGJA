package org.topra.callouts;

import java.sql.Timestamp;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.apps.ProcessCtl;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MProcess;
import org.compiere.model.MTab;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.topra.model.HardCoded;
import org.topra.model.MCJobCardValuation;
import org.topra.model.MCReceivingNote;
import org.topra.model.MCReceivingNoteLine;
import org.topra.model.MCValuationCertificate;

import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.session.NullSessionException;

//Auther Lakshan
public class PrintJobCard extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(),
				mTab.getTrxInfo());

		if (ADialog.ask(WindowNo, null, "Print Confirmation", "Do I print this?")) {

			int AD_MemoProcess_ID = HardCoded.JobCardMemoProcess_ID;
			MProcess process = new MProcess(ctx, AD_MemoProcess_ID, mTab.getTrxInfo());
			int AD_DetailProcess_ID_ = HardCoded.JobCardDetailProcess_ID;
			MProcess process2 = new MProcess(ctx, AD_DetailProcess_ID_, mTab.getTrxInfo());
			int AD_PhotoProcess_ID = HardCoded.PhotoCertificateProcess_ID;
			MProcess process3 = new MProcess(ctx, AD_PhotoProcess_ID, mTab.getTrxInfo());
			int AD_PhotoMemoProcess_ID = HardCoded.PhotoMemoCertificateProcess_ID;
			MProcess process4 = new MProcess(ctx, AD_PhotoMemoProcess_ID, mTab.getTrxInfo());
			int table_ID = 1000036;
			int record_ID = mcValuationCertificate.getC_ValuationCertificate_ID();

			mcValuationCertificate.setDatePrinted(new Timestamp(System.currentTimeMillis()));
			mcValuationCertificate.save();

			if (mcValuationCertificate.isDetailedCertificate()
					&& mcValuationCertificate.getDetailCertStatus().equalsIgnoreCase("C")) {
				System.out.println("Detail");

				ProcessInfo processInfo = new ProcessInfo("Detailed Certificate", AD_DetailProcess_ID_, table_ID,
						record_ID);
				processInfo.setAD_User_ID(Env.getAD_User_ID(ctx));
				processInfo.setAD_Client_ID(Env.getAD_Client_ID(ctx));
				processInfo.setPrintPreview(!process.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), processInfo, null);
				mcValuationCertificate.setProcessed(true);
				mcValuationCertificate.setIsPrinted(true);
				try {
					sendMsg("Detail", ctx, mTab, mcValuationCertificate, mcValuationCertificate.getDocumentNoDetail());
				} catch (Exception e) {
					throw new AdempiereException("SMS not sent!");
				}
			}
			if (mcValuationCertificate.isMemo() && mcValuationCertificate.getMemoCertStatus().equalsIgnoreCase("C")) {
				System.out.println("memo");
				ProcessInfo pi = new ProcessInfo("Memo Certificate", AD_MemoProcess_ID, table_ID, record_ID);
				pi.setAD_User_ID(Env.getAD_User_ID(ctx));
				pi.setAD_Client_ID(Env.getAD_Client_ID(ctx));
				pi.setPrintPreview(!process2.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), pi, null);
				mcValuationCertificate.setProcessed(true);
				mcValuationCertificate.setIsPrinted(true);
				sendMsg("Memo", ctx, mTab, mcValuationCertificate, mcValuationCertificate.getDocumentNoMemo());
			}
			if (mcValuationCertificate.isPhotoCertificate()
					&& mcValuationCertificate.getPhotoCertStatus().equalsIgnoreCase("C")) {
				System.out.println("photo");
				ProcessInfo pii = new ProcessInfo("Photo Certificate", AD_PhotoProcess_ID, table_ID, record_ID);
				pii.setAD_User_ID(Env.getAD_User_ID(ctx));
				pii.setAD_Client_ID(Env.getAD_Client_ID(ctx));
				pii.setPrintPreview(!process3.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), pii, null);
				mcValuationCertificate.setProcessed(true);
				mcValuationCertificate.setIsPrinted(true);
				sendMsg("Photo", ctx, mTab, mcValuationCertificate, mcValuationCertificate.getDocumentNoPhoto());
			}
			if (mcValuationCertificate.isPhotoMemo()
					&& mcValuationCertificate.getPhotoMemoCertStatus().equalsIgnoreCase("C")) {
				System.out.println("photo memo");
				ProcessInfo pii = new ProcessInfo("Photo Memo Certificate", AD_PhotoMemoProcess_ID, table_ID,
						record_ID);
				pii.setAD_User_ID(Env.getAD_User_ID(ctx));
				pii.setAD_Client_ID(Env.getAD_Client_ID(ctx));
				pii.setPrintPreview(!process4.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), pii, null);
				mcValuationCertificate.setProcessed(true);
				mcValuationCertificate.setIsPrinted(true);
				sendMsg("Photo Memo", ctx, mTab, mcValuationCertificate,
						mcValuationCertificate.getDocumentNoPhotoMemo());
			}

			mcValuationCertificate.save();

		}
		mTab.dataRefresh(true);
		return "";
	}

	private void sendMsg(String license, Properties ctx, GridTab mTab, MCValuationCertificate mcValuationCertificate,
			String docNo) {

		String mobileNo = "";

		// get Business Partner
		MCJobCardValuation jobCardValuation = new MCJobCardValuation(ctx,
				mcValuationCertificate.getC_JobCardValuation_ID(), mTab.getTrxInfo());
		System.out.println(mcValuationCertificate.getC_ValuationCertificate_ID());
		MCReceivingNoteLine receivingNoteLine = new MCReceivingNoteLine(ctx,
				jobCardValuation.getC_ReceivingNoteLine_ID(), mTab.getTrxInfo());
		System.out.println(jobCardValuation.getC_ReceivingNoteLine_ID());
		MCReceivingNote receivingNote = new MCReceivingNote(ctx, receivingNoteLine.getC_ReceivingNote_ID(),
				mTab.getTrxInfo());
		MBPartner mbPartner = new MBPartner(ctx, receivingNote.getC_BPartner_ID(), mTab.getTrxInfo());
		MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(ctx, mbPartner.get_ID(), mTab.getTrxInfo());
		System.out.println(receivingNoteLine.getC_ReceivingNote_ID());
		System.out.println(receivingNote.getC_BPartner_ID());
		System.out.println(mbPartner.get_ID());

//	ADialog.info(1, null, "Invoice Created : " + mcValuationCertificate.getC_ValuationCertificate_ID()+" "+
//			jobCardValuation.getC_ReceivingNoteLine_ID()+" "+receivingNoteLine.getC_ReceivingNote_ID()+" "+
//			receivingNote.getC_BPartner_ID()+" "+ mbPartner.get_ID() +" "+bpls.length);

		// VALIDATE THE BUSINESS PARTNER lOCATION
		if (bpls == null || bpls.length == 0)
			throw new AdempiereException("No Business partner Location found!");

		for (MBPartnerLocation bpl : bpls) {
			if (!bpl.getPhone().equalsIgnoreCase("")) {
				mobileNo = bpl.getPhone();
				// ADialog.info(1, null, "Phone : " +bpl.getPhone());
				break;
			}
		}

		lk.mobitel.esms.ws.User user = new lk.mobitel.esms.ws.User();
		user.setUsername("esmsusr_5go");
		user.setPassword("Test@123");

		lk.mobitel.esms.test.ServiceTest st = new lk.mobitel.esms.test.ServiceTest(); // To test if the service is
		System.out.println(st.testService(user));
//	ADialog.info(1, null, "user : " +st.testService(user));
		lk.mobitel.esms.session.SessionManager sm = lk.mobitel.esms.session.SessionManager.getInstance();

		sm.login(user); // Create session

		System.out.println(sm.isSession());
		// ADialog.info(1, null, "session : " +sm.isSession());

		lk.mobitel.esms.ws.SmsMessage msg = new lk.mobitel.esms.ws.SmsMessage();
		msg.setMessage("Dear Sir/Madam,\r\n" + "\r\n"
				+ "We are happy to inform that your certificate is ready. Please collect it from the Gem testing laboratory counter. Thank you - NGJA");
		msg.setSender("NGJA");
		msg.setMessageType(1);
		msg.getRecipients().add(mobileNo);
		SMSManager smsMgr = new SMSManager();

		try {
			smsMgr.sendMessage(msg);
		} catch (NullSessionException ex) {

			System.out.println(ex.getMessage());

		}

	}

}
