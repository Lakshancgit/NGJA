package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCDealerDirector extends X_C_DealerDirector {

	public MCDealerDirector(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCDealerDirector(Properties ctx, int C_DealerDirector_ID, String trxName) {
		super(ctx, C_DealerDirector_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	protected boolean beforeSave(boolean newRecord) {
		MCDealerFile dealerFile = new MCDealerFile(this.getCtx(), this.getC_DealerFile_ID(), this.get_TrxName());
		this.setC_BPartner_ID(dealerFile.getC_BPartner_ID());

		return true;
	} // beforeSave
}
