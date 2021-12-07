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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for C_AuctionLicense
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_AuctionLicense extends PO implements I_C_AuctionLicense, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190506L;

    /** Standard Constructor */
    public X_C_AuctionLicense (Properties ctx, int C_AuctionLicense_ID, String trxName)
    {
      super (ctx, C_AuctionLicense_ID, trxName);
      /** if (C_AuctionLicense_ID == 0)
        {
			setC_AuctionLicense_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_AuctionLicense (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_AuctionLicense[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** AuctionLicesneStatus AD_Reference_ID=1000119 */
	public static final int AUCTIONLICESNESTATUS_AD_Reference_ID=1000119;
	/** Active = A */
	public static final String AUCTIONLICESNESTATUS_Active = "A";
	/** Inactive = I */
	public static final String AUCTIONLICESNESTATUS_Inactive = "I";
	/** Send For RM Approval = SFRA */
	public static final String AUCTIONLICESNESTATUS_SendForRMApproval = "SFRA";
	/** Prepare = P */
	public static final String AUCTIONLICESNESTATUS_Prepare = "P";
	
	/** Set AuctionLicesneStatus.
		@param AuctionLicesneStatus AuctionLicesneStatus	  */
	public void setAuctionLicesneStatus (String AuctionLicesneStatus)
	{

		set_Value (COLUMNNAME_AuctionLicesneStatus, AuctionLicesneStatus);
	}

	/** Get AuctionLicesneStatus.
		@return AuctionLicesneStatus	  */
	public String getAuctionLicesneStatus () 
	{
		return (String)get_Value(COLUMNNAME_AuctionLicesneStatus);
	}

	/** Set AuctionPlace.
		@param AuctionPlace AuctionPlace	  */
	public void setAuctionPlace (String AuctionPlace)
	{
		set_Value (COLUMNNAME_AuctionPlace, AuctionPlace);
	}

	/** Get AuctionPlace.
		@return AuctionPlace	  */
	public String getAuctionPlace () 
	{
		return (String)get_Value(COLUMNNAME_AuctionPlace);
	}

	/** Set AuctionLicense ID.
		@param C_AuctionLicense_ID AuctionLicense ID	  */
	public void setC_AuctionLicense_ID (int C_AuctionLicense_ID)
	{
		if (C_AuctionLicense_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_AuctionLicense_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_AuctionLicense_ID, Integer.valueOf(C_AuctionLicense_ID));
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

	public org.topra.model.I_C_GemMining getC_GemMining() throws RuntimeException
    {
		return (org.topra.model.I_C_GemMining)MTable.get(getCtx(), org.topra.model.I_C_GemMining.Table_Name)
			.getPO(getC_GemMining_ID(), get_TrxName());	}

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

	/** Set Finish Date.
		@param DateFinish 
		Finish or (planned) completion date
	  */
	public void setDateFinish (Timestamp DateFinish)
	{
		set_Value (COLUMNNAME_DateFinish, DateFinish);
	}

	/** Get Finish Date.
		@return Finish or (planned) completion date
	  */
	public Timestamp getDateFinish () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFinish);
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

	/** Set End Date.
		@param EndDate 
		Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate)
	{
		set_Value (COLUMNNAME_EndDate, EndDate);
	}

	/** Get End Date.
		@return Last effective date (inclusive)
	  */
	public Timestamp getEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EndDate);
	}

	/** Set End Time.
		@param EndTime 
		End of the time span
	  */
	public void setEndTime (Timestamp EndTime)
	{
		set_Value (COLUMNNAME_EndTime, EndTime);
	}

	/** Get End Time.
		@return End of the time span
	  */
	public Timestamp getEndTime () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EndTime);
	}

	/** Set Last Active Year.
		@param LastActiveYear Last Active Year	  */
	public void setLastActiveYear (String LastActiveYear)
	{
		set_Value (COLUMNNAME_LastActiveYear, LastActiveYear);
	}

	/** Get Last Active Year.
		@return Last Active Year	  */
	public String getLastActiveYear () 
	{
		return (String)get_Value(COLUMNNAME_LastActiveYear);
	}

	/** Set NoOfApprovedGemPitM.
		@param NoOfApprovedGemPitM NoOfApprovedGemPitM	  */
	public void setNoOfApprovedGemPitM (int NoOfApprovedGemPitM)
	{
		set_Value (COLUMNNAME_NoOfApprovedGemPitM, Integer.valueOf(NoOfApprovedGemPitM));
	}

	/** Get NoOfApprovedGemPitM.
		@return NoOfApprovedGemPitM	  */
	public int getNoOfApprovedGemPitM () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfApprovedGemPitM);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NoOfApprovedGemPitN.
		@param NoOfApprovedGemPitN NoOfApprovedGemPitN	  */
	public void setNoOfApprovedGemPitN (int NoOfApprovedGemPitN)
	{
		set_Value (COLUMNNAME_NoOfApprovedGemPitN, Integer.valueOf(NoOfApprovedGemPitN));
	}

	/** Get NoOfApprovedGemPitN.
		@return NoOfApprovedGemPitN	  */
	public int getNoOfApprovedGemPitN () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfApprovedGemPitN);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PrintBtn.
		@param PrintBtn PrintBtn	  */
	public void setPrintBtn (String PrintBtn)
	{
		set_Value (COLUMNNAME_PrintBtn, PrintBtn);
	}

	/** Get PrintBtn.
		@return PrintBtn	  */
	public String getPrintBtn () 
	{
		return (String)get_Value(COLUMNNAME_PrintBtn);
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

	/** Set Printed.
		@param Printed Printed	  */
	public void setPrinted (boolean Printed)
	{
		set_Value (COLUMNNAME_Printed, Boolean.valueOf(Printed));
	}

	/** Get Printed.
		@return Printed	  */
	public boolean isPrinted () 
	{
		Object oo = get_Value(COLUMNNAME_Printed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Start Date.
		@param StartDate 
		First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate)
	{
		set_Value (COLUMNNAME_StartDate, StartDate);
	}

	/** Get Start Date.
		@return First effective day (inclusive)
	  */
	public Timestamp getStartDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_StartDate);
	}

	/** Set Start Time.
		@param StartTime 
		Time started
	  */
	public void setStartTime (Timestamp StartTime)
	{
		set_Value (COLUMNNAME_StartTime, StartTime);
	}

	/** Get Start Time.
		@return Time started
	  */
	public Timestamp getStartTime () 
	{
		return (Timestamp)get_Value(COLUMNNAME_StartTime);
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

	/** Set Value.
		@param ValueNumber 
		Numeric Value
	  */
	public void setValueNumber (BigDecimal ValueNumber)
	{
		set_Value (COLUMNNAME_ValueNumber, ValueNumber);
	}

	/** Get Value.
		@return Numeric Value
	  */
	public BigDecimal getValueNumber () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ValueNumber);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Load Informations.
		@param ZoomBtn Load Informations	  */
	public void setZoomBtn (String ZoomBtn)
	{
		set_Value (COLUMNNAME_ZoomBtn, ZoomBtn);
	}

	/** Get Load Informations.
		@return Load Informations	  */
	public String getZoomBtn () 
	{
		return (String)get_Value(COLUMNNAME_ZoomBtn);
	}
}