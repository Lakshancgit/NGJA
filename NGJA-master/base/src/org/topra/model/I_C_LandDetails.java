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

/** Generated Interface for C_LandDetails
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_LandDetails 
{

    /** TableName=C_LandDetails */
    public static final String Table_Name = "C_LandDetails";

    /** AD_Table_ID=1000045 */
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

    /** Column name AdminMangerName */
    public static final String COLUMNNAME_AdminMangerName = "AdminMangerName";

	/** Set Proposed Manager/Administrator Name	  */
	public void setAdminMangerName (String AdminMangerName);

	/** Get Proposed Manager/Administrator Name	  */
	public String getAdminMangerName();

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

    /** Column name ApplicationStatus */
    public static final String COLUMNNAME_ApplicationStatus = "ApplicationStatus";

	/** Set ApplicationStatus	  */
	public void setApplicationStatus (String ApplicationStatus);

	/** Get ApplicationStatus	  */
	public String getApplicationStatus();

    /** Column name BelongsToOther */
    public static final String COLUMNNAME_BelongsToOther = "BelongsToOther";

	/** Set Land Belongs to the Temple/Fane/Manorial	  */
	public void setBelongsToOther (String BelongsToOther);

	/** Get Land Belongs to the Temple/Fane/Manorial	  */
	public String getBelongsToOther();

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

    /** Column name C_GemMining_ID */
    public static final String COLUMNNAME_C_GemMining_ID = "C_GemMining_ID";

	/** Set GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID);

	/** Get GemMininig ID	  */
	public int getC_GemMining_ID();

	public org.topra.model.I_C_GemMining getC_GemMining() throws RuntimeException;

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

    /** Column name C_LandDetails_ID */
    public static final String COLUMNNAME_C_LandDetails_ID = "C_LandDetails_ID";

	/** Set Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID);

	/** Get Land Details ID	  */
	public int getC_LandDetails_ID();

    /** Column name C_MiningLandName_ID */
    public static final String COLUMNNAME_C_MiningLandName_ID = "C_MiningLandName_ID";

	/** Set C_MiningLandName ID	  */
	public void setC_MiningLandName_ID (int C_MiningLandName_ID);

	/** Get C_MiningLandName ID	  */
	public int getC_MiningLandName_ID();

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

    /** Column name DeedNumber */
    public static final String COLUMNNAME_DeedNumber = "DeedNumber";

	/** Set Deed Number	  */
	public void setDeedNumber (String DeedNumber);

	/** Get Deed Number	  */
	public String getDeedNumber();

    /** Column name District */
    public static final String COLUMNNAME_District = "District";

	/** Set District	  */
	public void setDistrict (String District);

	/** Get District	  */
	public String getDistrict();

    /** Column name DiviSecOffice */
    public static final String COLUMNNAME_DiviSecOffice = "DiviSecOffice";

	/** Set Divisional Secretary Office	  */
	public void setDiviSecOffice (int DiviSecOffice);

	/** Get Divisional Secretary Office	  */
	public int getDiviSecOffice();

//	public org.topra.model.I_C_DiviSecOffice getDiviSecOff() throws RuntimeException;

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

    /** Column name ElectroDivision */
    public static final String COLUMNNAME_ElectroDivision = "ElectroDivision";

	/** Set Electro Division	  */
	public void setElectroDivision (int ElectroDivision);

	/** Get Electro Division	  */
	public int getElectroDivision();

//	public org.topra.model.I_C_ElectoralDivision getElectroDivis() throws RuntimeException;

    /** Column name EOCheckedDate */
    public static final String COLUMNNAME_EOCheckedDate = "EOCheckedDate";

	/** Set EOCheckedDate	  */
	public void setEOCheckedDate (Timestamp EOCheckedDate);

	/** Get EOCheckedDate	  */
	public Timestamp getEOCheckedDate();

    /** Column name GramaNDivision */
    public static final String COLUMNNAME_GramaNDivision = "GramaNDivision";

	/** Set Grama Niladari Division	  */
	public void setGramaNDivision (int GramaNDivision);

	/** Get Grama Niladari Division	  */
	public int getGramaNDivision();

