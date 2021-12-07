package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.model.MInvoice;
import org.compiere.util.DB;

public class MCMiningLicenseUpgrade extends X_C_MiningLicenseUpgrade {

	public MCMiningLicenseUpgrade(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCMiningLicenseUpgrade(Properties ctx, int C_MiningLicenseUpgrade_ID, String trxName) {
		super(ctx, C_MiningLicenseUpgrade_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		StringBuffer buffer2 = new StringBuffer(
				"SELECT  count(C_GemMining_ID)  FROM C_GemMining WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
		int count = DB.getSQLValue(get_TrxName(), buffer2.toString());

		if (count >= 1) {
			MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());

			StringBuffer buffer = new StringBuffer(
					"SELECT  max(C_LandDetails_ID)  FROM C_LandDetails WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
			int C_LandDetails_ID = DB.getSQLValue(get_TrxName(), buffer.toString());

			StringBuffer buffer3 = new StringBuffer(
					"SELECT  max(C_GemMining_ID)  FROM C_GemMining WHERE C_Invoice_ID=" + this.getC_Invoice_ID());
			int C_GemMining_ID = DB.getSQLValue(get_TrxName(), buffer3.toString());

			this.setC_LandDetails_ID(C_LandDetails_ID);
			this.setC_GemMining_ID(C_GemMining_ID);
			this.setC_BPartner_ID(invoice.getC_BPartner_ID());

			MCGemMining mcGemMining = new MCGemMining(this.getCtx(), C_GemMining_ID, this.get_TrxName());
			MCLandDetails landDetails = new MCLandDetails(this.getCtx(), C_LandDetails_ID, this.get_TrxName());

			this.setTotalQty(mcGemMining.getNoOfMine() + this.getNoOfExtendMines());

			if (this.getStatus().equalsIgnoreCase("U")) {
				mcGemMining.setIsUpgrade(true);
				landDetails.setIsUpgrade(true);
			}
			this.setDateStart(mcGemMining.getDateStart());
			this.setEndDate(mcGemMining.getDateTo());
			this.setC_LandDetails_ID(mcGemMining.getC_LandDetails_ID());
			this.setNoOfMine(mcGemMining.getNoOfMine());
			mcGemMining.save();
			landDetails.save();

			return true;
		} else {
			ADialog.error(0, null, "No Mining License");
			return false;
		}
	}

}
