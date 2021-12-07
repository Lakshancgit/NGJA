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

/** Generated Model for C_JobCardValuation
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_JobCardValuation extends PO implements I_C_JobCardValuation, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191016L;

    /** Standard Constructor */
    public X_C_JobCardValuation (Properties ctx, int C_JobCardValuation_ID, String trxName)
    {
      super (ctx, C_JobCardValuation_ID, trxName);
      /** if (C_JobCardValuation_ID == 0)
        {
			setC_JobCardValuation_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_JobCardValuation (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_JobCardValuation[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Actual Weight.
		@param ActualWeight Actual Weight	  */
	public void setActualWeight (String ActualWeight)
	{
		set_Value (COLUMNNAME_ActualWeight, ActualWeight);
	}

	/** Get Actual Weight.
		@return Actual Weight	  */
	public String getActualWeight () 
	{
		return (String)get_Value(COLUMNNAME_ActualWeight);
	}

	/** Set Image.
		@param AD_Image_ID 
		Image or Icon
	  */
	public void setAD_Image_ID (int AD_Image_ID)
	{
		if (AD_Image_ID < 1) 
			set_Value (COLUMNNAME_AD_Image_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Image_ID, Integer.valueOf(AD_Image_ID));
	}

	/** Get Image.
		@return Image or Icon
	  */
	public int getAD_Image_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Image_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Breadth.
		@param Breadth Breadth	  */
	public void setBreadth (String Breadth)
	{
		set_Value (COLUMNNAME_Breadth, Breadth);
	}

	/** Get Breadth.
		@return Breadth	  */
	public String getBreadth () 
	{
		return (String)get_Value(COLUMNNAME_Breadth);
	}

//	public I_C_AbsorpSpec getC_AbsorpSpec() throws RuntimeException
//    {
//		return (I_C_AbsorpSpec)MTable.get(getCtx(), I_C_AbsorpSpec.Table_Name)
//			.getPO(getC_AbsorpSpec_ID(), get_TrxName());	}

	/** Set Absorption Spectrum.
		@param C_AbsorpSpec_ID Absorption Spectrum	  */
	public void setC_AbsorpSpec_ID (int C_AbsorpSpec_ID)
	{
		if (C_AbsorpSpec_ID < 1) 
			set_Value (COLUMNNAME_C_AbsorpSpec_ID, null);
		else 
			set_Value (COLUMNNAME_C_AbsorpSpec_ID, Integer.valueOf(C_AbsorpSpec_ID));
	}

	/** Get Absorption Spectrum.
		@return Absorption Spectrum	  */
	public int getC_AbsorpSpec_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AbsorpSpec_ID);
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
		return ii.intValue();
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

	/** Set Cetificate No.
		@param CetificateNo 
		Document sequence number of the document
	  */
	public void setCetificateNo (String CetificateNo)
	{
		set_Value (COLUMNNAME_CetificateNo, CetificateNo);
	}

	/** Get Cetificate No.
		@return Document sequence number of the document
	  */
	public String getCetificateNo () 
	{
		return (String)get_Value(COLUMNNAME_CetificateNo);
	}

