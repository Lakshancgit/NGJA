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

/** Generated Model for C_ReceivingNote
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ReceivingNote extends PO implements I_C_ReceivingNote, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191009L;

    /** Standard Constructor */
    public X_C_ReceivingNote (Properties ctx, int C_ReceivingNote_ID, String trxName)
    {
      super (ctx, C_ReceivingNote_ID, trxName);
      /** if (C_ReceivingNote_ID == 0)
        {
			setC_ReceivingNote_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_ReceivingNote (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ReceivingNote[")
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

	/** Set No.of Reports.
		@param reportCount No.of Reports	  */
	public void setreportCount (String reportCount)
	{
		set_Value (COLUMNNAME_reportCount, reportCount);
	}

	/** Get No.of Reports.
		@return No.of Reports	  */
	public String getreportCount () 
	{
		return (String)get_Value(COLUMNNAME_reportCount);
	}

	/** Status AD_Reference_ID=1000026 */
	public static final int STATUS_AD_Reference_ID=1000026;
	/** Send for Testing = T */
	public static final String STATUS_SendForTesting = "T";
	/** Prepare = P */
	public static final String STATUS_Prepare = "P";
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