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

/** Generated Model for C_ReceivingNoteLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ReceivingNoteLine extends PO implements I_C_ReceivingNoteLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191016L;

    /** Standard Constructor */
    public X_C_ReceivingNoteLine (Properties ctx, int C_ReceivingNoteLine_ID, String trxName)
    {
      super (ctx, C_ReceivingNoteLine_ID, trxName);
      /** if (C_ReceivingNoteLine_ID == 0)
        {
			setC_ReceivingNote_ID (0);
			setC_ReceivingNoteLine_ID (0);
			setWeight (null);
        } */
    }

    /** Load Constructor */
    public X_C_ReceivingNoteLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ReceivingNoteLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

//	public I_C_ArticleStd getC_ArticleStd() throws RuntimeException
//    {
//		return (I_C_ArticleStd)MTable.get(getCtx(), I_C_ArticleStd.Table_Name)
//			.getPO(getC_ArticleStd_ID(), get_TrxName());	}

	/** Set C_ArticleStd ID.
		@param C_ArticleStd_ID C_ArticleStd ID	  */
	public void setC_ArticleStd_ID (int C_ArticleStd_ID)
	{
		if (C_ArticleStd_ID < 1) 
			set_Value (COLUMNNAME_C_ArticleStd_ID, null);
		else 
			set_Value (COLUMNNAME_C_ArticleStd_ID, Integer.valueOf(C_ArticleStd_ID));
	}

	/** Get C_ArticleStd ID.
		@return C_ArticleStd ID	  */
	public int getC_ArticleStd_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ArticleStd_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

