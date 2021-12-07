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

/** Generated Model for C_BackhoeServiceFee
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_BackhoeServiceFee extends PO implements I_C_BackhoeServiceFee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190506L;

    /** Standard Constructor */
    public X_C_BackhoeServiceFee (Properties ctx, int C_BackhoeServiceFee_ID, String trxName)
    {
      super (ctx, C_BackhoeServiceFee_ID, trxName);
      /** if (C_BackhoeServiceFee_ID == 0)
        {
			setC_BackhoeServiceFee_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_BackhoeServiceFee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_BackhoeServiceFee[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set BackhoeLicenseServiceFee ID.
		@param C_BackhoeServiceFee_ID BackhoeLicenseServiceFee ID	  */
	public void setC_BackhoeServiceFee_ID (int C_BackhoeServiceFee_ID)
	{
		if (C_BackhoeServiceFee_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BackhoeServiceFee_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BackhoeServiceFee_ID, Integer.valueOf(C_BackhoeServiceFee_ID));
	}

	/** Get BackhoeLicenseServiceFee ID.
		@return BackhoeLicenseServiceFee ID	  */
	public int getC_BackhoeServiceFee_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BackhoeServiceFee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_BackhoeService getC_BackhoeService() throws RuntimeException
    {
		return (org.topra.model.I_C_BackhoeService)MTable.get(getCtx(), org.topra.model.I_C_BackhoeService.Table_Name)
			.getPO(getC_BackhoeService_ID(), get_TrxName());	}

	/** Set BackhoeService ID.
		@param C_BackhoeService_ID BackhoeService ID	  */
	public void setC_BackhoeService_ID (int C_BackhoeService_ID)
	{
		if (C_BackhoeService_ID < 1) 
			set_Value (COLUMNNAME_C_BackhoeService_ID, null);
		else 
			set_Value (COLUMNNAME_C_BackhoeService_ID, Integer.valueOf(C_BackhoeService_ID));
	}

	/** Get BackhoeService ID.
		@return BackhoeService ID	  */
	public int getC_BackhoeService_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BackhoeService_ID);
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

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException
    {
		return (org.compiere.model.I_C_Order)MTable.get(getCtx(), org.compiere.model.I_C_Order.Table_Name)
			.getPO(getC_Order_ID(), get_TrxName());	}

	/** Set Order.
		@param C_Order_ID 
		Order
	  */
	public void setC_Order_ID (int C_Order_ID)
	{
		if (C_Order_ID < 1) 
			set_Value (COLUMNNAME_C_Order_ID, null);
		else 
			set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
	}

	/** Get Order.
		@return Order
	  */
	public int getC_Order_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Status AD_Reference_ID=1000162 */
	public static final int STATUS_AD_Reference_ID=1000162;
	/** Prepare = P */
	public static final String STATUS_Prepare = "P";
	/** Send For RM APP = RM */
	public static final String STATUS_SendForRMAPP = "RM";
	/** Waiting For Payment = Cash */
	public static final String STATUS_WaitingForPayment = "Cash";
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

	/** Set ZoomRecord.
		@param ZoomRecord ZoomRecord	  */
	public void setZoomRecord (String ZoomRecord)
	{
		set_Value (COLUMNNAME_ZoomRecord, ZoomRecord);
	}

	/** Get ZoomRecord.
		@return ZoomRecord	  */
	public String getZoomRecord () 
	{
		return (String)get_Value(COLUMNNAME_ZoomRecord);
	}
}