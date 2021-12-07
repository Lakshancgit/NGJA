package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MCLandSpecialConditions extends X_C_LandSpecialConditions {

	public MCLandSpecialConditions(Properties ctx, int C_LandSpecialConditions_ID, String trxName) {
		super(ctx, C_LandSpecialConditions_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCLandSpecialConditions(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}
	
	protected boolean beforeSave(boolean newRecord)
	{
		/** Prevents saving
		log.saveError("Error", Msg.parseTranslation(getCtx(), "@C_Currency_ID@ = @C_Currency_ID@"));
		log.saveError("FillMandatory", Msg.getElement(getCtx(), "PriceEntered"));
		/** Issues message
		log.saveWarning(AD_Message, message);
		log.saveInfo (AD_Message, message);
		**/
		return true;
	}

}
