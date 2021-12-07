package org.topra.callouts;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MAsset;
import org.compiere.model.MAssetAcct;
import org.compiere.model.MGLCategory;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournalLine;
import org.compiere.util.DB;
import org.hibernate.validator.MaxValidator;
import org.topra.model.MAAssetOrgTrasfer;

//org.topra.callouts.AssetOrgTransferer.processIt
public class AssetOrgTransferer extends CalloutEngine {

	public String processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return "";

		MAAssetOrgTrasfer assetOrgTrasfer = new MAAssetOrgTrasfer(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
		
		if (ADialog.ask(WindowNo, null, "Process Confirmation", "Do I process this?")) {
			MAsset asset = new MAsset(ctx, assetOrgTrasfer.getA_Asset_ID(), mTab.getTrxInfo());

			
			int currentOrg_ID = asset.getAD_Org_ID();
			asset.setAD_Org_ID(assetOrgTrasfer.getNewOrg_ID());
			asset.save();
			
			
			
			StringBuffer sqlA_Asset_Product = new StringBuffer("UPDATE A_Asset_Product " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			int a = DB.executeUpdateEx(sqlA_Asset_Product.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Depreciation_Workfile = new StringBuffer(
					"UPDATE A_Depreciation_Workfile " + "set ad_org_id=" + assetOrgTrasfer.getNewOrg_ID()
							+ " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Depreciation_Workfile.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Acct = new StringBuffer("UPDATE A_Asset_Acct " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Acct.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Addition = new StringBuffer("UPDATE A_Asset_Addition " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Addition.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Disposed = new StringBuffer("UPDATE A_Asset_Disposed " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Disposed.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Change = new StringBuffer("UPDATE A_Asset_Change " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Change.toString(), mTab.getTrxInfo());

			StringBuffer sqlR_IssueProject = new StringBuffer("UPDATE R_IssueProject " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlR_IssueProject.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Info_Fin = new StringBuffer("UPDATE A_Asset_Info_Fin " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Info_Fin.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Info_Lic = new StringBuffer("UPDATE A_Asset_Info_Lic " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Info_Lic.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Info_Ins = new StringBuffer("UPDATE A_Asset_Info_Ins " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Info_Ins.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Info_Tax = new StringBuffer("UPDATE A_Asset_Info_Tax " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Info_Tax.toString(), mTab.getTrxInfo());

			StringBuffer sqlA_Asset_Info_Oth = new StringBuffer("UPDATE A_Asset_Info_Oth " + "set ad_org_id="
					+ assetOrgTrasfer.getNewOrg_ID() + " where A_Asset_ID = " + asset.getA_Asset_ID());
			a = DB.executeUpdateEx(sqlA_Asset_Info_Oth.toString(), mTab.getTrxInfo());

			
			StringBuffer stringBuffer = new StringBuffer("SELECT MAX(A_Asset_Acct_id) FROM A_Asset_Acct where A_Asset_ID=" + asset.getA_Asset_ID());
			int A_Asset_Acct_id = DB.getSQLValue(mTab.getTrxInfo() , stringBuffer.toString());
			MAssetAcct acct = new MAssetAcct(ctx, A_Asset_Acct_id, mTab.getTrxInfo());
			 
			StringBuffer stringBuffer1 = new StringBuffer("SELECT MAX(account_id) from c_validcombination where c_validcombination_id=" + acct.getA_Asset_Acct());
			int account = DB.getSQLValue(mTab.getTrxInfo() , stringBuffer1.toString());
			
			Calendar ce = Calendar.getInstance();
			Timestamp ts = new Timestamp(ce.getTimeInMillis());
			
			//Journal Entries
			MJournalBatch batch= new MJournalBatch(ctx, 0, mTab.getTrxInfo());
			batch.addDescription(assetOrgTrasfer.getDescription());
			batch.setPostingType("A");
			batch.setGL_Category_ID(1000000);
			batch.setC_Currency_ID(313);
			batch.setDateDoc(ts);
			batch.setDateAcct(ts);
			batch.setC_DocType_ID(1000000);
			//batch.setC_Period_ID(0);
			batch.save();
			System.out.println("batch  "+ batch.get_ID());
			
			MJournal journal = new MJournal(batch);
			journal.setC_AcctSchema_ID(1000000);
			journal.setC_DocType_ID(1000000);
			journal.setDescription(assetOrgTrasfer.getDescription());
			journal.setIsApproved(true);
			journal.setPostingType("A");
			journal.setGL_Category_ID(1000000);
			journal.setC_Currency_ID(313);
			journal.setDateDoc(ts);
			journal.setDateAcct(ts);
			journal.setC_ConversionType_ID(114);
			journal.save();
			System.out.println("journal  "+ journal.get_ID());
			StringBuffer stringBuffer2 = new StringBuffer( "SELECT a_asset_cost FROM A_Depreciation_Workfile WHERE A_Asset_ID=" + assetOrgTrasfer.getA_Asset_ID());
			BigDecimal cost = DB.getSQLValueBD(mTab.getTrxInfo() , stringBuffer2.toString());
			
			System.out.println("Cost    "+ cost);
			
			MJournalLine journalCrLine = new MJournalLine(journal);
			journalCrLine.setAccount_ID(account);
			journalCrLine.setDescription(assetOrgTrasfer.getDescription());
			journalCrLine.setM_Product_ID(asset.getM_Product_ID());
			journalCrLine.setAD_Org_ID(currentOrg_ID);
			journalCrLine.setAmtSourceCr(cost);
			journalCrLine.save();
			
			MJournalLine journalDrLine = new MJournalLine(journal);
			journalDrLine.setAccount_ID(account);
			journalDrLine.setDescription(assetOrgTrasfer.getDescription());
			journalDrLine.setM_Product_ID(asset.getM_Product_ID());
			journalDrLine.setAD_Org_ID(assetOrgTrasfer.getNewOrg_ID());
			journalDrLine.setAmtSourceDr(cost);
			journalDrLine.save();
			
			batch.completeIt();
			ADialog.info(0, null, "Journal Batch : "+batch.getDocumentNo());
		}

		assetOrgTrasfer.setProcessed(true);
		assetOrgTrasfer.save();
		mTab.dataRefresh(true);
		return "";
	}
}
