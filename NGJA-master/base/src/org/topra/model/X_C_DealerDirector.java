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

/** Generated Model for C_DealerDirector
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_DealerDirector extends PO implements I_C_DealerDirector, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190819L;

    /** Standard Constructor */
    public X_C_DealerDirector (Properties ctx, int C_DealerDirector_ID, String trxName)
    {
      super (ctx, C_DealerDirector_ID, trxName);
      /** if (C_DealerDirector_ID == 0)
        {
			setC_DealerDirector_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_DealerDirector (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_DealerDirector[")
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
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
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

	/** Set DealerDirectorDetails ID.
		@param C_DealerDirector_ID DealerDirectorDetails ID	  */
	public void setC_DealerDirector_ID (int C_DealerDirector_ID)
	{
		if (C_DealerDirector_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_DealerDirector_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_DealerDirector_ID, Integer.valueOf(C_DealerDirector_ID));
	}

	/** Get DealerDirectorDetails ID.
		@return DealerDirectorDetails ID	  */
	public int getC_DealerDirector_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DealerDirector_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Dealer File Number ID.
		@param C_DealerFile_ID Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID)
	{
		if (C_DealerFile_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_DealerFile_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_DealerFile_ID, Integer.valueOf(C_DealerFile_ID));
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

	/** Set Director Name.
		@param DirectorName Director Name	  */
	public void setDirectorName (String DirectorName)
	{
		set_Value (COLUMNNAME_DirectorName, DirectorName);
	}

	/** Get Director Name.
		@return Director Name	  */
	public String getDirectorName () 
	{
		return (String)get_Value(COLUMNNAME_DirectorName);
	}

	/** Set Director Name2.
		@param DirectorName2 Director Name2	  */
	public void setDirectorName2 (String DirectorName2)
	{
		set_Value (COLUMNNAME_DirectorName2, DirectorName2);
	}

	/** Get Director Name2.
		@return Director Name2	  */
	public String getDirectorName2 () 
	{
		return (String)get_Value(COLUMNNAME_DirectorName2);
	}

	/** Set DirectorNIC.
		@param DirectorNIC DirectorNIC	  */
	public void setDirectorNIC (String DirectorNIC)
	{
		set_Value (COLUMNNAME_DirectorNIC, DirectorNIC);
	}

	/** Get DirectorNIC.
		@return DirectorNIC	  */
	public String getDirectorNIC () 
	{
		return (String)get_Value(COLUMNNAME_DirectorNIC);
	}

	/** Set FileNo.
		@param FileNo FileNo	  */
	public void setFileNo (String FileNo)
	{
		throw new IllegalArgumentException ("FileNo is virtual column");	}

	/** Get FileNo.
		@return FileNo	  */
	public String getFileNo () 
	{
		return (String)get_Value(COLUMNNAME_FileNo);
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