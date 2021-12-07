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

/** Generated Interface for C_ExportNGJALine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ExportNGJALine 
{

    /** TableName=C_ExportNGJALine */
    public static final String Table_Name = "C_ExportNGJALine";

    /** AD_Table_ID=1000056 */
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

    /** Column name AmountInFC */
    public static final String COLUMNNAME_AmountInFC = "AmountInFC";

	/** Set Amount In Foreign Currency	  */
	public void setAmountInFC (BigDecimal AmountInFC);

	/** Get Amount In Foreign Currency	  */
	public BigDecimal getAmountInFC();

    /** Column name AmountInRs */
    public static final String COLUMNNAME_AmountInRs = "AmountInRs";

	/** Set Amount In Rs	  */
	public void setAmountInRs (BigDecimal AmountInRs);

	/** Get Amount In Rs	  */
	public BigDecimal getAmountInRs();

    /** Column name CaraOfMetVeri */
    public static final String COLUMNNAME_CaraOfMetVeri = "CaraOfMetVeri";

	/** Set Caratage Of Metal Variety	  */
	public void setCaraOfMetVeri (String CaraOfMetVeri);

	/** Get Caratage Of Metal Variety	  */
	public String getCaraOfMetVeri();

    /** Column name C_ExpItems_ID */
    public static final String COLUMNNAME_C_ExpItems_ID = "C_ExpItems_ID";

	/** Set Export Item Name ID	  */
	public void setC_ExpItems_ID (int C_ExpItems_ID);

	/** Get Export Item Name ID	  */
	public int getC_ExpItems_ID();

	public org.topra.model.I_C_ExpItems getC_ExpItems() throws RuntimeException;

    /** Column name C_ExpMetal_ID */
    public static final String COLUMNNAME_C_ExpMetal_ID = "C_ExpMetal_ID";

	/** Set Metal Name	  */
	public void setC_ExpMetal_ID (int C_ExpMetal_ID);

	/** Get Metal Name	  */
	public int getC_ExpMetal_ID();

	public org.topra.model.I_C_ExpMetal getC_ExpMetal() throws RuntimeException;

    /** Column name C_ExportNGJA_ID */
    public static final String COLUMNNAME_C_ExportNGJA_ID = "C_ExportNGJA_ID";

	/** Set C_ExportNGJA ID	  */
	public void setC_ExportNGJA_ID (int C_ExportNGJA_ID);

	/** Get C_ExportNGJA ID	  */
	public int getC_ExportNGJA_ID();

    /** Column name C_ExportNGJALine_ID */
    public static final String COLUMNNAME_C_ExportNGJALine_ID = "C_ExportNGJALine_ID";

	/** Set C_ExportNGJALine ID	  */
	public void setC_ExportNGJALine_ID (int C_ExportNGJALine_ID);

	/** Get C_ExportNGJALine ID	  */
	public int getC_ExportNGJALine_ID();

    /** Column name C_JewelleryName_ID */
    public static final String COLUMNNAME_C_JewelleryName_ID = "C_JewelleryName_ID";

	/** Set Jewellery Name ID	  */
	public void setC_JewelleryName_ID (int C_JewelleryName_ID);

	/** Get Jewellery Name ID	  */
	public int getC_JewelleryName_ID();

	public org.topra.model.I_C_JewelleryName getC_JewelleryName() throws RuntimeException;

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

    /** Column name ItemType */
    public static final String COLUMNNAME_ItemType = "ItemType";

	/** Set Item Type	  */
	public void setItemType (String ItemType);

	/** Get Item Type	  */
	public String getItemType();

    /** Column name JewelleryType */
    public static final String COLUMNNAME_JewelleryType = "JewelleryType";

	/** Set Jewellery Type	  */
	public void setJewelleryType (String JewelleryType);

	/** Get Jewellery Type	  */
	public String getJewelleryType();

    /** Column name JewelleryWeight */
    public static final String COLUMNNAME_JewelleryWeight = "JewelleryWeight";

	/** Set Jewellery Weight (Gramm)	  */
	public void setJewelleryWeight (BigDecimal JewelleryWeight);

	/** Get Jewellery Weight (Gramm)	  */
	public BigDecimal getJewelleryWeight();

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name NoOfPCSLOT */
    public static final String COLUMNNAME_NoOfPCSLOT = "NoOfPCSLOT";

	/** Set No Of PCS /LOt/Quantity	  */
	public void setNoOfPCSLOT (int NoOfPCSLOT);

	/** Get No Of PCS /LOt/Quantity	  */
	public int getNoOfPCSLOT();

    /** Column name RateMeasureType */
    public static final String COLUMNNAME_RateMeasureType = "RateMeasureType";

	/** Set Rate Measure Type	  */
	public void setRateMeasureType (String RateMeasureType);

	/** Get Rate Measure Type	  */
	public String getRateMeasureType();

    /** Column name RatePerUnit */
    public static final String COLUMNNAME_RatePerUnit = "RatePerUnit";

	/** Set Rate Per Unit	  */
	public void setRatePerUnit (BigDecimal RatePerUnit);

	/** Get Rate Per Unit	  */
	public BigDecimal getRatePerUnit();

    /** Column name ReturnStatus */
    public static final String COLUMNNAME_ReturnStatus = "ReturnStatus";

	/** Set ReturnStatus	  */
	public void setReturnStatus (String ReturnStatus);

	/** Get ReturnStatus	  */
	public String getReturnStatus();

    /** Column name StonesWeight */
    public static final String COLUMNNAME_StonesWeight = "StonesWeight";

	/** Set Stones Weight (Gramm)	  */
	public void setStonesWeight (BigDecimal StonesWeight);

	/** Get Stones Weight (Gramm)	  */
	public BigDecimal getStonesWeight();

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

    /** Column name WeightCategory */
    public static final String COLUMNNAME_WeightCategory = "WeightCategory";

	/** Set Weight Category	  */
	public void setWeightCategory (String WeightCategory);

	/** Get Weight Category	  */
	public String getWeightCategory();
}
