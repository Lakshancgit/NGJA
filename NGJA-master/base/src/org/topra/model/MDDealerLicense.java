package org.topra.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Logger;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.util.DB;

import lk.mobitel.esms.message.SMSManager;
import lk.mobitel.esms.session.NullSessionException;


//Auther Lakshan
public class MDDealerLicense extends X_D_DealerLicense {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MDDealerLicense(Properties ctx, int D_DealerLicense_ID, String trxName) {
		super(ctx, D_DealerLicense_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MDDealerLicense(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		
		

		StringBuffer sqlDealerLicense = null;
		StringBuffer sqlFindBpartner = null;

		sqlFindBpartner = new StringBuffer("SELECT  max(c_bpartner_ID)  FROM c_Dealerfile WHERE c_Dealerfile_ID = ?");
		int c_bpartner_ID = DB.getSQLValue(get_TrxName(), sqlFindBpartner.toString(), this.getC_DealerFile_ID());

		sqlDealerLicense = new StringBuffer(
				"SELECT  count(D_DealerLicense_ID)  FROM D_DealerLicense WHERE c_Payment_ID=? ");
		int b = DB.getSQLValue(get_TrxName(), sqlDealerLicense.toString(), this.getC_Payment_ID());
		System.out.println("b   " + b);
		if (!newRecord) {

			if (this.getLicenseStatus().equalsIgnoreCase("M")) {
				return true;
			}
			if (b > 1) {
				throw new AdempiereException("Already Utilized this Payment");
			}

		} else {
			this.setC_BPartner_ID(c_bpartner_ID);
			return true;
		}

		if (b <= 1) {

			if (this.getC_DocType_ID() == HardCoded.JewelleryLicenseDocType_ID
					|| this.getC_DocType_ID() == HardCoded.LapidaristLicenseDocType_ID) {
				Calendar ce = Calendar.getInstance();
				ce.setTime(this.getLicenseStartDate());
				int year = ce.get(Calendar.YEAR);
				ce.set(Calendar.MONTH, 11);
				ce.set(Calendar.DATE, 31);
				int year2 = ce.get(Calendar.YEAR);
				Timestamp ts = new Timestamp(ce.getTimeInMillis());
				this.setLicenseEndDate(ts);
				this.setLastActiveYear(String.valueOf(year + "/" + year2));

			} else {
				Calendar ce = Calendar.getInstance();
				ce.setTime(this.getLicenseStartDate());
				int year = ce.get(Calendar.YEAR);
				ce.add(Calendar.YEAR, 1);
				ce.add(Calendar.DATE, -1);
				int year2 = ce.get(Calendar.YEAR);
				Timestamp ts = new Timestamp(ce.getTimeInMillis());
				this.setLicenseEndDate(ts);
				this.setLastActiveYear(String.valueOf(year + "/" + year2));

			}

			return true;

		} else if (b != 0) {
			throw new AdempiereException("Already Utilized this Payment");
		}

		return false;
	}

	private void sendMsg() {

		lk.mobitel.esms.ws.User user = new lk.mobitel.esms.ws.User();
		user.setUsername("esmsusr_5go");
		user.setPassword("Test@123");

		lk.mobitel.esms.test.ServiceTest st = new lk.mobitel.esms.test.ServiceTest(); // To test if the service is
		System.out.println(st.testService(user));

		lk.mobitel.esms.session.SessionManager sm = lk.mobitel.esms.session.SessionManager.getInstance();

		sm.login(user); // Create session

		System.out.println(sm.isSession());

		lk.mobitel.esms.ws.SmsMessage msg = new lk.mobitel.esms.ws.SmsMessage();
		msg.setMessage("This is a test\ntest01\ntest03");
		msg.setSender("NGJA");
		msg.setMessageType(1);
		msg.getRecipients().add("94768092848");
		SMSManager smsMgr = new SMSManager();

		try{
			System.out.println(smsMgr.sendMessage(msg)); // Send alphanumeric message
		}catch (NullSessionException ex)
		{

	//		 Logger.getLogger(ESMSV3Client.class.getName()).log(Level.SEVERE, null, ex);

		}
		
	}
	
	
	

}
