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

/** Generated Interface for C_ExportNGJA
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ExportNGJA 
{

    /** TableName=C_ExportNGJA */
    public static final String Table_Name = "C_ExportNGJA";

    /** AD_Table_ID=1000055 */
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

    /** Column name AdeddValue */
    public static final String COLUMNNAME_AdeddValue = "AdeddValue";

	/** Set Adedd Value	  */
	public void setAdeddValue (BigDecimal AdeddValue);

	/** Get Adedd Value	  */
	public BigDecimal getAdeddValue();

    /** Column name AdeddValueIinFC */
    public static final String COLUMNNAME_AdeddValueIinFC = "AdeddValueIinFC";

	/** Set Adedd Value in FC	  */
	public void setAdeddValueIinFC (BigDecimal AdeddValueIinFC);

	/** Get Adedd Value in FC	  */
	public BigDecimal getAdeddValueIinFC();

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

    /** Column name C_DealerFile_ID */
    public static final String COLUMNNAME_C_DealerFile_ID = "C_DealerFile_ID";

	/** Set Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID);

	/** Get Dealer File Number ID	  */
	public int getC_DealerFile_ID();

	public org.topra.model.I_C_DealerFile getC_DealerFile() throws RuntimeException;

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

    /** Column name C_ExportNGJA_ID */
    public static final String COLUMNNAME_C_ExportNGJA_ID = "C_ExportNGJA_ID";

	/** Set C_ExportNGJA ID	  */
	public void setC_ExportNGJA_ID (int C_ExportNGJA_ID);

	/** Get C_ExportNGJA ID	  */
	public int getC_ExportNGJA_ID();

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

    /** Column name ConCountry_ID */
    public static final String COLUMNNAME_ConCountry_ID = "ConCountry_ID";

	/** Set Consig Country	  */
	public void setConCountry_ID (int ConCountry_ID);

	/** Get Consig Country	  */
	public int getConCountry_ID();

    /** Column name ConsigAddCity */
    public static final String COLUMNNAME_ConsigAddCity = "ConsigAddCity";

	/** Set City	  */
	public void setConsigAddCity (String ConsigAddCity);

	/** Get City	  */
	public String getConsigAddCity();

    /** Column name ConsigAddFour */
    public static final String COLUMNNAME_ConsigAddFour = "ConsigAddFour";

	/** Set Address 4	  */
	public void setConsigAddFour (String ConsigAddFour);

	/** Get Address 4	  */
	public String getConsigAddFour();

    /** Column name ConsigAddOne */
    public static final String COLUMNNAME_ConsigAddOne = "ConsigAddOne";

	/** Set Address 1	  */
	public void setConsigAddOne (String ConsigAddOne);

	/** Get Address 1	  */
	public String getConsigAddOne();

    /** Column name ConsigAddThree */
    public static final String COLUMNNAME_ConsigAddThree = "ConsigAddThree";

	/** Set Address 3	  */
	public void setConsigAddThree (String ConsigAddThree);

	/** Get Address 3	  */
	public String getConsigAddThree();

    /** Column name ConsigAddTwo */
    public static final String COLUMNNAME_ConsigAddTwo = "ConsigAddTwo";

	/** Set Address 2	  */
	public void setConsigAddTwo (String ConsigAddTwo);

	/** Get Address 2	  */
	public String getConsigAddTwo();

    /** Column name ConsigneeTeleNo */
    public static final String COLUMNNAME_ConsigneeTeleNo = "ConsigneeTeleNo";

	/** Set Tele No	  */
	public void setConsigneeTeleNo (String ConsigneeTeleNo);

	/** Get Tele No	  */
	public String getConsigneeTeleNo();

    /** Column name C_Payment_ID */
    public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

	/** Set Payment.
	  * Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID);

	/** Get Payment.
	  * Payment identifier
	  */
	public int getC_Payment_ID();

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException;

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

    /** Column name CustomOfficer */
    public static final String COLUMNNAME_CustomOfficer = "CustomOfficer";

	/** Set Custom Officer	  */
	public void setCustomOfficer (String CustomOfficer);

	/** Get Custom Officer	  */
	public String getCustomOfficer();

    /** Column name CustomTNO */
    public static final String COLUMNNAME_CustomTNO = "CustomTNO";

	/** Set Custom T No	  */
	public void setCustomTNO (String CustomTNO);

	/** Get Custom T No	  */
	public String getCustomTNO();

    /** Column name DealerLicenseNo */
    public static final String COLUMNNAME_DealerLicenseNo = "DealerLicenseNo";

	/** Set Dealer License No	  */
	public void setDealerLicenseNo (int DealerLicenseNo);

	/** Get Dealer License No	  */
	public int getDealerLicenseNo();

	public org.topra.model.I_D_DealerLicense getDealerLicens() throws RuntimeException;

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

    /** Column name DocumentStatus */
    public static final String COLUMNNAME_DocumentStatus = "DocumentStatus";

	/** Set Document Status	  */
	public void setDocumentStatus (String DocumentStatus);

	/** Get Document Status	  */
	public String getDocumentStatus();

    /** Column name ExpDate */
    public static final String COLUMNNAME_ExpDate = "ExpDate";

	/** Set Export Date	  */
	public void setExpDate (Timestamp ExpDate);

	/** Get Export Date	  */
	public Timestamp getExpDate();

    /** Column name EXPDeliveryType */
    public static final String COLUMNNAME_EXPDeliveryType = "EXPDeliveryType";

	/** Set Delivery Type	  */
	public void setEXPDeliveryType (String EXPDeliveryType);

	/** Get Delivery Type	  */
	public String getEXPDeliveryType();

    /** Column name ExpExpireDate */
    public static final String COLUMNNAME_ExpExpireDate = "ExpExpireDate";

	/** Set Export Expire Date	  */
	public void setExpExpireDate (Timestamp ExpExpireDate);

	/** Get Export Expire Date	  */
	public Timestamp getExpExpireDate();

    /** Column name ExportLicenseNo */
    public static final String COLUMNNAME_ExportLicenseNo = "ExportLicenseNo";

	/** Set Export License No	  */
	public void setExportLicenseNo (String ExportLicenseNo);

	/** Get Export License No	  */
	public String getExportLicenseNo();

    /** Column name ExportTypes */
    public static final String COLUMNNAME_ExportTypes = "ExportTypes";

	/** Set Export Types	  */
	public void setExportTypes (String ExportTypes);

	/** Get Export Types	  */
	public String getExportTypes();

    /** Column name ExpPrice */
    public static final String COLUMNNAME_ExpPrice = "ExpPrice";

	/** Set Price	  */
	public void setExpPrice (String ExpPrice);

	/** Get Price	  */
	public String getExpPrice();

    /** Column name ExpStatus */
    public static final String COLUMNNAME_ExpStatus = "ExpStatus";

	/** Set ExpStatus	  */
	public void setExpStatus (String ExpStatus);

	/** Get ExpStatus	  */
	public String getExpStatus();

    /** Column name ExpTerms */
    public static final String COLUMNNAME_ExpTerms = "ExpTerms";

	/** Set Terms	  */
	public void setExpTerms (String ExpTerms);

	/** Get Terms	  */
	public String getExpTerms();

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

    /** Column name InvoiceNo */
    public static final String COLUMNNAME_InvoiceNo = "InvoiceNo";

	/** Set Invoice No	  */
	public void setInvoiceNo (String InvoiceNo);

	/** Get Invoice No	  */
	public String getInvoiceNo();

    /** Column name InvoiceSubmitDate */
    public static final String COLUMNNAME_InvoiceSubmitDate = "InvoiceSubmitDate";

	/** Set Invoice Subbmit Date	  */
	public void setInvoiceSubmitDate (Timestamp InvoiceSubmitDate);

	/** Get Invoice Subbmit Date	  */
	public Timestamp getInvoiceSubmitDate();

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

    /** Column name IsExtended */
    public static final String COLUMNNAME_IsExtended = "IsExtended";

	/** Set Extended	  */
	public void setIsExtended (boolean IsExtended);

	/** Get Extended	  */
	public boolean isExtended();

    /** Column name IsImport */
    public static final String COLUMNNAME_IsImport = "IsImport";

	/** Set Import	  */
	public void setIsImport (boolean IsImport);

	/** Get Import	  */
	public boolean isImport();

    /** Column name JewelleryLicenseNo */
    public static final String COLUMNNAME_JewelleryLicenseNo = "JewelleryLicenseNo";

	/** Set Jewellery License No	  */
	public void setJewelleryLicenseNo (String JewelleryLicenseNo);

	/** Get Jewellery License No	  */
	public String getJewelleryLicenseNo();

    /** Column name LapidaryLicenseNo */
    public static final String COLUMNNAME_LapidaryLicenseNo = "LapidaryLicenseNo";

	/** Set Lapidary License No	  */
	public void setLapidaryLicenseNo (String LapidaryLicenseNo);

	/** Get Lapidary License No	  */
	public String getLapidaryLicenseNo();

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

    /** Column name NameConsignee */
    public static final String COLUMNNAME_NameConsignee = "NameConsignee";

	/** Set Name of the Consignee	  */
	public void setNameConsignee (String NameConsignee);

	/** Get Name of the Consignee	  */
	public String getNameConsignee();

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

    /** Column name OverTenNumOfPieces */
    public static final String COLUMNNAME_OverTenNumOfPieces = "OverTenNumOfPieces";

	/** Set Number Of Pieces	  */
	public void setOverTenNumOfPieces (BigDecimal OverTenNumOfPieces);

	/** Get Number Of Pieces	  */
	public BigDecimal getOverTenNumOfPieces();

    /** Column name OverTenTotalWeight */
    public static final String COLUMNNAME_OverTenTotalWeight = "OverTenTotalWeight";

	/** Set Total Weight	  */
	public void setOverTenTotalWeight (BigDecimal OverTenTotalWeight);

	/** Get Total Weight	  */
	public BigDecimal getOverTenTotalWeight();

    /** Column name PerCarrierPassNo */
    public static final String COLUMNNAME_PerCarrierPassNo = "PerCarrierPassNo";

	/** Set Personnal Carrier Passport No	  */
	public void setPerCarrierPassNo (String PerCarrierPassNo);

	/** Get Personnal Carrier Passport No	  */
	public String getPerCarrierPassNo();

    /** Column name PerCarryName */
    public static final String COLUMNNAME_PerCarryName = "PerCarryName";

	/** Set Personnal Carrier Name	  */
	public void setPerCarryName (String PerCarryName);

	/** Get Personnal Carrier Name	  */
	public String getPerCarryName();

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

    /** Column name RateFC */
    public static final String COLUMNNAME_RateFC = "RateFC";

	/** Set Rate Of Foreign Currency	  */
	public void setRateFC (BigDecimal RateFC);

	/** Get Rate Of Foreign Currency	  */
	public BigDecimal getRateFC();

    /** Column name RefNo */
    public static final String COLUMNNAME_RefNo = "RefNo";

	/** Set Refference Number	  */
	public void setRefNo (String RefNo);

	/** Get Refference Number	  */
	public String getRefNo();

    /** Column name ReturnStatus */
    public static final String COLUMNNAME_ReturnStatus = "ReturnStatus";

	/** Set ReturnStatus	  */
	public void setReturnStatus (String ReturnStatus);

	/** Get ReturnStatus	  */
	public String getReturnStatus();

    /** Column name StockValue */
    public static final String COLUMNNAME_StockValue = "StockValue";

	/** Set Stock Value	  */
	public void setStockValue (int StockValue);

	/** Get Stock Value	  */
	public int getStockValue();

    /** Column name TotalAmtInFC */
    public static final String COLUMNNAME_TotalAmtInFC = "TotalAmtInFC";

	/** Set Total Amount In Foreign Currency	  */
	public void setTotalAmtInFC (BigDecimal TotalAmtInFC);

	/** Get Total Amount In Foreign Currency	  */
	public BigDecimal getTotalAmtInFC();

    /** Column name TotalNoOfLot */
    public static final String COLUMNNAME_TotalNoOfLot = "TotalNoOfLot";

	/** Set Total No Of Lot	  */
	public void setTotalNoOfLot (int TotalNoOfLot);

	/** Get Total No Of Lot	  */
	public int getTotalNoOfLot();

    /** Column name TotalNoOfPCS */
    public static final String COLUMNNAME_TotalNoOfPCS = "TotalNoOfPCS";

	/** Set Total No Of PCS	  */
	public void setTotalNoOfPCS (int TotalNoOfPCS);

	/** Get Total No Of PCS	  */
	public int getTotalNoOfPCS();

    /** Column name TotalWeightAmt */
    public static final String COLUMNNAME_TotalWeightAmt = "TotalWeightAmt";

	/** Set Total Weight Amount	  */
	public void setTotalWeightAmt (BigDecimal TotalWeightAmt);

	/** Get Total Weight Amount	  */
	public BigDecimal getTotalWeightAmt();

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

    /** Column name ValuationDate */
    public static final String COLUMNNAME_ValuationDate = "ValuationDate";

	/** Set Valuation Date	  */
	public void setValuationDate (Timestamp ValuationDate);

	/** Get Valuation Date	  */
	public Timestamp getValuationDate();

    /** Column name ViewInfoBtn */
    public static final String COLUMNNAME_ViewInfoBtn = "ViewInfoBtn";

	/** Set ViewInfoBtn	  */
	public void setViewInfoBtn (String ViewInfoBtn);

	/** Get ViewInfoBtn	  */
	public String getViewInfoBtn();

    /** Column name ZoomBtn */
    public static final String COLUMNNAME_ZoomBtn = "ZoomBtn";

	/** Set Load Informations	  */
	public void setZoomBtn (String ZoomBtn);

	/** Get Load Informations	  */
	public String getZoomBtn();
}
