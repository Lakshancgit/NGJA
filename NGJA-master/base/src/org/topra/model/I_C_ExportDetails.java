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

/** Generated Interface for C_ExportDetails
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ExportDetails 
{

    /** TableName=C_ExportDetails */
    public static final String Table_Name = "C_ExportDetails";

    /** AD_Table_ID=1000112 */
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

    /** Column name AddedValue */
    public static final String COLUMNNAME_AddedValue = "AddedValue";

	/** Set Added Value	  */
	public void setAddedValue (BigDecimal AddedValue);

	/** Get Added Value	  */
	public BigDecimal getAddedValue();

    /** Column name AirFreightInFC */
    public static final String COLUMNNAME_AirFreightInFC = "AirFreightInFC";

	/** Set Air Freight In Foreign Currency	  */
	public void setAirFreightInFC (BigDecimal AirFreightInFC);

	/** Get Air Freight In Foreign Currency	  */
	public BigDecimal getAirFreightInFC();

    /** Column name AirFreightInRS */
    public static final String COLUMNNAME_AirFreightInRS = "AirFreightInRS";

	/** Set Air Freight In Rs	  */
	public void setAirFreightInRS (BigDecimal AirFreightInRS);

	/** Get Air Freight In Rs	  */
	public BigDecimal getAirFreightInRS();

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

    /** Column name C_BPartner_Location_ID */
    public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

	/** Set Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID);

	/** Get Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID();

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

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

    /** Column name C_ExportDetails_ID */
    public static final String COLUMNNAME_C_ExportDetails_ID = "C_ExportDetails_ID";

	/** Set Export Details ID	  */
	public void setC_ExportDetails_ID (int C_ExportDetails_ID);

	/** Get Export Details ID	  */
	public int getC_ExportDetails_ID();

    /** Column name C_ExportItemType_ID */
    public static final String COLUMNNAME_C_ExportItemType_ID = "C_ExportItemType_ID";

	/** Set Export Item Types	  */
	public void setC_ExportItemType_ID (int C_ExportItemType_ID);

	/** Get Export Item Types	  */
	public int getC_ExportItemType_ID();

	public org.topra.model.I_C_ExportItemType getC_ExportItemType() throws RuntimeException;

    /** Column name C_ExportServiceType_ID */
    public static final String COLUMNNAME_C_ExportServiceType_ID = "C_ExportServiceType_ID";

	/** Set Export Service Types ID	  */
	public void setC_ExportServiceType_ID (int C_ExportServiceType_ID);

	/** Get Export Service Types ID	  */
	public int getC_ExportServiceType_ID();

	public org.topra.model.I_C_ExportServiceType getC_ExportServiceType() throws RuntimeException;

    /** Column name C_ExpServiceTypeLine_ID */
    public static final String COLUMNNAME_C_ExpServiceTypeLine_ID = "C_ExpServiceTypeLine_ID";

	/** Set Export Service Type Line ID	  */
	public void setC_ExpServiceTypeLine_ID (int C_ExpServiceTypeLine_ID);

	/** Get Export Service Type Line ID	  */
	public int getC_ExpServiceTypeLine_ID();

	public org.topra.model.I_C_ExpServiceTypeLine getC_ExpServiceTypeLine() throws RuntimeException;

    /** Column name C_Invoice_ID */
    public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

	/** Set Invoice.
	  * Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID);

	/** Get Invoice.
	  * Invoice Identifier
	  */
	public int getC_Invoice_ID();

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException;

    /** Column name CIFValueInFC */
    public static final String COLUMNNAME_CIFValueInFC = "CIFValueInFC";

	/** Set CIF Value In Foreign Currency	  */
	public void setCIFValueInFC (BigDecimal CIFValueInFC);

	/** Get CIF Value In Foreign Currency	  */
	public BigDecimal getCIFValueInFC();

    /** Column name CIFValueInRS */
    public static final String COLUMNNAME_CIFValueInRS = "CIFValueInRS";

	/** Set CIF Value In Rs	  */
	public void setCIFValueInRS (BigDecimal CIFValueInRS);

	/** Get CIF Value In Rs	  */
	public BigDecimal getCIFValueInRS();

    /** Column name CountryCode */
    public static final String COLUMNNAME_CountryCode = "CountryCode";

	/** Set ISO Country Code.
	  * Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	  */
	public void setCountryCode (String CountryCode);

	/** Get ISO Country Code.
	  * Upper-case two-letter alphanumeric ISO Country code according to ISO 3166-1 - http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	  */
	public String getCountryCode();

    /** Column name CountryName */
    public static final String COLUMNNAME_CountryName = "CountryName";

	/** Set Country.
	  * Country Name
	  */
	public void setCountryName (String CountryName);

	/** Get Country.
	  * Country Name
	  */
	public String getCountryName();

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

    /** Column name CustomTNO */
    public static final String COLUMNNAME_CustomTNO = "CustomTNO";

	/** Set Custom T No	  */
	public void setCustomTNO (String CustomTNO);

	/** Get Custom T No	  */
	public String getCustomTNO();

    /** Column name Date1 */
    public static final String COLUMNNAME_Date1 = "Date1";

	/** Set Date.
	  * Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1);

	/** Get Date.
	  * Date when business is not conducted
	  */
	public Timestamp getDate1();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocAction */
    public static final String COLUMNNAME_DocAction = "DocAction";

	/** Set Document Action.
	  * The targeted status of the document
	  */
	public void setDocAction (String DocAction);

	/** Get Document Action.
	  * The targeted status of the document
	  */
	public String getDocAction();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

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

    /** Column name Fax */
    public static final String COLUMNNAME_Fax = "Fax";

	/** Set Fax.
	  * Facsimile number
	  */
	public void setFax (int Fax);

	/** Get Fax.
	  * Facsimile number
	  */
	public int getFax();

	public org.compiere.model.I_C_BPartner_Location get() throws RuntimeException;

    /** Column name FOBInRS */
    public static final String COLUMNNAME_FOBInRS = "FOBInRS";

	/** Set FOB Value In Rs	  */
	public void setFOBInRS (BigDecimal FOBInRS);

	/** Get FOB Value In Rs	  */
	public BigDecimal getFOBInRS();

    /** Column name FOBValueFC */
    public static final String COLUMNNAME_FOBValueFC = "FOBValueFC";

	/** Set FOB Value in Foreign Currency	  */
	public void setFOBValueFC (BigDecimal FOBValueFC);

	/** Get FOB Value in Foreign Currency	  */
	public BigDecimal getFOBValueFC();

    /** Column name ForeignCurrency */
    public static final String COLUMNNAME_ForeignCurrency = "ForeignCurrency";

	/** Set Foreign Currency 	  */
	public void setForeignCurrency (boolean ForeignCurrency);

	/** Get Foreign Currency 	  */
	public boolean isForeignCurrency();

    /** Column name GenerateTo */
    public static final String COLUMNNAME_GenerateTo = "GenerateTo";

	/** Set Generate To.
	  * Generate To
	  */
	public void setGenerateTo (String GenerateTo);

	/** Get Generate To.
	  * Generate To
	  */
	public String getGenerateTo();

    /** Column name InsuaranceInFC */
    public static final String COLUMNNAME_InsuaranceInFC = "InsuaranceInFC";

	/** Set Insuarance In Foreign Currency	  */
	public void setInsuaranceInFC (BigDecimal InsuaranceInFC);

	/** Get Insuarance In Foreign Currency	  */
	public BigDecimal getInsuaranceInFC();

    /** Column name InsuaranceInRS */
    public static final String COLUMNNAME_InsuaranceInRS = "InsuaranceInRS";

	/** Set Insuarance In Rs	  */
	public void setInsuaranceInRS (BigDecimal InsuaranceInRS);

	/** Get Insuarance In Rs	  */
	public BigDecimal getInsuaranceInRS();

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

    /** Column name LicenseNumber_ID */
    public static final String COLUMNNAME_LicenseNumber_ID = "LicenseNumber_ID";

	/** Set License Number	  */
	public void setLicenseNumber_ID (int LicenseNumber_ID);

	/** Get License Number	  */
	public int getLicenseNumber_ID();

	public org.topra.model.I_D_DealerLicense getLicenseNumber() throws RuntimeException;

    /** Column name LocalCurrency */
    public static final String COLUMNNAME_LocalCurrency = "LocalCurrency";

	/** Set Local Currency	  */
	public void setLocalCurrency (boolean LocalCurrency);

	/** Get Local Currency	  */
	public boolean isLocalCurrency();

    /** Column name OldLicenseNumber */
    public static final String COLUMNNAME_OldLicenseNumber = "OldLicenseNumber";

	/** Set Old License Number	  */
	public void setOldLicenseNumber (String OldLicenseNumber);

	/** Get Old License Number	  */
	public String getOldLicenseNumber();

    /** Column name PaymentDocumentNo */
    public static final String COLUMNNAME_PaymentDocumentNo = "PaymentDocumentNo";

	/** Set Payment Document No.
	  * Document number of the Payment
	  */
	public void setPaymentDocumentNo (String PaymentDocumentNo);

	/** Get Payment Document No.
	  * Document number of the Payment
	  */
	public String getPaymentDocumentNo();

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (int Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public int getPhone();

	public org.compiere.model.I_C_BPartner_Location getPh() throws RuntimeException;

    /** Column name PostageInFC */
    public static final String COLUMNNAME_PostageInFC = "PostageInFC";

	/** Set Postage In Foreign Currency	  */
	public void setPostageInFC (BigDecimal PostageInFC);

	/** Get Postage In Foreign Currency	  */
	public BigDecimal getPostageInFC();

    /** Column name PostageInRS */
    public static final String COLUMNNAME_PostageInRS = "PostageInRS";

	/** Set Postage In Rs	  */
	public void setPostageInRS (BigDecimal PostageInRS);

	/** Get Postage In Rs	  */
	public BigDecimal getPostageInRS();

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

    /** Column name RateFC */
    public static final String COLUMNNAME_RateFC = "RateFC";

	/** Set Rate Of Foreign Currency	  */
	public void setRateFC (BigDecimal RateFC);

	/** Get Rate Of Foreign Currency	  */
	public BigDecimal getRateFC();

    /** Column name ReferenceNo */
    public static final String COLUMNNAME_ReferenceNo = "ReferenceNo";

	/** Set Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public void setReferenceNo (String ReferenceNo);

	/** Get Reference No.
	  * Your customer or vendor number at the Business Partner's site
	  */
	public String getReferenceNo();

    /** Column name TotalAmt */
    public static final String COLUMNNAME_TotalAmt = "TotalAmt";

	/** Set Total Amount In Rupees.
	  * Total Amount
	  */
	public void setTotalAmt (BigDecimal TotalAmt);

	/** Get Total Amount In Rupees.
	  * Total Amount
	  */
	public BigDecimal getTotalAmt();

    /** Column name TotalAmtInFC */
    public static final String COLUMNNAME_TotalAmtInFC = "TotalAmtInFC";

	/** Set Total Amount In Foreign Currency	  */
	public void setTotalAmtInFC (BigDecimal TotalAmtInFC);

	/** Get Total Amount In Foreign Currency	  */
	public BigDecimal getTotalAmtInFC();

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

    /** Column name ViewInfoBtn */
    public static final String COLUMNNAME_ViewInfoBtn = "ViewInfoBtn";

	/** Set ViewInfoBtn	  */
	public void setViewInfoBtn (String ViewInfoBtn);

	/** Get ViewInfoBtn	  */
	public String getViewInfoBtn();

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
}
