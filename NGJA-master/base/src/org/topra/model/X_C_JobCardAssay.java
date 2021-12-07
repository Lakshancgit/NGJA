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

/** Generated Model for C_JobCardAssay
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_JobCardAssay extends PO implements I_C_JobCardAssay, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200219L;

    /** Standard Constructor */
    public X_C_JobCardAssay (Properties ctx, int C_JobCardAssay_ID, String trxName)
    {
      super (ctx, C_JobCardAssay_ID, trxName);
      /** if (C_JobCardAssay_ID == 0)
        {
			setC_JobCardAssay_ID (0);
			setC_ReceivingNote_ID (0);
			setOpeningDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_C_JobCardAssay (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_JobCardAssay[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_JobCardAssay ID.
		@param C_JobCardAssay_ID C_JobCardAssay ID	  */
	public void setC_JobCardAssay_ID (int C_JobCardAssay_ID)
	{
		if (C_JobCardAssay_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_JobCardAssay_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_JobCardAssay_ID, Integer.valueOf(C_JobCardAssay_ID));
	}

	/** Get C_JobCardAssay ID.
		@return C_JobCardAssay ID	  */
	public int getC_JobCardAssay_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_JobCardAssay_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Receiving Note ID.
		@param C_ReceivingNote_ID Receiving Note ID	  */
	public void setC_ReceivingNote_ID (int C_ReceivingNote_ID)
	{
		if (C_ReceivingNote_ID < 1) 
			set_Value (COLUMNNAME_C_ReceivingNote_ID, null);
		else 
			set_Value (COLUMNNAME_C_ReceivingNote_ID, Integer.valueOf(C_ReceivingNote_ID));
	}

	/** Get Receiving Note ID.
		@return Receiving Note ID	  */
	public int getC_ReceivingNote_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ReceivingNote_ID);
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

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** hmValue AD_Reference_ID=1000050 */
	public static final int HMVALUE_AD_Reference_ID=1000050;
	/** 999 (24 Kt) = 999 (24 Kt) */
	public static final String HMVALUE_99924Kt = "999 (24 Kt)";
	/** 916 (22 Kt) = 916 (22 Kt) */
	public static final String HMVALUE_91622Kt = "916 (22 Kt)";
	/** 875 (21 Kt) = 875 (21 Kt) */
	public static final String HMVALUE_87521Kt = "875 (21 Kt)";
	/** 585 (14 Kt) = 585 (14 Kt) */
	public static final String HMVALUE_58514Kt = "585 (14 Kt)";
	/** 417 (10 Kt) = 417 (10 Kt) */
	public static final String HMVALUE_41710Kt = "417 (10 Kt)";
	/** 375 (9 Kt) = 375 (9 Kt) */
	public static final String HMVALUE_3759Kt = "375 (9 Kt)";
	/** 333 (8 Kt) = 333 (8 Kt) */
	public static final String HMVALUE_3338Kt = "333 (8 Kt)";
	/** 999 = 999 */
	public static final String HMVALUE_999 = "999";
	/** 925 (Sterling Silver)  = 925 (Sterling Silver)   */
	public static final String HMVALUE_925SterlingSilver = "925 (Sterling Silver)  ";
	/** 800 = 800 */
	public static final String HMVALUE_800 = "800";
	/** 950 = 950 */
	public static final String HMVALUE_950 = "950";
	/** 900 = 900 */
	public static final String HMVALUE_900 = "900";
	/** 850 = 850 */
	public static final String HMVALUE_850 = "850";
	/** Set Hallmarked Value.
		@param hmValue Hallmarked Value	  */
	public void sethmValue (String hmValue)
	{

		set_Value (COLUMNNAME_hmValue, hmValue);
	}

	/** Get Hallmarked Value.
		@return Hallmarked Value	  */
	public String gethmValue () 
	{
		return (String)get_Value(COLUMNNAME_hmValue);
	}

	/** Set KARAT.
		@param karat KARAT	  */
	public void setkarat (String karat)
	{
		throw new IllegalArgumentException ("karat is virtual column");	}

	/** Get KARAT.
		@return KARAT	  */
	public String getkarat () 
	{
		return (String)get_Value(COLUMNNAME_karat);
	}

	/** Set Fire Assay.
		@param me01 Fire Assay	  */
	public void setme01 (boolean me01)
	{
		set_Value (COLUMNNAME_me01, Boolean.valueOf(me01));
	}

	/** Get Fire Assay.
		@return Fire Assay	  */
	public boolean isme01 () 
	{
		Object oo = get_Value(COLUMNNAME_me01);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Atomic Absorption Spectrometry.
		@param me02 Atomic Absorption Spectrometry	  */
	public void setme02 (boolean me02)
	{
		set_Value (COLUMNNAME_me02, Boolean.valueOf(me02));
	}

	/** Get Atomic Absorption Spectrometry.
		@return Atomic Absorption Spectrometry	  */
	public boolean isme02 () 
	{
		Object oo = get_Value(COLUMNNAME_me02);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Protentiometric Titration.
		@param me03 Protentiometric Titration	  */
	public void setme03 (boolean me03)
	{
		set_Value (COLUMNNAME_me03, Boolean.valueOf(me03));
	}

	/** Get Protentiometric Titration.
		@return Protentiometric Titration	  */
	public boolean isme03 () 
	{
		Object oo = get_Value(COLUMNNAME_me03);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set EDXRF Spectrometry.
		@param me04 EDXRF Spectrometry	  */
	public void setme04 (boolean me04)
	{
		set_Value (COLUMNNAME_me04, Boolean.valueOf(me04));
	}

	/** Get EDXRF Spectrometry.
		@return EDXRF Spectrometry	  */
	public boolean isme04 () 
	{
		Object oo = get_Value(COLUMNNAME_me04);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Other.
		@param me05 Other	  */
	public void setme05 (boolean me05)
	{
		set_Value (COLUMNNAME_me05, Boolean.valueOf(me05));
	}

	/** Get Other.
		@return Other	  */
	public boolean isme05 () 
	{
		Object oo = get_Value(COLUMNNAME_me05);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Opening Date.
		@param OpeningDate Opening Date	  */
	public void setOpeningDate (Timestamp OpeningDate)
	{
		set_Value (COLUMNNAME_OpeningDate, OpeningDate);
	}

	/** Get Opening Date.
		@return Opening Date	  */
	public Timestamp getOpeningDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_OpeningDate);
	}

	/** Set PPT GOLD.
		@param pptGold PPT GOLD	  */
	public void setpptGold (int pptGold)
	{
		set_Value (COLUMNNAME_pptGold, Integer.valueOf(pptGold));
	}

	/** Get PPT GOLD.
		@return PPT GOLD	  */
	public int getpptGold () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_pptGold);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PPT PLATINUM.
		@param pptPlatinum PPT PLATINUM	  */
	public void setpptPlatinum (int pptPlatinum)
	{
		set_Value (COLUMNNAME_pptPlatinum, Integer.valueOf(pptPlatinum));
	}

	/** Get PPT PLATINUM.
		@return PPT PLATINUM	  */
	public int getpptPlatinum () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_pptPlatinum);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PPT SILVER.
		@param pptSilver PPT SILVER	  */
	public void setpptSilver (int pptSilver)
	{
		set_Value (COLUMNNAME_pptSilver, Integer.valueOf(pptSilver));
	}

	/** Get PPT SILVER.
		@return PPT SILVER	  */
	public int getpptSilver () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_pptSilver);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Article's below standard which submitted.
		@param rs01 Article's below standard which submitted	  */
	public void setrs01 (boolean rs01)
	{
		set_Value (COLUMNNAME_rs01, Boolean.valueOf(rs01));
	}

	/** Get Article's below standard which submitted.
		@return Article's below standard which submitted	  */
	public boolean isrs01 () 
	{
		Object oo = get_Value(COLUMNNAME_rs01);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Solder below required fineness standard.
		@param rs02 Solder below required fineness standard	  */
	public void setrs02 (boolean rs02)
	{
		set_Value (COLUMNNAME_rs02, Boolean.valueOf(rs02));
	}

	/** Get Solder below required fineness standard.
		@return Solder below required fineness standard	  */
	public boolean isrs02 () 
	{
		Object oo = get_Value(COLUMNNAME_rs02);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Excessive use of solder alloy used for joining parts.
		@param rs03 Excessive use of solder alloy used for joining parts	  */
	public void setrs03 (boolean rs03)
	{
		set_Value (COLUMNNAME_rs03, Boolean.valueOf(rs03));
	}

	/** Get Excessive use of solder alloy used for joining parts.
		@return Excessive use of solder alloy used for joining parts	  */
	public boolean isrs03 () 
	{
		Object oo = get_Value(COLUMNNAME_rs03);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Unauthorized base metal parts / fillings.
		@param rs04 Unauthorized base metal parts / fillings	  */
	public void setrs04 (boolean rs04)
	{
		set_Value (COLUMNNAME_rs04, Boolean.valueOf(rs04));
	}

	/** Get Unauthorized base metal parts / fillings.
		@return Unauthorized base metal parts / fillings	  */
	public boolean isrs04 () 
	{
		Object oo = get_Value(COLUMNNAME_rs04);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Unauthorized base metal plating.
		@param rs05 Unauthorized base metal plating	  */
	public void setrs05 (boolean rs05)
	{
		set_Value (COLUMNNAME_rs05, Boolean.valueOf(rs05));
	}

	/** Get Unauthorized base metal plating.
		@return Unauthorized base metal plating	  */
	public boolean isrs05 () 
	{
		Object oo = get_Value(COLUMNNAME_rs05);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set No suitable place to stamp the Hallmark.
		@param rs06 No suitable place to stamp the Hallmark	  */
	public void setrs06 (boolean rs06)
	{
		set_Value (COLUMNNAME_rs06, Boolean.valueOf(rs06));
	}

	/** Get No suitable place to stamp the Hallmark.
		@return No suitable place to stamp the Hallmark	  */
	public boolean isrs06 () 
	{
		Object oo = get_Value(COLUMNNAME_rs06);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Status AD_Reference_ID=1000034 */
	public static final int STATUS_AD_Reference_ID=1000034;
	/** Prepare = P */
	public static final String STATUS_Prepare = "P";
	/** Complete = C */
	public static final String STATUS_Complete = "C";
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