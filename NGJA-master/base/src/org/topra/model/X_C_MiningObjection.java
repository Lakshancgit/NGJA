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

/** Generated Model for C_MiningObjection
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_MiningObjection extends PO implements I_C_MiningObjection, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190402L;

    /** Standard Constructor */
    public X_C_MiningObjection (Properties ctx, int C_MiningObjection_ID, String trxName)
    {
      super (ctx, C_MiningObjection_ID, trxName);
      /** if (C_MiningObjection_ID == 0)
        {
			setC_MiningObjection_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_MiningObjection (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_MiningObjection[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set GemMininig ID.
		@param C_GemMining_ID GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID)
	{
		if (C_GemMining_ID < 1) 
			set_Value (COLUMNNAME_C_GemMining_ID, null);
		else 
			set_Value (COLUMNNAME_C_GemMining_ID, Integer.valueOf(C_GemMining_ID));
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

	/** Set Land Details ID.
		@param C_LandDetails_ID Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID)
	{
		if (C_LandDetails_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_LandDetails_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_LandDetails_ID, Integer.valueOf(C_LandDetails_ID));
	}

	/** Get Land Details ID.
		@return Land Details ID	  */
	public int getC_LandDetails_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandDetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ObjectionHandeling ID.
		@param C_MiningObjection_ID ObjectionHandeling ID	  */
	public void setC_MiningObjection_ID (int C_MiningObjection_ID)
	{
		if (C_MiningObjection_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MiningObjection_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MiningObjection_ID, Integer.valueOf(C_MiningObjection_ID));
	}

	/** Get ObjectionHandeling ID.
		@return ObjectionHandeling ID	  */
	public int getC_MiningObjection_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MiningObjection_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comments.
		@param Comments 
		Comments or additional information
	  */
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments () 
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** ISObjection AD_Reference_ID=1000102 */
	public static final int ISOBJECTION_AD_Reference_ID=1000102;
	/** Yes = Y */
	public static final String ISOBJECTION_Yes = "Y";
	/** No = N */
	public static final String ISOBJECTION_No = "N";
	/** Set ISObjection.
		@param ISObjection ISObjection	  */
	public void setISObjection (String ISObjection)
	{

		set_Value (COLUMNNAME_ISObjection, ISObjection);
	}

	/** Get ISObjection.
		@return ISObjection	  */
	public String getISObjection () 
	{
		return (String)get_Value(COLUMNNAME_ISObjection);
	}

	/** Set ObjectionDocNo.
		@param ObjectionDocNo ObjectionDocNo	  */
	public void setObjectionDocNo (String ObjectionDocNo)
	{
		set_Value (COLUMNNAME_ObjectionDocNo, ObjectionDocNo);
	}

	/** Get ObjectionDocNo.
		@return ObjectionDocNo	  */
	public String getObjectionDocNo () 
	{
		return (String)get_Value(COLUMNNAME_ObjectionDocNo);
	}

	/** ObjectionResult AD_Reference_ID=1000103 */
	public static final int OBJECTIONRESULT_AD_Reference_ID=1000103;
	/** Closed = Cl */
	public static final String OBJECTIONRESULT_Closed = "Cl";
	/** Open = O */
	public static final String OBJECTIONRESULT_Open = "O";
	/** Set ObjectionResult.
		@param ObjectionResult ObjectionResult	  */
	public void setObjectionResult (String ObjectionResult)
	{

		set_Value (COLUMNNAME_ObjectionResult, ObjectionResult);
	}

	/** Get ObjectionResult.
		@return ObjectionResult	  */
	public String getObjectionResult () 
	{
		return (String)get_Value(COLUMNNAME_ObjectionResult);
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