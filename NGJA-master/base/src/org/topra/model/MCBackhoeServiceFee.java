package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;

public class MCBackhoeServiceFee extends X_C_BackhoeServiceFee {

	public MCBackhoeServiceFee(Properties ctx, int C_BackhoeServiceFee_ID, String trxName) {
		super(ctx, C_BackhoeServiceFee_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCBackhoeServiceFee(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());

		StringBuffer stringBuffer = new StringBuffer(
				"SELECT  max(c_BackhoeService_id)  FROM c_BackhoeService WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
		int c_BackhoeService_id = DB.getSQLValue(get_TrxName(), stringBuffer.toString());

		
		//check if the backhoe license available??
		if (c_BackhoeService_id != 0) {

			MCBackhoeService backhoeService = new MCBackhoeService(this.getCtx(), c_BackhoeService_id,
					this.get_TrxName());
			this.setC_BPartner_ID(backhoeService.getC_BPartner_ID());
			this.setC_BackhoeService_ID(c_BackhoeService_id);
			System.out.println(backhoeService.getC_BPartner_ID() +"   "+ c_BackhoeService_id);
			return true;
		} else {
			ADialog.error(0, null, "No Any Backhoe License!");
			return false;
		}

	}

}
