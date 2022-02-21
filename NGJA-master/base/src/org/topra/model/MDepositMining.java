package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.util.DB;

public class MDepositMining extends X_DepositMining {

	public MDepositMining(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MDepositMining(Properties ctx, int DepositMining_ID, String trxName) {
		super(ctx, DepositMining_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	
	protected boolean beforeSave(boolean newRecord)
	{
		if (this.isUpgrade()) {

			StringBuffer stringBuffer = new StringBuffer(
					"SELECT  count(C_Payment_ID)  FROM DepositMining WHERE C_Payment_ID=" + this.getC_Payment_ID());
			int count = DB.getSQLValue(get_TrxName(), stringBuffer.toString());

			if (count < 1) {
				return true;
			} else {
				throw new AdempiereException("Cannot Use this Payment!");
			}
		}else {
		MCGemMining gemMining = new MCGemMining(this.getCtx(), this.getC_GemMining_ID(), this.get_TrxName());
		
		if (this.getDepositType().equalsIgnoreCase("BL")) {
			StringBuffer stringBuffer = new StringBuffer(
					"SELECT  count(C_Payment_ID)  FROM DepositMining WHERE C_Payment_ID=" + this.getC_Payment_ID());
			int count = DB.getSQLValue(get_TrxName(), stringBuffer.toString());

			if (count < 1) {
				return true;
			} else {
				throw new AdempiereException("Cannot Use this Payment!");
			}
		}else if (this.getDepositType().equalsIgnoreCase("ML")) {
			if (gemMining.getIsRenewal().equalsIgnoreCase("Y")) {
				return true;
			}else {
				StringBuffer stringBuffer = new StringBuffer(
						"SELECT  count(C_Payment_ID)  FROM DepositMining WHERE C_Payment_ID=" + this.getC_Payment_ID());
				int count = DB.getSQLValue(get_TrxName(), stringBuffer.toString());

				if (count < 1) {
					return true;
				} else {
					throw new AdempiereException("Cannot Use this Payment!");
				}
			}
		}else if(this.getDepositType().equalsIgnoreCase("LS")){
			return true;
		}
		}
		return false;
		
		
	}	
}
