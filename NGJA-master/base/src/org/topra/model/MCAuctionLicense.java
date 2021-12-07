package org.topra.model;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;


public class MCAuctionLicense extends X_C_AuctionLicense {

	public MCAuctionLicense(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCAuctionLicense(Properties ctx, int C_AuctionLicense_ID, String trxName) {
		super(ctx, C_AuctionLicense_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		StringBuffer buffer = new StringBuffer(
				"SELECT  count(C_GemMining_ID)  FROM C_GemMining WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
		int count = DB.getSQLValue(get_TrxName(), buffer.toString());

		if (count >= 1) {
			
			MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());
			
			StringBuffer buffer3 = new StringBuffer(
					"SELECT  max(C_GemMining_ID)  FROM C_GemMining WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
			int C_GemMining_ID = DB.getSQLValue(get_TrxName(), buffer3.toString());
			MCGemMining gemMining = new MCGemMining(this.getCtx(), C_GemMining_ID, this.get_TrxName());
			
			this.setC_BPartner_ID(invoice.getC_BPartner_ID());
			this.setDateFinish(gemMining.getDateTo());
			this.setC_GemMining_ID(C_GemMining_ID);
			
			if (newRecord) {
				if (this.getEndDate()!=null) {
					Calendar ce = Calendar.getInstance();
					ce.setTime(this.getEndDate());
					int year = ce.get(Calendar.YEAR);
					this.setLastActiveYear(String.valueOf(year));
					return true;
				}
			}
			return true;
		}else {
			ADialog.error(0, null, "No Any Mining License!");
		}
		
		
		

		return false;
	}

}
