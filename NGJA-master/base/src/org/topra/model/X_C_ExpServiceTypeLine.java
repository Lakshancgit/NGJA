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

/** Generated Model for C_ExpServiceTypeLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ExpServiceTypeLine extends PO implements I_C_ExpServiceTypeLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190122L;

    /** Standard Constructor */
    public X_C_ExpServiceTypeLine (Properties ctx, int C_ExpServiceTypeLine_ID, String trxName)
    {
      super (ctx, C_ExpServiceTypeLine_ID, trxName);
      /** if (C_ExpServiceTypeLine_ID == 0)
        {
			setC_ExpServiceTypeLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ExpServiceTypeLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ExpServiceTypeLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Export Service Types ID.
		@param C_ExportServiceType_ID Export Service Types ID	  */
	public void setC_ExportServiceType_ID (int C_ExportServiceType_ID)
	{
		if (C_ExportServiceType_ID < 1) 
			set_Value (COLUMNNAME_C_ExportServiceType_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportServiceType_ID, Integer.valueOf(C_ExportServiceType_ID));
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

	/** Set Export Service Type Line ID.
		@param C_ExpServiceTypeLine_ID Export Service Type Line ID	  */
	public void setC_ExpServiceTypeLine_ID (int C_ExpServiceTypeLine_ID)
	{
		if (C_ExpServiceTypeLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ExpServiceTypeLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ExpServiceTypeLine_ID, Integer.valueOf(C_ExpServiceTypeLine_ID));
	}

	/** Get Export Service Type Line ID.
		@return Export Service Type Line ID	  */
	public int getC_ExpServiceTypeLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExpServiceTypeLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Is Percentage.
		@param IsPercentage 
		Indicates that Quantity is expressed as Percentage (%)
	  */
	public void setIsPercentage (boolean IsPercentage)
	{
		set_Value (COLUMNNAME_IsPercentage, Boolean.valueOf(IsPercentage));
	}

	/** Get Is Percentage.
		@return Indicates that Quantity is expressed as Percentage (%)
	  */
	public boolean isPercentage () 
	{
		Object oo = get_Value(COLUMNNAME_IsPercentage);
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

	/** Set Description.
		@param productname 
		Optional short description of the record
	  */
	public void setproductname (String productname)
	{
		set_Value (COLUMNNAME_productname, productname);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getproductname () 
	{
		return (String)get_Value(COLUMNNAME_productname);
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