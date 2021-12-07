package org.topra.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.MInvoiceLine;
import org.compiere.util.DB;

public class MCExportNGJA extends X_C_ExportNGJA {// implements DocAction , DocOptions {

	public MCExportNGJA(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCExportNGJA(Properties ctx, int C_ExportNGJA_ID, String trxName) {
		super(ctx, C_ExportNGJA_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {
		
		
		Timestamp current = new Timestamp(System.currentTimeMillis());

		if (this.getExpDate() != null && !isExtended()) {
			Calendar ce = Calendar.getInstance();
			ce.setTime(this.getExpDate());
			ce.add(Calendar.DATE, 120);
			Timestamp ts = new Timestamp(ce.getTimeInMillis());
			this.setExpExpireDate(ts);
		}

		
		
		StringBuffer buffer = new StringBuffer("SELECT Multiplyrate FROM C_Conversion_Rate WHERE c_currency_id=?  AND c_currency_id_to = 313 AND (validfrom < '"+current+"' AND validto > '"+current+"')");
		BigDecimal fc= DB.getSQLValueBD(this.get_TrxName(), buffer.toString(),this.getC_Currency_ID());
		
System.out.println(fc);
if (fc==null) {
	throw new AdempiereException("No Currency Conversion Rate!!");
}else {
	 this.setRateFC(fc);

		this.setInsuaranceInRS(this.getInsuaranceInFC().multiply(fc));
		this.setAirFreightInRS(this.getAirFreightInFC().multiply(fc));
		this.setPostageInRS(this.getPostageInFC().multiply(fc));
		this.setAdeddValue(this.getAdeddValueIinFC().multiply(fc));
}
       

		

		if (this.getC_Payment_ID() == 0 && this.getDocumentStatus().equalsIgnoreCase("CO")) {
			ADialog.error(1000123, null, "You cannot do the export without a payment!");
			return false;
		}

		return true;
	}

	


}