//	public org.topra.model.I_C_GNDivision getGramaNDivis() throws RuntimeException;

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

    /** Column name ISEditedByEO */
    public static final String COLUMNNAME_ISEditedByEO = "ISEditedByEO";

	/** Set ISEditedByEO	  */
	public void setISEditedByEO (String ISEditedByEO);

	/** Get ISEditedByEO	  */
	public String getISEditedByEO();

    /** Column name isGotPreference */
    public static final String COLUMNNAME_isGotPreference = "isGotPreference";

	/** Set Is Got Preference in Written	  */
	public void setisGotPreference (String isGotPreference);

	/** Get Is Got Preference in Written	  */
	public String getisGotPreference();

    /** Column name IsTradeLicense */
    public static final String COLUMNNAME_IsTradeLicense = "IsTradeLicense";

	/** Set Applicant has the Gem Trade License	  */
	public void setIsTradeLicense (String IsTradeLicense);

	/** Get Applicant has the Gem Trade License	  */
	public String getIsTradeLicense();

    /** Column name IsUpgrade */
    public static final String COLUMNNAME_IsUpgrade = "IsUpgrade";

	/** Set IsUpgrade	  */
	public void setIsUpgrade (boolean IsUpgrade);

	/** Get IsUpgrade	  */
	public boolean isUpgrade();

    /** Column name L_Acres */
    public static final String COLUMNNAME_L_Acres = "L_Acres";

	/** Set L_Acres	  */
	public void setL_Acres (BigDecimal L_Acres);

	/** Get L_Acres	  */
	public BigDecimal getL_Acres();

    /** Column name LandArea */
    public static final String COLUMNNAME_LandArea = "LandArea";

	/** Set Land Area	  */
	public void setLandArea (String LandArea);

	/** Get Land Area	  */
	public String getLandArea();

    /** Column name LandBelongsToGov */
    public static final String COLUMNNAME_LandBelongsToGov = "LandBelongsToGov";

	/** Set Land Belongs to the Government	  */
	public void setLandBelongsToGov (String LandBelongsToGov);

	/** Get Land Belongs to the Government	  */
	public String getLandBelongsToGov();

    /** Column name LandName */
    public static final String COLUMNNAME_LandName = "LandName";

	/** Set Name of the Land	  */
	public void setLandName (String LandName);

	/** Get Name of the Land	  */
	public String getLandName();

    /** Column name LandNature */
    public static final String COLUMNNAME_LandNature = "LandNature";

	/** Set Nature of the Land	  */
	public void setLandNature (String LandNature);

	/** Get Nature of the Land	  */
	public String getLandNature();

    /** Column name LandType */
    public static final String COLUMNNAME_LandType = "LandType";

	/** Set LandType	  */
	public void setLandType (String LandType);

	/** Get LandType	  */
	public String getLandType();

    /** Column name L_FeetsFromBordertoEast */
    public static final String COLUMNNAME_L_FeetsFromBordertoEast = "L_FeetsFromBordertoEast";

	/** Set L_FeetsFromBordertoEast	  */
	public void setL_FeetsFromBordertoEast (BigDecimal L_FeetsFromBordertoEast);

	/** Get L_FeetsFromBordertoEast	  */
	public BigDecimal getL_FeetsFromBordertoEast();

    /** Column name L_FeetsFromBordertoNorth */
    public static final String COLUMNNAME_L_FeetsFromBordertoNorth = "L_FeetsFromBordertoNorth";

	/** Set L_FeetsFromBordertoNorth	  */
	public void setL_FeetsFromBordertoNorth (BigDecimal L_FeetsFromBordertoNorth);

	/** Get L_FeetsFromBordertoNorth	  */
	public BigDecimal getL_FeetsFromBordertoNorth();

    /** Column name L_FeetsFromBordertoSouth */
    public static final String COLUMNNAME_L_FeetsFromBordertoSouth = "L_FeetsFromBordertoSouth";

	/** Set L_FeetsFromBordertoSouth	  */
	public void setL_FeetsFromBordertoSouth (BigDecimal L_FeetsFromBordertoSouth);

	/** Get L_FeetsFromBordertoSouth	  */
	public BigDecimal getL_FeetsFromBordertoSouth();

    /** Column name L_FeetsFromBordertoWest */
    public static final String COLUMNNAME_L_FeetsFromBordertoWest = "L_FeetsFromBordertoWest";

	/** Set L_FeetsFromBordertoWest	  */
	public void setL_FeetsFromBordertoWest (BigDecimal L_FeetsFromBordertoWest);

	/** Get L_FeetsFromBordertoWest	  */
	public BigDecimal getL_FeetsFromBordertoWest();

    /** Column name L_Purches */
    public static final String COLUMNNAME_L_Purches = "L_Purches";

	/** Set L_Purches	  */
	public void setL_Purches (BigDecimal L_Purches);

	/** Get L_Purches	  */
	public BigDecimal getL_Purches();

    /** Column name L_Roods */
    public static final String COLUMNNAME_L_Roods = "L_Roods";

	/** Set L_Roods	  */
	public void setL_Roods (BigDecimal L_Roods);

	/** Get L_Roods	  */
	public BigDecimal getL_Roods();

    /** Column name MineralOwnership */
    public static final String COLUMNNAME_MineralOwnership = "MineralOwnership";

	/** Set Mineral Ownership	  */
	public void setMineralOwnership (String MineralOwnership);

	/** Get Mineral Ownership	  */
	public String getMineralOwnership();

    /** Column name NameOfConveyancer */
    public static final String COLUMNNAME_NameOfConveyancer = "NameOfConveyancer";

	/** Set Name of the Conveyancer	  */
	public void setNameOfConveyancer (String NameOfConveyancer);

	/** Get Name of the Conveyancer	  */
	public String getNameOfConveyancer();

    /** Column name NatureOfDeed */
    public static final String COLUMNNAME_NatureOfDeed = "NatureOfDeed";

	/** Set Nature of the Deed	  */
	public void setNatureOfDeed (String NatureOfDeed);

	/** Get Nature of the Deed	  */
	public String getNatureOfDeed();

    /** Column name NearestWayToLand */
    public static final String COLUMNNAME_NearestWayToLand = "NearestWayToLand";

	/** Set Nearest Way to reach the Land	  */
	public void setNearestWayToLand (String NearestWayToLand);

	/** Get Nearest Way to reach the Land	  */
	public String getNearestWayToLand();

    /** Column name North */
    public static final String COLUMNNAME_North = "North";

	/** Set North	  */
	public void setNorth (String North);

	/** Get North	  */
	public String getNorth();

    /** Column name NumMines */
    public static final String COLUMNNAME_NumMines = "NumMines";

	/** Set Number of Mines hope to minning at onece	  */
	public void setNumMines (BigDecimal NumMines);

	/** Get Number of Mines hope to minning at onece	  */
	public BigDecimal getNumMines();

    /** Column name PlanPlotNum */
    public static final String COLUMNNAME_PlanPlotNum = "PlanPlotNum";

	/** Set Plan & Plot Number	  */
	public void setPlanPlotNum (String PlanPlotNum);

	/** Get Plan & Plot Number	  */
	public String getPlanPlotNum();

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

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name RatioOfOwnership */
    public static final String COLUMNNAME_RatioOfOwnership = "RatioOfOwnership";

	/** Set Ratio of the Ownership	  */
	public void setRatioOfOwnership (String RatioOfOwnership);

	/** Get Ratio of the Ownership	  */
	public String getRatioOfOwnership();

    /** Column name ServiceStaff */
    public static final String COLUMNNAME_ServiceStaff = "ServiceStaff";

	/** Set Number of Service Staff	  */
	public void setServiceStaff (BigDecimal ServiceStaff);

	/** Get Number of Service Staff	  */
	public BigDecimal getServiceStaff();

    /** Column name ToEast */
    public static final String COLUMNNAME_ToEast = "ToEast";

	/** Set To East	  */
	public void setToEast (String ToEast);

	/** Get To East	  */
	public String getToEast();

    /** Column name ToSouth */
    public static final String COLUMNNAME_ToSouth = "ToSouth";

	/** Set To South	  */
	public void setToSouth (String ToSouth);

	/** Get To South	  */
	public String getToSouth();

    /** Column name ToWest */
    public static final String COLUMNNAME_ToWest = "ToWest";

	/** Set To West	  */
	public void setToWest (String ToWest);

	/** Get To West	  */
	public String getToWest();

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

    /** Column name VillageDetail */
    public static final String COLUMNNAME_VillageDetail = "VillageDetail";

	/** Set Village	  */
	public void setVillageDetail (int VillageDetail);

	/** Get Village	  */
	public int getVillageDetail();

//	public org.topra.model.I_C_Village getVillageDet() throws RuntimeException;
}
