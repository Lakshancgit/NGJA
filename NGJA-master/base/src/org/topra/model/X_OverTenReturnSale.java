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

/** Generated Model for OverTenReturnSale
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_OverTenReturnSale extends PO implements I_OverTenReturnSale, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190321L;

    /** Standard Constructor */
    public X_OverTenReturnSale (Properties ctx, int OverTenReturnSale_ID, String trxName)
    {
      super (ctx, OverTenReturnSale_ID, trxName);
      /** if (OverTenReturnSale_ID == 0)
        {
			setC_OverTen_ID (0);
			setOverTenReturnSale_ID (0);
        } */
    }

    /** Load Constructor */
    public X_OverTenReturnSale (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_OverTenReturnSale[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Breadth.
		@param Breadth Breadth	  */
	public void setBreadth (String Breadth)
	{
		set_Value (COLUMNNAME_Breadth, Breadth);
	}

	/** Get Breadth.
		@return Breadth	  */
	public String getBreadth () 
	{
		return (String)get_Value(COLUMNNAME_Breadth);
	}

	public org.topra.model.I_C_Color getC_Color() throws RuntimeException
    {
		return (org.topra.model.I_C_Color)MTable.get(getCtx(), org.topra.model.I_C_Color.Table_Name)
			.getPO(getC_Color_ID(), get_TrxName());	}

	/** Set Color.
		@param C_Color_ID Color	  */
	public void setC_Color_ID (int C_Color_ID)
	{
		if (C_Color_ID < 1) 
			set_Value (COLUMNNAME_C_Color_ID, null);
		else 
			set_Value (COLUMNNAME_C_Color_ID, Integer.valueOf(C_Color_ID));
	}

	/** Get Color.
		@return Color	  */
	public int getC_Color_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Color_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

//	public I_C_GemItems getC_GemItems() throws RuntimeException
//    {
//		return (I_C_GemItems)MTable.get(getCtx(), I_C_GemItems.Table_Name)
//			.getPO(getC_GemItems_ID(), get_TrxName());	}

	/** Set Item Name.
		@param C_GemItems_ID Item Name	  */
	public void setC_GemItems_ID (int C_GemItems_ID)
	{
		if (C_GemItems_ID < 1) 
			set_Value (COLUMNNAME_C_GemItems_ID, null);
		else 
			set_Value (COLUMNNAME_C_GemItems_ID, Integer.valueOf(C_GemItems_ID));
	}

	/** Get Item Name.
		@return Item Name	  */
	public int getC_GemItems_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_GemItems_ID);
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

	public org.topra.model.I_C_Shape getC_Shape() throws RuntimeException
    {
		return (org.topra.model.I_C_Shape)MTable.get(getCtx(), org.topra.model.I_C_Shape.Table_Name)
			.getPO(getC_Shape_ID(), get_TrxName());	}

	/** Set Shape.
		@param C_Shape_ID Shape	  */
	public void setC_Shape_ID (int C_Shape_ID)
	{
		if (C_Shape_ID < 1) 
			set_Value (COLUMNNAME_C_Shape_ID, null);
		else 
			set_Value (COLUMNNAME_C_Shape_ID, Integer.valueOf(C_Shape_ID));
	}

	/** Get Shape.
		@return Shape	  */
	public int getC_Shape_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Shape_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Customer Entered Weight.
		@param CusEnteredWeight Customer Entered Weight	  */
	public void setCusEnteredWeight (BigDecimal CusEnteredWeight)
	{
		set_Value (COLUMNNAME_CusEnteredWeight, CusEnteredWeight);
	}

	/** Get Customer Entered Weight.
		@return Customer Entered Weight	  */
	public BigDecimal getCusEnteredWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CusEnteredWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.topra.model.I_C_ExportNGJALine getDescript() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportNGJALine)MTable.get(getCtx(), org.topra.model.I_C_ExportNGJALine.Table_Name)
			.getPO(getDescription(), get_TrxName());	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (int Description)
	{
		set_Value (COLUMNNAME_Description, Integer.valueOf(Description));
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public int getDescription () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Description);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description Of the Inclutions.
		@param DesOfIclusions Description Of the Inclutions	  */
	public void setDesOfIclusions (String DesOfIclusions)
	{
		set_Value (COLUMNNAME_DesOfIclusions, DesOfIclusions);
	}

	/** Get Description Of the Inclutions.
		@return Description Of the Inclutions	  */
	public String getDesOfIclusions () 
	{
		return (String)get_Value(COLUMNNAME_DesOfIclusions);
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

	/** Set Height.
		@param Height Height	  */
	public void setHeight (String Height)
	{
		set_Value (COLUMNNAME_Height, Height);
	}

	/** Get Height.
		@return Height	  */
	public String getHeight () 
	{
		return (String)get_Value(COLUMNNAME_Height);
	}

	/** Set Length.
		@param Length Length	  */
	public void setLength (String Length)
	{
		set_Value (COLUMNNAME_Length, Length);
	}

	/** Get Length.
		@return Length	  */
	public String getLength () 
	{
		return (String)get_Value(COLUMNNAME_Length);
	}

	/** Set Over Ten Return & Sale ID.
		@param OverTenReturnSale_ID Over Ten Return & Sale ID	  */
	public void setOverTenReturnSale_ID (int OverTenReturnSale_ID)
	{
		if (OverTenReturnSale_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_OverTenReturnSale_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_OverTenReturnSale_ID, Integer.valueOf(OverTenReturnSale_ID));
	}

	/** Get Over Ten Return & Sale ID.
		@return Over Ten Return & Sale ID	  */
	public int getOverTenReturnSale_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_OverTenReturnSale_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Returned Weight.
		@param ReturnedWeight Returned Weight	  */
	public void setReturnedWeight (BigDecimal ReturnedWeight)
	{
		set_Value (COLUMNNAME_ReturnedWeight, ReturnedWeight);
	}

	/** Get Returned Weight.
		@return Returned Weight	  */
	public BigDecimal getReturnedWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ReturnedWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Variance Of Weight.
		@param VarianceOfWweight Variance Of Weight	  */
	public void setVarianceOfWweight (BigDecimal VarianceOfWweight)
	{
		set_Value (COLUMNNAME_VarianceOfWweight, VarianceOfWweight);
	}

	/** Get Variance Of Weight.
		@return Variance Of Weight	  */
	public BigDecimal getVarianceOfWweight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_VarianceOfWweight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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
}