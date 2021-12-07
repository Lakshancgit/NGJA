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

/** Generated Model for C_BackhoeService
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_BackhoeService extends PO implements I_C_BackhoeService, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190429L;

    /** Standard Constructor */
    public X_C_BackhoeService (Properties ctx, int C_BackhoeService_ID, String trxName)
    {
      super (ctx, C_BackhoeService_ID, trxName);
      /** if (C_BackhoeService_ID == 0)
        {
			setC_BackhoeService_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_BackhoeService (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_BackhoeService[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set ApprovedSquarefeet.
		@param ApprovedSquarefeet ApprovedSquarefeet	  */
	public void setApprovedSquarefeet (BigDecimal ApprovedSquarefeet)
	{
		set_Value (COLUMNNAME_ApprovedSquarefeet, ApprovedSquarefeet);
	}

	/** Get ApprovedSquarefeet.
		@return ApprovedSquarefeet	  */
	public BigDecimal getApprovedSquarefeet () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ApprovedSquarefeet);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set BackhoeService ID.
		@param C_BackhoeService_ID BackhoeService ID	  */
	public void setC_BackhoeService_ID (int C_BackhoeService_ID)
	{
		if (C_BackhoeService_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BackhoeService_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BackhoeService_ID, Integer.valueOf(C_BackhoeService_ID));
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

	/** Set EngineeringServiceFee .
		@param EngineeringServiceFee EngineeringServiceFee 	  */
	public void setEngineeringServiceFee (BigDecimal EngineeringServiceFee)
	{
		set_Value (COLUMNNAME_EngineeringServiceFee, EngineeringServiceFee);
	}

	/** Get EngineeringServiceFee .
		@return EngineeringServiceFee 	  */
	public BigDecimal getEngineeringServiceFee () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_EngineeringServiceFee);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** LicenseStatus AD_Reference_ID=1000121 */
	public static final int LICENSESTATUS_AD_Reference_ID=1000121;
	/** Prepare = P */
	public static final String LICENSESTATUS_Prepare = "P";
	/** Send For Deputy Director Approval = SDA */
	public static final String LICENSESTATUS_SendForDeputyDirectorApproval = "SDA";
	/** Active = A */
	public static final String LICENSESTATUS_Active = "A";
	/** Inactive = IN */
	public static final String LICENSESTATUS_Inactive = "IN";
	/** Set License Status.
		@param LicenseStatus License Status	  */
	public void setLicenseStatus (String LicenseStatus)
	{

		set_Value (COLUMNNAME_LicenseStatus, LicenseStatus);
	}

	/** Get License Status.
		@return License Status	  */
	public String getLicenseStatus () 
	{
		return (String)get_Value(COLUMNNAME_LicenseStatus);
	}

	/** Set NoOfGravelMachines.
		@param NoOfGravelMachines NoOfGravelMachines	  */
	public void setNoOfGravelMachines (BigDecimal NoOfGravelMachines)
	{
		set_Value (COLUMNNAME_NoOfGravelMachines, NoOfGravelMachines);
	}

	/** Get NoOfGravelMachines.
		@return NoOfGravelMachines	  */
	public BigDecimal getNoOfGravelMachines () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NoOfGravelMachines);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set NumberOfBackhoes.
		@param NumberOfBackhoes NumberOfBackhoes	  */
	public void setNumberOfBackhoes (BigDecimal NumberOfBackhoes)
	{
		set_Value (COLUMNNAME_NumberOfBackhoes, NumberOfBackhoes);
	}

	/** Get NumberOfBackhoes.
		@return NumberOfBackhoes	  */
	public BigDecimal getNumberOfBackhoes () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NumberOfBackhoes);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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