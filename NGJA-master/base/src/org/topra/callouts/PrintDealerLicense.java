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
import org.topra.model.HardCoded;
import org.topra.model.MDDealerLicense;
import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.session.NullSessionException;

//Auther Lakshan
public class PrintDealerLicense extends CalloutEngine {
	
	public String processIt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
		
		if(mTab.getRecord_ID() == -1) return "";
		
		MDDealerLicense mdDealerLicense = new MDDealerLicense(ctx , mTab.getRecord_ID() ,mTab.getTrxInfo());
		
		if(ADialog.ask(WindowNo, null, "Print Confirmation", "Do I print this?")){
			int AD_Process_ID;
			MProcess process = null;
			ProcessInfo pi=null;
			int table_ID = mTab.getAD_Table_ID();
			int record_ID = mTab.getRecord_ID();
			if (mdDealerLicense.getC_DocType_ID()== HardCoded.GemDealerLicenseDocType_ID) {
				AD_Process_ID = HardCoded.DealerLicenseProcess_ID;
				process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());
				pi = new ProcessInfo ("Dealer Licence", AD_Process_ID, table_ID, record_ID);
				pi.setAD_User_ID (Env.getAD_User_ID(ctx));
				pi.setAD_Client_ID (Env.getAD_Client_ID(ctx));
				pi.setPrintPreview(!process.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), pi, null);
				mdDealerLicense.setPrinted(true);
				mdDealerLicense.setProcessed(true);
				//sendMsg("Dealer Licence", ctx, mTab, mdDealerLicense);
			}else if (mdDealerLicense.getC_DocType_ID()== HardCoded.JewelleryLicenseDocType_ID) {
				AD_Process_ID = HardCoded.JewlleryRegistrationLicense_ID;
				process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());
				pi = new ProcessInfo ("Jewllery Registration Licence", AD_Process_ID, table_ID, record_ID);
				pi.setAD_User_ID (Env.getAD_User_ID(ctx));
				pi.setAD_Client_ID (Env.getAD_Client_ID(ctx));
				pi.setPrintPreview(!process.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), pi, null);
				mdDealerLicense.setPrinted(true);
				mdDealerLicense.setProcessed(true);
				//sendMsg("Jewllery Registration Licence", ctx, mTab, mdDealerLicense);
			}else if (mdDealerLicense.getC_DocType_ID()== HardCoded.LapidaristLicenseDocType_ID) {
				AD_Process_ID = HardCoded.LapidaristLicense_ID;
				process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());
				pi = new ProcessInfo ("Lapidarist's Licence", AD_Process_ID, table_ID, record_ID);
				pi.setAD_User_ID (Env.getAD_User_ID(ctx));
				pi.setAD_Client_ID (Env.getAD_Client_ID(ctx));
				pi.setPrintPreview(!process.isDirectPrint());
				ProcessCtl.process(null, mTab.getWindowNo(), pi, null);
				mdDealerLicense.setPrinted(true);
				mdDealerLicense.setProcessed(true);
				//sendMsg("Lapidarist's Licence", ctx, mTab, mdDealerLicense);
			}
			 mdDealerLicense.save();	
		   
		}
		mTab.dataRefresh(true);
		return "";
	}
	
	
	private void sendMsg(String license, Properties ctx,GridTab mTab,MDDealerLicense mdDealerLicense) {

		String mobileNo= "";
		
		//get Business Partner

		MBPartner mbPartner= new MBPartner(ctx, mdDealerLicense.getC_BPartner_ID(), mTab.getTrxInfo());
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
		msg.setMessage("Dear "+mbPartner.getName()+"\\Your certificate is ready, Please collect.\n"+license +" "+mdDealerLicense.getDocumentNo());
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
