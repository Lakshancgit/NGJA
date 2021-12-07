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

/** Generated Model for C_ExportServiceType
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ExportServiceType extends PO implements I_C_ExportServiceType, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200723L;

    /** Standard Constructor */
    public X_C_ExportServiceType (Properties ctx, int C_ExportServiceType_ID, String trxName)
    {
      super (ctx, C_ExportServiceType_ID, trxName);
      /** if (C_ExportServiceType_ID == 0)
        {
			setC_ExportServiceType_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ExportServiceType (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ExportServiceType[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.topra.model.I_C_ExportItemType getC_ExportItemType() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportItemType)MTable.get(getCtx(), org.topra.model.I_C_ExportItemType.Table_Name)
			.getPO(getC_ExportItemType_ID(), get_TrxName());	}

	/** Set Export Item Types ID.
		@param C_ExportItemType_ID Export Item Types ID	  */
	public void setC_ExportItemType_ID (int C_ExportItemType_ID)
	{
		if (C_ExportItemType_ID < 1) 
			set_Value (COLUMNNAME_C_ExportItemType_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportItemType_ID, Integer.valueOf(C_ExportItemType_ID));
	}

	/** Get Export Item Types ID.
		@return Export Item Types ID	  */
	public int getC_ExportItemType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportItemType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Export Service Types ID.
		@param C_ExportServiceType_ID Export Service Types ID	  */
	public void setC_ExportServiceType_ID (int C_ExportServiceType_ID)
	{
		if (C_ExportServiceType_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ExportServiceType_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ExportServiceType_ID, Integer.valueOf(C_ExportServiceType_ID));
	}

	/** Get Export Service Types ID.
		@return Export Service Types ID	  */
	public int getC_ExportServiceType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportServiceType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DicisionMakingBasedOnAddedValue.
		@param DicisionMakingAddedValue DicisionMakingBasedOnAddedValue	  */
	public void setDicisionMakingAddedValue (BigDecimal DicisionMakingAddedValue)
	{
		set_Value (COLUMNNAME_DicisionMakingAddedValue, DicisionMakingAddedValue);
	}

	/** Get DicisionMakingBasedOnAddedValue.
		@return DicisionMakingBasedOnAddedValue	  */
	public BigDecimal getDicisionMakingAddedValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DicisionMakingAddedValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set DicisionMakingPrice.
		@param DicisionMakingPrice DicisionMakingPrice	  */
	public void setDicisionMakingPrice (BigDecimal DicisionMakingPrice)
	{
		set_Value (COLUMNNAME_DicisionMakingPrice, DicisionMakingPrice);
	}

	/** Get DicisionMakingPrice.
		@return DicisionMakingPrice	  */
	public BigDecimal getDicisionMakingPrice () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_DicisionMakingPrice);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.topra.model.I_C_ExportItemType getExpItemType() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportItemType)MTable.get(getCtx(), org.topra.model.I_C_ExportItemType.Table_Name)
			.getPO(getExpItemType_ID(), get_TrxName());	}

	/** Set Exp Item Type.
		@param ExpItemType_ID Exp Item Type	  */
	public void setExpItemType_ID (int ExpItemType_ID)
	{
		if (ExpItemType_ID < 1) 
			set_Value (COLUMNNAME_ExpItemType_ID, null);
		else 
			set_Value (COLUMNNAME_ExpItemType_ID, Integer.valueOf(ExpItemType_ID));
	}

	/** Get Exp Item Type.
		@return Exp Item Type	  */
	public int getExpItemType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ExpItemType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Fine Percentage Amount.
		@param FinePercentage Fine Percentage Amount	  */
	public void setFinePercentage (BigDecimal FinePercentage)
	{
		set_Value (COLUMNNAME_FinePercentage, FinePercentage);
	}

	/** Get Fine Percentage Amount.
		@return Fine Percentage Amount	  */
	public BigDecimal getFinePercentage () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FinePercentage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FOB.
		@param FOBCal FOB	  */
	public void setFOBCal (boolean FOBCal)
	{
		set_Value (COLUMNNAME_FOBCal, Boolean.valueOf(FOBCal));
	}

	/** Get FOB.
		@return FOB	  */
	public boolean isFOBCal () 
	{
		Object oo = get_Value(COLUMNNAME_FOBCal);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set FOB in Foriegn.
		@param FOBCalForiegn FOB in Foriegn	  */
	public void setFOBCalForiegn (boolean FOBCalForiegn)
	{
		set_Value (COLUMNNAME_FOBCalForiegn, Boolean.valueOf(FOBCalForiegn));
	}

	/** Get FOB in Foriegn.
		@return FOB in Foriegn	  */
	public boolean isFOBCalForiegn () 
	{
		Object oo = get_Value(COLUMNNAME_FOBCalForiegn);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Import Percentage.
		@param ImportPercentage Import Percentage	  */
	public void setImportPercentage (BigDecimal ImportPercentage)
	{
		set_Value (COLUMNNAME_ImportPercentage, ImportPercentage);
	}

	/** Get Import Percentage.
		@return Import Percentage	  */
	public BigDecimal getImportPercentage () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ImportPercentage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Is Imported.
		@param IsImported 
		The record is active in the system
	  */
	public void setIsImported (boolean IsImported)
	{
		set_Value (COLUMNNAME_IsImported, Boolean.valueOf(IsImported));
	}

	/** Get Is Imported.
		@return The record is active in the system
	  */
	public boolean isImported () 
	{
		Object oo = get_Value(COLUMNNAME_IsImported);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Percentage Amount.
		@param PercentageAmount Percentage Amount	  */
	public void setPercentageAmount (BigDecimal PercentageAmount)
	{
		set_Value (COLUMNNAME_PercentageAmount, PercentageAmount);
	}

	/** Get Percentage Amount.
		@return Percentage Amount	  */
	public BigDecimal getPercentageAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PercentageAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Percentage Amount Return.
		@param PercentageAmountReturn Percentage Amount Return	  */
	public void setPercentageAmountReturn (BigDecimal PercentageAmountReturn)
	{
		set_Value (COLUMNNAME_PercentageAmountReturn, PercentageAmountReturn);
	}

	/** Get Percentage Amount Return.
		@return Percentage Amount Return	  */
	public BigDecimal getPercentageAmountReturn () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PercentageAmountReturn);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Quantity Based.
		@param QuantityBased Quantity Based	  */
	public void setQuantityBased (boolean QuantityBased)
	{
		set_Value (COLUMNNAME_QuantityBased, Boolean.valueOf(QuantityBased));
	}

	/** Get Quantity Based.
		@return Quantity Based	  */
	public boolean isQuantityBased () 
	{
		Object oo = get_Value(COLUMNNAME_QuantityBased);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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
}