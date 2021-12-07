package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

//Auther Lakshan
public class MCJobCardValuation extends X_C_JobCardValuation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MCJobCardValuation(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCJobCardValuation(Properties ctx, int C_JobCardValuation_ID, String trxName) {
		super(ctx, C_JobCardValuation_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected boolean beforeSave(boolean newRecord){
		if (newRecord) {
			MCReceivingNoteLine mcReceivingNoteLine = new MCReceivingNoteLine(this.getCtx(), this.getC_ReceivingNoteLine_ID(), this.get_TrxName());
			this.setC_Color_ID(mcReceivingNoteLine.getC_Color_ID());
			this.setC_RCPolish_ID(mcReceivingNoteLine.getC_RCPolish_ID());
			this.setC_Shape_ID(mcReceivingNoteLine.getC_Shape_ID());
			this.setisMemoJC(mcReceivingNoteLine.isMemo());
			this.setisJewelleryJC(mcReceivingNoteLine.isJewellery());
			this.setisPhotoJC(mcReceivingNoteLine.isPhotoCertificate());
			this.setisDetailJC(mcReceivingNoteLine.isDetailedCertificate());
			this.setisAddintoWebJC(mcReceivingNoteLine.isAddintoWeb());
			this.setNormalHeatDetal(mcReceivingNoteLine.getNormalHeat());
			this.setNormalHeatPhotoJC(mcReceivingNoteLine.getNormalHeatPhoto());
			this.setWeightRN(mcReceivingNoteLine.getWeight());
			this.setisSaleInWeb(mcReceivingNoteLine.isSaleInWeb());
			this.setisPhotoMemo(mcReceivingNoteLine.isPhotoMemo());
		}
		
	
		
	return true;
	}

}