//	public I_C_GemItems getC_GemItems() throws RuntimeException
//    {
//		return (I_C_GemItems)MTable.get(getCtx(), I_C_GemItems.Table_Name)
//			.getPO(getC_GemItems_ID(), get_TrxName());	}

	/** Set Item Name.
		@param C_GemItems_ID Item Name	  */
	public void setC_GemItems_ID (int C_GemItems_ID)
	{
		if (C_GemItems_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_GemItems_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_GemItems_ID, Integer.valueOf(C_GemItems_ID));
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

	/** Set Job Card Number.
		@param C_JobCardValuation_ID Job Card Number	  */
	public void setC_JobCardValuation_ID (int C_JobCardValuation_ID)
	{
		if (C_JobCardValuation_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_JobCardValuation_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_JobCardValuation_ID, Integer.valueOf(C_JobCardValuation_ID));
	}

	/** Get Job Card Number.
		@return Job Card Number	  */
	public int getC_JobCardValuation_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_JobCardValuation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

//	public I_C_LongWave getC_LongWave() throws RuntimeException
//    {
//		return (I_C_LongWave)MTable.get(getCtx(), I_C_LongWave.Table_Name)
//			.getPO(getC_LongWave_ID(), get_TrxName());	}

	/** Set Long Wave.
		@param C_LongWave_ID Long Wave	  */
	public void setC_LongWave_ID (int C_LongWave_ID)
	{
		if (C_LongWave_ID < 1) 
			set_Value (COLUMNNAME_C_LongWave_ID, null);
		else 
			set_Value (COLUMNNAME_C_LongWave_ID, Integer.valueOf(C_LongWave_ID));
	}

	/** Get Long Wave.
		@return Long Wave	  */
	public int getC_LongWave_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LongWave_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

//	public I_C_Pleochroism getC_Pleochroism() throws RuntimeException
//    {
//		return (I_C_Pleochroism)MTable.get(getCtx(), I_C_Pleochroism.Table_Name)
//			.getPO(getC_Pleochroism_ID(), get_TrxName());	}

	/** Set Pleochroism.
		@param C_Pleochroism_ID Pleochroism	  */
	public void setC_Pleochroism_ID (int C_Pleochroism_ID)
	{
		if (C_Pleochroism_ID < 1) 
			set_Value (COLUMNNAME_C_Pleochroism_ID, null);
		else 
			set_Value (COLUMNNAME_C_Pleochroism_ID, Integer.valueOf(C_Pleochroism_ID));
	}

	/** Get Pleochroism.
		@return Pleochroism	  */
	public int getC_Pleochroism_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Pleochroism_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

//	public I_C_Polariscope getC_Polariscope() throws RuntimeException
//    {
//		return (I_C_Polariscope)MTable.get(getCtx(), I_C_Polariscope.Table_Name)
//			.getPO(getC_Polariscope_ID(), get_TrxName());	}

	/** Set Polariscope.
		@param C_Polariscope_ID Polariscope	  */
	public void setC_Polariscope_ID (int C_Polariscope_ID)
	{
		if (C_Polariscope_ID < 1) 
			set_Value (COLUMNNAME_C_Polariscope_ID, null);
		else 
			set_Value (COLUMNNAME_C_Polariscope_ID, Integer.valueOf(C_Polariscope_ID));
	}

	/** Get Polariscope.
		@return Polariscope	  */
	public int getC_Polariscope_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Polariscope_ID);
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

//	public I_C_ShortWave getC_ShortWave() throws RuntimeException
//    {
//		return (I_C_ShortWave)MTable.get(getCtx(), I_C_ShortWave.Table_Name)
//			.getPO(getC_ShortWave_ID(), get_TrxName());	}

	/** Set Short Wave.
		@param C_ShortWave_ID Short Wave	  */
	public void setC_ShortWave_ID (int C_ShortWave_ID)
	{
		if (C_ShortWave_ID < 1) 
			set_Value (COLUMNNAME_C_ShortWave_ID, null);
		else 
			set_Value (COLUMNNAME_C_ShortWave_ID, Integer.valueOf(C_ShortWave_ID));
	}

	/** Get Short Wave.
		@return Short Wave	  */
	public int getC_ShortWave_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ShortWave_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

