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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for C_DepositRelease
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_DepositRelease extends PO implements I_C_DepositRelease, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190514L;

    /** Standard Constructor */
    public X_C_DepositRelease (Properties ctx, int C_DepositRelease_ID, String trxName)
    {
      super (ctx, C_DepositRelease_ID, trxName);
      /** if (C_DepositRelease_ID == 0)
        {
			setC_DepositRelease_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_DepositRelease (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_DepositRelease[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.topra.model.I_C_AuctionLicense getC_AuctionLicense() throws RuntimeException
    {
		return (org.topra.model.I_C_AuctionLicense)MTable.get(getCtx(), org.topra.model.I_C_AuctionLicense.Table_Name)
			.getPO(getC_AuctionLicense_ID(), get_TrxName());	}

	/** Set AuctionLicense ID.
		@param C_AuctionLicense_ID AuctionLicense ID	  */
	public void setC_AuctionLicense_ID (int C_AuctionLicense_ID)
	{
		if (C_AuctionLicense_ID < 1) 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, null);
		else 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, Integer.valueOf(C_AuctionLicense_ID));
	}

	/** Get AuctionLicense ID.
		@return AuctionLicense ID	  */
	public int getC_AuctionLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AuctionLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_BackhoeService getC_BackhoeService() throws RuntimeException
    {
		return (org.topra.model.I_C_BackhoeService)MTable.get(getCtx(), org.topra.model.I_C_BackhoeService.Table_Name)
			.getPO(getC_BackhoeService_ID(), get_TrxName());	}

	/** Set BackhoeService ID.
		@param C_BackhoeService_ID BackhoeService ID	  */
	public void setC_BackhoeService_ID (int C_BackhoeService_ID)
	{
		if (C_BackhoeService_ID < 1) 
			set_Value (COLUMNNAME_C_BackhoeService_ID, null);
		else 
			set_Value (COLUMNNAME_C_BackhoeService_ID, Integer.valueOf(C_BackhoeService_ID));
	}

	/** Get BackhoeService ID.
		@return BackhoeService ID	  */
	public int getC_BackhoeService_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BackhoeService_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set License Deposit Release ID.
		@param C_DepositRelease_ID License Deposit Release ID	  */
	public void setC_DepositRelease_ID (int C_DepositRelease_ID)
	{
		if (C_DepositRelease_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_DepositRelease_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_DepositRelease_ID, Integer.valueOf(C_DepositRelease_ID));
	}

	/** Get License Deposit Release ID.
		@return License Deposit Release ID	  */
	public int getC_DepositRelease_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DepositRelease_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_GemMining getC_GemMining() throws RuntimeException
    {
		return (org.topra.model.I_C_GemMining)MTable.get(getCtx(), org.topra.model.I_C_GemMining.Table_Name)
			.getPO(getC_GemMining_ID(), get_TrxName());	}

	/** Set GemMininig ID.
		@param C_GemMining_ID GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID)
	{
		if (C_GemMining_ID < 1) 
			set_Value (COLUMNNAME_C_GemMining_ID, null);
		else 
			set_Value (COLUMNNAME_C_GemMining_ID, Integer.valueOf(C_GemMining_ID));
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

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException
    {
		return (org.compiere.model.I_C_Payment)MTable.get(getCtx(), org.compiere.model.I_C_Payment.Table_Name)
			.getPO(getC_Payment_ID(), get_TrxName());	}

	/** Set Payment.
		@param C_Payment_ID 
		Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID)
	{
		if (C_Payment_ID < 1) 
			set_Value (COLUMNNAME_C_Payment_ID, null);
		else 
			set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
	}

	/** Get Payment.
		@return Payment identifier
	  */
	public int getC_Payment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.compiere.model.I_C_Payment getDepositMining() throws RuntimeException
    {
		return (org.compiere.model.I_C_Payment)MTable.get(getCtx(), org.compiere.model.I_C_Payment.Table_Name)
			.getPO(getDepositMining_ID(), get_TrxName());	}

	/** Set DepositMining ID.
		@param DepositMining_ID DepositMining ID	  */
	public void setDepositMining_ID (int DepositMining_ID)
	{
		if (DepositMining_ID < 1) 
			set_Value (COLUMNNAME_DepositMining_ID, null);
		else 
			set_Value (COLUMNNAME_DepositMining_ID, Integer.valueOf(DepositMining_ID));
	}

	/** Get DepositMining ID.
		@return DepositMining ID	  */
	public int getDepositMining_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DepositMining_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
	/** Released For Government = DC */
	public static final String DEPOSITRELEASETYPE_ReleasedForGovernment = "DC";
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

	/** LicenseTypeMining AD_Reference_ID=1000171 */
	public static final int LICENSETYPEMINING_AD_Reference_ID=1000171;
	/** Mining License = ML */
	public static final String LICENSETYPEMINING_MiningLicense = "ML";
	/** Aution License = AL */
	public static final String LICENSETYPEMINING_AutionLicense = "AL";
	/** Backhoe License = BL */
	public static final String LICENSETYPEMINING_BackhoeLicense = "BL";
	/** Set LicenseTypeMining.
		@param LicenseTypeMining LicenseTypeMining	  */
	public void setLicenseTypeMining (String LicenseTypeMining)
	{

		set_Value (COLUMNNAME_LicenseTypeMining, LicenseTypeMining);
	}

	/** Get LicenseTypeMining.
		@return LicenseTypeMining	  */
	public String getLicenseTypeMining () 
	{
		return (String)get_Value(COLUMNNAME_LicenseTypeMining);
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

	/** Set Value.
		@param ValueNumber 
		Numeric Value
	  */
	public void setValueNumber (BigDecimal ValueNumber)
	{
		set_Value (COLUMNNAME_ValueNumber, ValueNumber);
	}

	/** Get Value.
		@return Numeric Value
	  */
	public BigDecimal getValueNumber () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ValueNumber);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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