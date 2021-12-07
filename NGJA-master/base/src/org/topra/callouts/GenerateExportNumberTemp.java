package org.topra.callouts;

import java.util.Properties;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MSequence;
import org.topra.model.HardCoded;
import org.topra.model.MCExportDetails;

/**
 * org.topra.callouts.GenerateExportNumberTemp.processIt
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 6th of jan 2020
 */

public class GenerateExportNumberTemp extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCExportDetails MCExportDetails = new MCExportDetails(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		

			if (MCExportDetails.getC_Invoice_ID() != 0) {
				StringBuffer sqlDealerLicense = null;

				if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignmentGemExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.personalConsignmentGemExportsSeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignGemExportDemo_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.personalConsignmentGemExportsDemoSeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignGemExportsTest_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.personalConsignmentGemExportsTestSeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalGemExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.personalGemExportsSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignJewExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.personalConsignmentJewExportsSeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalJewExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.personalJewExportsSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeRoughImportnReExport_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.roughImportsnReExportSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeDiamondConsignmentExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.DiamondConExportsSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeDiamondConsignJewExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.DiamondConJewExportsSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeGeudaExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.geudaExportsSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeGeudaKattaExports_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.geudaKattaExportsSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeExhibitionGem_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.exhibitionGemSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeExhibitionJew_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.exhibitionJewSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeGIFTGem_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.giftGemSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeGIFTJewellery_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.giftJewSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeTradeSampleGem_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.tradeSampleGemSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeTradeSampleJew_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.tradeSampleJewSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeInternetSaleGem_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.internetSaleGemSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeInternetSaleJewellery_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(), HardCoded.internetSaleJewSeq_ID,
							MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalJewExDemo_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.personalConsignmentJewExportsDemoSeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				
				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeRoughDiamondReExport_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.RoughDiamondReExportSeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				
				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeRIEGem_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.RIEGemSeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				else if (MCExportDetails.getC_ExportServiceType_ID() == HardCoded.ExpTypeRIEJewellery_ID) {

					MSequence mSequence = new MSequence(MCExportDetails.getCtx(),
							HardCoded.RIEJewellerySeq_ID, MCExportDetails.get_TrxName());
					String prefix, sufix;

					if (mSequence.getPrefix() == null) {
						prefix = "";
					} else {
						prefix = mSequence.getPrefix();
					}

					if (mSequence.getSuffix() == null) {
						sufix = "";
					} else {
						sufix = mSequence.getSuffix();
					}
					MCExportDetails.setReferenceNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
	//			MCExportDetails.setExpStatus("R");
			//	MCExportDetails.setC_DocType_ID(HardCoded.RegExportDocType_ID);
				MCExportDetails.save();
				mTab.dataRefresh();

			}
		

		return "";
	}
}
