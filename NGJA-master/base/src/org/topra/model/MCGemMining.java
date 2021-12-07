package org.topra.model;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;

public class MCGemMining extends X_C_GemMining {

	public MCGemMining(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCGemMining(Properties ctx, int C_GemMining_ID, String trxName) {
		super(ctx, C_GemMining_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		StringBuffer stringBuffer = new StringBuffer(
				"SELECT  count(C_LandDetails_ID)  FROM C_LandDetails WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
		int count = DB.getSQLValue(get_TrxName(), stringBuffer.toString());

		if (count >= 1) {
			MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());

			stringBuffer = new StringBuffer(
					"SELECT  max(C_LandDetails_ID)  FROM C_LandDetails WHERE C_Invoice_ID="
							+ this.getC_Invoice_ID());
			int C_LandDetails_ID = DB.getSQLValue(get_TrxName(), stringBuffer.toString());

			this.setC_LandDetails_ID(C_LandDetails_ID);
			this.setC_BPartner_ID(invoice.getC_BPartner_ID());

//			if (!this.getDateTo().equals(null)) {
//				Calendar ce = Calendar.getInstance();
//				ce.setTime(this.getDateTo());
//				int year = ce.get(Calendar.YEAR);
//				this.setLastActiveYear(String.valueOf(year));
//			}

			if (this.getLicenseStatus().equalsIgnoreCase("A")) {
				MCLandDetails landDetails = new MCLandDetails(getCtx(), C_LandDetails_ID, this.get_TrxName());
				landDetails.setC_GemMining_ID(this.getC_GemMining_ID());
			}

			return true;
		} else {
			throw new AdempiereException("No Any Land!");
		}

		
	}

}
