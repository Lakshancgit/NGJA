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

/** Generated Model for C_MiningLicenseUpgrade
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_MiningLicenseUpgrade extends PO implements I_C_MiningLicenseUpgrade, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190513L;

    /** Standard Constructor */
    public X_C_MiningLicenseUpgrade (Properties ctx, int C_MiningLicenseUpgrade_ID, String trxName)
    {
      super (ctx, C_MiningLicenseUpgrade_ID, trxName);
      /** if (C_MiningLicenseUpgrade_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_C_MiningLicenseUpgrade (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_MiningLicenseUpgrade[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Payment getBondPayment() throws RuntimeException
    {
		return (org.compiere.model.I_C_Payment)MTable.get(getCtx(), org.compiere.model.I_C_Payment.Table_Name)
			.getPO(getBondPayment_ID(), get_TrxName());	}

	/** Set BondPayment_ID.
		@param BondPayment_ID BondPayment_ID	  */
	public void setBondPayment_ID (int BondPayment_ID)
	{
		if (BondPayment_ID < 1) 
			set_Value (COLUMNNAME_BondPayment_ID, null);
		else 
			set_Value (COLUMNNAME_BondPayment_ID, Integer.valueOf(BondPayment_ID));
	}

	/** Get BondPayment_ID.
		@return BondPayment_ID	  */
	public int getBondPayment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_BondPayment_ID);
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

	public org.topra.model.I_C_LandDetails getC_LandDetails() throws RuntimeException
    {
		return (org.topra.model.I_C_LandDetails)MTable.get(getCtx(), org.topra.model.I_C_LandDetails.Table_Name)
			.getPO(getC_LandDetails_ID(), get_TrxName());	}

	/** Set Land Details ID.
		@param C_LandDetails_ID Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID)
	{
		if (C_LandDetails_ID < 1) 
			set_Value (COLUMNNAME_C_LandDetails_ID, null);
		else 
			set_Value (COLUMNNAME_C_LandDetails_ID, Integer.valueOf(C_LandDetails_ID));
	}

	/** Get Land Details ID.
		@return Land Details ID	  */
	public int getC_LandDetails_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandDetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Mining License Upgrade ID.
		@param C_MiningLicenseUpgrade_ID Mining License Upgrade ID	  */
	public void setC_MiningLicenseUpgrade_ID (int C_MiningLicenseUpgrade_ID)
	{
		if (C_MiningLicenseUpgrade_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MiningLicenseUpgrade_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MiningLicenseUpgrade_ID, Integer.valueOf(C_MiningLicenseUpgrade_ID));
	}

	/** Get Mining License Upgrade ID.
		@return Mining License Upgrade ID	  */
	public int getC_MiningLicenseUpgrade_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MiningLicenseUpgrade_ID);
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
		set_ValueNoCheck (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set Date Start.
		@param DateStart 
		Date Start for this Order
	  */
	public void setDateStart (Timestamp DateStart)
	{
		set_ValueNoCheck (COLUMNNAME_DateStart, DateStart);
	}

	/** Get Date Start.
		@return Date Start for this Order
	  */
	public Timestamp getDateStart () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateStart);
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
		set_ValueNoCheck (COLUMNNAME_EndDate, EndDate);
	}

	/** Get End Date.
		@return Last effective date (inclusive)
	  */
	public Timestamp getEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EndDate);
	}

	/** Set FileNo.
		@param FileNo FileNo	  */
	public void setFileNo (String FileNo)
	{
		set_ValueNoCheck (COLUMNNAME_FileNo, FileNo);
	}

	/** Get FileNo.
		@return FileNo	  */
	public String getFileNo () 
	{
		return (String)get_Value(COLUMNNAME_FileNo);
	}

	/** Set NoOfExtendMines.
		@param NoOfExtendMines NoOfExtendMines	  */
	public void setNoOfExtendMines (int NoOfExtendMines)
	{
		set_Value (COLUMNNAME_NoOfExtendMines, Integer.valueOf(NoOfExtendMines));
	}

	/** Get NoOfExtendMines.
		@return NoOfExtendMines	  */
	public int getNoOfExtendMines () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfExtendMines);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set NoOfMine.
		@param NoOfMine NoOfMine	  */
	public void setNoOfMine (int NoOfMine)
	{
		set_ValueNoCheck (COLUMNNAME_NoOfMine, Integer.valueOf(NoOfMine));
	}

	/** Get NoOfMine.
		@return NoOfMine	  */
	public int getNoOfMine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfMine);
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

	/** Status AD_Reference_ID=1000143 */
	public static final int STATUS_AD_Reference_ID=1000143;
	/** Send For RM Approval = SRA */
	public static final String STATUS_SendForRMApproval = "SRA";
	/** Send For Inspection Approval = SIA */
	public static final String STATUS_SendForInspectionApproval = "SIA";
	/** Prepare = P */
	public static final String STATUS_Prepare = "P";
	/** Upgraded = U */
	public static final String STATUS_Upgraded = "U";
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

	/** Set Total Mines.
		@param TotalQty 
		Total Quantity
	  */
	public void setTotalQty (int TotalQty)
	{
		set_Value (COLUMNNAME_TotalQty, Integer.valueOf(TotalQty));
	}

	/** Get Total Mines.
		@return Total Quantity
	  */
	public int getTotalQty () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TotalQty);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** UpgradeMethod AD_Reference_ID=1000155 */
	public static final int UPGRADEMETHOD_AD_Reference_ID=1000155;
	/** Reservation Change = RC */
	public static final String UPGRADEMETHOD_ReservationChange = "RC";
	/** Extend The No of Mine = ENM */
	public static final String UPGRADEMETHOD_ExtendTheNoOfMine = "ENM";
	/** Set UpgradeMethod.
		@param UpgradeMethod UpgradeMethod	  */
	public void setUpgradeMethod (String UpgradeMethod)
	{

		set_Value (COLUMNNAME_UpgradeMethod, UpgradeMethod);
	}

	/** Get UpgradeMethod.
		@return UpgradeMethod	  */
	public String getUpgradeMethod () 
	{
		return (String)get_Value(COLUMNNAME_UpgradeMethod);
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