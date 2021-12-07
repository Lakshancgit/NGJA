package org.topra.callouts;

import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.topra.model.MCDealerFile;
import org.topra.model.MDDLModification;
import org.topra.model.MDDealerLicense;

/**
 * org.topra.callouts.DLicenseModificationProcessor
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 24th of Sep 2012
 */

public class DLicenseModificationProcessor extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MDDLModification modification = new MDDLModification(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (modification.getC_DealerFile_ID() != 0 && modification.getD_DealerLicense_ID() != 0) {
			if (ADialog.ask(WindowNo, null, "Create a new license?", "This process will create a new License, Old license will be still there with as status -> 'Modified' ")) {

				MCDealerFile dealerFile = new MCDealerFile(modification.getCtx(), modification.getC_DealerFile_ID(),
						mTab.getTrxInfo());
				MBPartner mbPartner = new MBPartner(modification.getCtx(), dealerFile.getC_BPartner_ID(),
						mTab.getTrxInfo());
				MBPartnerLocation location = new MBPartnerLocation(mbPartner);
				MDDealerLicense dealerLicense = new MDDealerLicense(modification.getCtx(),
						modification.getD_DealerLicense_ID(), mTab.getTrxInfo());
				MDDealerLicense newDealerLicense = new MDDealerLicense(ctx, 0, mTab.getTrxInfo());

				String type1 = "";
				String type2 = "";
				String type3 = "";

				// System.out.println("1 "+newDealerLicense.getC_BPartner_ID());
				if (modification.isDLMtypeName()) {
					type1 = "Name Change    ";

					dealerFile.setC_BPartner_ID(modification.getC_BPartner_ID());
					modification.setC_OldBPartner_ID(dealerLicense.getC_BPartner_ID());
					newDealerLicense.setC_BPartner_ID(modification.getC_BPartner_ID());
				}

				if (modification.isDLMtypeAddress()) {
					type1 = "Address Change    ";
					modification.setC_OldLocation_ID(location.getC_Location_ID());
				} else {
					modification.setC_Location_ID(modification.getC_Location_ID());
				}
				if (modification.isDLMtypeStock()) {
					type1 = "Stock Change    ";
					modification.setOldStockValue(dealerLicense.getgem_stock_value());
					newDealerLicense.setgem_stock_value(modification.getgem_stock_value());
				} else {
					newDealerLicense.setgem_stock_value(dealerLicense.getgem_stock_value());
				}
				newDealerLicense.setAD_Org_ID(dealerLicense.getAD_Org_ID());
				newDealerLicense.setC_DealerFile_ID(dealerLicense.getC_DealerFile_ID());
				newDealerLicense.setC_DocType_ID(dealerLicense.getC_DocType_ID());
				newDealerLicense.setDescription("Modification is the Modified License of "
						+ dealerLicense.getDocumentNo() + "   Type(s) of changes " + type1 + type2 + type3);
				newDealerLicense.setIsRenewal(dealerLicense.getIsRenewal());
				newDealerLicense.setLicenseEndDate(dealerLicense.getLicenseEndDate());
				newDealerLicense.setLicenseStartDate(dealerLicense.getLicenseStartDate());
				newDealerLicense.setLastActiveYear(dealerLicense.getLastActiveYear());
				newDealerLicense.setC_Payment_ID(0);
				newDealerLicense.setLicenseStatus("P");
				newDealerLicense.setD_DLModification_ID(modification.get_ID());
				newDealerLicense.setIsModified(true);
				newDealerLicense.setUPtoStoctValue(false);
				newDealerLicense.setOverStoctValue(false);

				modification.setD_NDealerLicense_ID(newDealerLicense.get_ID());
				dealerFile.setProcessed(true);
				dealerFile.save();
				newDealerLicense.save();
				dealerLicense.setDescription("Modification License has modified to the new license "
						+ newDealerLicense.getDocumentNo() + "   Type(s) of changes " + type1 + type2 + type3);
				;
				dealerLicense.setLicenseStatus("M");
				dealerLicense.setD_DLModification_ID(modification.get_ID());
				dealerLicense.save();

				modification.setD_NDealerLicense_ID(newDealerLicense.get_ID());
				modification.setProcessed(true);
				modification.save();

			}
		} else {
			throw new AdempiereException("Please Select the license to be modified!");
		}
		mTab.dataRefresh(true);
		return "";
	}
}
