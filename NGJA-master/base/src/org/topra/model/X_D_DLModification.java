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

/** Generated Model for D_DLModification
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_D_DLModification extends PO implements I_D_DLModification, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200213L;

    /** Standard Constructor */
    public X_D_DLModification (Properties ctx, int D_DLModification_ID, String trxName)
    {
      super (ctx, D_DLModification_ID, trxName);
      /** if (D_DLModification_ID == 0)
        {
			setD_DLModification_ID (0);
			setUUID (null);
// 0
        } */
    }

    /** Load Constructor */
    public X_D_DLModification (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_D_DLModification[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	public org.topra.model.I_C_DealerFile getC_DealerFile() throws RuntimeException
    {
		return (org.topra.model.I_C_DealerFile)MTable.get(getCtx(), org.topra.model.I_C_DealerFile.Table_Name)
			.getPO(getC_DealerFile_ID(), get_TrxName());	}

	/** Set Dealer File Number ID.
		@param C_DealerFile_ID Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID)
	{
		if (C_DealerFile_ID < 1) 
			set_Value (COLUMNNAME_C_DealerFile_ID, null);
		else 
			set_Value (COLUMNNAME_C_DealerFile_ID, Integer.valueOf(C_DealerFile_ID));
	}

	/** Get Dealer File Number ID.
		@return Dealer File Number ID	  */
	public int getC_DealerFile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DealerFile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Location getC_Location() throws RuntimeException
    {
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_Name)
			.getPO(getC_Location_ID(), get_TrxName());	}

	/** Set Address.
		@param C_Location_ID 
		Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID)
	{
		if (C_Location_ID < 1) 
			set_Value (COLUMNNAME_C_Location_ID, null);
		else 
			set_Value (COLUMNNAME_C_Location_ID, Integer.valueOf(C_Location_ID));
	}

	/** Get Address.
		@return Location or Address
	  */
	public int getC_Location_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_OldBPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_OldBPartner_ID(), get_TrxName());	}

	/** Set C_OldBPartner_ID.
		@param C_OldBPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_OldBPartner_ID (int C_OldBPartner_ID)
	{
		if (C_OldBPartner_ID < 1) 
			set_Value (COLUMNNAME_C_OldBPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_OldBPartner_ID, Integer.valueOf(C_OldBPartner_ID));
	}

	/** Get C_OldBPartner_ID.
		@return Identifies a Business Partner
	  */
	public int getC_OldBPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_OldBPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Location getC_OldLocation() throws RuntimeException
    {
		return (I_C_Location)MTable.get(getCtx(), I_C_Location.Table_Name)
			.getPO(getC_OldLocation_ID(), get_TrxName());	}

	/** Set Address.
		@param C_OldLocation_ID 
		Location or Address
	  */
	public void setC_OldLocation_ID (int C_OldLocation_ID)
	{
		if (C_OldLocation_ID < 1) 
			set_Value (COLUMNNAME_C_OldLocation_ID, null);
		else 
			set_Value (COLUMNNAME_C_OldLocation_ID, Integer.valueOf(C_OldLocation_ID));
	}

	/** Get Address.
		@return Location or Address
	  */
	public int getC_OldLocation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_OldLocation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_D_DealerLicense getD_DealerLicense() throws RuntimeException
    {
		return (org.topra.model.I_D_DealerLicense)MTable.get(getCtx(), org.topra.model.I_D_DealerLicense.Table_Name)
			.getPO(getD_DealerLicense_ID(), get_TrxName());	}

	/** Set Gem Dealer License ID.
		@param D_DealerLicense_ID Gem Dealer License ID	  */
	public void setD_DealerLicense_ID (int D_DealerLicense_ID)
	{
		if (D_DealerLicense_ID < 1) 
			set_Value (COLUMNNAME_D_DealerLicense_ID, null);
		else 
			set_Value (COLUMNNAME_D_DealerLicense_ID, Integer.valueOf(D_DealerLicense_ID));
	}

	/** Get Gem Dealer License ID.
		@return Gem Dealer License ID	  */
	public int getD_DealerLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_D_DealerLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set D_DLModification ID.
		@param D_DLModification_ID D_DLModification ID	  */
	public void setD_DLModification_ID (int D_DLModification_ID)
	{
		if (D_DLModification_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_D_DLModification_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_D_DLModification_ID, Integer.valueOf(D_DLModification_ID));
	}

	/** Get D_DLModification ID.
		@return D_DLModification ID	  */
	public int getD_DLModification_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_D_DLModification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_D_DealerLicense getD_NDealerLicense() throws RuntimeException
    {
		return (org.topra.model.I_D_DealerLicense)MTable.get(getCtx(), org.topra.model.I_D_DealerLicense.Table_Name)
			.getPO(getD_NDealerLicense_ID(), get_TrxName());	}

	/** Set D_NDealerLicense_ID.
		@param D_NDealerLicense_ID D_NDealerLicense_ID	  */
	public void setD_NDealerLicense_ID (int D_NDealerLicense_ID)
	{
		if (D_NDealerLicense_ID < 1) 
			set_Value (COLUMNNAME_D_NDealerLicense_ID, null);
		else 
			set_Value (COLUMNNAME_D_NDealerLicense_ID, Integer.valueOf(D_NDealerLicense_ID));
	}

	/** Get D_NDealerLicense_ID.
		@return D_NDealerLicense_ID	  */
	public int getD_NDealerLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_D_NDealerLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Gem Stock Value.
		@param gem_stock_value Gem Stock Value	  */
	public void setgem_stock_value (int gem_stock_value)
	{
		set_Value (COLUMNNAME_gem_stock_value, Integer.valueOf(gem_stock_value));
	}

	/** Get Gem Stock Value.
		@return Gem Stock Value	  */
	public int getgem_stock_value () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_gem_stock_value);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set IsDLMtypeAddress.
		@param IsDLMtypeAddress IsDLMtypeAddress	  */
	public void setIsDLMtypeAddress (boolean IsDLMtypeAddress)
	{
		set_Value (COLUMNNAME_IsDLMtypeAddress, Boolean.valueOf(IsDLMtypeAddress));
	}

	/** Get IsDLMtypeAddress.
		@return IsDLMtypeAddress	  */
	public boolean isDLMtypeAddress () 
	{
		Object oo = get_Value(COLUMNNAME_IsDLMtypeAddress);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsDLMtypeName.
		@param IsDLMtypeName IsDLMtypeName	  */
	public void setIsDLMtypeName (boolean IsDLMtypeName)
	{
		set_Value (COLUMNNAME_IsDLMtypeName, Boolean.valueOf(IsDLMtypeName));
	}

	/** Get IsDLMtypeName.
		@return IsDLMtypeName	  */
	public boolean isDLMtypeName () 
	{
		Object oo = get_Value(COLUMNNAME_IsDLMtypeName);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsDLMtypeStock.
		@param IsDLMtypeStock IsDLMtypeStock	  */
	public void setIsDLMtypeStock (boolean IsDLMtypeStock)
	{
		set_Value (COLUMNNAME_IsDLMtypeStock, Boolean.valueOf(IsDLMtypeStock));
	}

	/** Get IsDLMtypeStock.
		@return IsDLMtypeStock	  */
	public boolean isDLMtypeStock () 
	{
		Object oo = get_Value(COLUMNNAME_IsDLMtypeStock);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Old Stock Value.
		@param OldStockValue Old Stock Value	  */
	public void setOldStockValue (int OldStockValue)
	{
		set_Value (COLUMNNAME_OldStockValue, Integer.valueOf(OldStockValue));
	}

	/** Get Old Stock Value.
		@return Old Stock Value	  */
	public int getOldStockValue () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_OldStockValue);
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