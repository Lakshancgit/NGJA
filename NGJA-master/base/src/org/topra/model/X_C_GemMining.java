/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.topra.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_GemMining
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_GemMining extends PO implements I_C_GemMining, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190508L;

    /** Standard Constructor */
    public X_C_GemMining (Properties ctx, int C_GemMining_ID, String trxName)
    {
      super (ctx, C_GemMining_ID, trxName);
      /** if (C_GemMining_ID == 0)
        {
			setC_GemMining_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_GemMining (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_GemMining[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GemMininig ID.
		@param C_GemMining_ID GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID)
	{
		if (C_GemMining_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_GemMining_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_GemMining_ID, Integer.valueOf(C_GemMining_ID));
	}

	/** Get GemMininig ID.
		@return GemMininig ID	  */
	public int getC_GemMining_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_GemMining_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
    {
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_Name)
			.getPO(getC_Invoice_ID(), get_TrxName());	}

	/** Set Invoice.
		@param C_Invoice_ID 
		Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1) 
			set_Value (COLUMNNAME_C_Invoice_ID, null);
		else 
			set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_LandDetails getC_LandDetails() throws RuntimeException
    {
		return (org.topra.model.I_C_LandDetails)MTable.get(getCtx(), org.topra.model.I_C_LandDetails.Table_Name)
			.getPO(getC_LandDetails_ID(), get_TrxName());	}

	/** Set Land Details ID.
		@param C_LandDetails_ID Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID)
	{
		if (C_LandDetails_ID < 1) 
			set_Value (COLUMNNAME_C_LandDetails_ID, null);
		else 
			set_Value (COLUMNNAME_C_LandDetails_ID, Integer.valueOf(C_LandDetails_ID));
	}

	/** Get Land Details ID.
		@return Land Details ID	  */
	public int getC_LandDetails_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandDetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_LandDetails getC_MiningLandName() throws RuntimeException
    {
		return (org.topra.model.I_C_LandDetails)MTable.get(getCtx(), org.topra.model.I_C_LandDetails.Table_Name)
			.getPO(getC_MiningLandName_ID(), get_TrxName());	}

	/** Set C_MiningLandName ID.
		@param C_MiningLandName_ID C_MiningLandName ID	  */
	public void setC_MiningLandName_ID (int C_MiningLandName_ID)
	{
		if (C_MiningLandName_ID < 1) 
			set_Value (COLUMNNAME_C_MiningLandName_ID, null);
		else 
			set_Value (COLUMNNAME_C_MiningLandName_ID, Integer.valueOf(C_MiningLandName_ID));
	}

	/** Get C_MiningLandName ID.
		@return C_MiningLandName ID	  */
	public int getC_MiningLandName_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MiningLandName_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Confirm.
		@param DateConfirm 
		Date Confirm of this Order
	  */
	public void setDateConfirm (Timestamp DateConfirm)
	{
		set_Value (COLUMNNAME_DateConfirm, DateConfirm);
	}

	/** Get Date Confirm.
		@return Date Confirm of this Order
	  */
	public Timestamp getDateConfirm () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateConfirm);
	}

	/** Set Date Start.
		@param DateStart 
		Date Start for this Order
	  */
	public void setDateStart (Timestamp DateStart)
	{
		set_Value (COLUMNNAME_DateStart, DateStart);
	}

	/** Get Date Start.
		@return Date Start for this Order
	  */
	public Timestamp getDateStart () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateStart);
	}

	/** Set Date To.
		@param DateTo 
		End date of a date range
	  */
	public void setDateTo (Timestamp DateTo)
	{
		set_Value (COLUMNNAME_DateTo, DateTo);
	}

	/** Get Date To.
		@return End date of a date range
	  */
	public Timestamp getDateTo () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTo);
	}

	/** DepositReleaseStatus AD_Reference_ID=1000107 */
	public static final int DEPOSITRELEASESTATUS_AD_Reference_ID=1000107;
	/** Prepare = P */
	public static final String DEPOSITRELEASESTATUS_Prepare = "P";
	/** Send for inspection Approval = SIA */
	public static final String DEPOSITRELEASESTATUS_SendForInspectionApproval = "SIA";
	/** Send for diputy director Approval = SDDA */
	public static final String DEPOSITRELEASESTATUS_SendForDiputyDirectorApproval = "SDDA";
	/** Send for director Approval = SDA */
	public static final String DEPOSITRELEASESTATUS_SendForDirectorApproval = "SDA";
	/** Send for chairman approval = SCA */
	public static final String DEPOSITRELEASESTATUS_SendForChairmanApproval = "SCA";
	/** Reject = R */
	public static final String DEPOSITRELEASESTATUS_Reject = "R";
	/** Active = A */
	public static final String DEPOSITRELEASESTATUS_Active = "A";
	/** Inactive = IN */
	public static final String DEPOSITRELEASESTATUS_Inactive = "IN";
	/** Send for Legal Officer Approval = SAL */
	public static final String DEPOSITRELEASESTATUS_SendForLegalOfficerApproval = "SAL";
	/** Record Not Completed = NC */
	public static final String DEPOSITRELEASESTATUS_RecordNotCompleted = "NC";
	/** Incomplete Ownership = ICO */
	public static final String DEPOSITRELEASESTATUS_IncompleteOwnership = "ICO";
	/** Close = CL */
	public static final String DEPOSITRELEASESTATUS_Close = "CL";
	/** Ready for Accountant Approval = RFA */
	public static final String DEPOSITRELEASESTATUS_ReadyForAccountantApproval = "RFA";
	/** Released = REL */
	public static final String DEPOSITRELEASESTATUS_Released = "REL";
	/** Ready to Print = RTP */
	public static final String DEPOSITRELEASESTATUS_ReadyToPrint = "RTP";
	/** Set DepositReleaseStatus.
		@param DepositReleaseStatus DepositReleaseStatus	  */
	public void setDepositReleaseStatus (String DepositReleaseStatus)
	{

		set_Value (COLUMNNAME_DepositReleaseStatus, DepositReleaseStatus);
	}

	/** Get DepositReleaseStatus.
		@return DepositReleaseStatus	  */
	public String getDepositReleaseStatus () 
	{
		return (String)get_Value(COLUMNNAME_DepositReleaseStatus);
	}

	/** DepositReleaseType AD_Reference_ID=1000147 */
	public static final int DEPOSITRELEASETYPE_AD_Reference_ID=1000147;
	/** Release For Customer = RFC */
	public static final String DEPOSITRELEASETYPE_ReleaseForCustomer = "RFC";
	/** Deposit Confiscation = DC */
	public static final String DEPOSITRELEASETYPE_DepositConfiscation = "DC";
	/** Set DepositReleaseType.
		@param DepositReleaseType DepositReleaseType	  */
	public void setDepositReleaseType (String DepositReleaseType)
	{

		set_Value (COLUMNNAME_DepositReleaseType, DepositReleaseType);
	}

	/** Get DepositReleaseType.
		@return DepositReleaseType	  */
	public String getDepositReleaseType () 
	{
		return (String)get_Value(COLUMNNAME_DepositReleaseType);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** IsRenewal AD_Reference_ID=1000151 */
	public static final int ISRENEWAL_AD_Reference_ID=1000151;
	/** Yes = Y */
	public static final String ISRENEWAL_Yes = "Y";
	/** No = N */
	public static final String ISRENEWAL_No = "N";
	/** Set IsRenewal.
		@param IsRenewal IsRenewal	  */
	public void setIsRenewal (String IsRenewal)
	{

		set_Value (COLUMNNAME_IsRenewal, IsRenewal);
	}

	/** Get IsRenewal.
		@return IsRenewal	  */
	public String getIsRenewal () 
	{
		return (String)get_Value(COLUMNNAME_IsRenewal);
	}

	/** Set IsUpgrade.
		@param IsUpgrade IsUpgrade	  */
	public void setIsUpgrade (boolean IsUpgrade)
	{
		set_Value (COLUMNNAME_IsUpgrade, Boolean.valueOf(IsUpgrade));
	}

	/** Get IsUpgrade.
		@return IsUpgrade	  */
	public boolean isUpgrade () 
	{
		Object oo = get_Value(COLUMNNAME_IsUpgrade);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public org.topra.model.I_C_LandDetails getLandN() throws RuntimeException
    {
		return (org.topra.model.I_C_LandDetails)MTable.get(getCtx(), org.topra.model.I_C_LandDetails.Table_Name)
			.getPO(getLandName(), get_TrxName());	}

	/** Set Name of the Land.
		@param LandName Name of the Land	  */
	public void setLandName (int LandName)
	{
		set_Value (COLUMNNAME_LandName, Integer.valueOf(LandName));
	}

	/** Get Name of the Land.
		@return Name of the Land	  */
	public int getLandName () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LandName);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Last Active Year.
		@param LastActiveYear Last Active Year	  */
	public void setLastActiveYear (String LastActiveYear)
	{
		set_Value (COLUMNNAME_LastActiveYear, LastActiveYear);
	}

	/** Get Last Active Year.
		@return Last Active Year	  */
	public String getLastActiveYear () 
	{
		return (String)get_Value(COLUMNNAME_LastActiveYear);
	}

	/** LicenseStatus AD_Reference_ID=1000107 */
	public static final int LICENSESTATUS_AD_Reference_ID=1000107;
	/** Prepare = P */
	public static final String LICENSESTATUS_Prepare = "P";
	/** Send for inspection Approval = SIA */
	public static final String LICENSESTATUS_SendForInspectionApproval = "SIA";
	/** Send for diputy director Approval = SDDA */
	public static final String LICENSESTATUS_SendForDiputyDirectorApproval = "SDDA";
	/** Send for director Approval = SDA */
	public static final String LICENSESTATUS_SendForDirectorApproval = "SDA";
	/** Send for chairman approval = SCA */
	public static final String LICENSESTATUS_SendForChairmanApproval = "SCA";
	/** Reject = R */
	public static final String LICENSESTATUS_Reject = "R";
	/** Active = A */
	public static final String LICENSESTATUS_Active = "A";
	/** Inactive = IN */
	public static final String LICENSESTATUS_Inactive = "IN";
	/** Send for Legal Officer Approval = SAL */
	public static final String LICENSESTATUS_SendForLegalOfficerApproval = "SAL";
	/** Record Not Completed = NC */
	public static final String LICENSESTATUS_RecordNotCompleted = "NC";
	/** Incomplete Ownership = ICO */
	public static final String LICENSESTATUS_IncompleteOwnership = "ICO";
	/** Close = CL */
	public static final String LICENSESTATUS_Close = "CL";
	/** Ready for Accountant Approval = RFA */
	public static final String LICENSESTATUS_ReadyForAccountantApproval = "RFA";
	/** Released = REL */
	public static final String LICENSESTATUS_Released = "REL";
	/** Ready to Print = RTP */
	public static final String LICENSESTATUS_ReadyToPrint = "RTP";
	/** Set License Status.
		@param LicenseStatus License Status	  */
	public void setLicenseStatus (String LicenseStatus)
	{

		set_Value (COLUMNNAME_LicenseStatus, LicenseStatus);
	}

	/** Get License Status.
		@return License Status	  */
	public String getLicenseStatus () 
	{
		return (String)get_Value(COLUMNNAME_LicenseStatus);
	}

	/** Set NoOfMine.
		@param NoOfMine NoOfMine	  */
	public void setNoOfMine (int NoOfMine)
	{
		set_Value (COLUMNNAME_NoOfMine, Integer.valueOf(NoOfMine));
	}

	/** Get NoOfMine.
		@return NoOfMine	  */
	public int getNoOfMine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfMine);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** PrintApproval AD_Reference_ID=1000164 */
	public static final int PRINTAPPROVAL_AD_Reference_ID=1000164;
	/** Approved = Approved */
	public static final String PRINTAPPROVAL_Approved = "Approved";
	/** Not Approved = Not Approved */
	public static final String PRINTAPPROVAL_NotApproved = "Not Approved";
	/** Set PrintApproval.
		@param PrintApproval PrintApproval	  */
	public void setPrintApproval (String PrintApproval)
	{

		set_Value (COLUMNNAME_PrintApproval, PrintApproval);
	}

	/** Get PrintApproval.
		@return PrintApproval	  */
	public String getPrintApproval () 
	{
		return (String)get_Value(COLUMNNAME_PrintApproval);
	}

	/** Set PrintBtn.
		@param PrintBtn PrintBtn	  */
	public void setPrintBtn (String PrintBtn)
	{
		set_Value (COLUMNNAME_PrintBtn, PrintBtn);
	}

	/** Get PrintBtn.
		@return PrintBtn	  */
	public String getPrintBtn () 
	{
		return (String)get_Value(COLUMNNAME_PrintBtn);
	}

	/** Set Print Document.
		@param PrintDocument 
		Document to print
	  */
	public void setPrintDocument (String PrintDocument)
	{
		set_Value (COLUMNNAME_PrintDocument, PrintDocument);
	}

	/** Get Print Document.
		@return Document to print
	  */
	public String getPrintDocument () 
	{
		return (String)get_Value(COLUMNNAME_PrintDocument);
	}

	/** Set Printed.
		@param Printed Printed	  */
	public void setPrinted (boolean Printed)
	{
		set_Value (COLUMNNAME_Printed, Boolean.valueOf(Printed));
	}

	/** Get Printed.
		@return Printed	  */
	public boolean isPrinted () 
	{
		Object oo = get_Value(COLUMNNAME_Printed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Stock Value.
		@param StockValue Stock Value	  */
	public void setStockValue (int StockValue)
	{
		set_Value (COLUMNNAME_StockValue, Integer.valueOf(StockValue));
	}

	/** Get Stock Value.
		@return Stock Value	  */
	public int getStockValue () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_StockValue);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	/** Set ViewRecord.
		@param ViewRecord ViewRecord	  */
	public void setViewRecord (String ViewRecord)
	{
		set_Value (COLUMNNAME_ViewRecord, ViewRecord);
	}

	/** Get ViewRecord.
		@return ViewRecord	  */
	public String getViewRecord () 
	{
		return (String)get_Value(COLUMNNAME_ViewRecord);
	}

	/** Set ZoomRecord.
		@param ZoomRecord ZoomRecord	  */
	public void setZoomRecord (String ZoomRecord)
	{
		set_Value (COLUMNNAME_ZoomRecord, ZoomRecord);
	}

	/** Get ZoomRecord.
		@return ZoomRecord	  */
	public String getZoomRecord () 
	{
		return (String)get_Value(COLUMNNAME_ZoomRecord);
	}
}