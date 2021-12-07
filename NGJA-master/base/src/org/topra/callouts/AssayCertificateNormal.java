package org.topra.callouts;

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
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.topra.model.MCJobCardAssay;
import org.topra.model.MCJobCardValuation;
import org.topra.model.MCReceivingNote;
import org.topra.model.MCReceivingNoteLine;
import org.topra.model.MCValuationCertificate;

import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.session.NullSessionException;

//org.topra.callouts.AssayCertificateNormal.processIt
public class AssayCertificateNormal extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCJobCardAssay jobCardAssay = new MCJobCardAssay(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		int table_ID = 1000033;
		int record_ID = jobCardAssay.getC_JobCardAssay_ID();
		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {

			int normalCertificate_ID = 1000048;
			MProcess process = new MProcess(ctx, normalCertificate_ID, mTab.getTrxInfo());

			ProcessInfo pi = new ProcessInfo("Normal Certificate", normalCertificate_ID, table_ID, record_ID);
			pi.setAD_User_ID(Env.getAD_User_ID(ctx));
			pi.setAD_Client_ID(Env.getAD_Client_ID(ctx));
			pi.setPrintPreview(!process.isDirectPrint());
			ProcessCtl.process(null, mTab.getWindowNo(), pi, null);
			jobCardAssay.set_ValueOfColumn("Processed", "Y");
			jobCardAssay.set_ValueOfColumn("Printed", "Y");
			jobCardAssay.save();
			try {
				sendMsg( ctx, mTab, jobCardAssay);
			} catch (Exception e) {
				throw new AdempiereException("SMS not sent!");
			}
			
		}
		mTab.dataRefresh();
		return "";
	}
	
	
	
	private void sendMsg( Properties ctx,GridTab mTab,MCJobCardAssay jobCardAssay) {

		String mobileNo= "";
		
		
		
		
		//get Business Partner
		MCReceivingNote receivingNote = new MCReceivingNote(ctx, jobCardAssay.getC_ReceivingNote_ID(), mTab.getTrxInfo());
		MBPartner mbPartner= new MBPartner(ctx, receivingNote.getC_BPartner_ID(), mTab.getTrxInfo());
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
		msg.setMessage("Dear Sir/Madam,\r\n" + 
				"\r\n" + 
				"We are happy to inform that your certificate is ready. Please collect it from the Gem testing laboratory counter. Thank you - NGJA ");
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
