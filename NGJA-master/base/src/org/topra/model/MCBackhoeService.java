package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;

public class MCBackhoeService extends X_C_BackhoeService {

	public MCBackhoeService(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCBackhoeService(Properties ctx, int C_BackhoeService_ID, String trxName) {
		super(ctx, C_BackhoeService_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord) {

		StringBuffer buffer2 = new StringBuffer(
				"SELECT  count(C_GemMining_ID)  FROM C_GemMining WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
		int count = DB.getSQLValue(get_TrxName(), buffer2.toString());

		if (count >= 1) {
			
			MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName()); 
			
			StringBuffer buffer3 = new StringBuffer(
					"SELECT  max(C_GemMining_ID)  FROM C_GemMining WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
			int C_GemMining_ID = DB.getSQLValue(get_TrxName(), buffer3.toString());
			
			MCGemMining gemMining = new MCGemMining(this.getCtx(), C_GemMining_ID, this.get_TrxName());
			
			this.setC_GemMining_ID(C_GemMining_ID);
			this.setC_BPartner_ID(invoice.getC_BPartner_ID());
			this.setStartDate(gemMining.getDateStart());
			this.setEndDate(gemMining.getDateTo());
			
			return true;
		}else {
			ADialog.error(0, null, "No Mining License");
			return false;
		}

		
	}

}
