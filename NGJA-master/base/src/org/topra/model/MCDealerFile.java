package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.util.DB;

public class MCDealerFile extends X_C_DealerFile {

	public MCDealerFile(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCDealerFile(Properties ctx, int C_DealerFile_ID, String trxName) {
		super(ctx, C_DealerFile_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	protected boolean beforeSave(boolean newRecord) {
		
		if (newRecord) {
			StringBuffer stringBuffer = new StringBuffer(
					"SELECT count(c_dealerfile_id) FROM c_dealerfile where fileno='" + this.getFileNo()+"'");
			int count = DB.getSQLValue(get_TrxName(), stringBuffer.toString());
			
			if (count<=0) {
				return true;
			}else {
				throw new AdempiereException("Already have a file with this File No!");
			}
		}else {
			return true;
		}
		
	} // beforeSave

}
