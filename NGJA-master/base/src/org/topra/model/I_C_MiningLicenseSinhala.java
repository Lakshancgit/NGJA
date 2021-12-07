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

/** Generated Interface for C_MiningLicenseSinhala
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_MiningLicenseSinhala 
{

    /** TableName=C_MiningLicenseSinhala */
    public static final String Table_Name = "C_MiningLicenseSinhala";

    /** AD_Table_ID=1000082 */
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

    /** Column name C_GemMining_ID */
    public static final String COLUMNNAME_C_GemMining_ID = "C_GemMining_ID";

	/** Set GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID);

	/** Get GemMininig ID	  */
	public int getC_GemMining_ID();

    /** Column name C_MiningLicenseSinhala_ID */
    public static final String COLUMNNAME_C_MiningLicenseSinhala_ID = "C_MiningLicenseSinhala_ID";

	/** Set Mining License (Sinhala) ID	  */
	public void setC_MiningLicenseSinhala_ID (int C_MiningLicenseSinhala_ID);

	/** Get Mining License (Sinhala) ID	  */
	public int getC_MiningLicenseSinhala_ID();

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

    /** Column name DateConfirm */
    public static final String COLUMNNAME_DateConfirm = "DateConfirm";

	/** Set Date Confirm.
	  * Date Confirm of this Order
	  */
	public void setDateConfirm (String DateConfirm);

	/** Get Date Confirm.
	  * Date Confirm of this Order
	  */
	public String getDateConfirm();

    /** Column name District */
    public static final String COLUMNNAME_District = "District";

	/** Set District	  */
	public void setDistrict (String District);

	/** Get District	  */
	public String getDistrict();

    /** Column name DiviSecHeadOff */
    public static final String COLUMNNAME_DiviSecHeadOff = "DiviSecHeadOff";

	/** Set Divisional Secretary Head Office	  */
	public void setDiviSecHeadOff (String DiviSecHeadOff);

	/** Get Divisional Secretary Head Office	  */
	public String getDiviSecHeadOff();

    /** Column name DiviSecOffice */
    public static final String COLUMNNAME_DiviSecOffice = "DiviSecOffice";

	/** Set Divisional Secretary Office	  */
	public void setDiviSecOffice (String DiviSecOffice);

	/** Get Divisional Secretary Office	  */
	public String getDiviSecOffice();

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

    /** Column name ExpiryDateOfLicense */
    public static final String COLUMNNAME_ExpiryDateOfLicense = "ExpiryDateOfLicense";

	/** Set ExpiryDateOfLicense	  */
	public void setExpiryDateOfLicense (String ExpiryDateOfLicense);

	/** Get ExpiryDateOfLicense	  */
	public String getExpiryDateOfLicense();

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

    /** Column name IsPrinted */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";

	/** Set Printed.
	  * Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted);

	/** Get Printed.
	  * Indicates if this document / line is printed
	  */
	public boolean isPrinted();

    /** Column name IsSaved */
    public static final String COLUMNNAME_IsSaved = "IsSaved";

	/** Set Saved	  */
	public void setIsSaved (boolean IsSaved);

	/** Get Saved	  */
	public boolean isSaved();

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

    /** Column name MiningLicenseNo */
    public static final String COLUMNNAME_MiningLicenseNo = "MiningLicenseNo";

	/** Set MiningLicenseNo	  */
	public void setMiningLicenseNo (String MiningLicenseNo);

	/** Get MiningLicenseNo	  */
	public String getMiningLicenseNo();

    /** Column name NICnName */
    public static final String COLUMNNAME_NICnName = "NICnName";

	/** Set NIC & Name	  */
	public void setNICnName (String NICnName);

	/** Get NIC & Name	  */
	public String getNICnName();

    /** Column name NoOfMine */
    public static final String COLUMNNAME_NoOfMine = "NoOfMine";

	/** Set NoOfMine	  */
	public void setNoOfMine (String NoOfMine);

	/** Get NoOfMine	  */
	public String getNoOfMine();

    /** Column name specialConditions */
    public static final String COLUMNNAME_specialConditions = "specialConditions";

	/** Set specialConditions	  */
	public void setspecialConditions (String specialConditions);

	/** Get specialConditions	  */
	public String getspecialConditions();

    /** Column name ToEast */
    public static final String COLUMNNAME_ToEast = "ToEast";

	/** Set To East	  */
	public void setToEast (String ToEast);

	/** Get To East	  */
	public String getToEast();

    /** Column name ToNorth */
    public static final String COLUMNNAME_ToNorth = "ToNorth";

	/** Set To North	  */
	public void setToNorth (String ToNorth);

	/** Get To North	  */
	public String getToNorth();

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

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name Village */
    public static final String COLUMNNAME_Village = "Village";

	/** Set Village	  */
	public void setVillage (String Village);

	/** Get Village	  */
	public String getVillage();
}
