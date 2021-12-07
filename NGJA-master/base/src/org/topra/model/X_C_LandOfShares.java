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

/** Generated Model for C_LandOfShares
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_LandOfShares extends PO implements I_C_LandOfShares, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190507L;

    /** Standard Constructor */
    public X_C_LandOfShares (Properties ctx, int C_LandOfShares_ID, String trxName)
    {
      super (ctx, C_LandOfShares_ID, trxName);
      /** if (C_LandOfShares_ID == 0)
        {
			setC_LandOfShares_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_LandOfShares (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_LandOfShares[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.topra.model.I_C_AuctionLicense getC_AuctionLicense() throws RuntimeException
    {
		return (org.topra.model.I_C_AuctionLicense)MTable.get(getCtx(), org.topra.model.I_C_AuctionLicense.Table_Name)
			.getPO(getC_AuctionLicense_ID(), get_TrxName());	}

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

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LandOfShares ID.
		@param C_LandOfShares_ID LandOfShares ID	  */
	public void setC_LandOfShares_ID (int C_LandOfShares_ID)
	{
		if (C_LandOfShares_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_LandOfShares_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_LandOfShares_ID, Integer.valueOf(C_LandOfShares_ID));
	}

	/** Get LandOfShares ID.
		@return LandOfShares ID	  */
	public int getC_LandOfShares_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandOfShares_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Status AD_Reference_ID=1000166 */
	public static final int STATUS_AD_Reference_ID=1000166;
	/** Prepare = P */
	public static final String STATUS_Prepare = "P";
	/** Send For IO App = IO */
	public static final String STATUS_SendForIOApp = "IO";
	/** Send For RM APP = RM */
	public static final String STATUS_SendForRMAPP = "RM";
	/** Active = A */
	public static final String STATUS_Active = "A";
	/** Set Status.
		@param Status 
		Status of the currently running check
	  */
	public void setStatus (String Status)
	{

		set_Value (COLUMNNAME_Status, Status);
	}

	/** Get Status.
		@return Status of the currently running check
	  */
	public String getStatus () 
	{
		return (String)get_Value(COLUMNNAME_Status);
	}

	/** Set TotalGemSale.
		@param TotalGemSale TotalGemSale	  */
	public void setTotalGemSale (BigDecimal TotalGemSale)
	{
		set_Value (COLUMNNAME_TotalGemSale, TotalGemSale);
	}

	/** Get TotalGemSale.
		@return TotalGemSale	  */
	public BigDecimal getTotalGemSale () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalGemSale);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set TotalGemValue.
		@param TotalGemValue TotalGemValue	  */
	public void setTotalGemValue (BigDecimal TotalGemValue)
	{
		set_Value (COLUMNNAME_TotalGemValue, TotalGemValue);
	}

	/** Get TotalGemValue.
		@return TotalGemValue	  */
	public BigDecimal getTotalGemValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalGemValue);
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
}