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

/** Generated Model for ExpReturnSaleLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_ExpReturnSaleLine extends PO implements I_ExpReturnSaleLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190321L;

    /** Standard Constructor */
    public X_ExpReturnSaleLine (Properties ctx, int ExpReturnSaleLine_ID, String trxName)
    {
      super (ctx, ExpReturnSaleLine_ID, trxName);
      /** if (ExpReturnSaleLine_ID == 0)
        {
			setC_ExportNGJALine_ID (0);
			setExpReturnSaleLine_ID (0);
			setReturnedQuantity (0);
			setReturnedTotalWeight (Env.ZERO);
			setReturnSale (null);
        } */
    }

    /** Load Constructor */
    public X_ExpReturnSaleLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_ExpReturnSaleLine[")
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

	public org.topra.model.I_C_ExportNGJALine getC_ExportNGJALine() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportNGJALine)MTable.get(getCtx(), org.topra.model.I_C_ExportNGJALine.Table_Name)
			.getPO(getC_ExportNGJALine_ID(), get_TrxName());	}

	/** Set C_ExportNGJALine ID.
		@param C_ExportNGJALine_ID C_ExportNGJALine ID	  */
	public void setC_ExportNGJALine_ID (int C_ExportNGJALine_ID)
	{
		if (C_ExportNGJALine_ID < 1) 
			set_Value (COLUMNNAME_C_ExportNGJALine_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportNGJALine_ID, Integer.valueOf(C_ExportNGJALine_ID));
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

	public org.topra.model.I_C_OverTen getC_OverTen() throws RuntimeException
    {
		return (org.topra.model.I_C_OverTen)MTable.get(getCtx(), org.topra.model.I_C_OverTen.Table_Name)
			.getPO(getC_OverTen_ID(), get_TrxName());	}

	/** Set C_OverTen ID.
		@param C_OverTen_ID C_OverTen ID	  */
	public void setC_OverTen_ID (int C_OverTen_ID)
	{
		if (C_OverTen_ID < 1) 
			set_Value (COLUMNNAME_C_OverTen_ID, null);
		else 
			set_Value (COLUMNNAME_C_OverTen_ID, Integer.valueOf(C_OverTen_ID));
	}

	/** Get C_OverTen ID.
		@return C_OverTen ID	  */
	public int getC_OverTen_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_OverTen_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ExpFineStatus AD_Reference_ID=1000138 */
	public static final int EXPFINESTATUS_AD_Reference_ID=1000138;
	/** Fined = F */
	public static final String EXPFINESTATUS_Fined = "F";
	/** Set Exp Fine Status.
		@param ExpFineStatus Exp Fine Status	  */
	public void setExpFineStatus (String ExpFineStatus)
	{

		set_Value (COLUMNNAME_ExpFineStatus, ExpFineStatus);
	}

	/** Get Exp Fine Status.
		@return Exp Fine Status	  */
	public String getExpFineStatus () 
	{
		return (String)get_Value(COLUMNNAME_ExpFineStatus);
	}

	/** Set Export Return & Sale ID.
		@param ExpReturnSale_ID Export Return & Sale ID	  */
	public void setExpReturnSale_ID (int ExpReturnSale_ID)
	{
		if (ExpReturnSale_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ExpReturnSale_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ExpReturnSale_ID, Integer.valueOf(ExpReturnSale_ID));
	}

	/** Get Export Return & Sale ID.
		@return Export Return & Sale ID	  */
	public int getExpReturnSale_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ExpReturnSale_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Export Return & Sale Line ID.
		@param ExpReturnSaleLine_ID Export Return & Sale Line ID	  */
	public void setExpReturnSaleLine_ID (int ExpReturnSaleLine_ID)
	{
		if (ExpReturnSaleLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ExpReturnSaleLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ExpReturnSaleLine_ID, Integer.valueOf(ExpReturnSaleLine_ID));
	}

	/** Get Export Return & Sale Line ID.
		@return Export Return & Sale Line ID	  */
	public int getExpReturnSaleLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ExpReturnSaleLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Item Value In Foreign.
		@param ItemValueInForeign Item Value In Foreign	  */
	public void setItemValueInForeign (BigDecimal ItemValueInForeign)
	{
		set_Value (COLUMNNAME_ItemValueInForeign, ItemValueInForeign);
	}

	/** Get Item Value In Foreign.
		@return Item Value In Foreign	  */
	public BigDecimal getItemValueInForeign () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ItemValueInForeign);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Item Value In Rs.
		@param ItemValueInRs Item Value In Rs	  */
	public void setItemValueInRs (BigDecimal ItemValueInRs)
	{
		set_Value (COLUMNNAME_ItemValueInRs, ItemValueInRs);
	}

	/** Get Item Value In Rs.
		@return Item Value In Rs	  */
	public BigDecimal getItemValueInRs () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ItemValueInRs);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** RateMeasureType AD_Reference_ID=1000093 */
	public static final int RATEMEASURETYPE_AD_Reference_ID=1000093;
	/** cts = C */
	public static final String RATEMEASURETYPE_Cts = "C";
	/** PCS = P */
	public static final String RATEMEASURETYPE_PCS = "P";
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

	/** Set ReturnedQuantity.
		@param ReturnedQuantity ReturnedQuantity	  */
	public void setReturnedQuantity (int ReturnedQuantity)
	{
		set_Value (COLUMNNAME_ReturnedQuantity, Integer.valueOf(ReturnedQuantity));
	}

	/** Get ReturnedQuantity.
		@return ReturnedQuantity	  */
	public int getReturnedQuantity () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ReturnedQuantity);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ReturnedTotalWeight.
		@param ReturnedTotalWeight ReturnedTotalWeight	  */
	public void setReturnedTotalWeight (BigDecimal ReturnedTotalWeight)
	{
		set_Value (COLUMNNAME_ReturnedTotalWeight, ReturnedTotalWeight);
	}

	/** Get ReturnedTotalWeight.
		@return ReturnedTotalWeight	  */
	public BigDecimal getReturnedTotalWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ReturnedTotalWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** ReturnSale AD_Reference_ID=1000130 */
	public static final int RETURNSALE_AD_Reference_ID=1000130;
	/** Return = R */
	public static final String RETURNSALE_Return = "R";
	/** Sale = S */
	public static final String RETURNSALE_Sale = "S";
	/** Set Return/Sale.
		@param ReturnSale Return/Sale	  */
	public void setReturnSale (String ReturnSale)
	{

		set_Value (COLUMNNAME_ReturnSale, ReturnSale);
	}

	/** Get Return/Sale.
		@return Return/Sale	  */
	public String getReturnSale () 
	{
		return (String)get_Value(COLUMNNAME_ReturnSale);
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
	/** Below One (Precision/Calibrated) = BO */
	public static final String WEIGHTCATEGORY_BelowOnePrecisionCalibrated = "BO";
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