//	public I_C_ArticleTypes getC_ArticleTypes() throws RuntimeException
//    {
//		return (I_C_ArticleTypes)MTable.get(getCtx(), I_C_ArticleTypes.Table_Name)
//			.getPO(getC_ArticleTypes_ID(), get_TrxName());	}

	/** Set C_ArticleTypes ID.
		@param C_ArticleTypes_ID C_ArticleTypes ID	  */
	public void setC_ArticleTypes_ID (int C_ArticleTypes_ID)
	{
		if (C_ArticleTypes_ID < 1) 
			set_Value (COLUMNNAME_C_ArticleTypes_ID, null);
		else 
			set_Value (COLUMNNAME_C_ArticleTypes_ID, Integer.valueOf(C_ArticleTypes_ID));
	}

	/** Get C_ArticleTypes ID.
		@return C_ArticleTypes ID	  */
	public int getC_ArticleTypes_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ArticleTypes_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_Color getC_Color() throws RuntimeException
    {
		return (org.topra.model.I_C_Color)MTable.get(getCtx(), org.topra.model.I_C_Color.Table_Name)
			.getPO(getC_Color_ID(), get_TrxName());	}

	/** Set Color.
		@param C_Color_ID Color	  */
	public void setC_Color_ID (int C_Color_ID)
	{
		if (C_Color_ID < 1) 
			set_Value (COLUMNNAME_C_Color_ID, null);
		else 
			set_Value (COLUMNNAME_C_Color_ID, Integer.valueOf(C_Color_ID));
	}

	/** Get Color.
		@return Color	  */
	public int getC_Color_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Color_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();}


	/** Set Item Name.
		@param C_GemItems_ID Item Name	  */
	public void setC_GemItems_ID (int C_GemItems_ID)
	{
		if (C_GemItems_ID < 1) 
			set_Value (COLUMNNAME_C_GemItems_ID, null);
		else 
			set_Value (COLUMNNAME_C_GemItems_ID, Integer.valueOf(C_GemItems_ID));
	}

	/** Get Item Name.
		@return Item Name	  */
	public int getC_GemItems_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_GemItems_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_RCPolish getC_RCPolish() throws RuntimeException
    {
		return (org.topra.model.I_C_RCPolish)MTable.get(getCtx(), org.topra.model.I_C_RCPolish.Table_Name)
			.getPO(getC_RCPolish_ID(), get_TrxName());	}

	/** Set Rough/Cut & Polish.
		@param C_RCPolish_ID Rough/Cut & Polish	  */
	public void setC_RCPolish_ID (int C_RCPolish_ID)
	{
		if (C_RCPolish_ID < 1) 
			set_Value (COLUMNNAME_C_RCPolish_ID, null);
		else 
			set_Value (COLUMNNAME_C_RCPolish_ID, Integer.valueOf(C_RCPolish_ID));
	}

	/** Get Rough/Cut & Polish.
		@return Rough/Cut & Polish	  */
	public int getC_RCPolish_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_RCPolish_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Receiving Note ID.
		@param C_ReceivingNote_ID Receiving Note ID	  */
	public void setC_ReceivingNote_ID (int C_ReceivingNote_ID)
	{
		if (C_ReceivingNote_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ReceivingNote_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ReceivingNote_ID, Integer.valueOf(C_ReceivingNote_ID));
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

	/** Set Receiving Note Line.
		@param C_ReceivingNoteLine_ID Receiving Note Line	  */
	public void setC_ReceivingNoteLine_ID (int C_ReceivingNoteLine_ID)
	{
		if (C_ReceivingNoteLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ReceivingNoteLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ReceivingNoteLine_ID, Integer.valueOf(C_ReceivingNoteLine_ID));
	}

	/** Get Receiving Note Line.
		@return Receiving Note Line	  */
	public int getC_ReceivingNoteLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ReceivingNoteLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_Shape getC_Shape() throws RuntimeException
    {
		return (org.topra.model.I_C_Shape)MTable.get(getCtx(), org.topra.model.I_C_Shape.Table_Name)
			.getPO(getC_Shape_ID(), get_TrxName());	}

	/** Set Shape.
		@param C_Shape_ID Shape	  */
	public void setC_Shape_ID (int C_Shape_ID)
	{
		if (C_Shape_ID < 1) 
			set_Value (COLUMNNAME_C_Shape_ID, null);
		else 
			set_Value (COLUMNNAME_C_Shape_ID, Integer.valueOf(C_Shape_ID));
	}

	/** Get Shape.
		@return Shape	  */
	public int getC_Shape_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Shape_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Detailed Certificate Number.
		@param DetaCertNo Detailed Certificate Number	  */
	public void setDetaCertNo (String DetaCertNo)
	{
		set_Value (COLUMNNAME_DetaCertNo, DetaCertNo);
	}

	/** Get Detailed Certificate Number.
		@return Detailed Certificate Number	  */
	public String getDetaCertNo () 
	{
		return (String)get_Value(COLUMNNAME_DetaCertNo);
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

	/** Set 10 Kt.
		@param is10 10 Kt	  */
	public void setis10 (boolean is10)
	{
		set_Value (COLUMNNAME_is10, Boolean.valueOf(is10));
	}

	/** Get 10 Kt.
		@return 10 Kt	  */
	public boolean is10 () 
	{
		Object oo = get_Value(COLUMNNAME_is10);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 14 Kt.
		@param is14 14 Kt	  */
	public void setis14 (boolean is14)
	{
		set_Value (COLUMNNAME_is14, Boolean.valueOf(is14));
	}

	/** Get 14 Kt.
		@return 14 Kt	  */
	public boolean is14 () 
	{
		Object oo = get_Value(COLUMNNAME_is14);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 18 Kt.
		@param is18 18 Kt	  */
	public void setis18 (boolean is18)
	{
		set_Value (COLUMNNAME_is18, Boolean.valueOf(is18));
	}

	/** Get 18 Kt.
		@return 18 Kt	  */
	public boolean is18 () 
	{
		Object oo = get_Value(COLUMNNAME_is18);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 21 Kt.
		@param is21 21 Kt	  */
	public void setis21 (boolean is21)
	{
		set_Value (COLUMNNAME_is21, Boolean.valueOf(is21));
	}

	/** Get 21 Kt.
		@return 21 Kt	  */
	public boolean is21 () 
	{
		Object oo = get_Value(COLUMNNAME_is21);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 22 Kt.
		@param is22 22 Kt	  */
	public void setis22 (boolean is22)
	{
		set_Value (COLUMNNAME_is22, Boolean.valueOf(is22));
	}

	/** Get 22 Kt.
		@return 22 Kt	  */
	public boolean is22 () 
	{
		Object oo = get_Value(COLUMNNAME_is22);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 24 Kt.
		@param is24 24 Kt	  */
	public void setis24 (boolean is24)
	{
		set_Value (COLUMNNAME_is24, Boolean.valueOf(is24));
	}

	/** Get 24 Kt.
		@return 24 Kt	  */
	public boolean is24 () 
	{
		Object oo = get_Value(COLUMNNAME_is24);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 8 Kt.
		@param is8 8 Kt	  */
	public void setis8 (boolean is8)
	{
		set_Value (COLUMNNAME_is8, Boolean.valueOf(is8));
	}

	/** Get 8 Kt.
		@return 8 Kt	  */
	public boolean is8 () 
	{
		Object oo = get_Value(COLUMNNAME_is8);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 800.
		@param is800s 800	  */
	public void setis800s (boolean is800s)
	{
		set_Value (COLUMNNAME_is800s, Boolean.valueOf(is800s));
	}

	/** Get 800.
		@return 800	  */
	public boolean is800s () 
	{
		Object oo = get_Value(COLUMNNAME_is800s);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 850.
		@param is850p 850	  */
	public void setis850p (boolean is850p)
	{
		set_Value (COLUMNNAME_is850p, Boolean.valueOf(is850p));
	}

	/** Get 850.
		@return 850	  */
	public boolean is850p () 
	{
		Object oo = get_Value(COLUMNNAME_is850p);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 9 Kt.
		@param is9 9 Kt	  */
	public void setis9 (boolean is9)
	{
		set_Value (COLUMNNAME_is9, Boolean.valueOf(is9));
	}

	/** Get 9 Kt.
		@return 9 Kt	  */
	public boolean is9 () 
	{
		Object oo = get_Value(COLUMNNAME_is9);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 900.
		@param is900p 900	  */
	public void setis900p (boolean is900p)
	{
		set_Value (COLUMNNAME_is900p, Boolean.valueOf(is900p));
	}

	/** Get 900.
		@return 900	  */
	public boolean is900p () 
	{
		Object oo = get_Value(COLUMNNAME_is900p);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 925.
		@param is925s 925	  */
	public void setis925s (boolean is925s)
	{
		set_Value (COLUMNNAME_is925s, Boolean.valueOf(is925s));
	}

	/** Get 925.
		@return 925	  */
	public boolean is925s () 
	{
		Object oo = get_Value(COLUMNNAME_is925s);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 950.
		@param is950p 950	  */
	public void setis950p (boolean is950p)
	{
		set_Value (COLUMNNAME_is950p, Boolean.valueOf(is950p));
	}

	/** Get 950.
		@return 950	  */
	public boolean is950p () 
	{
		Object oo = get_Value(COLUMNNAME_is950p);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 999.
		@param is999p 999	  */
	public void setis999p (boolean is999p)
	{
		set_Value (COLUMNNAME_is999p, Boolean.valueOf(is999p));
	}

	/** Get 999.
		@return 999	  */
	public boolean is999p () 
	{
		Object oo = get_Value(COLUMNNAME_is999p);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set 999.
		@param is999s 999	  */
	public void setis999s (boolean is999s)
	{
		set_Value (COLUMNNAME_is999s, Boolean.valueOf(is999s));
	}

	/** Get 999.
		@return 999	  */
	public boolean is999s () 
	{
		Object oo = get_Value(COLUMNNAME_is999s);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Add into Web.
		@param isAddintoWeb Add into Web	  */
	public void setisAddintoWeb (boolean isAddintoWeb)
	{
		set_Value (COLUMNNAME_isAddintoWeb, Boolean.valueOf(isAddintoWeb));
	}

	/** Get Add into Web.
		@return Add into Web	  */
	public boolean isAddintoWeb () 
	{
		Object oo = get_Value(COLUMNNAME_isAddintoWeb);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Detailed Certificate.
		@param isDetailedCertificate Detailed Certificate	  */
	public void setisDetailedCertificate (boolean isDetailedCertificate)
	{
		set_Value (COLUMNNAME_isDetailedCertificate, Boolean.valueOf(isDetailedCertificate));
	}

	/** Get Detailed Certificate.
		@return Detailed Certificate	  */
	public boolean isDetailedCertificate () 
	{
		Object oo = get_Value(COLUMNNAME_isDetailedCertificate);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Hallmark ?.
		@param isHallmark Is Hallmark ?	  */
	public void setisHallmark (boolean isHallmark)
	{
		set_Value (COLUMNNAME_isHallmark, Boolean.valueOf(isHallmark));
	}

	/** Get Is Hallmark ?.
		@return Is Hallmark ?	  */
	public boolean isHallmark () 
	{
		Object oo = get_Value(COLUMNNAME_isHallmark);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Jewellery.
		@param isJewellery Jewellery	  */
	public void setisJewellery (boolean isJewellery)
	{
		set_Value (COLUMNNAME_isJewellery, Boolean.valueOf(isJewellery));
	}

	/** Get Jewellery.
		@return Jewellery	  */
	public boolean isJewellery () 
	{
		Object oo = get_Value(COLUMNNAME_isJewellery);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Memo.
		@param isMemo Memo	  */
	public void setisMemo (boolean isMemo)
	{
		set_Value (COLUMNNAME_isMemo, Boolean.valueOf(isMemo));
	}

	/** Get Memo.
		@return Memo	  */
	public boolean isMemo () 
	{
		Object oo = get_Value(COLUMNNAME_isMemo);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Any Other Metals.
		@param IsOtherMetal Any Other Metals	  */
	public void setIsOtherMetal (boolean IsOtherMetal)
	{
		set_Value (COLUMNNAME_IsOtherMetal, Boolean.valueOf(IsOtherMetal));
	}

	/** Get Any Other Metals.
		@return Any Other Metals	  */
	public boolean isOtherMetal () 
	{
		Object oo = get_Value(COLUMNNAME_IsOtherMetal);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Photo Certificate.
		@param isPhotoCertificate Photo Certificate	  */
	public void setisPhotoCertificate (boolean isPhotoCertificate)
	{
		set_Value (COLUMNNAME_isPhotoCertificate, Boolean.valueOf(isPhotoCertificate));
	}

	/** Get Photo Certificate.
		@return Photo Certificate	  */
	public boolean isPhotoCertificate () 
	{
		Object oo = get_Value(COLUMNNAME_isPhotoCertificate);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Photo Memo.
		@param isPhotoMemo Photo Memo	  */
	public void setisPhotoMemo (boolean isPhotoMemo)
	{
		set_Value (COLUMNNAME_isPhotoMemo, Boolean.valueOf(isPhotoMemo));
	}

	/** Get Photo Memo.
		@return Photo Memo	  */
	public boolean isPhotoMemo () 
	{
		Object oo = get_Value(COLUMNNAME_isPhotoMemo);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sale in Web.
		@param isSaleInWeb Sale in Web	  */
	public void setisSaleInWeb (boolean isSaleInWeb)
	{
		set_Value (COLUMNNAME_isSaleInWeb, Boolean.valueOf(isSaleInWeb));
	}

	/** Get Sale in Web.
		@return Sale in Web	  */
	public boolean isSaleInWeb () 
	{
		Object oo = get_Value(COLUMNNAME_isSaleInWeb);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Is Sponsor's Mark Printed.
		@param IsSponceMark Is Sponsor's Mark Printed	  */
	public void setIsSponceMark (boolean IsSponceMark)
	{
		set_Value (COLUMNNAME_IsSponceMark, Boolean.valueOf(IsSponceMark));
	}

	/** Get Is Sponsor's Mark Printed.
		@return Is Sponsor's Mark Printed	  */
	public boolean isSponceMark () 
	{
		Object oo = get_Value(COLUMNNAME_IsSponceMark);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Item Count.
		@param itemCount Item Count	  */
	public void setitemCount (int itemCount)
	{
		set_Value (COLUMNNAME_itemCount, Integer.valueOf(itemCount));
	}

	/** Get Item Count.
		@return Item Count	  */
	public int getitemCount () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_itemCount);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Memo Certificate Number.
		@param MemoCertNo Memo Certificate Number	  */
	public void setMemoCertNo (String MemoCertNo)
	{
		set_Value (COLUMNNAME_MemoCertNo, MemoCertNo);
	}

	/** Get Memo Certificate Number.
		@return Memo Certificate Number	  */
	public String getMemoCertNo () 
	{
		return (String)get_Value(COLUMNNAME_MemoCertNo);
	}

	/** NormalHeat AD_Reference_ID=1000030 */
	public static final int NORMALHEAT_AD_Reference_ID=1000030;
	/** Normal = N */
	public static final String NORMALHEAT_Normal = "N";
	/** Heat/Unheat = HU */
	public static final String NORMALHEAT_HeatUnheat = "HU";
	/** Set Normal/Heat.
		@param NormalHeat Normal/Heat	  */
	public void setNormalHeat (String NormalHeat)
	{

		set_Value (COLUMNNAME_NormalHeat, NormalHeat);
	}

	/** Get Normal/Heat.
		@return Normal/Heat	  */
	public String getNormalHeat () 
	{
		return (String)get_Value(COLUMNNAME_NormalHeat);
	}

	/** NormalHeatPhoto AD_Reference_ID=1000030 */
	public static final int NORMALHEATPHOTO_AD_Reference_ID=1000030;
	/** Normal = N */
	public static final String NORMALHEATPHOTO_Normal = "N";
	/** Heat/Unheat = HU */
	public static final String NORMALHEATPHOTO_HeatUnheat = "HU";
	/** Set Normal/Heat.
		@param NormalHeatPhoto Normal/Heat	  */
	public void setNormalHeatPhoto (String NormalHeatPhoto)
	{

		set_Value (COLUMNNAME_NormalHeatPhoto, NormalHeatPhoto);
	}

	/** Get Normal/Heat.
		@return Normal/Heat	  */
	public String getNormalHeatPhoto () 
	{
		return (String)get_Value(COLUMNNAME_NormalHeatPhoto);
	}

	/** PhotoCertiColour AD_Reference_ID=1000081 */
	public static final int PHOTOCERTICOLOUR_AD_Reference_ID=1000081;
	/** Red = R */
	public static final String PHOTOCERTICOLOUR_Red = "R";
	/** Blue = B */
	public static final String PHOTOCERTICOLOUR_Blue = "B";
	/** Set Photo Certificate Colour.
		@param PhotoCertiColour Photo Certificate Colour	  */
	public void setPhotoCertiColour (String PhotoCertiColour)
	{

		set_Value (COLUMNNAME_PhotoCertiColour, PhotoCertiColour);
	}

	/** Get Photo Certificate Colour.
		@return Photo Certificate Colour	  */
	public String getPhotoCertiColour () 
	{
		return (String)get_Value(COLUMNNAME_PhotoCertiColour);
	}

	/** Set Photo Certificate Number.
		@param PhotoCertNo Photo Certificate Number	  */
	public void setPhotoCertNo (String PhotoCertNo)
	{
		set_Value (COLUMNNAME_PhotoCertNo, PhotoCertNo);
	}

	/** Get Photo Certificate Number.
		@return Photo Certificate Number	  */
	public String getPhotoCertNo () 
	{
		return (String)get_Value(COLUMNNAME_PhotoCertNo);
	}

	/** Set Remarks.
		@param Remarks 
		Remarks
	  */
	public void setRemarks (String Remarks)
	{
		set_Value (COLUMNNAME_Remarks, Remarks);
	}

	/** Get Remarks.
		@return Remarks
	  */
	public String getRemarks () 
	{
		return (String)get_Value(COLUMNNAME_Remarks);
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

	/** Set Weight.
		@param Weight 
		Weight of a product
	  */
	public void setWeight (String Weight)
	{
		set_Value (COLUMNNAME_Weight, Weight);
	}

	/** Get Weight.
		@return Weight of a product
	  */
	public String getWeight () 
	{
		return (String)get_Value(COLUMNNAME_Weight);
	}
}