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

/** Generated Model for C_AuctionLicenseSinhala
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_AuctionLicenseSinhala extends PO implements I_C_AuctionLicenseSinhala, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190326L;

    /** Standard Constructor */
    public X_C_AuctionLicenseSinhala (Properties ctx, int C_AuctionLicenseSinhala_ID, String trxName)
    {
      super (ctx, C_AuctionLicenseSinhala_ID, trxName);
      /** if (C_AuctionLicenseSinhala_ID == 0)
        {
			setC_AuctionLicenseSinhala_ID (0);
			setUUID (null);
// 0
        } */
    }

    /** Load Constructor */
    public X_C_AuctionLicenseSinhala (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_AuctionLicenseSinhala[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AuctionLicense ID.
		@param C_AuctionLicense_ID AuctionLicense ID	  */
	public void setC_AuctionLicense_ID (int C_AuctionLicense_ID)
	{
		if (C_AuctionLicense_ID < 1) 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, null);
		else 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, Integer.valueOf(C_AuctionLicense_ID));
	}

	/** Get AuctionLicense ID.
		@return AuctionLicense ID	  */
	public int getC_AuctionLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AuctionLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Auction License - Sinhala ID.
		@param C_AuctionLicenseSinhala_ID Auction License - Sinhala ID	  */
	public void setC_AuctionLicenseSinhala_ID (int C_AuctionLicenseSinhala_ID)
	{
		if (C_AuctionLicenseSinhala_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_AuctionLicenseSinhala_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_AuctionLicenseSinhala_ID, Integer.valueOf(C_AuctionLicenseSinhala_ID));
	}

	/** Get Auction License - Sinhala ID.
		@return Auction License - Sinhala ID	  */
	public int getC_AuctionLicenseSinhala_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AuctionLicenseSinhala_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Confirm.
		@param DateConfirm 
		Date Confirm of this Order
	  */
	public void setDateConfirm (String DateConfirm)
	{
		set_Value (COLUMNNAME_DateConfirm, DateConfirm);
	}

	/** Get Date Confirm.
		@return Date Confirm of this Order
	  */
	public String getDateConfirm () 
	{
		return (String)get_Value(COLUMNNAME_DateConfirm);
	}

	/** Set Address 1.
		@param Location 
		Address line 1 for this location
	  */
	public void setLocation (String Location)
	{
		set_Value (COLUMNNAME_Location, Location);
	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getLocation () 
	{
		return (String)get_Value(COLUMNNAME_Location);
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

	/** Set Residence.
		@param Residence Residence	  */
	public void setResidence (String Residence)
	{
		set_Value (COLUMNNAME_Residence, Residence);
	}

	/** Get Residence.
		@return Residence	  */
	public String getResidence () 
	{
		return (String)get_Value(COLUMNNAME_Residence);
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