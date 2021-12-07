package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MBPartner;

@SuppressWarnings("serial")
public class MCBPStatusLog extends X_C_BPStatusLog {

	public MCBPStatusLog(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCBPStatusLog(Properties ctx, int C_BPStatusLog_ID, String trxName) {
		super(ctx, C_BPStatusLog_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	protected boolean beforeSave(boolean newRecord) {
		if (newRecord) {
			MBPartner mbPartner = new MBPartner(this.getCtx(), this.getC_BPartner_ID(), this.get_TrxName());
			this.setCurrentStatus(mbPartner.get_ValueAsString("bp_status"));
			this.setValue(mbPartner.getValue());
		}
		return true;
	}

}
