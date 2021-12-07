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

/** Generated Model for C_ValuationCertificate
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ValuationCertificate extends PO implements I_C_ValuationCertificate, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191016L;

    /** Standard Constructor */
    public X_C_ValuationCertificate (Properties ctx, int C_ValuationCertificate_ID, String trxName)
    {
      super (ctx, C_ValuationCertificate_ID, trxName);
      /** if (C_ValuationCertificate_ID == 0)
        {
			setC_ValuationCertificate_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ValuationCertificate (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ValuationCertificate[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.topra.model.I_C_JobCardValuation getC_JobCardValuation() throws RuntimeException
    {
		return (org.topra.model.I_C_JobCardValuation)MTable.get(getCtx(), org.topra.model.I_C_JobCardValuation.Table_Name)
			.getPO(getC_JobCardValuation_ID(), get_TrxName());	}

	/** Set Job Card Number.
		@param C_JobCardValuation_ID Job Card Number	  */
	public void setC_JobCardValuation_ID (int C_JobCardValuation_ID)
	{
		if (C_JobCardValuation_ID < 1) 
			set_Value (COLUMNNAME_C_JobCardValuation_ID, null);
		else 
			set_Value (COLUMNNAME_C_JobCardValuation_ID, Integer.valueOf(C_JobCardValuation_ID));
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

	/** Set Create Detail Certficate.
		@param CreatDetail 
		Create Detail Certficate
	  */
	public void setCreatDetail (String CreatDetail)
	{
		set_Value (COLUMNNAME_CreatDetail, CreatDetail);
	}

	/** Get Create Detail Certficate.
		@return Create Detail Certficate
	  */
	public String getCreatDetail () 
	{
		return (String)get_Value(COLUMNNAME_CreatDetail);
	}

	/** Set Create Brief Note.
		@param CreateBriefNote 
		Create Brief Note
	  */
	public void setCreateBriefNote (String CreateBriefNote)
	{
		set_Value (COLUMNNAME_CreateBriefNote, CreateBriefNote);
	}

	/** Get Create Brief Note.
		@return Create Brief Note
	  */
	public String getCreateBriefNote () 
	{
		return (String)get_Value(COLUMNNAME_CreateBriefNote);
	}

	/** Set Create Photo Certificate.
		@param CreatePhoto 
		Create Photo Certificate
	  */
	public void setCreatePhoto (String CreatePhoto)
	{
		set_Value (COLUMNNAME_CreatePhoto, CreatePhoto);
	}

	/** Get Create Photo Certificate.
		@return Create Photo Certificate
	  */
	public String getCreatePhoto () 
	{
		return (String)get_Value(COLUMNNAME_CreatePhoto);
	}

	/** Set Create PhotoMemo Certficate.
		@param CreatPhotoMemo 
		Create PhotoMemo Certficate
	  */
	public void setCreatPhotoMemo (String CreatPhotoMemo)
	{
		set_Value (COLUMNNAME_CreatPhotoMemo, CreatPhotoMemo);
	}

	/** Get Create PhotoMemo Certficate.
		@return Create PhotoMemo Certficate
	  */
	public String getCreatPhotoMemo () 
	{
		return (String)get_Value(COLUMNNAME_CreatPhotoMemo);
	}

	/** Set Valuation Certificate ID.
		@param C_ValuationCertificate_ID Valuation Certificate ID	  */
	public void setC_ValuationCertificate_ID (int C_ValuationCertificate_ID)
	{
		if (C_ValuationCertificate_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ValuationCertificate_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ValuationCertificate_ID, Integer.valueOf(C_ValuationCertificate_ID));
	}

	/** Get Valuation Certificate ID.
		@return Valuation Certificate ID	  */
	public int getC_ValuationCertificate_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ValuationCertificate_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date printed.
		@param DatePrinted 
		Date the document was printed.
	  */
	public void setDatePrinted (Timestamp DatePrinted)
	{
		set_Value (COLUMNNAME_DatePrinted, DatePrinted);
	}

	/** Get Date printed.
		@return Date the document was printed.
	  */
	public Timestamp getDatePrinted () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DatePrinted);
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

	/** DetailCertStatus AD_Reference_ID=1000054 */
	public static final int DETAILCERTSTATUS_AD_Reference_ID=1000054;
	/** Completed = C */
	public static final String DETAILCERTSTATUS_Completed = "C";
	/** Cancelled = CN */
	public static final String DETAILCERTSTATUS_Cancelled = "CN";
	/** Open = O */
	public static final String DETAILCERTSTATUS_Open = "O";
	/** Set Detailed Certificate Status.
		@param DetailCertStatus Detailed Certificate Status	  */
	public void setDetailCertStatus (String DetailCertStatus)
	{

		set_Value (COLUMNNAME_DetailCertStatus, DetailCertStatus);
	}

	/** Get Detailed Certificate Status.
		@return Detailed Certificate Status	  */
	public String getDetailCertStatus () 
	{
		return (String)get_Value(COLUMNNAME_DetailCertStatus);
	}

	/** Set Document No.
		@param DocumentNoDetail 
		Document sequence number of the document
	  */
	public void setDocumentNoDetail (String DocumentNoDetail)
	{
		set_Value (COLUMNNAME_DocumentNoDetail, DocumentNoDetail);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNoDetail () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNoDetail);
	}

	/** Set Document No.
		@param DocumentNoMemo 
		Document sequence number of the document
	  */
	public void setDocumentNoMemo (String DocumentNoMemo)
	{
		set_Value (COLUMNNAME_DocumentNoMemo, DocumentNoMemo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNoMemo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNoMemo);
	}

	/** Set Document No.
		@param DocumentNoPhoto 
		Document sequence number of the document
	  */
	public void setDocumentNoPhoto (String DocumentNoPhoto)
	{
		set_Value (COLUMNNAME_DocumentNoPhoto, DocumentNoPhoto);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNoPhoto () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNoPhoto);
	}

	/** Set Document No.
		@param DocumentNoPhotoMemo 
		Document sequence number of the document
	  */
	public void setDocumentNoPhotoMemo (String DocumentNoPhotoMemo)
	{
		set_Value (COLUMNNAME_DocumentNoPhotoMemo, DocumentNoPhotoMemo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNoPhotoMemo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNoPhotoMemo);
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

	/** Set Printed.
		@param IsPrinted 
		Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted)
	{
		set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
	}

	/** Get Printed.
		@return Indicates if this document / line is printed
	  */
	public boolean isPrinted () 
	{
		Object oo = get_Value(COLUMNNAME_IsPrinted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** MemoCertStatus AD_Reference_ID=1000054 */
	public static final int MEMOCERTSTATUS_AD_Reference_ID=1000054;
	/** Completed = C */
	public static final String MEMOCERTSTATUS_Completed = "C";
	/** Cancelled = CN */
	public static final String MEMOCERTSTATUS_Cancelled = "CN";
	/** Open = O */
	public static final String MEMOCERTSTATUS_Open = "O";
	/** Set Memo Certificate Status.
		@param MemoCertStatus Memo Certificate Status	  */
	public void setMemoCertStatus (String MemoCertStatus)
	{

		set_Value (COLUMNNAME_MemoCertStatus, MemoCertStatus);
	}

	/** Get Memo Certificate Status.
		@return Memo Certificate Status	  */
	public String getMemoCertStatus () 
	{
		return (String)get_Value(COLUMNNAME_MemoCertStatus);
	}

	/** NormalHeat AD_Reference_ID=1000030 */
	public static final int NORMALHEAT_AD_Reference_ID=1000030;
	/** Normal = N */
	public static final String NORMALHEAT_Normal = "N";
	/** Heat/Unheat = HU */
	public static final String NORMALHEAT_HeatUnheat = "HU";
	/** Set NormalHeat.
		@param NormalHeat NormalHeat	  */
	public void setNormalHeat (String NormalHeat)
	{

		set_Value (COLUMNNAME_NormalHeat, NormalHeat);
	}

	/** Get NormalHeat.
		@return NormalHeat	  */
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

	/** PhotoCertStatus AD_Reference_ID=1000054 */
	public static final int PHOTOCERTSTATUS_AD_Reference_ID=1000054;
	/** Completed = C */
	public static final String PHOTOCERTSTATUS_Completed = "C";
	/** Cancelled = CN */
	public static final String PHOTOCERTSTATUS_Cancelled = "CN";
	/** Open = O */
	public static final String PHOTOCERTSTATUS_Open = "O";
	/** Set Photo Certificate Status.
		@param PhotoCertStatus Photo Certificate Status	  */
	public void setPhotoCertStatus (String PhotoCertStatus)
	{

		set_Value (COLUMNNAME_PhotoCertStatus, PhotoCertStatus);
	}

	/** Get Photo Certificate Status.
		@return Photo Certificate Status	  */
	public String getPhotoCertStatus () 
	{
		return (String)get_Value(COLUMNNAME_PhotoCertStatus);
	}

	/** PhotoMemoCertStatus AD_Reference_ID=1000054 */
	public static final int PHOTOMEMOCERTSTATUS_AD_Reference_ID=1000054;
	/** Completed = C */
	public static final String PHOTOMEMOCERTSTATUS_Completed = "C";
	/** Cancelled = CN */
	public static final String PHOTOMEMOCERTSTATUS_Cancelled = "CN";
	/** Open = O */
	public static final String PHOTOMEMOCERTSTATUS_Open = "O";
	/** Set Photo Memo Certificate Status.
		@param PhotoMemoCertStatus Photo Memo Certificate Status	  */
	public void setPhotoMemoCertStatus (String PhotoMemoCertStatus)
	{

		set_Value (COLUMNNAME_PhotoMemoCertStatus, PhotoMemoCertStatus);
	}

	/** Get Photo Memo Certificate Status.
		@return Photo Memo Certificate Status	  */
	public String getPhotoMemoCertStatus () 
	{
		return (String)get_Value(COLUMNNAME_PhotoMemoCertStatus);
	}

	/** Set Print Document.
		@param PrintDocument 
		Document to print
	  */
	public void setPrintDocument (String PrintDocument)
	{
		set_Value (COLUMNNAME_PrintDocument, PrintDocument);
	}

	/** Get Print Document.
		@return Document to print
	  */
	public String getPrintDocument () 
	{
		return (String)get_Value(COLUMNNAME_PrintDocument);
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

	/** Set Comments.
		@param ReasonCancelMemo Comments	  */
	public void setReasonCancelMemo (String ReasonCancelMemo)
	{
		set_Value (COLUMNNAME_ReasonCancelMemo, ReasonCancelMemo);
	}

	/** Get Comments.
		@return Comments	  */
	public String getReasonCancelMemo () 
	{
		return (String)get_Value(COLUMNNAME_ReasonCancelMemo);
	}

	/** Set Comments.
		@param ReasonCancelPhotoMemo Comments	  */
	public void setReasonCancelPhotoMemo (String ReasonCancelPhotoMemo)
	{
		set_Value (COLUMNNAME_ReasonCancelPhotoMemo, ReasonCancelPhotoMemo);
	}

	/** Get Comments.
		@return Comments	  */
	public String getReasonCancelPhotoMemo () 
	{
		return (String)get_Value(COLUMNNAME_ReasonCancelPhotoMemo);
	}

	/** Set Comments.
		@param ReasonDetailCan Comments	  */
	public void setReasonDetailCan (String ReasonDetailCan)
	{
		set_Value (COLUMNNAME_ReasonDetailCan, ReasonDetailCan);
	}

	/** Get Comments.
		@return Comments	  */
	public String getReasonDetailCan () 
	{
		return (String)get_Value(COLUMNNAME_ReasonDetailCan);
	}

	/** Set Comments.
		@param ReasonPhotoCancel Comments	  */
	public void setReasonPhotoCancel (String ReasonPhotoCancel)
	{
		set_Value (COLUMNNAME_ReasonPhotoCancel, ReasonPhotoCancel);
	}

	/** Get Comments.
		@return Comments	  */
	public String getReasonPhotoCancel () 
	{
		return (String)get_Value(COLUMNNAME_ReasonPhotoCancel);
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