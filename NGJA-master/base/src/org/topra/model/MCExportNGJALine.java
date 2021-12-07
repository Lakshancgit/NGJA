package org.topra.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.Msg;

public class MCExportNGJALine extends X_C_ExportNGJALine {

	public MCExportNGJALine(Properties ctx, int C_ExportNGJALine_ID, String trxName) {
		super(ctx, C_ExportNGJALine_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCExportNGJALine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		this.setAmountInFC(this.getWeight().multiply(this.getRatePerUnit()));
		MCExportNGJA exportNGJA = new MCExportNGJA(this.getCtx(), this.getC_ExportNGJA_ID(), this.get_TrxName());
		this.setRateMeasureType(exportNGJA.getTotalWeightType());

		MCJewelleryName mcJewelleryName = new MCJewelleryName(this.getCtx(), this.getC_JewelleryName_ID(),
				this.get_TrxName());
		MCExpMetal mcExpMetal = new MCExpMetal(this.getCtx(), this.getC_ExpMetal_ID(), this.get_TrxName());
		MCExpItems mcExpItems = new MCExpItems(this.getCtx(), this.getC_ExpItems_ID(), this.get_TrxName());

		if (this.getC_JewelleryName_ID() == 0 && this.getC_ExpItems_ID() != 0) {
			this.setDescription(mcExpItems.getName());
		} else if (this.getC_JewelleryName_ID() != 0 && this.getC_ExpItems_ID() == 0) {
			this.setDescription(mcExpMetal.getName() + " " + mcJewelleryName.getName());
		} else {
			this.setDescription(mcExpMetal.getName() + " " + mcJewelleryName.getName() + " " + mcExpItems.getName());
		}

		this.setAmountInRs(exportNGJA.getRateFC().multiply(this.getAmountInFC()));
		return true;
	}

	

}
