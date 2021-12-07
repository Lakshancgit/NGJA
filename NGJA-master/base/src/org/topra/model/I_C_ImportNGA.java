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
package org.topra.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_ImportNGA
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ImportNGA 
{

    /** TableName=C_ImportNGA */
    public static final String Table_Name = "C_ImportNGA";

    /** AD_Table_ID=1000076 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name BusRegNo */
    public static final String COLUMNNAME_BusRegNo = "BusRegNo";

	/** Set Business Reg No	  */
	public void setBusRegNo (String BusRegNo);

	/** Get Business Reg No	  */
	public String getBusRegNo();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Country_ID */
    public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";

	/** Set Country.
	  * Country 
	  */
	public void setC_Country_ID (int C_Country_ID);

	/** Get Country.
	  * Country 
	  */
	public int getC_Country_ID();

	public org.compiere.model.I_C_Country getC_Country() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name C_ExportItemType_ID */
    public static final String COLUMNNAME_C_ExportItemType_ID = "C_ExportItemType_ID";

	/** Set Export Item Types ID	  */
	public void setC_ExportItemType_ID (int C_ExportItemType_ID);

	/** Get Export Item Types ID	  */
	public int getC_ExportItemType_ID();

	public org.topra.model.I_C_ExportItemType getC_ExportItemType() throws RuntimeException;

    /** Column name C_ImportNGA_ID */
    public static final String COLUMNNAME_C_ImportNGA_ID = "C_ImportNGA_ID";

	/** Set Import NGJA ID	  */
	public void setC_ImportNGA_ID (int C_ImportNGA_ID);

	/** Get Import NGJA ID	  */
	public int getC_ImportNGA_ID();

    /** Column name CountryOfProvenace_ID */
    public static final String COLUMNNAME_CountryOfProvenace_ID = "CountryOfProvenace_ID";

	/** Set Country Of Provenace	  */
	public void setCountryOfProvenace_ID (int CountryOfProvenace_ID);

	/** Get Country Of Provenace	  */
	public int getCountryOfProvenace_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name CustomImportNo */
    public static final String COLUMNNAME_CustomImportNo = "CustomImportNo";

	/** Set Custom Import No	  */
	public void setCustomImportNo (String CustomImportNo);

	/** Get Custom Import No	  */
	public String getCustomImportNo();

    /** Column name DateofExpiry */
    public static final String COLUMNNAME_DateofExpiry = "DateofExpiry";

	/** Set Date of Expiry.
	  * Date when business is not conducted
	  */
	public void setDateofExpiry (Timestamp DateofExpiry);

	/** Get Date of Expiry.
	  * Date when business is not conducted
	  */
	public Timestamp getDateofExpiry();

    /** Column name DateofImport */
    public static final String COLUMNNAME_DateofImport = "DateofImport";

	/** Set Date of Import.
	  * Date when business is not conducted
	  */
	public void setDateofImport (Timestamp DateofImport);

	/** Get Date of Import.
	  * Date when business is not conducted
	  */
	public Timestamp getDateofImport();

    /** Column name DateofIssue */
    public static final String COLUMNNAME_DateofIssue = "DateofIssue";

	/** Set Date of Issue.
	  * Date when business is not conducted
	  */
	public void setDateofIssue (Timestamp DateofIssue);

	/** Get Date of Issue.
	  * Date when business is not conducted
	  */
	public Timestamp getDateofIssue();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name ExporterAddFour */
    public static final String COLUMNNAME_ExporterAddFour = "ExporterAddFour";

	/** Set Add 4	  */
	public void setExporterAddFour (String ExporterAddFour);

	/** Get Add 4	  */
	public String getExporterAddFour();

    /** Column name ExporterAddOne */
    public static final String COLUMNNAME_ExporterAddOne = "ExporterAddOne";

	/** Set Add 1	  */
	public void setExporterAddOne (String ExporterAddOne);

	/** Get Add 1	  */
	public String getExporterAddOne();

    /** Column name ExporterAddThree */
    public static final String COLUMNNAME_ExporterAddThree = "ExporterAddThree";

	/** Set Add 3	  */
	public void setExporterAddThree (String ExporterAddThree);

	/** Get Add 3	  */
	public String getExporterAddThree();

    /** Column name ExporterAddTwo */
    public static final String COLUMNNAME_ExporterAddTwo = "ExporterAddTwo";

	/** Set Add 2	  */
	public void setExporterAddTwo (String ExporterAddTwo);

	/** Get Add 2	  */
	public String getExporterAddTwo();

    /** Column name ExporterCity */
    public static final String COLUMNNAME_ExporterCity = "ExporterCity";

	/** Set Exporter City	  */
	public void setExporterCity (String ExporterCity);

	/** Get Exporter City	  */
	public String getExporterCity();

    /** Column name ExporterCountry_ID */
    public static final String COLUMNNAME_ExporterCountry_ID = "ExporterCountry_ID";

	/** Set Exporter Country	  */
	public void setExporterCountry_ID (int ExporterCountry_ID);

	/** Get Exporter Country	  */
	public int getExporterCountry_ID();

    /** Column name ExporterName */
    public static final String COLUMNNAME_ExporterName = "ExporterName";

	/** Set Exporter Name	  */
	public void setExporterName (String ExporterName);

	/** Get Exporter Name	  */
	public String getExporterName();

    /** Column name FileNumber */
    public static final String COLUMNNAME_FileNumber = "FileNumber";

	/** Set Dealer File Number	  */
	public void setFileNumber (String FileNumber);

	/** Get Dealer File Number	  */
	public String getFileNumber();

    /** Column name ForwardingAgent */
    public static final String COLUMNNAME_ForwardingAgent = "ForwardingAgent";

	/** Set Forwarding Agent	  */
	public void setForwardingAgent (String ForwardingAgent);

	/** Get Forwarding Agent	  */
	public String getForwardingAgent();

    /** Column name HSCode */
    public static final String COLUMNNAME_HSCode = "HSCode";

	/** Set HS Code	  */
	public void setHSCode (String HSCode);

	/** Get HS Code	  */
	public String getHSCode();

    /** Column name ImportCertiNumber */
    public static final String COLUMNNAME_ImportCertiNumber = "ImportCertiNumber";

	/** Set Import Certificate Number	  */
	public void setImportCertiNumber (String ImportCertiNumber);

	/** Get Import Certificate Number	  */
	public String getImportCertiNumber();

    /** Column name ImportDocStatus */
    public static final String COLUMNNAME_ImportDocStatus = "ImportDocStatus";

	/** Set Import Document Status	  */
	public void setImportDocStatus (String ImportDocStatus);

	/** Get Import Document Status	  */
	public String getImportDocStatus();

    /** Column name ImportValue */
    public static final String COLUMNNAME_ImportValue = "ImportValue";

	/** Set Import Value	  */
	public void setImportValue (BigDecimal ImportValue);

	/** Get Import Value	  */
	public BigDecimal getImportValue();

    /** Column name ImportVarieties */
    public static final String COLUMNNAME_ImportVarieties = "ImportVarieties";

	/** Set ImportVarieties	  */
	public void setImportVarieties (String ImportVarieties);

	/** Get ImportVarieties	  */
	public String getImportVarieties();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LicenseEndDate */
    public static final String COLUMNNAME_LicenseEndDate = "LicenseEndDate";

	/** Set License End Date	  */
	public void setLicenseEndDate (Timestamp LicenseEndDate);

	/** Get License End Date	  */
	public Timestamp getLicenseEndDate();

    /** Column name LicenseNumber_ID */
    public static final String COLUMNNAME_LicenseNumber_ID = "LicenseNumber_ID";

	/** Set License Number	  */
	public void setLicenseNumber_ID (int LicenseNumber_ID);

	/** Get License Number	  */
	public int getLicenseNumber_ID();

	public org.topra.model.I_D_DealerLicense getLicenseNumber() throws RuntimeException;

    /** Column name LicenseType_ID */
    public static final String COLUMNNAME_LicenseType_ID = "LicenseType_ID";

	/** Set License Type	  */
	public void setLicenseType_ID (int LicenseType_ID);

	/** Get License Type	  */
	public int getLicenseType_ID();

	public org.compiere.model.I_C_DocType getLicenseType() throws RuntimeException;

    /** Column name Logo_ID */
    public static final String COLUMNNAME_Logo_ID = "Logo_ID";

	/** Set Logo	  */
	public void setLogo_ID (int Logo_ID);

	/** Get Logo	  */
	public int getLogo_ID();

    /** Column name NICPassNo */
    public static final String COLUMNNAME_NICPassNo = "NICPassNo";

	/** Set NIC/Passport Number	  */
	public void setNICPassNo (String NICPassNo);

	/** Get NIC/Passport Number	  */
	public String getNICPassNo();

    /** Column name NoOfPkgs */
    public static final String COLUMNNAME_NoOfPkgs = "NoOfPkgs";

	/** Set No Of Pkgs	  */
	public void setNoOfPkgs (int NoOfPkgs);

	/** Get No Of Pkgs	  */
	public int getNoOfPkgs();

    /** Column name ProcessDocument */
    public static final String COLUMNNAME_ProcessDocument = "ProcessDocument";

	/** Set Process	  */
	public void setProcessDocument (String ProcessDocument);

	/** Get Process	  */
	public String getProcessDocument();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name TotalWeightType */
    public static final String COLUMNNAME_TotalWeightType = "TotalWeightType";

	/** Set Total Weight Type	  */
	public void setTotalWeightType (String TotalWeightType);

	/** Get Total Weight Type	  */
	public String getTotalWeightType();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name ValuarName */
    public static final String COLUMNNAME_ValuarName = "ValuarName";

	/** Set Valuar Name	  */
	public void setValuarName (int ValuarName);

	/** Get Valuar Name	  */
	public int getValuarName();

	public org.compiere.model.I_C_BPartner getValuarN() throws RuntimeException;

    /** Column name Weight */
    public static final String COLUMNNAME_Weight = "Weight";

	/** Set Weight.
	  * Weight of a product
	  */
	public void setWeight (BigDecimal Weight);

	/** Get Weight.
	  * Weight of a product
	  */
	public BigDecimal getWeight();

    /** Column name ZoomBtn */
    public static final String COLUMNNAME_ZoomBtn = "ZoomBtn";

	/** Set Load Informations	  */
	public void setZoomBtn (String ZoomBtn);

	/** Get Load Informations	  */
	public String getZoomBtn();
}
