package org.topra.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;
import org.compiere.util.DB;

//Auther Lakshan
//7/11/2018
public class MCValuationCertificate extends X_C_ValuationCertificate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MCValuationCertificate(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCValuationCertificate(Properties ctx, int C_ValuationCertificate_ID, String trxName) {
		super(ctx, C_ValuationCertificate_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean beforeSave(boolean newRecord) {

		if (newRecord == true) {
			MCJobCardValuation mcJobCardValuation = new MCJobCardValuation(this.getCtx(),
					this.getC_JobCardValuation_ID(), this.get_TrxName());
			MCReceivingNoteLine mcReceivingNoteLine = new MCReceivingNoteLine(mcJobCardValuation.getCtx(),
					mcJobCardValuation.getC_ReceivingNoteLine_ID(), mcJobCardValuation.get_TrxName());
			Calendar ce = Calendar.getInstance();
			Timestamp ts = new Timestamp(ce.getTimeInMillis());

			//
			if (mcReceivingNoteLine.isMemo()) {
				StringBuffer memoStringBuffer = new StringBuffer();
				memoStringBuffer = new StringBuffer(
						"SELECT count(C_ValuationCertificate_id) FROM C_ValuationCertificate "
								+ " WHERE C_JobCardValuation_ID = " + this.getC_JobCardValuation_ID()
								+ " and memocertstatus = 'C'");
				int memoCount = DB.getSQLValue(get_TrxName(), memoStringBuffer.toString());

				if (memoCount == 0) {
					this.setisMemo(mcReceivingNoteLine.isMemo());
					this.setDatePrinted(ts);
				} else {

					this.setMemoCertStatus("C");
					this.setReasonCancelMemo("Already Completed");
				}

			}

			if (mcReceivingNoteLine.isPhotoCertificate()) {
				StringBuffer photoStringBuffer = new StringBuffer();
				photoStringBuffer = new StringBuffer(
						"SELECT count(C_ValuationCertificate_id) FROM C_ValuationCertificate "
								+ " WHERE C_JobCardValuation_ID = " + this.getC_JobCardValuation_ID()
								+ " and photocertstatus = 'C'");
				int photoCount = DB.getSQLValue(get_TrxName(), photoStringBuffer.toString());

				if (photoCount == 0) {
					this.setisPhotoCertificate(mcReceivingNoteLine.isPhotoCertificate());
					this.setNormalHeatPhoto(mcReceivingNoteLine.getNormalHeatPhoto());
					this.setDatePrinted(ts);
				} else {
					this.setPhotoCertStatus("C");
					this.setReasonPhotoCancel("Already Completed");
				}

			}

			if (mcReceivingNoteLine.isDetailedCertificate()) {
				StringBuffer detailStringBuffer = new StringBuffer();
				detailStringBuffer = new StringBuffer(
						"SELECT count(C_ValuationCertificate_id) FROM C_ValuationCertificate "
								+ " WHERE C_JobCardValuation_ID = " + this.getC_JobCardValuation_ID()
								+ " and detailcertstatus = 'C'");
				int detailCount = DB.getSQLValue(get_TrxName(), detailStringBuffer.toString());

				if (detailCount == 0) {
					this.setisDetailedCertificate(mcReceivingNoteLine.isDetailedCertificate());
					this.setNormalHeat(mcReceivingNoteLine.getNormalHeat());
					this.setDatePrinted(ts);
				} else {
					this.setDetailCertStatus("C");
					this.setReasonDetailCan("Already Completed");
				}

			}
			
			if (mcReceivingNoteLine.isPhotoMemo()) {
				StringBuffer memoStringBuffer = new StringBuffer();
				memoStringBuffer = new StringBuffer(
						"SELECT count(C_ValuationCertificate_id) FROM C_ValuationCertificate "
								+ " WHERE C_JobCardValuation_ID = " + this.getC_JobCardValuation_ID()
								+ " and PhotoMemoCertStatus = 'C'");
				int photoMemoCount = DB.getSQLValue(get_TrxName(), memoStringBuffer.toString());

				if (photoMemoCount == 0) {
					this.setisPhotoMemo(mcReceivingNoteLine.isPhotoMemo());
					this.setDatePrinted(ts);
				} else {

					this.setPhotoMemoCertStatus("C");
					this.setReasonCancelPhotoMemo("Already Completed");
				}

			}

		}

		return true;
	}

}
