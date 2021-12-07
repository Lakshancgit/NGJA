package org.topra.callouts;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.DB;
import org.topra.model.MCValuationCertificate;

//org.topra.callouts.JobCardValidation.processIt
//Auther Lakshan
//27th of Dec 2018
public class JobCardValidation extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(),
				mTab.getTrxInfo());

		PreparedStatement psmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();

		try {
			sb = new StringBuffer("SELECT * FROM C_ValuationCertificate " + " WHERE C_JobCardValuation_ID = "
					+ mcValuationCertificate.getC_JobCardValuation_ID());

			psmt = DB.prepareStatement(sb.toString(), mTab.getTrxInfo());
			rs = psmt.executeQuery();

			while (rs.next()) {
				MCValuationCertificate rsCertificate = new MCValuationCertificate(ctx,
						rs.getInt("C_ValuationCertificate_ID"), mTab.getTrxInfo());
				if (rsCertificate.getMemoCertStatus() == "C") {
					// mcValuationCertificate.setisMemo(false);
					System.out.println("memo");
					// throw new AdempiereException("Cannot add a memo");
				}

				if (rsCertificate.getDetailCertStatus() == "C") {
					// mcValuationCertificate.setisDetailedCertificate(false);
					System.out.println("Detail");
					// throw new AdempiereException("Cannot add a Detail");
				}

				if (rsCertificate.getPhotoCertStatus() == "C") {
					// mcValuationCertificate.setisPhotoCertificate(false);
					System.out.println("Photo");
					// throw new AdempiereException("Cannot add a photo");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			DB.close(rs, psmt);
			psmt = null;
			rs = null;
		}
		mTab.dataRefresh(true);
		return "";
	}
}
