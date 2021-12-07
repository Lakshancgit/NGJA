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

/** Generated Model for C_AuctionLicenseFinal
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_AuctionLicenseFinal extends PO implements I_C_AuctionLicenseFinal, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190508L;

    /** Standard Constructor */
    public X_C_AuctionLicenseFinal (Properties ctx, int C_AuctionLicenseFinal_ID, String trxName)
    {
      super (ctx, C_AuctionLicenseFinal_ID, trxName);
      /** if (C_AuctionLicenseFinal_ID == 0)
        {
			setC_AuctionLicenseFinal_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_AuctionLicenseFinal (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_AuctionLicenseFinal[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Invoice getC_AuctionInvoice() throws RuntimeException
    {
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_Name)
			.getPO(getC_AuctionInvoice_ID(), get_TrxName());	}

	/** Set C_AuctionInvoice_ID.
		@param C_AuctionInvoice_ID C_AuctionInvoice_ID	  */
	public void setC_AuctionInvoice_ID (int C_AuctionInvoice_ID)
	{
		if (C_AuctionInvoice_ID < 1) 
			set_Value (COLUMNNAME_C_AuctionInvoice_ID, null);
		else 
			set_Value (COLUMNNAME_C_AuctionInvoice_ID, Integer.valueOf(C_AuctionInvoice_ID));
	}

	/** Get C_AuctionInvoice_ID.
		@return C_AuctionInvoice_ID	  */
	public int getC_AuctionInvoice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AuctionInvoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AuctionLicenseFinal ID.
		@param C_AuctionLicenseFinal_ID AuctionLicenseFinal ID	  */
	public void setC_AuctionLicenseFinal_ID (int C_AuctionLicenseFinal_ID)
	{
		if (C_AuctionLicenseFinal_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_AuctionLicenseFinal_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_AuctionLicenseFinal_ID, Integer.valueOf(C_AuctionLicenseFinal_ID));
	}

	/** Get AuctionLicenseFinal ID.
		@return AuctionLicenseFinal ID	  */
	public int getC_AuctionLicenseFinal_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AuctionLicenseFinal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_AuctionLicense getC_AuctionLicense() throws RuntimeException
    {
		return (org.topra.model.I_C_AuctionLicense)MTable.get(getCtx(), org.topra.model.I_C_AuctionLicense.Table_Name)
			.getPO(getC_AuctionLicense_ID(), get_TrxName());	}

	/** Set AuctionLicense ID.
		@param C_AuctionLicense_ID AuctionLicense ID	  */
	public void setC_AuctionLicense_ID (int C_AuctionLicense_ID)
	{
		if (C_AuctionLicense_ID < 1) 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, null);
		else 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, Integer.valueOf(C_AuctionLicense_ID));
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

	/** Status AD_Reference_ID=1000167 */
	public static final int STATUS_AD_Reference_ID=1000167;
	/** Prepare = P */
	public static final String STATUS_Prepare = "P";
	/** Send for RM APP = SRMA */
	public static final String STATUS_SendForRMAPP = "SRMA";
	/** P A I D = PAID */
	public static final String STATUS_PAID = "PAID";
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

	/** Set TaxFileNo.
		@param TaxFileNo TaxFileNo	  */
	public void setTaxFileNo (String TaxFileNo)
	{
		set_Value (COLUMNNAME_TaxFileNo, TaxFileNo);
	}

	/** Get TaxFileNo.
		@return TaxFileNo	  */
	public String getTaxFileNo () 
	{
		return (String)get_Value(COLUMNNAME_TaxFileNo);
	}

	/** Set TaxValue.
		@param TaxValue TaxValue	  */
	public void setTaxValue (String TaxValue)
	{
		set_Value (COLUMNNAME_TaxValue, TaxValue);
	}

	/** Get TaxValue.
		@return TaxValue	  */
	public String getTaxValue () 
	{
		return (String)get_Value(COLUMNNAME_TaxValue);
	}

	/** Set TotalGemSale.
		@param TotalGemSale TotalGemSale	  */
	public void setTotalGemSale (BigDecimal TotalGemSale)
	{
		set_Value (COLUMNNAME_TotalGemSale, TotalGemSale);
	}

	/** Get TotalGemSale.
		@return TotalGemSale	  */
	public BigDecimal getTotalGemSale () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalGemSale);
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

	/** ValueNumber AD_Reference_ID=1000168 */
	public static final int VALUENUMBER_AD_Reference_ID=1000168;
	/** 2.5% = 2.5 */
	public static final String VALUENUMBER_25 = "2.5";
	/** Set Value.
		@param ValueNumber 
		Numeric Value
	  */
	public void setValueNumber (String ValueNumber)
	{

		set_Value (COLUMNNAME_ValueNumber, ValueNumber);
	}

	/** Get Value.
		@return Numeric Value
	  */
	public String getValueNumber () 
	{
		return (String)get_Value(COLUMNNAME_ValueNumber);
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
}