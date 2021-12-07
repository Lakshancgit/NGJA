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

/** Generated Model for C_JewelleryName
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_JewelleryName extends PO implements I_C_JewelleryName, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190213L;

    /** Standard Constructor */
    public X_C_JewelleryName (Properties ctx, int C_JewelleryName_ID, String trxName)
    {
      super (ctx, C_JewelleryName_ID, trxName);
      /** if (C_JewelleryName_ID == 0)
        {
			setC_JewelleryName_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_JewelleryName (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_JewelleryName[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Jewellery Name ID.
		@param C_JewelleryName_ID Jewellery Name ID	  */
	public void setC_JewelleryName_ID (int C_JewelleryName_ID)
	{
		if (C_JewelleryName_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_JewelleryName_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_JewelleryName_ID, Integer.valueOf(C_JewelleryName_ID));
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