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

/** Generated Interface for ExpReturnSaleLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_ExpReturnSaleLine 
{

    /** TableName=ExpReturnSaleLine */
    public static final String Table_Name = "ExpReturnSaleLine";

    /** AD_Table_ID=1000069 */
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

    /** Column name C_ExportNGJALine_ID */
    public static final String COLUMNNAME_C_ExportNGJALine_ID = "C_ExportNGJALine_ID";

	/** Set C_ExportNGJALine ID	  */
	public void setC_ExportNGJALine_ID (int C_ExportNGJALine_ID);

	/** Get C_ExportNGJALine ID	  */
	public int getC_ExportNGJALine_ID();

	public org.topra.model.I_C_ExportNGJALine getC_ExportNGJALine() throws RuntimeException;

    /** Column name C_OverTen_ID */
    public static final String COLUMNNAME_C_OverTen_ID = "C_OverTen_ID";

	/** Set C_OverTen ID	  */
	public void setC_OverTen_ID (int C_OverTen_ID);

	/** Get C_OverTen ID	  */
	public int getC_OverTen_ID();

	public org.topra.model.I_C_OverTen getC_OverTen() throws RuntimeException;

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

    /** Column name ExpFineStatus */
    public static final String COLUMNNAME_ExpFineStatus = "ExpFineStatus";

	/** Set Exp Fine Status	  */
	public void setExpFineStatus (String ExpFineStatus);

	/** Get Exp Fine Status	  */
	public String getExpFineStatus();

    /** Column name ExpReturnSale_ID */
    public static final String COLUMNNAME_ExpReturnSale_ID = "ExpReturnSale_ID";

	/** Set Export Return & Sale ID	  */
	public void setExpReturnSale_ID (int ExpReturnSale_ID);

	/** Get Export Return & Sale ID	  */
	public int getExpReturnSale_ID();

    /** Column name ExpReturnSaleLine_ID */
    public static final String COLUMNNAME_ExpReturnSaleLine_ID = "ExpReturnSaleLine_ID";

	/** Set Export Return & Sale Line ID	  */
	public void setExpReturnSaleLine_ID (int ExpReturnSaleLine_ID);

	/** Get Export Return & Sale Line ID	  */
	public int getExpReturnSaleLine_ID();

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

    /** Column name ItemValueInForeign */
    public static final String COLUMNNAME_ItemValueInForeign = "ItemValueInForeign";

	/** Set Item Value In Foreign	  */
	public void setItemValueInForeign (BigDecimal ItemValueInForeign);

	/** Get Item Value In Foreign	  */
	public BigDecimal getItemValueInForeign();

    /** Column name ItemValueInRs */
    public static final String COLUMNNAME_ItemValueInRs = "ItemValueInRs";

	/** Set Item Value In Rs	  */
	public void setItemValueInRs (BigDecimal ItemValueInRs);

	/** Get Item Value In Rs	  */
	public BigDecimal getItemValueInRs();

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

    /** Column name ReturnedQuantity */
    public static final String COLUMNNAME_ReturnedQuantity = "ReturnedQuantity";

	/** Set ReturnedQuantity	  */
	public void setReturnedQuantity (int ReturnedQuantity);

	/** Get ReturnedQuantity	  */
	public int getReturnedQuantity();

    /** Column name ReturnedTotalWeight */
    public static final String COLUMNNAME_ReturnedTotalWeight = "ReturnedTotalWeight";

	/** Set ReturnedTotalWeight	  */
	public void setReturnedTotalWeight (BigDecimal ReturnedTotalWeight);

	/** Get ReturnedTotalWeight	  */
	public BigDecimal getReturnedTotalWeight();

    /** Column name ReturnSale */
    public static final String COLUMNNAME_ReturnSale = "ReturnSale";

	/** Set Return/Sale	  */
	public void setReturnSale (String ReturnSale);

	/** Get Return/Sale	  */
	public String getReturnSale();

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
