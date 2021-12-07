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

/** Generated Model for ExpReturnSale
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_ExpReturnSale extends PO implements I_ExpReturnSale, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190329L;

    /** Standard Constructor */
    public X_ExpReturnSale (Properties ctx, int ExpReturnSale_ID, String trxName)
    {
      super (ctx, ExpReturnSale_ID, trxName);
      /** if (ExpReturnSale_ID == 0)
        {
			setC_ExportNGJA_ID (0);
			setExpReturnSale_ID (0);
        } */
    }

    /** Load Constructor */
    public X_ExpReturnSale (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_ExpReturnSale[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.topra.model.I_C_ExportNGJA getC_ExportNGJA() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportNGJA)MTable.get(getCtx(), org.topra.model.I_C_ExportNGJA.Table_Name)
			.getPO(getC_ExportNGJA_ID(), get_TrxName());	}

	/** Set C_ExportNGJA ID.
		@param C_ExportNGJA_ID C_ExportNGJA ID	  */
	public void setC_ExportNGJA_ID (int C_ExportNGJA_ID)
	{
		if (C_ExportNGJA_ID < 1) 
			set_Value (COLUMNNAME_C_ExportNGJA_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportNGJA_ID, Integer.valueOf(C_ExportNGJA_ID));
	}

	/** Get C_ExportNGJA ID.
		@return C_ExportNGJA ID	  */
	public int getC_ExportNGJA_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportNGJA_ID);
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

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException
    {
		return (org.compiere.model.I_C_Payment)MTable.get(getCtx(), org.compiere.model.I_C_Payment.Table_Name)
			.getPO(getC_Payment_ID(), get_TrxName());	}

	/** Set Payment.
		@param C_Payment_ID 
		Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID)
	{
		if (C_Payment_ID < 1) 
			set_Value (COLUMNNAME_C_Payment_ID, null);
		else 
			set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
	}

	/** Get Payment.
		@return Payment identifier
	  */
	public int getC_Payment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** DocumentStatus AD_Reference_ID=1000154 */
	public static final int DOCUMENTSTATUS_AD_Reference_ID=1000154;
	/** Send For AD-Officer Approval = AD */
	public static final String DOCUMENTSTATUS_SendForAD_OfficerApproval = "AD";
	/** Send For AD-Officer Final Approval = ADF */
	public static final String DOCUMENTSTATUS_SendForAD_OfficerFinalApproval = "ADF";
	/** Send For MA Confirmation = MAC */
	public static final String DOCUMENTSTATUS_SendForMAConfirmation = "MAC";
	/** Prepared = PR */
	public static final String DOCUMENTSTATUS_Prepared = "PR";
	/** Send For Implementation Officer Approval = SIOA */
	public static final String DOCUMENTSTATUS_SendForImplementationOfficerApproval = "SIOA";
	/** Voided = VO */
	public static final String DOCUMENTSTATUS_Voided = "VO";
	/** Returned = R */
	public static final String DOCUMENTSTATUS_Returned = "R";
	/** MA Approval = MA */
	public static final String DOCUMENTSTATUS_MAApproval = "MA";
	/** Set Document Status.
		@param DocumentStatus Document Status	  */
	public void setDocumentStatus (String DocumentStatus)
	{

		set_Value (COLUMNNAME_DocumentStatus, DocumentStatus);
	}

	/** Get Document Status.
		@return Document Status	  */
	public String getDocumentStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocumentStatus);
	}

	/** Set Export Return & Sale ID.
		@param ExpReturnSale_ID Export Return & Sale ID	  */
	public void setExpReturnSale_ID (int ExpReturnSale_ID)
	{
		if (ExpReturnSale_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ExpReturnSale_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ExpReturnSale_ID, Integer.valueOf(ExpReturnSale_ID));
	}

	/** Get Export Return & Sale ID.
		@return Export Return & Sale ID	  */
	public int getExpReturnSale_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ExpReturnSale_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Generate To.
		@param GenerateTo 
		Generate To
	  */
	public void setGenerateTo (String GenerateTo)
	{
		set_Value (COLUMNNAME_GenerateTo, GenerateTo);
	}

	/** Get Generate To.
		@return Generate To
	  */
	public String getGenerateTo () 
	{
		return (String)get_Value(COLUMNNAME_GenerateTo);
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

	/** Set ViewInfoBtn.
		@param ViewInfoBtn ViewInfoBtn	  */
	public void setViewInfoBtn (String ViewInfoBtn)
	{
		set_Value (COLUMNNAME_ViewInfoBtn, ViewInfoBtn);
	}

	/** Get ViewInfoBtn.
		@return ViewInfoBtn	  */
	public String getViewInfoBtn () 
	{
		return (String)get_Value(COLUMNNAME_ViewInfoBtn);
	}
}