//	public org.topra.model.I_C_ValFinalRemarks getFinalRemarksC() throws RuntimeException
//    {
//		return (org.topra.model.I_C_ValFinalRemarks)MTable.get(getCtx(), org.topra.model.I_C_ValFinalRemarks.Table_Name)
//			.getPO(getFinalRemarksCmnt(), get_TrxName());	}

	/** Set Final Remark/Comment.
		@param FinalRemarksCmnt Final Remark/Comment	  */
	public void setFinalRemarksCmnt (int FinalRemarksCmnt)
	{
		set_Value (COLUMNNAME_FinalRemarksCmnt, Integer.valueOf(FinalRemarksCmnt));
	}

	/** Get Final Remark/Comment.
		@return Final Remark/Comment	  */
	public int getFinalRemarksCmnt () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_FinalRemarksCmnt);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Height.
		@param Height Height	  */
	public void setHeight (String Height)
	{
		set_Value (COLUMNNAME_Height, Height);
	}

	/** Get Height.
		@return Height	  */
	public String getHeight () 
	{
		return (String)get_Value(COLUMNNAME_Height);
	}

	/** Set Add in to Web.
		@param isAddintoWebJC Add in to Web	  */
	public void setisAddintoWebJC (boolean isAddintoWebJC)
	{
		set_Value (COLUMNNAME_isAddintoWebJC, Boolean.valueOf(isAddintoWebJC));
	}

	/** Get Add in to Web.
		@return Add in to Web	  */
	public boolean isAddintoWebJC () 
	{
		Object oo = get_Value(COLUMNNAME_isAddintoWebJC);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Detail Certificate.
		@param isDetailJC Detail Certificate	  */
	public void setisDetailJC (boolean isDetailJC)
	{
		set_Value (COLUMNNAME_isDetailJC, Boolean.valueOf(isDetailJC));
	}

	/** Get Detail Certificate.
		@return Detail Certificate	  */
	public boolean isDetailJC () 
	{
		Object oo = get_Value(COLUMNNAME_isDetailJC);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Jewellery.
		@param isJewelleryJC Jewellery	  */
	public void setisJewelleryJC (boolean isJewelleryJC)
	{
		set_Value (COLUMNNAME_isJewelleryJC, Boolean.valueOf(isJewelleryJC));
	}

	/** Get Jewellery.
		@return Jewellery	  */
	public boolean isJewelleryJC () 
	{
		Object oo = get_Value(COLUMNNAME_isJewelleryJC);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Memo.
		@param isMemoJC Memo	  */
	public void setisMemoJC (boolean isMemoJC)
	{
		set_Value (COLUMNNAME_isMemoJC, Boolean.valueOf(isMemoJC));
	}

	/** Get Memo.
		@return Memo	  */
	public boolean isMemoJC () 
	{
		Object oo = get_Value(COLUMNNAME_isMemoJC);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Opaque.
		@param isOpaque Opaque	  */
	public void setisOpaque (boolean isOpaque)
	{
		set_Value (COLUMNNAME_isOpaque, Boolean.valueOf(isOpaque));
	}

	/** Get Opaque.
		@return Opaque	  */
	public boolean isOpaque () 
	{
		Object oo = get_Value(COLUMNNAME_isOpaque);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Photo Certificate.
		@param isPhotoJC Photo Certificate	  */
	public void setisPhotoJC (boolean isPhotoJC)
	{
		set_Value (COLUMNNAME_isPhotoJC, Boolean.valueOf(isPhotoJC));
	}

	/** Get Photo Certificate.
		@return Photo Certificate	  */
	public boolean isPhotoJC () 
	{
		Object oo = get_Value(COLUMNNAME_isPhotoJC);
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

	/** Set Translucent.
		@param isTranslucent Translucent	  */
	public void setisTranslucent (boolean isTranslucent)
	{
		set_Value (COLUMNNAME_isTranslucent, Boolean.valueOf(isTranslucent));
	}

	/** Get Translucent.
		@return Translucent	  */
	public boolean isTranslucent () 
	{
		Object oo = get_Value(COLUMNNAME_isTranslucent);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Transparant.
		@param isTransparant Transparant	  */
	public void setisTransparant (boolean isTransparant)
	{
		set_Value (COLUMNNAME_isTransparant, Boolean.valueOf(isTransparant));
	}

	/** Get Transparant.
		@return Transparant	  */
	public boolean isTransparant () 
	{
		Object oo = get_Value(COLUMNNAME_isTransparant);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** JobCardStatus AD_Reference_ID=1000044 */
	public static final int JOBCARDSTATUS_AD_Reference_ID=1000044;
	/** Completed = CO */
	public static final String JOBCARDSTATUS_Completed = "CO";
	/** Cancelled = CN */
	public static final String JOBCARDSTATUS_Cancelled = "CN";
	/** COMMENT = CM */
	public static final String JOBCARDSTATUS_COMMENT = "CM";
	/** Set Job Card Status.
		@param JobCardStatus Job Card Status	  */
	public void setJobCardStatus (String JobCardStatus)
	{

		set_Value (COLUMNNAME_JobCardStatus, JobCardStatus);
	}

	/** Get Job Card Status.
		@return Job Card Status	  */
	public String getJobCardStatus () 
	{
		return (String)get_Value(COLUMNNAME_JobCardStatus);
	}

	/** Set Length.
		@param Length Length	  */
	public void setLength (String Length)
	{
		set_Value (COLUMNNAME_Length, Length);
	}

	/** Get Length.
		@return Length	  */
	public String getLength () 
	{
		return (String)get_Value(COLUMNNAME_Length);
	}

	/** Set Lense (X).
		@param Lense Lense (X)	  */
	public void setLense (String Lense)
	{
		set_Value (COLUMNNAME_Lense, Lense);
	}

	/** Get Lense (X).
		@return Lense (X)	  */
	public String getLense () 
	{
		return (String)get_Value(COLUMNNAME_Lense);
	}

	/** Set Line.
		@param LineNo 
		Line No
	  */
	public void setLineNo (int LineNo)
	{
		set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
	}

	/** Get Line.
		@return Line No
	  */
	public int getLineNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Microscope.
		@param MicroscopeCerti Microscope	  */
	public void setMicroscopeCerti (boolean MicroscopeCerti)
	{
		set_Value (COLUMNNAME_MicroscopeCerti, Boolean.valueOf(MicroscopeCerti));
	}

	/** Get Microscope.
		@return Microscope	  */
	public boolean isMicroscopeCerti () 
	{
		Object oo = get_Value(COLUMNNAME_MicroscopeCerti);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Microscope.
		@param MicroscopeGOne Microscope	  */
	public void setMicroscopeGOne (boolean MicroscopeGOne)
	{
		set_Value (COLUMNNAME_MicroscopeGOne, Boolean.valueOf(MicroscopeGOne));
	}

	/** Get Microscope.
		@return Microscope	  */
	public boolean isMicroscopeGOne () 
	{
		Object oo = get_Value(COLUMNNAME_MicroscopeGOne);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Microscopic Examination.
		@param MicroscopicExamination Microscopic Examination	  */
	public void setMicroscopicExamination (String MicroscopicExamination)
	{
		set_Value (COLUMNNAME_MicroscopicExamination, MicroscopicExamination);
	}

	/** Get Microscopic Examination.
		@return Microscopic Examination	  */
	public String getMicroscopicExamination () 
	{
		return (String)get_Value(COLUMNNAME_MicroscopicExamination);
	}

	/** NormalHeatDetal AD_Reference_ID=1000030 */
	public static final int NORMALHEATDETAL_AD_Reference_ID=1000030;
	/** Normal = N */
	public static final String NORMALHEATDETAL_Normal = "N";
	/** Heat/Unheat = HU */
	public static final String NORMALHEATDETAL_HeatUnheat = "HU";
	/** Set Normal/Heat.
		@param NormalHeatDetal Normal/Heat	  */
	public void setNormalHeatDetal (String NormalHeatDetal)
	{

		set_Value (COLUMNNAME_NormalHeatDetal, NormalHeatDetal);
	}

	/** Get Normal/Heat.
		@return Normal/Heat	  */
	public String getNormalHeatDetal () 
	{
		return (String)get_Value(COLUMNNAME_NormalHeatDetal);
	}

	/** NormalHeatPhotoJC AD_Reference_ID=1000030 */
	public static final int NORMALHEATPHOTOJC_AD_Reference_ID=1000030;
	/** Normal = N */
	public static final String NORMALHEATPHOTOJC_Normal = "N";
	/** Heat/Unheat = HU */
	public static final String NORMALHEATPHOTOJC_HeatUnheat = "HU";
	/** Set Normal/Heat.
		@param NormalHeatPhotoJC Normal/Heat	  */
	public void setNormalHeatPhotoJC (String NormalHeatPhotoJC)
	{

		set_Value (COLUMNNAME_NormalHeatPhotoJC, NormalHeatPhotoJC);
	}

	/** Get Normal/Heat.
		@return Normal/Heat	  */
	public String getNormalHeatPhotoJC () 
	{
		return (String)get_Value(COLUMNNAME_NormalHeatPhotoJC);
	}

	/** Set Other.
		@param Other Other	  */
	public void setOther (String Other)
	{
		set_Value (COLUMNNAME_Other, Other);
	}

	/** Get Other.
		@return Other	  */
	public String getOther () 
	{
		return (String)get_Value(COLUMNNAME_Other);
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

	/** Set Polariscope.
		@param PolariscopeGOne Polariscope	  */
	public void setPolariscopeGOne (boolean PolariscopeGOne)
	{
		set_Value (COLUMNNAME_PolariscopeGOne, Boolean.valueOf(PolariscopeGOne));
	}

	/** Get Polariscope.
		@return Polariscope	  */
	public boolean isPolariscopeGOne () 
	{
		Object oo = get_Value(COLUMNNAME_PolariscopeGOne);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Poloriscope.
		@param PoloriscopeCerti Poloriscope	  */
	public void setPoloriscopeCerti (boolean PoloriscopeCerti)
	{
		set_Value (COLUMNNAME_PoloriscopeCerti, Boolean.valueOf(PoloriscopeCerti));
	}

	/** Get Poloriscope.
		@return Poloriscope	  */
	public boolean isPoloriscopeCerti () 
	{
		Object oo = get_Value(COLUMNNAME_PoloriscopeCerti);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Refractive Index.
		@param RefractiveIndex Refractive Index	  */
	public void setRefractiveIndex (String RefractiveIndex)
	{
		set_Value (COLUMNNAME_RefractiveIndex, RefractiveIndex);
	}

	/** Get Refractive Index.
		@return Refractive Index	  */
	public String getRefractiveIndex () 
	{
		return (String)get_Value(COLUMNNAME_RefractiveIndex);
	}

	/** Set Refractor Meter.
		@param RefractorMeterCerti Refractor Meter	  */
	public void setRefractorMeterCerti (boolean RefractorMeterCerti)
	{
		set_Value (COLUMNNAME_RefractorMeterCerti, Boolean.valueOf(RefractorMeterCerti));
	}

	/** Get Refractor Meter.
		@return Refractor Meter	  */
	public boolean isRefractorMeterCerti () 
	{
		Object oo = get_Value(COLUMNNAME_RefractorMeterCerti);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Refractor Meter.
		@param RefractorMeterGOne Refractor Meter	  */
	public void setRefractorMeterGOne (boolean RefractorMeterGOne)
	{
		set_Value (COLUMNNAME_RefractorMeterGOne, Boolean.valueOf(RefractorMeterGOne));
	}

	/** Get Refractor Meter.
		@return Refractor Meter	  */
	public boolean isRefractorMeterGOne () 
	{
		Object oo = get_Value(COLUMNNAME_RefractorMeterGOne);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Remarks.
		@param RemarksCerti Remarks	  */
	public void setRemarksCerti (String RemarksCerti)
	{
		set_Value (COLUMNNAME_RemarksCerti, RemarksCerti);
	}

	/** Get Remarks.
		@return Remarks	  */
	public String getRemarksCerti () 
	{
		return (String)get_Value(COLUMNNAME_RemarksCerti);
	}

	/** Set Remarks.
		@param RemarksGOne Remarks	  */
	public void setRemarksGOne (String RemarksGOne)
	{
		set_Value (COLUMNNAME_RemarksGOne, RemarksGOne);
	}

	/** Get Remarks.
		@return Remarks	  */
	public String getRemarksGOne () 
	{
		return (String)get_Value(COLUMNNAME_RemarksGOne);
	}

//	public I_C_Specieses getSp() throws RuntimeException
//    {
//		return (I_C_Specieses)MTable.get(getCtx(), I_C_Specieses.Table_Name)
//			.getPO(getSpeci(), get_TrxName());	}

	/** Set Species.
		@param Speci Species	  */
	public void setSpeci (int Speci)
	{
		set_ValueNoCheck (COLUMNNAME_Speci, Integer.valueOf(Speci));
	}

	/** Get Species.
		@return Species	  */
	public int getSpeci () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Speci);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Specific Gravity.
		@param SpecificGravity Specific Gravity	  */
	public void setSpecificGravity (String SpecificGravity)
	{
		set_Value (COLUMNNAME_SpecificGravity, SpecificGravity);
	}

	/** Get Specific Gravity.
		@return Specific Gravity	  */
	public String getSpecificGravity () 
	{
		return (String)get_Value(COLUMNNAME_SpecificGravity);
	}

	/** Set Spectroscope.
		@param SpectroscopeCerti Spectroscope	  */
	public void setSpectroscopeCerti (boolean SpectroscopeCerti)
	{
		set_Value (COLUMNNAME_SpectroscopeCerti, Boolean.valueOf(SpectroscopeCerti));
	}

	/** Get Spectroscope.
		@return Spectroscope	  */
	public boolean isSpectroscopeCerti () 
	{
		Object oo = get_Value(COLUMNNAME_SpectroscopeCerti);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Spectroscope.
		@param SpectroscopeGOne Spectroscope	  */
	public void setSpectroscopeGOne (boolean SpectroscopeGOne)
	{
		set_Value (COLUMNNAME_SpectroscopeGOne, Boolean.valueOf(SpectroscopeGOne));
	}

	/** Get Spectroscope.
		@return Spectroscope	  */
	public boolean isSpectroscopeGOne () 
	{
		Object oo = get_Value(COLUMNNAME_SpectroscopeGOne);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

//	public I_C_TypeofCut getTypeOf() throws RuntimeException
//    {
//		return (I_C_TypeofCut)MTable.get(getCtx(), I_C_TypeofCut.Table_Name)
//			.getPO(getTypeOfCut(), get_TrxName());	}

	/** Set Type Of Cut.
		@param TypeOfCut Type Of Cut	  */
	public void setTypeOfCut (int TypeOfCut)
	{
		set_Value (COLUMNNAME_TypeOfCut, Integer.valueOf(TypeOfCut));
	}

	/** Get Type Of Cut.
		@return Type Of Cut	  */
	public int getTypeOfCut () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TypeOfCut);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_AD_User getUser1() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getUser1_ID(), get_TrxName());	}

	/** Set User 2.
		@param User1_ID 
		User defined list element #1
	  */
	public void setUser1_ID (int User1_ID)
	{
		if (User1_ID < 1) 
			set_Value (COLUMNNAME_User1_ID, null);
		else 
			set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
	}

	/** Get User 2.
		@return User defined list element #1
	  */
	public int getUser1_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
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

	/** Set UV Lamp.
		@param UVLampCerti UV Lamp	  */
	public void setUVLampCerti (boolean UVLampCerti)
	{
		set_Value (COLUMNNAME_UVLampCerti, Boolean.valueOf(UVLampCerti));
	}

	/** Get UV Lamp.
		@return UV Lamp	  */
	public boolean isUVLampCerti () 
	{
		Object oo = get_Value(COLUMNNAME_UVLampCerti);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set UV Lamp.
		@param UVLampGOne UV Lamp	  */
	public void setUVLampGOne (boolean UVLampGOne)
	{
		set_Value (COLUMNNAME_UVLampGOne, Boolean.valueOf(UVLampGOne));
	}

	/** Get UV Lamp.
		@return UV Lamp	  */
	public boolean isUVLampGOne () 
	{
		Object oo = get_Value(COLUMNNAME_UVLampGOne);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** ValMesureUnit AD_Reference_ID=1000156 */
	public static final int VALMESUREUNIT_AD_Reference_ID=1000156;
	/** mm = M */
	public static final String VALMESUREUNIT_Mm = "M";
	/** Gram = G */
	public static final String VALMESUREUNIT_Gram = "G";
	/** Set Mesure Unit.
		@param ValMesureUnit Mesure Unit	  */
	public void setValMesureUnit (String ValMesureUnit)
	{

		set_Value (COLUMNNAME_ValMesureUnit, ValMesureUnit);
	}

	/** Get Mesure Unit.
		@return Mesure Unit	  */
	public String getValMesureUnit () 
	{
		return (String)get_Value(COLUMNNAME_ValMesureUnit);
	}

//	public I_C_Variety getV() throws RuntimeException
//    {
//		return (I_C_Variety)MTable.get(getCtx(), I_C_Variety.Table_Name)
//			.getPO(getVari(), get_TrxName());	}

	/** Set Variety.
		@param Vari Variety	  */
	public void setVari (int Vari)
	{
		set_ValueNoCheck (COLUMNNAME_Vari, Integer.valueOf(Vari));
	}

	/** Get Variety.
		@return Variety	  */
	public int getVari () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Vari);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Weight (In Receiving Note).
		@param WeightRN Weight (In Receiving Note)	  */
	public void setWeightRN (String WeightRN)
	{
		set_Value (COLUMNNAME_WeightRN, WeightRN);
	}

	/** Get Weight (In Receiving Note).
		@return Weight (In Receiving Note)	  */
	public String getWeightRN () 
	{
		return (String)get_Value(COLUMNNAME_WeightRN);
	}
}