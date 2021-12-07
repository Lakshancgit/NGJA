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
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for C_ExportNGJALine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ExportNGJALine extends PO implements I_C_ExportNGJALine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190314L;

    /** Standard Constructor */
    public X_C_ExportNGJALine (Properties ctx, int C_ExportNGJALine_ID, String trxName)
    {
      super (ctx, C_ExportNGJALine_ID, trxName);
      /** if (C_ExportNGJALine_ID == 0)
        {
			setC_ExportNGJALine_ID (0);
			setItemType (null);
			setNoOfPCSLOT (0);
			setRatePerUnit (Env.ZERO);
			setWeight (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_C_ExportNGJALine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ExportNGJALine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount In Foreign Currency.
		@param AmountInFC Amount In Foreign Currency	  */
	public void setAmountInFC (BigDecimal AmountInFC)
	{
		set_Value (COLUMNNAME_AmountInFC, AmountInFC);
	}

	/** Get Amount In Foreign Currency.
		@return Amount In Foreign Currency	  */
	public BigDecimal getAmountInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmountInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Amount In Rs.
		@param AmountInRs Amount In Rs	  */
	public void setAmountInRs (BigDecimal AmountInRs)
	{
		set_Value (COLUMNNAME_AmountInRs, AmountInRs);
	}

	/** Get Amount In Rs.
		@return Amount In Rs	  */
	public BigDecimal getAmountInRs () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmountInRs);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Caratage Of Metal Variety.
		@param CaraOfMetVeri Caratage Of Metal Variety	  */
	public void setCaraOfMetVeri (String CaraOfMetVeri)
	{
		set_Value (COLUMNNAME_CaraOfMetVeri, CaraOfMetVeri);
	}

	/** Get Caratage Of Metal Variety.
		@return Caratage Of Metal Variety	  */
	public String getCaraOfMetVeri () 
	{
		return (String)get_Value(COLUMNNAME_CaraOfMetVeri);
	}

	public org.topra.model.I_C_ExpItems getC_ExpItems() throws RuntimeException
    {
		return (org.topra.model.I_C_ExpItems)MTable.get(getCtx(), org.topra.model.I_C_ExpItems.Table_Name)
			.getPO(getC_ExpItems_ID(), get_TrxName());	}

	/** Set Export Item Name ID.
		@param C_ExpItems_ID Export Item Name ID	  */
	public void setC_ExpItems_ID (int C_ExpItems_ID)
	{
		if (C_ExpItems_ID < 1) 
			set_Value (COLUMNNAME_C_ExpItems_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExpItems_ID, Integer.valueOf(C_ExpItems_ID));
	}

	/** Get Export Item Name ID.
		@return Export Item Name ID	  */
	public int getC_ExpItems_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExpItems_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_ExpMetal getC_ExpMetal() throws RuntimeException
    {
		return (org.topra.model.I_C_ExpMetal)MTable.get(getCtx(), org.topra.model.I_C_ExpMetal.Table_Name)
			.getPO(getC_ExpMetal_ID(), get_TrxName());	}

	/** Set Metal Name.
		@param C_ExpMetal_ID Metal Name	  */
	public void setC_ExpMetal_ID (int C_ExpMetal_ID)
	{
		if (C_ExpMetal_ID < 1) 
			set_Value (COLUMNNAME_C_ExpMetal_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExpMetal_ID, Integer.valueOf(C_ExpMetal_ID));
	}

	/** Get Metal Name.
		@return Metal Name	  */
	public int getC_ExpMetal_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExpMetal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_ExportNGJA ID.
		@param C_ExportNGJA_ID C_ExportNGJA ID	  */
	public void setC_ExportNGJA_ID (int C_ExportNGJA_ID)
	{
		if (C_ExportNGJA_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ExportNGJA_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ExportNGJA_ID, Integer.valueOf(C_ExportNGJA_ID));
	}

	/** Get C_ExportNGJA ID.
		@return C_ExportNGJA ID	  */
	public int getC_ExportNGJA_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportNGJA_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_ExportNGJALine ID.
		@param C_ExportNGJALine_ID C_ExportNGJALine ID	  */
	public void setC_ExportNGJALine_ID (int C_ExportNGJALine_ID)
	{
		if (C_ExportNGJALine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ExportNGJALine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ExportNGJALine_ID, Integer.valueOf(C_ExportNGJALine_ID));
	}

	/** Get C_ExportNGJALine ID.
		@return C_ExportNGJALine ID	  */
	public int getC_ExportNGJALine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportNGJALine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_JewelleryName getC_JewelleryName() throws RuntimeException
    {
		return (org.topra.model.I_C_JewelleryName)MTable.get(getCtx(), org.topra.model.I_C_JewelleryName.Table_Name)
			.getPO(getC_JewelleryName_ID(), get_TrxName());	}

	/** Set Jewellery Name ID.
		@param C_JewelleryName_ID Jewellery Name ID	  */
	public void setC_JewelleryName_ID (int C_JewelleryName_ID)
	{
		if (C_JewelleryName_ID < 1) 
			set_Value (COLUMNNAME_C_JewelleryName_ID, null);
		else 
			set_Value (COLUMNNAME_C_JewelleryName_ID, Integer.valueOf(C_JewelleryName_ID));
	}

	/** Get Jewellery Name ID.
		@return Jewellery Name ID	  */
	public int getC_JewelleryName_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_JewelleryName_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** ItemType AD_Reference_ID=1000092 */
	public static final int ITEMTYPE_AD_Reference_ID=1000092;
	/** PCS = P */
	public static final String ITEMTYPE_PCS = "P";
	/** Lot = L */
	public static final String ITEMTYPE_Lot = "L";
	/** Set Item Type.
		@param ItemType Item Type	  */
	public void setItemType (String ItemType)
	{

		set_Value (COLUMNNAME_ItemType, ItemType);
	}

	/** Get Item Type.
		@return Item Type	  */
	public String getItemType () 
	{
		return (String)get_Value(COLUMNNAME_ItemType);
	}

	/** JewelleryType AD_Reference_ID=1000116 */
	public static final int JEWELLERYTYPE_AD_Reference_ID=1000116;
	/** Silver = S */
	public static final String JEWELLERYTYPE_Silver = "S";
	/** Gold = G */
	public static final String JEWELLERYTYPE_Gold = "G";
	/** Platinum = P */
	public static final String JEWELLERYTYPE_Platinum = "P";
	/** Other = O */
	public static final String JEWELLERYTYPE_Other = "O";
	/** Set Jewellery Type.
		@param JewelleryType Jewellery Type	  */
	public void setJewelleryType (String JewelleryType)
	{

		set_Value (COLUMNNAME_JewelleryType, JewelleryType);
	}

	/** Get Jewellery Type.
		@return Jewellery Type	  */
	public String getJewelleryType () 
	{
		return (String)get_Value(COLUMNNAME_JewelleryType);
	}

	/** Set Jewellery Weight (Gramm).
		@param JewelleryWeight Jewellery Weight (Gramm)	  */
	public void setJewelleryWeight (BigDecimal JewelleryWeight)
	{
		set_Value (COLUMNNAME_JewelleryWeight, JewelleryWeight);
	}

	/** Get Jewellery Weight (Gramm).
		@return Jewellery Weight (Gramm)	  */
	public BigDecimal getJewelleryWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_JewelleryWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set No Of PCS /LOt/Quantity.
		@param NoOfPCSLOT No Of PCS /LOt/Quantity	  */
	public void setNoOfPCSLOT (int NoOfPCSLOT)
	{
		set_Value (COLUMNNAME_NoOfPCSLOT, Integer.valueOf(NoOfPCSLOT));
	}

	/** Get No Of PCS /LOt/Quantity.
		@return No Of PCS /LOt/Quantity	  */
	public int getNoOfPCSLOT () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfPCSLOT);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** RateMeasureType AD_Reference_ID=1000089 */
	public static final int RATEMEASURETYPE_AD_Reference_ID=1000089;
	/** cts = C */
	public static final String RATEMEASURETYPE_Cts = "C";
	/** Gram = G */
	public static final String RATEMEASURETYPE_Gram = "G";
	/** Kilogram = KG */
	public static final String RATEMEASURETYPE_Kilogram = "KG";
	/** Millimeter = MM */
	public static final String RATEMEASURETYPE_Millimeter = "MM";
	/** Set Rate Measure Type.
		@param RateMeasureType Rate Measure Type	  */
	public void setRateMeasureType (String RateMeasureType)
	{

		set_Value (COLUMNNAME_RateMeasureType, RateMeasureType);
	}

	/** Get Rate Measure Type.
		@return Rate Measure Type	  */
	public String getRateMeasureType () 
	{
		return (String)get_Value(COLUMNNAME_RateMeasureType);
	}

	/** Set Rate Per Unit.
		@param RatePerUnit Rate Per Unit	  */
	public void setRatePerUnit (BigDecimal RatePerUnit)
	{
		set_Value (COLUMNNAME_RatePerUnit, RatePerUnit);
	}

	/** Get Rate Per Unit.
		@return Rate Per Unit	  */
	public BigDecimal getRatePerUnit () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RatePerUnit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set ReturnStatus.
		@param ReturnStatus ReturnStatus	  */
	public void setReturnStatus (String ReturnStatus)
	{
		set_Value (COLUMNNAME_ReturnStatus, ReturnStatus);
	}

	/** Get ReturnStatus.
		@return ReturnStatus	  */
	public String getReturnStatus () 
	{
		return (String)get_Value(COLUMNNAME_ReturnStatus);
	}

	/** Set Stones Weight (Gramm).
		@param StonesWeight Stones Weight (Gramm)	  */
	public void setStonesWeight (BigDecimal StonesWeight)
	{
		set_Value (COLUMNNAME_StonesWeight, StonesWeight);
	}

	/** Get Stones Weight (Gramm).
		@return Stones Weight (Gramm)	  */
	public BigDecimal getStonesWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_StonesWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** WeightCategory AD_Reference_ID=1000123 */
	public static final int WEIGHTCATEGORY_AD_Reference_ID=1000123;
	/** 1-3 cts = OT */
	public static final String WEIGHTCATEGORY_1_3Cts = "OT";
	/** 3-5 cts = TF */
	public static final String WEIGHTCATEGORY_3_5Cts = "TF";
	/** 5-10 cts = FT */
	public static final String WEIGHTCATEGORY_5_10Cts = "FT";
	/** Over 10 cts = OTEN */
	public static final String WEIGHTCATEGORY_Over10Cts = "OTEN";
	/** Set Weight Category.
		@param WeightCategory Weight Category	  */
	public void setWeightCategory (String WeightCategory)
	{

		set_Value (COLUMNNAME_WeightCategory, WeightCategory);
	}

	/** Get Weight Category.
		@return Weight Category	  */
	public String getWeightCategory () 
	{
		return (String)get_Value(COLUMNNAME_WeightCategory);
	}
}