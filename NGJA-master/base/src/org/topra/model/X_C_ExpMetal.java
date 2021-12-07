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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_ExpMetal
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ExpMetal extends PO implements I_C_ExpMetal, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190213L;

    /** Standard Constructor */
    public X_C_ExpMetal (Properties ctx, int C_ExpMetal_ID, String trxName)
    {
      super (ctx, C_ExpMetal_ID, trxName);
      /** if (C_ExpMetal_ID == 0)
        {
			setC_ExpMetal_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ExpMetal (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ExpMetal[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Metal Name.
		@param C_ExpMetal_ID Metal Name	  */
	public void setC_ExpMetal_ID (int C_ExpMetal_ID)
	{
		if (C_ExpMetal_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ExpMetal_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ExpMetal_ID, Integer.valueOf(C_ExpMetal_ID));
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