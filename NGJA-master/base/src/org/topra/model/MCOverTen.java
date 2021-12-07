package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;

public class MCOverTen extends X_C_OverTen {

	public MCOverTen(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCOverTen(Properties ctx, int C_OverTen_ID, String trxName) {
		super(ctx, C_OverTen_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		if (this.getWeight().doubleValue()>9.999999) {
		
			if (!newRecord) {
				if (this.getReturnedWeight().compareTo(this.getCusEnteredWeight()) < 0) {
					this.setVarianceOfWweight(this.getCusEnteredWeight().subtract(this.getReturnedWeight()));
					
				} else {
					
				}
			}
			MCExportNGJALine exportNGJALine = new MCExportNGJALine(this.getCtx(), this.getC_ExportNGJALine_ID(), this.get_TrxName());
			MCExportNGJA exportNGJA = new MCExportNGJA(this.getCtx(), exportNGJALine.getC_ExportNGJA_ID(), this.get_TrxName());
			this.setOverTenItem(exportNGJALine.getDescription()+" "+ this.getLength()+"L "+
			this.getBreadth() +"B "+ this.getHeight()+"H");
			this.setTotalWeightType(exportNGJA.getTotalWeightType());

			return true;
		}else {
			throw new AdempiereException("Weight must be 10 or above!");
		}
		
	}

}
