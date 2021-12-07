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

/** Generated Model for C_ImportNGA
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ImportNGA extends PO implements I_C_ImportNGA, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190328L;

    /** Standard Constructor */
    public X_C_ImportNGA (Properties ctx, int C_ImportNGA_ID, String trxName)
    {
      super (ctx, C_ImportNGA_ID, trxName);
      /** if (C_ImportNGA_ID == 0)
        {
			setC_ImportNGA_ID (0);
			setLicenseNumber_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ImportNGA (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ImportNGA[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Business Reg No.
		@param BusRegNo Business Reg No	  */
	public void setBusRegNo (String BusRegNo)
	{
		set_Value (COLUMNNAME_BusRegNo, BusRegNo);
	}

	/** Get Business Reg No.
		@return Business Reg No	  */
	public String getBusRegNo () 
	{
		return (String)get_Value(COLUMNNAME_BusRegNo);
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

	public org.compiere.model.I_C_Country getC_Country() throws RuntimeException
    {
		return (org.compiere.model.I_C_Country)MTable.get(getCtx(), org.compiere.model.I_C_Country.Table_Name)
			.getPO(getC_Country_ID(), get_TrxName());	}

	/** Set Country.
		@param C_Country_ID 
		Country 
	  */
	public void setC_Country_ID (int C_Country_ID)
	{
		if (C_Country_ID < 1) 
			set_Value (COLUMNNAME_C_Country_ID, null);
		else 
			set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
	}

	/** Get Country.
		@return Country 
	  */
	public int getC_Country_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
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

	public org.topra.model.I_C_ExportItemType getC_ExportItemType() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportItemType)MTable.get(getCtx(), org.topra.model.I_C_ExportItemType.Table_Name)
			.getPO(getC_ExportItemType_ID(), get_TrxName());	}

	/** Set Export Item Types ID.
		@param C_ExportItemType_ID Export Item Types ID	  */
	public void setC_ExportItemType_ID (int C_ExportItemType_ID)
	{
		if (C_ExportItemType_ID < 1) 
			set_Value (COLUMNNAME_C_ExportItemType_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportItemType_ID, Integer.valueOf(C_ExportItemType_ID));
	}

	/** Get Export Item Types ID.
		@return Export Item Types ID	  */
	public int getC_ExportItemType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportItemType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Import NGJA ID.
		@param C_ImportNGA_ID Import NGJA ID	  */
	public void setC_ImportNGA_ID (int C_ImportNGA_ID)
	{
		if (C_ImportNGA_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ImportNGA_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ImportNGA_ID, Integer.valueOf(C_ImportNGA_ID));
	}

	/** Get Import NGJA ID.
		@return Import NGJA ID	  */
	public int getC_ImportNGA_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ImportNGA_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Country Of Provenace.
		@param CountryOfProvenace_ID Country Of Provenace	  */
	public void setCountryOfProvenace_ID (int CountryOfProvenace_ID)
	{
		if (CountryOfProvenace_ID < 1) 
			set_Value (COLUMNNAME_CountryOfProvenace_ID, null);
		else 
			set_Value (COLUMNNAME_CountryOfProvenace_ID, Integer.valueOf(CountryOfProvenace_ID));
	}

	/** Get Country Of Provenace.
		@return Country Of Provenace	  */
	public int getCountryOfProvenace_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CountryOfProvenace_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Custom Import No.
		@param CustomImportNo Custom Import No	  */
	public void setCustomImportNo (String CustomImportNo)
	{
		set_Value (COLUMNNAME_CustomImportNo, CustomImportNo);
	}

	/** Get Custom Import No.
		@return Custom Import No	  */
	public String getCustomImportNo () 
	{
		return (String)get_Value(COLUMNNAME_CustomImportNo);
	}

	/** Set Date of Expiry.
		@param DateofExpiry 
		Date when business is not conducted
	  */
	public void setDateofExpiry (Timestamp DateofExpiry)
	{
		set_Value (COLUMNNAME_DateofExpiry, DateofExpiry);
	}

	/** Get Date of Expiry.
		@return Date when business is not conducted
	  */
	public Timestamp getDateofExpiry () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateofExpiry);
	}

	/** Set Date of Import.
		@param DateofImport 
		Date when business is not conducted
	  */
	public void setDateofImport (Timestamp DateofImport)
	{
		set_Value (COLUMNNAME_DateofImport, DateofImport);
	}

	/** Get Date of Import.
		@return Date when business is not conducted
	  */
	public Timestamp getDateofImport () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateofImport);
	}

	/** Set Date of Issue.
		@param DateofIssue 
		Date when business is not conducted
	  */
	public void setDateofIssue (Timestamp DateofIssue)
	{
		set_Value (COLUMNNAME_DateofIssue, DateofIssue);
	}

	/** Get Date of Issue.
		@return Date when business is not conducted
	  */
	public Timestamp getDateofIssue () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateofIssue);
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

	/** Set Add 4.
		@param ExporterAddFour Add 4	  */
	public void setExporterAddFour (String ExporterAddFour)
	{
		set_Value (COLUMNNAME_ExporterAddFour, ExporterAddFour);
	}

	/** Get Add 4.
		@return Add 4	  */
	public String getExporterAddFour () 
	{
		return (String)get_Value(COLUMNNAME_ExporterAddFour);
	}

	/** Set Add 1.
		@param ExporterAddOne Add 1	  */
	public void setExporterAddOne (String ExporterAddOne)
	{
		set_Value (COLUMNNAME_ExporterAddOne, ExporterAddOne);
	}

	/** Get Add 1.
		@return Add 1	  */
	public String getExporterAddOne () 
	{
		return (String)get_Value(COLUMNNAME_ExporterAddOne);
	}

	/** Set Add 3.
		@param ExporterAddThree Add 3	  */
	public void setExporterAddThree (String ExporterAddThree)
	{
		set_Value (COLUMNNAME_ExporterAddThree, ExporterAddThree);
	}

	/** Get Add 3.
		@return Add 3	  */
	public String getExporterAddThree () 
	{
		return (String)get_Value(COLUMNNAME_ExporterAddThree);
	}

	/** Set Add 2.
		@param ExporterAddTwo Add 2	  */
	public void setExporterAddTwo (String ExporterAddTwo)
	{
		set_Value (COLUMNNAME_ExporterAddTwo, ExporterAddTwo);
	}

	/** Get Add 2.
		@return Add 2	  */
	public String getExporterAddTwo () 
	{
		return (String)get_Value(COLUMNNAME_ExporterAddTwo);
	}

	/** Set Exporter City.
		@param ExporterCity Exporter City	  */
	public void setExporterCity (String ExporterCity)
	{
		set_Value (COLUMNNAME_ExporterCity, ExporterCity);
	}

	/** Get Exporter City.
		@return Exporter City	  */
	public String getExporterCity () 
	{
		return (String)get_Value(COLUMNNAME_ExporterCity);
	}

	/** Set Exporter Country.
		@param ExporterCountry_ID Exporter Country	  */
	public void setExporterCountry_ID (int ExporterCountry_ID)
	{
		if (ExporterCountry_ID < 1) 
			set_Value (COLUMNNAME_ExporterCountry_ID, null);
		else 
			set_Value (COLUMNNAME_ExporterCountry_ID, Integer.valueOf(ExporterCountry_ID));
	}

	/** Get Exporter Country.
		@return Exporter Country	  */
	public int getExporterCountry_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ExporterCountry_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Exporter Name.
		@param ExporterName Exporter Name	  */
	public void setExporterName (String ExporterName)
	{
		set_Value (COLUMNNAME_ExporterName, ExporterName);
	}

	/** Get Exporter Name.
		@return Exporter Name	  */
	public String getExporterName () 
	{
		return (String)get_Value(COLUMNNAME_ExporterName);
	}

	/** Set Dealer File Number.
		@param FileNumber Dealer File Number	  */
	public void setFileNumber (String FileNumber)
	{
		set_Value (COLUMNNAME_FileNumber, FileNumber);
	}

	/** Get Dealer File Number.
		@return Dealer File Number	  */
	public String getFileNumber () 
	{
		return (String)get_Value(COLUMNNAME_FileNumber);
	}

	/** Set Forwarding Agent.
		@param ForwardingAgent Forwarding Agent	  */
	public void setForwardingAgent (String ForwardingAgent)
	{
		set_Value (COLUMNNAME_ForwardingAgent, ForwardingAgent);
	}

	/** Get Forwarding Agent.
		@return Forwarding Agent	  */
	public String getForwardingAgent () 
	{
		return (String)get_Value(COLUMNNAME_ForwardingAgent);
	}

	/** Set HS Code.
		@param HSCode HS Code	  */
	public void setHSCode (String HSCode)
	{
		set_Value (COLUMNNAME_HSCode, HSCode);
	}

	/** Get HS Code.
		@return HS Code	  */
	public String getHSCode () 
	{
		return (String)get_Value(COLUMNNAME_HSCode);
	}

	/** Set Import Certificate Number.
		@param ImportCertiNumber Import Certificate Number	  */
	public void setImportCertiNumber (String ImportCertiNumber)
	{
		set_Value (COLUMNNAME_ImportCertiNumber, ImportCertiNumber);
	}

	/** Get Import Certificate Number.
		@return Import Certificate Number	  */
	public String getImportCertiNumber () 
	{
		return (String)get_Value(COLUMNNAME_ImportCertiNumber);
	}

	/** ImportDocStatus AD_Reference_ID=1000137 */
	public static final int IMPORTDOCSTATUS_AD_Reference_ID=1000137;
	/** Send For AD-Officer Approval = AD */
	public static final String IMPORTDOCSTATUS_SendForAD_OfficerApproval = "AD";
	/** Canceled = CN */
	public static final String IMPORTDOCSTATUS_Canceled = "CN";
	/** Prepared = PR */
	public static final String IMPORTDOCSTATUS_Prepared = "PR";
	/** Send For AD-Officer Final Approval = ADF */
	public static final String IMPORTDOCSTATUS_SendForAD_OfficerFinalApproval = "ADF";
	/** Send For MA Confirmation = MAC */
	public static final String IMPORTDOCSTATUS_SendForMAConfirmation = "MAC";
	/** Send For Implementation Officer Approval = SIOA */
	public static final String IMPORTDOCSTATUS_SendForImplementationOfficerApproval = "SIOA";
	/** Voided = VO */
	public static final String IMPORTDOCSTATUS_Voided = "VO";
	/** Imporetd = IM */
	public static final String IMPORTDOCSTATUS_Imporetd = "IM";
	/** MA Approval = MA */
	public static final String IMPORTDOCSTATUS_MAApproval = "MA";
	/** Set Import Document Status.
		@param ImportDocStatus Import Document Status	  */
	public void setImportDocStatus (String ImportDocStatus)
	{

		set_Value (COLUMNNAME_ImportDocStatus, ImportDocStatus);
	}

	/** Get Import Document Status.
		@return Import Document Status	  */
	public String getImportDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_ImportDocStatus);
	}

	/** Set Import Value.
		@param ImportValue Import Value	  */
	public void setImportValue (BigDecimal ImportValue)
	{
		set_Value (COLUMNNAME_ImportValue, ImportValue);
	}

	/** Get Import Value.
		@return Import Value	  */
	public BigDecimal getImportValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ImportValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** ImportVarieties AD_Reference_ID=1000153 */
	public static final int IMPORTVARIETIES_AD_Reference_ID=1000153;
	/** Rough Gemstones = R */
	public static final String IMPORTVARIETIES_RoughGemstones = "R";
	/** Cut & Polished Gemstones = C */
	public static final String IMPORTVARIETIES_CutPolishedGemstones = "C";
	/** Import Raw Material Export After Processing  = I */
	public static final String IMPORTVARIETIES_ImportRawMaterialExportAfterProcessing = "I";
	/** Set ImportVarieties.
		@param ImportVarieties ImportVarieties	  */
	public void setImportVarieties (String ImportVarieties)
	{

		set_Value (COLUMNNAME_ImportVarieties, ImportVarieties);
	}

	/** Get ImportVarieties.
		@return ImportVarieties	  */
	public String getImportVarieties () 
	{
		return (String)get_Value(COLUMNNAME_ImportVarieties);
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

	public org.compiere.model.I_C_DocType getLicenseType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getLicenseType_ID(), get_TrxName());	}

	/** Set License Type.
		@param LicenseType_ID License Type	  */
	public void setLicenseType_ID (int LicenseType_ID)
	{
		if (LicenseType_ID < 1) 
			set_Value (COLUMNNAME_LicenseType_ID, null);
		else 
			set_Value (COLUMNNAME_LicenseType_ID, Integer.valueOf(LicenseType_ID));
	}

	/** Get License Type.
		@return License Type	  */
	public int getLicenseType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LicenseType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Logo.
		@param Logo_ID Logo	  */
	public void setLogo_ID (int Logo_ID)
	{
		if (Logo_ID < 1) 
			set_Value (COLUMNNAME_Logo_ID, null);
		else 
			set_Value (COLUMNNAME_Logo_ID, Integer.valueOf(Logo_ID));
	}

	/** Get Logo.
		@return Logo	  */
	public int getLogo_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Logo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NIC/Passport Number.
		@param NICPassNo NIC/Passport Number	  */
	public void setNICPassNo (String NICPassNo)
	{
		set_Value (COLUMNNAME_NICPassNo, NICPassNo);
	}

	/** Get NIC/Passport Number.
		@return NIC/Passport Number	  */
	public String getNICPassNo () 
	{
		return (String)get_Value(COLUMNNAME_NICPassNo);
	}

	/** Set No Of Pkgs.
		@param NoOfPkgs No Of Pkgs	  */
	public void setNoOfPkgs (int NoOfPkgs)
	{
		set_Value (COLUMNNAME_NoOfPkgs, Integer.valueOf(NoOfPkgs));
	}

	/** Get No Of Pkgs.
		@return No Of Pkgs	  */
	public int getNoOfPkgs () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfPkgs);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Process.
		@param ProcessDocument Process	  */
	public void setProcessDocument (String ProcessDocument)
	{
		set_Value (COLUMNNAME_ProcessDocument, ProcessDocument);
	}

	/** Get Process.
		@return Process	  */
	public String getProcessDocument () 
	{
		return (String)get_Value(COLUMNNAME_ProcessDocument);
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

	public org.compiere.model.I_C_BPartner getValuarN() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getValuarName(), get_TrxName());	}

	/** Set Valuar Name.
		@param ValuarName Valuar Name	  */
	public void setValuarName (int ValuarName)
	{
		set_Value (COLUMNNAME_ValuarName, Integer.valueOf(ValuarName));
	}

	/** Get Valuar Name.
		@return Valuar Name	  */
	public int getValuarName () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ValuarName);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Load Informations.
		@param ZoomBtn Load Informations	  */
	public void setZoomBtn (String ZoomBtn)
	{
		set_Value (COLUMNNAME_ZoomBtn, ZoomBtn);
	}

	/** Get Load Informations.
		@return Load Informations	  */
	public String getZoomBtn () 
	{
		return (String)get_Value(COLUMNNAME_ZoomBtn);
	}
}