package org.topra.callouts;

import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.AEnv;
import org.compiere.apps.AWindow;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MInvoice;
import org.compiere.model.MQuery;
import org.topra.model.MCGemMining;
import org.topra.model.MCLicenseFineFees;

public class InvoicingLicenseFineFees extends CalloutEngine {

	public void zoomWindow(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;
		
		MCLicenseFineFees mcLicenseFineFees = new MCLicenseFineFees(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		if (mcLicenseFineFees.getC_Invoice_ID()==0) {
			// Creating Invoice
			MInvoice mInvoice = new MInvoice(ctx, 0, mTab.getTrxInfo());
			MCGemMining mcGemMining = new MCGemMining(ctx, mcLicenseFineFees.getC_GemMining_ID(), mTab.getTrxInfo());
			MBPartner mbPartner = (MBPartner) mcGemMining.getC_BPartner();
			MBPartnerLocation[] bpls = MBPartnerLocation.getForBPartner(ctx, mbPartner.get_ID(), mTab.getTrxInfo());

			// VALIDATE THE BUSINESS PARTNER lOCATION
			if (bpls == null || bpls.length == 0)
				throw new AdempiereException("No Business partner Location found!");

			for (MBPartnerLocation bpl : bpls) {
				if (bpl.isShipTo()) {
					mInvoice.setC_BPartner_Location_ID(bpl.get_ID());
					break;
				}
			}

			// VALIDATE THE BUSINESS PARTNER lOCATION
			if (mInvoice.getC_BPartner_Location_ID() == 0)
				throw new AdempiereException("No Business partner Location found!");

			mInvoice.setBPartner(mbPartner);
			mInvoice.setC_DocTypeTarget_ID(1000002);
			mInvoice.setM_PriceList_ID(1000012);
			mInvoice.save();
			mcLicenseFineFees.setC_Invoice_ID(mInvoice.get_ID());
			mcLicenseFineFees.save();
			mTab.dataRefresh();
		}
		
		

		// Open Invoice
		int AD_Window_ID = 1000156;
		String ColumnName = "C_Invoice_ID";
		MQuery query = MQuery.getEqualQuery(ColumnName, mcLicenseFineFees.getC_Invoice_ID());

		@SuppressWarnings("deprecation")
		AWindow frame = new AWindow();
		if (!frame.initWindow(AD_Window_ID, query))
			return;

		AEnv.addToWindowManager(frame);
		AEnv.showCenterScreen(frame);
		frame = null;

		return;
	}

	public void zoomRecord(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		int Record_ID = (Integer) mTab.getValue("C_Invoice_ID");
		if (Record_ID != 0) {
			// Open Invoice
			int AD_Window_ID = 1000156;
			String ColumnName = "C_Invoice_ID";
			MQuery query = MQuery.getEqualQuery(ColumnName, Record_ID);

			@SuppressWarnings("deprecation")
			AWindow frame = new AWindow();
			if (!frame.initWindow(AD_Window_ID, query))
				return;

			AEnv.addToWindowManager(frame);
			AEnv.showCenterScreen(frame);
			frame = null;

		} else {
			throw new AdempiereException("Can't open the window");
		}

		return;
	}

}
