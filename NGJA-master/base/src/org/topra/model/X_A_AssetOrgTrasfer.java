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

/** Generated Model for A_AssetOrgTrasfer
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_A_AssetOrgTrasfer extends PO implements I_A_AssetOrgTrasfer, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200608L;

    /** Standard Constructor */
    public X_A_AssetOrgTrasfer (Properties ctx, int A_AssetOrgTrasfer_ID, String trxName)
    {
      super (ctx, A_AssetOrgTrasfer_ID, trxName);
      /** if (A_AssetOrgTrasfer_ID == 0)
        {
			setA_AssetOrgTrasfer_ID (0);
			setUUID (null);
        } */
    }

    /** Load Constructor */
    public X_A_AssetOrgTrasfer (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_A_AssetOrgTrasfer[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_A_Asset getA_Asset() throws RuntimeException
    {
		return (org.compiere.model.I_A_Asset)MTable.get(getCtx(), org.compiere.model.I_A_Asset.Table_Name)
			.getPO(getA_Asset_ID(), get_TrxName());	}

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_Value (COLUMNNAME_A_Asset_ID, null);
		else 
			set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_AssetOrgTrasfer ID.
		@param A_AssetOrgTrasfer_ID A_AssetOrgTrasfer ID	  */
	public void setA_AssetOrgTrasfer_ID (int A_AssetOrgTrasfer_ID)
	{
		if (A_AssetOrgTrasfer_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_A_AssetOrgTrasfer_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_A_AssetOrgTrasfer_ID, Integer.valueOf(A_AssetOrgTrasfer_ID));
	}

	/** Get A_AssetOrgTrasfer ID.
		@return A_AssetOrgTrasfer ID	  */
	public int getA_AssetOrgTrasfer_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_AssetOrgTrasfer_ID);
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

	/** Set Organization.
		@param NewOrg_ID 
		Organizational entity within client
	  */
	public void setNewOrg_ID (int NewOrg_ID)
	{
		if (NewOrg_ID < 1) 
			set_Value (COLUMNNAME_NewOrg_ID, null);
		else 
			set_Value (COLUMNNAME_NewOrg_ID, Integer.valueOf(NewOrg_ID));
	}

	/** Get Organization.
		@return Organizational entity within client
	  */
	public int getNewOrg_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NewOrg_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Process.
		@param ProcessDocument Process	  */
	public void setProcessDocument (String ProcessDocument)
	{
		set_Value (COLUMNNAME_ProcessDocument, ProcessDocument);
	}

	/** Get Process.
		@return Process	  */
	public String getProcessDocument () 
	{
		return (String)get_Value(COLUMNNAME_ProcessDocument);
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