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

/** Generated Model for D_DealerLicense
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_D_DealerLicense extends PO implements I_D_DealerLicense, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200127L;

    /** Standard Constructor */
    public X_D_DealerLicense (Properties ctx, int D_DealerLicense_ID, String trxName)
    {
      super (ctx, D_DealerLicense_ID, trxName);
      /** if (D_DealerLicense_ID == 0)
        {
			setD_DealerLicense_ID (0);
        } */
    }

    /** Load Constructor */
    public X_D_DealerLicense (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_D_DealerLicense[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Process Application.
		@param AppStatus Process Application	  */
	public void setAppStatus (String AppStatus)
	{
		set_Value (COLUMNNAME_AppStatus, AppStatus);
	}

	/** Get Process Application.
		@return Process Application	  */
	public String getAppStatus () 
	{
		return (String)get_Value(COLUMNNAME_AppStatus);
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
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
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

	public org.topra.model.I_C_DealerFile getC_DealerFile() throws RuntimeException
    {
		return (org.topra.model.I_C_DealerFile)MTable.get(getCtx(), org.topra.model.I_C_DealerFile.Table_Name)
			.getPO(getC_DealerFile_ID(), get_TrxName());	}

	/** Set Dealer File Number ID.
		@param C_DealerFile_ID Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID)
	{
		if (C_DealerFile_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_DealerFile_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_DealerFile_ID, Integer.valueOf(C_DealerFile_ID));
	}

	/** Get Dealer File Number ID.
		@return Dealer File Number ID	  */
	public int getC_DealerFile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DealerFile_ID);
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

	/** Set Gem Dealer License ID.
		@param D_DealerLicense_ID Gem Dealer License ID	  */
	public void setD_DealerLicense_ID (int D_DealerLicense_ID)
	{
		if (D_DealerLicense_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_D_DealerLicense_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_D_DealerLicense_ID, Integer.valueOf(D_DealerLicense_ID));
	}

	/** Get Gem Dealer License ID.
		@return Gem Dealer License ID	  */
	public int getD_DealerLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_D_DealerLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_D_DLModification getD_DLModification() throws RuntimeException
    {
		return (org.topra.model.I_D_DLModification)MTable.get(getCtx(), org.topra.model.I_D_DLModification.Table_Name)
			.getPO(getD_DLModification_ID(), get_TrxName());	}

	/** Set D_DLModification ID.
		@param D_DLModification_ID D_DLModification ID	  */
	public void setD_DLModification_ID (int D_DLModification_ID)
	{
		if (D_DLModification_ID < 1) 
			set_Value (COLUMNNAME_D_DLModification_ID, null);
		else 
			set_Value (COLUMNNAME_D_DLModification_ID, Integer.valueOf(D_DLModification_ID));
	}

	/** Get D_DLModification ID.
		@return D_DLModification ID	  */
	public int getD_DLModification_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_D_DLModification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DealerView.
		@param DealerView DealerView	  */
	public void setDealerView (String DealerView)
	{
		set_Value (COLUMNNAME_DealerView, DealerView);
	}

	/** Get DealerView.
		@return DealerView	  */
	public String getDealerView () 
	{
		return (String)get_Value(COLUMNNAME_DealerView);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
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

	/** Set Gem Stock Value.
		@param gem_stock_value Gem Stock Value	  */
	public void setgem_stock_value (int gem_stock_value)
	{
		set_Value (COLUMNNAME_gem_stock_value, Integer.valueOf(gem_stock_value));
	}

	/** Get Gem Stock Value.
		@return Gem Stock Value	  */
	public int getgem_stock_value () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_gem_stock_value);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set InactiveBtn.
		@param InactiveBtn InactiveBtn	  */
	public void setInactiveBtn (String InactiveBtn)
	{
		set_Value (COLUMNNAME_InactiveBtn, InactiveBtn);
	}

	/** Get InactiveBtn.
		@return InactiveBtn	  */
	public String getInactiveBtn () 
	{
		return (String)get_Value(COLUMNNAME_InactiveBtn);
	}

	/** Set Modified.
		@param IsModified 
		The record is modified
	  */
	public void setIsModified (boolean IsModified)
	{
		set_Value (COLUMNNAME_IsModified, Boolean.valueOf(IsModified));
	}

	/** Get Modified.
		@return The record is modified
	  */
	public boolean isModified () 
	{
		Object oo = get_Value(COLUMNNAME_IsModified);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** IsRenewal AD_Reference_ID=1000102 */
	public static final int ISRENEWAL_AD_Reference_ID=1000102;
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

	/** Set License End Date.
		@param LicenseEndDate License End Date	  */
	public void setLicenseEndDate (Timestamp LicenseEndDate)
	{
		set_Value (COLUMNNAME_LicenseEndDate, LicenseEndDate);
	}

	/** Get License End Date.
		@return License End Date	  */
	public Timestamp getLicenseEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LicenseEndDate);
	}

	/** Set License Start  Date.
		@param LicenseStartDate License Start  Date	  */
	public void setLicenseStartDate (Timestamp LicenseStartDate)
	{
		set_Value (COLUMNNAME_LicenseStartDate, LicenseStartDate);
	}

	/** Get License Start  Date.
		@return License Start  Date	  */
	public Timestamp getLicenseStartDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LicenseStartDate);
	}

	/** LicenseStatus AD_Reference_ID=1000025 */
	public static final int LICENSESTATUS_AD_Reference_ID=1000025;
	/** Invoiced = INV */
	public static final String LICENSESTATUS_Invoiced = "INV";
	/** Prepare = P */
	public static final String LICENSESTATUS_Prepare = "P";
	/** Draft = DR */
	public static final String LICENSESTATUS_Draft = "DR";
	/** Active = A */
	public static final String LICENSESTATUS_Active = "A";
	/** Inactive = I */
	public static final String LICENSESTATUS_Inactive = "I";
	/** Sent For Inspection Approval = SA */
	public static final String LICENSESTATUS_SentForInspectionApproval = "SA";
	/** Sent For Deputy Director Approval = SDA */
	public static final String LICENSESTATUS_SentForDeputyDirectorApproval = "SDA";
	/** Sent For Chairman Approval = SCA */
	public static final String LICENSESTATUS_SentForChairmanApproval = "SCA";
	/** Modified = M */
	public static final String LICENSESTATUS_Modified = "M";
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

	/** Set Modified.
		@param Modified Modified	  */
	public void setModified (String Modified)
	{
		set_Value (COLUMNNAME_Modified, Modified);
	}

	/** Get Modified.
		@return Modified	  */
	public String getModified () 
	{
		return (String)get_Value(COLUMNNAME_Modified);
	}

	/** OtherStatus AD_Reference_ID=1000179 */
	public static final int OTHERSTATUS_AD_Reference_ID=1000179;
	/** Modified = M */
	public static final String OTHERSTATUS_Modified = "M";
	/** Set OtherStatus.
		@param OtherStatus OtherStatus	  */
	public void setOtherStatus (String OtherStatus)
	{

		set_Value (COLUMNNAME_OtherStatus, OtherStatus);
	}

	/** Get OtherStatus.
		@return OtherStatus	  */
	public String getOtherStatus () 
	{
		return (String)get_Value(COLUMNNAME_OtherStatus);
	}

	/** Set OverStoctValue.
		@param OverStoctValue OverStoctValue	  */
	public void setOverStoctValue (boolean OverStoctValue)
	{
		set_Value (COLUMNNAME_OverStoctValue, Boolean.valueOf(OverStoctValue));
	}

	/** Get OverStoctValue.
		@return OverStoctValue	  */
	public boolean isOverStoctValue () 
	{
		Object oo = get_Value(COLUMNNAME_OverStoctValue);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set UPtoStoctValue.
		@param UPtoStoctValue UPtoStoctValue	  */
	public void setUPtoStoctValue (boolean UPtoStoctValue)
	{
		set_Value (COLUMNNAME_UPtoStoctValue, Boolean.valueOf(UPtoStoctValue));
	}

	/** Get UPtoStoctValue.
		@return UPtoStoctValue	  */
	public boolean isUPtoStoctValue () 
	{
		Object oo = get_Value(COLUMNNAME_UPtoStoctValue);
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
}