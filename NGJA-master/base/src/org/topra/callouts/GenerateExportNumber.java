package org.topra.callouts;

import java.util.Properties;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MSequence;
import org.topra.model.HardCoded;
import org.topra.model.MCExportNGJA;

/**
 * GenerateExportNumber
 * 
 * @author Lakshan - Topra
 * @version 1.0
 * @date 15th of jan 2019
 */

public class GenerateExportNumber extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MCExportNGJA mcExportNGJA = new MCExportNGJA(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (mcExportNGJA.getC_DocType_ID() == HardCoded.TempExportDocType_ID) {

			if (mcExportNGJA.getC_Invoice_ID() != 0) {
				StringBuffer sqlDealerLicense = null;

				if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignmentGemExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.personalConsignmentGemExportsSeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignGemExportDemo_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.personalConsignmentGemExportsDemoSeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignGemExportsTest_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.personalConsignmentGemExportsTestSeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalGemExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.personalGemExportsSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalConsignJewExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.personalConsignmentJewExportsSeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalJewExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.personalJewExportsSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeRoughImportnReExport_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.roughImportsnReExportSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeDiamondConsignmentExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.DiamondConExportsSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeDiamondConsignJewExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.DiamondConJewExportsSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeGeudaExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.geudaExportsSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeGeudaKattaExports_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.geudaKattaExportsSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeExhibitionGem_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.exhibitionGemSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeExhibitionJew_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.exhibitionJewSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeGIFTGem_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.giftGemSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeGIFTJewellery_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.giftJewSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeTradeSampleGem_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.tradeSampleGemSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeTradeSampleJew_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.tradeSampleJewSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeInternetSaleGem_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.internetSaleGemSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeInternetSaleJewellery_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(), HardCoded.internetSaleJewSeq_ID,
							mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}

				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypePersonalJewExDemo_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.personalConsignmentJewExportsDemoSeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				
				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeRoughDiamondReExport_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.RoughDiamondReExportSeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				
				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeRIEGem_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.RIEGemSeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				else if (mcExportNGJA.getC_ExportServiceType_ID() == HardCoded.ExpTypeRIEJewellery_ID) {

					MSequence mSequence = new MSequence(mcExportNGJA.getCtx(),
							HardCoded.RIEJewellerySeq_ID, mcExportNGJA.get_TrxName());
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
					mcExportNGJA.setDocumentNo(prefix + String.valueOf(mSequence.getCurrentNext()) + sufix);
					mSequence.setCurrentNext(mSequence.getCurrentNext() + 1);
					mSequence.save();

				}
				mcExportNGJA.setExpStatus("R");
				mcExportNGJA.setC_DocType_ID(HardCoded.RegExportDocType_ID);
				mcExportNGJA.save();
				mTab.dataRefresh();

			}
		}

		return "";
	}
}
