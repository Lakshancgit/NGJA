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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_LicenseFineFees
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_LicenseFineFees extends PO implements I_C_LicenseFineFees, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190218L;

    /** Standard Constructor */
    public X_C_LicenseFineFees (Properties ctx, int C_LicenseFineFees_ID, String trxName)
    {
      super (ctx, C_LicenseFineFees_ID, trxName);
      /** if (C_LicenseFineFees_ID == 0)
        {
			setC_LicenseFineFees_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_LicenseFineFees (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_LicenseFineFees[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set GemMininig ID.
		@param C_GemMining_ID GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID)
	{
		if (C_GemMining_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_GemMining_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_GemMining_ID, Integer.valueOf(C_GemMining_ID));
	}

	/** Get GemMininig ID.
		@return GemMininig ID	  */
	public int getC_GemMining_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_GemMining_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
    {
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_Name)
			.getPO(getC_Invoice_ID(), get_TrxName());	}

	/** Set Invoice.
		@param C_Invoice_ID 
		Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1) 
			set_Value (COLUMNNAME_C_Invoice_ID, null);
		else 
			set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_LicenseFineFees ID.
		@param C_LicenseFineFees_ID C_LicenseFineFees ID	  */
	public void setC_LicenseFineFees_ID (int C_LicenseFineFees_ID)
	{
		if (C_LicenseFineFees_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_LicenseFineFees_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_LicenseFineFees_ID, Integer.valueOf(C_LicenseFineFees_ID));
	}

	/** Get C_LicenseFineFees ID.
		@return C_LicenseFineFees ID	  */
	public int getC_LicenseFineFees_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LicenseFineFees_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date.
		@param Date1 
		Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set FineStatus.
		@param FineStatus FineStatus	  */
	public void setFineStatus (String FineStatus)
	{
		set_Value (COLUMNNAME_FineStatus, FineStatus);
	}

	/** Get FineStatus.
		@return FineStatus	  */
	public String getFineStatus () 
	{
		return (String)get_Value(COLUMNNAME_FineStatus);
	}

	/** Set Paid.
		@param IsPaid 
		The document is paid
	  */
	public void setIsPaid (boolean IsPaid)
	{
		set_Value (COLUMNNAME_IsPaid, Boolean.valueOf(IsPaid));
	}

	/** Get Paid.
		@return The document is paid
	  */
	public boolean isPaid () 
	{
		Object oo = get_Value(COLUMNNAME_IsPaid);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set NoOfFine.
		@param NoOfFine NoOfFine	  */
	public void setNoOfFine (int NoOfFine)
	{
		set_Value (COLUMNNAME_NoOfFine, Integer.valueOf(NoOfFine));
	}

	/** Get NoOfFine.
		@return NoOfFine	  */
	public int getNoOfFine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfFine);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set ViewRecord.
		@param ViewRecord ViewRecord	  */
	public void setViewRecord (String ViewRecord)
	{
		set_Value (COLUMNNAME_ViewRecord, ViewRecord);
	}

	/** Get ViewRecord.
		@return ViewRecord	  */
	public String getViewRecord () 
	{
		return (String)get_Value(COLUMNNAME_ViewRecord);
	}

	/** Set ZoomRecord.
		@param ZoomRecord ZoomRecord	  */
	public void setZoomRecord (String ZoomRecord)
	{
		set_Value (COLUMNNAME_ZoomRecord, ZoomRecord);
	}

	/** Get ZoomRecord.
		@return ZoomRecord	  */
	public String getZoomRecord () 
	{
		return (String)get_Value(COLUMNNAME_ZoomRecord);
	}
}