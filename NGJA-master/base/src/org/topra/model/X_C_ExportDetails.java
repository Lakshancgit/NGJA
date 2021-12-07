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

/** Generated Model for C_ExportDetails
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ExportDetails extends PO implements I_C_ExportDetails, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200707L;

    /** Standard Constructor */
    public X_C_ExportDetails (Properties ctx, int C_ExportDetails_ID, String trxName)
    {
      super (ctx, C_ExportDetails_ID, trxName);
      /** if (C_ExportDetails_ID == 0)
        {
			setC_ExportDetails_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ExportDetails (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ExportDetails[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Added Value.
		@param AddedValue Added Value	  */
	public void setAddedValue (BigDecimal AddedValue)
	{
		set_Value (COLUMNNAME_AddedValue, AddedValue);
	}

	/** Get Added Value.
		@return Added Value	  */
	public BigDecimal getAddedValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AddedValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Air Freight In Foreign Currency.
		@param AirFreightInFC Air Freight In Foreign Currency	  */
	public void setAirFreightInFC (BigDecimal AirFreightInFC)
	{
		set_Value (COLUMNNAME_AirFreightInFC, AirFreightInFC);
	}

	/** Get Air Freight In Foreign Currency.
		@return Air Freight In Foreign Currency	  */
	public BigDecimal getAirFreightInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AirFreightInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Air Freight In Rs.
		@param AirFreightInRS Air Freight In Rs	  */
	public void setAirFreightInRS (BigDecimal AirFreightInRS)
	{
		set_Value (COLUMNNAME_AirFreightInRS, AirFreightInRS);
	}

	/** Get Air Freight In Rs.
		@return Air Freight In Rs	  */
	public BigDecimal getAirFreightInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AirFreightInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_Name)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID 
		Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
    {
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
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

	/** Set Export Details ID.
		@param C_ExportDetails_ID Export Details ID	  */
	public void setC_ExportDetails_ID (int C_ExportDetails_ID)
	{
		if (C_ExportDetails_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ExportDetails_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ExportDetails_ID, Integer.valueOf(C_ExportDetails_ID));
	}

	/** Get Export Details ID.
		@return Export Details ID	  */
	public int getC_ExportDetails_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportDetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_ExportItemType getC_ExportItemType() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportItemType)MTable.get(getCtx(), org.topra.model.I_C_ExportItemType.Table_Name)
			.getPO(getC_ExportItemType_ID(), get_TrxName());	}

	/** Set Export Item Types.
		@param C_ExportItemType_ID Export Item Types	  */
	public void setC_ExportItemType_ID (int C_ExportItemType_ID)
	{
		if (C_ExportItemType_ID < 1) 
			set_Value (COLUMNNAME_C_ExportItemType_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportItemType_ID, Integer.valueOf(C_ExportItemType_ID));
	}

	/** Get Export Item Types.
		@return Export Item Types	  */
	public int getC_ExportItemType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportItemType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_ExportServiceType getC_ExportServiceType() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportServiceType)MTable.get(getCtx(), org.topra.model.I_C_ExportServiceType.Table_Name)
			.getPO(getC_ExportServiceType_ID(), get_TrxName());	}

	/** Set Export Service Types ID.
		@param C_ExportServiceType_ID Export Service Types ID	  */
	public void setC_ExportServiceType_ID (int C_ExportServiceType_ID)
	{
		if (C_ExportServiceType_ID < 1) 
			set_Value (COLUMNNAME_C_ExportServiceType_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportServiceType_ID, Integer.valueOf(C_ExportServiceType_ID));
	}

	/** Get Export Service Types ID.
		@return Export Service Types ID	  */
	public int getC_ExportServiceType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportServiceType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_ExpServiceTypeLine getC_ExpServiceTypeLine() throws RuntimeException
    {
		return (org.topra.model.I_C_ExpServiceTypeLine)MTable.get(getCtx(), org.topra.model.I_C_ExpServiceTypeLine.Table_Name)
			.getPO(getC_ExpServiceTypeLine_ID(), get_TrxName());	}

	/** Set Export Service Type Line ID.
		@param C_ExpServiceTypeLine_ID Export Service Type Line ID	  */
	public void setC_ExpServiceTypeLine_ID (int C_ExpServiceTypeLine_ID)
	{
		if (C_ExpServiceTypeLine_ID < 1) 
			set_Value (COLUMNNAME_C_ExpServiceTypeLine_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExpServiceTypeLine_ID, Integer.valueOf(C_ExpServiceTypeLine_ID));
	}

	/** Get Export Service Type Line ID.
		@return Export Service Type Line ID	  */
	public int getC_ExpServiceTypeLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExpServiceTypeLine_ID);
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

	/** Set CIF Value In Foreign Currency.
		@param CIFValueInFC CIF Value In Foreign Currency	  */
	public void setCIFValueInFC (BigDecimal CIFValueInFC)
	{
		set_Value (COLUMNNAME_CIFValueInFC, CIFValueInFC);
	}

	/** Get CIF Value In Foreign Currency.
		@return CIF Value In Foreign Currency	  */
	public BigDecimal getCIFValueInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CIFValueInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CIF Value In Rs.
		@param CIFValueInRS CIF Value In Rs	  */
	public void setCIFValueInRS (BigDecimal CIFValueInRS)
	{
		set_Value (COLUMNNAME_CIFValueInRS, CIFValueInRS);
	}

	/** Get CIF Value In Rs.
		@return CIF Value In Rs	  */
	public BigDecimal getCIFValueInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CIFValueInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ISO Country Code.
		@param CountryCode 
		Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	  */
	public void setCountryCode (String CountryCode)
	{
		set_Value (COLUMNNAME_CountryCode, CountryCode);
	}

	/** Get ISO Country Code.
		@return Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	  */
	public String getCountryCode () 
	{
		return (String)get_Value(COLUMNNAME_CountryCode);
	}

	/** Set Country.
		@param CountryName 
		Country Name
	  */
	public void setCountryName (String CountryName)
	{
		set_Value (COLUMNNAME_CountryName, CountryName);
	}

	/** Get Country.
		@return Country Name
	  */
	public String getCountryName () 
	{
		return (String)get_Value(COLUMNNAME_CountryName);
	}

	/** Set Custom T No.
		@param CustomTNO Custom T No	  */
	public void setCustomTNO (String CustomTNO)
	{
		set_Value (COLUMNNAME_CustomTNO, CustomTNO);
	}

	/** Get Custom T No.
		@return Custom T No	  */
	public String getCustomTNO () 
	{
		return (String)get_Value(COLUMNNAME_CustomTNO);
	}

	/** Set Date.
		@param Date1 
		Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
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

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Reverse - Correct = RC */
	public static final String DOCACTION_Reverse_Correct = "RC";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** <None> = -- */
	public static final String DOCACTION_None = "--";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** Set Document Action.
		@param DocAction 
		The targeted status of the document
	  */
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction () 
	{
		return (String)get_Value(COLUMNNAME_DocAction);
	}

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
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

	public org.compiere.model.I_C_BPartner_Location get() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_Name)
			.getPO(getFax(), get_TrxName());	}

	/** Set Fax.
		@param Fax 
		Facsimile number
	  */
	public void setFax (int Fax)
	{
		set_Value (COLUMNNAME_Fax, Integer.valueOf(Fax));
	}

	/** Get Fax.
		@return Facsimile number
	  */
	public int getFax () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Fax);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set FOB Value In Rs.
		@param FOBInRS FOB Value In Rs	  */
	public void setFOBInRS (BigDecimal FOBInRS)
	{
		set_Value (COLUMNNAME_FOBInRS, FOBInRS);
	}

	/** Get FOB Value In Rs.
		@return FOB Value In Rs	  */
	public BigDecimal getFOBInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FOBInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FOB Value in Foreign Currency.
		@param FOBValueFC FOB Value in Foreign Currency	  */
	public void setFOBValueFC (BigDecimal FOBValueFC)
	{
		set_Value (COLUMNNAME_FOBValueFC, FOBValueFC);
	}

	/** Get FOB Value in Foreign Currency.
		@return FOB Value in Foreign Currency	  */
	public BigDecimal getFOBValueFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FOBValueFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Foreign Currency .
		@param ForeignCurrency Foreign Currency 	  */
	public void setForeignCurrency (boolean ForeignCurrency)
	{
		set_Value (COLUMNNAME_ForeignCurrency, Boolean.valueOf(ForeignCurrency));
	}

	/** Get Foreign Currency .
		@return Foreign Currency 	  */
	public boolean isForeignCurrency () 
	{
		Object oo = get_Value(COLUMNNAME_ForeignCurrency);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Generate To.
		@param GenerateTo 
		Generate To
	  */
	public void setGenerateTo (String GenerateTo)
	{
		set_Value (COLUMNNAME_GenerateTo, GenerateTo);
	}

	/** Get Generate To.
		@return Generate To
	  */
	public String getGenerateTo () 
	{
		return (String)get_Value(COLUMNNAME_GenerateTo);
	}

	/** Set Insuarance In Foreign Currency.
		@param InsuaranceInFC Insuarance In Foreign Currency	  */
	public void setInsuaranceInFC (BigDecimal InsuaranceInFC)
	{
		set_Value (COLUMNNAME_InsuaranceInFC, InsuaranceInFC);
	}

	/** Get Insuarance In Foreign Currency.
		@return Insuarance In Foreign Currency	  */
	public BigDecimal getInsuaranceInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InsuaranceInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Insuarance In Rs.
		@param InsuaranceInRS Insuarance In Rs	  */
	public void setInsuaranceInRS (BigDecimal InsuaranceInRS)
	{
		set_Value (COLUMNNAME_InsuaranceInRS, InsuaranceInRS);
	}

	/** Get Insuarance In Rs.
		@return Insuarance In Rs	  */
	public BigDecimal getInsuaranceInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InsuaranceInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.topra.model.I_D_DealerLicense getLicenseNumber() throws RuntimeException
    {
		return (org.topra.model.I_D_DealerLicense)MTable.get(getCtx(), org.topra.model.I_D_DealerLicense.Table_Name)
			.getPO(getLicenseNumber_ID(), get_TrxName());	}

	/** Set License Number.
		@param LicenseNumber_ID License Number	  */
	public void setLicenseNumber_ID (int LicenseNumber_ID)
	{
		if (LicenseNumber_ID < 1) 
			set_Value (COLUMNNAME_LicenseNumber_ID, null);
		else 
			set_Value (COLUMNNAME_LicenseNumber_ID, Integer.valueOf(LicenseNumber_ID));
	}

	/** Get License Number.
		@return License Number	  */
	public int getLicenseNumber_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LicenseNumber_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Local Currency.
		@param LocalCurrency Local Currency	  */
	public void setLocalCurrency (boolean LocalCurrency)
	{
		set_Value (COLUMNNAME_LocalCurrency, Boolean.valueOf(LocalCurrency));
	}

	/** Get Local Currency.
		@return Local Currency	  */
	public boolean isLocalCurrency () 
	{
		Object oo = get_Value(COLUMNNAME_LocalCurrency);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Old License Number.
		@param OldLicenseNumber Old License Number	  */
	public void setOldLicenseNumber (String OldLicenseNumber)
	{
		set_Value (COLUMNNAME_OldLicenseNumber, OldLicenseNumber);
	}

	/** Get Old License Number.
		@return Old License Number	  */
	public String getOldLicenseNumber () 
	{
		return (String)get_Value(COLUMNNAME_OldLicenseNumber);
	}

	/** Set Payment Document No.
		@param PaymentDocumentNo 
		Document number of the Payment
	  */
	public void setPaymentDocumentNo (String PaymentDocumentNo)
	{
		set_Value (COLUMNNAME_PaymentDocumentNo, PaymentDocumentNo);
	}

	/** Get Payment Document No.
		@return Document number of the Payment
	  */
	public String getPaymentDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_PaymentDocumentNo);
	}

	public org.compiere.model.I_C_BPartner_Location getPh() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_Name)
			.getPO(getPhone(), get_TrxName());	}

	/** Set Phone.
		@param Phone 
		Identifies a telephone number
	  */
	public void setPhone (int Phone)
	{
		set_Value (COLUMNNAME_Phone, Integer.valueOf(Phone));
	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public int getPhone () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Phone);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Postage In Foreign Currency.
		@param PostageInFC Postage In Foreign Currency	  */
	public void setPostageInFC (BigDecimal PostageInFC)
	{
		set_Value (COLUMNNAME_PostageInFC, PostageInFC);
	}

	/** Get Postage In Foreign Currency.
		@return Postage In Foreign Currency	  */
	public BigDecimal getPostageInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PostageInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Postage In Rs.
		@param PostageInRS Postage In Rs	  */
	public void setPostageInRS (BigDecimal PostageInRS)
	{
		set_Value (COLUMNNAME_PostageInRS, PostageInRS);
	}

	/** Get Postage In Rs.
		@return Postage In Rs	  */
	public BigDecimal getPostageInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PostageInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Rate Of Foreign Currency.
		@param RateFC Rate Of Foreign Currency	  */
	public void setRateFC (BigDecimal RateFC)
	{
		set_Value (COLUMNNAME_RateFC, RateFC);
	}

	/** Get Rate Of Foreign Currency.
		@return Rate Of Foreign Currency	  */
	public BigDecimal getRateFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RateFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Reference No.
		@param ReferenceNo 
		Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo)
	{
		set_Value (COLUMNNAME_ReferenceNo, ReferenceNo);
	}

	/** Get Reference No.
		@return Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo () 
	{
		return (String)get_Value(COLUMNNAME_ReferenceNo);
	}

	/** Set Total Amount In Rupees.
		@param TotalAmt 
		Total Amount
	  */
	public void setTotalAmt (BigDecimal TotalAmt)
	{
		set_Value (COLUMNNAME_TotalAmt, TotalAmt);
	}

	/** Get Total Amount In Rupees.
		@return Total Amount
	  */
	public BigDecimal getTotalAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total Amount In Foreign Currency.
		@param TotalAmtInFC Total Amount In Foreign Currency	  */
	public void setTotalAmtInFC (BigDecimal TotalAmtInFC)
	{
		set_Value (COLUMNNAME_TotalAmtInFC, TotalAmtInFC);
	}

	/** Get Total Amount In Foreign Currency.
		@return Total Amount In Foreign Currency	  */
	public BigDecimal getTotalAmtInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmtInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** TotalWeightType AD_Reference_ID=1000089 */
	public static final int TOTALWEIGHTTYPE_AD_Reference_ID=1000089;
	/** cts = C */
	public static final String TOTALWEIGHTTYPE_Cts = "C";
	/** Gram = G */
	public static final String TOTALWEIGHTTYPE_Gram = "G";
	/** Kilogram = KG */
	public static final String TOTALWEIGHTTYPE_Kilogram = "KG";
	/** Millimeter = MM */
	public static final String TOTALWEIGHTTYPE_Millimeter = "MM";
	/** Set Total Weight Type.
		@param TotalWeightType Total Weight Type	  */
	public void setTotalWeightType (String TotalWeightType)
	{

		set_Value (COLUMNNAME_TotalWeightType, TotalWeightType);
	}

	/** Get Total Weight Type.
		@return Total Weight Type	  */
	public String getTotalWeightType () 
	{
		return (String)get_Value(COLUMNNAME_TotalWeightType);
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

	/** Set ViewInfoBtn.
		@param ViewInfoBtn ViewInfoBtn	  */
	public void setViewInfoBtn (String ViewInfoBtn)
	{
		set_Value (COLUMNNAME_ViewInfoBtn, ViewInfoBtn);
	}

	/** Get ViewInfoBtn.
		@return ViewInfoBtn	  */
	public String getViewInfoBtn () 
	{
		return (String)get_Value(COLUMNNAME_ViewInfoBtn);
	}

	/** Set Weight.
		@param Weight 
		Weight of a product
	  */
	public void setWeight (BigDecimal Weight)
	{
		set_Value (COLUMNNAME_Weight, Weight);
	}

	/** Get Weight.
		@return Weight of a product
	  */
	public BigDecimal getWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}