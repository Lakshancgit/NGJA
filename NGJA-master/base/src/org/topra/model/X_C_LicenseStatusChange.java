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

/** Generated Model for C_LicenseStatusChange
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_LicenseStatusChange extends PO implements I_C_LicenseStatusChange, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200211L;

    /** Standard Constructor */
    public X_C_LicenseStatusChange (Properties ctx, int C_LicenseStatusChange_ID, String trxName)
    {
      super (ctx, C_LicenseStatusChange_ID, trxName);
      /** if (C_LicenseStatusChange_ID == 0)
        {
			setC_LicenseStatusChange_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_LicenseStatusChange (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_LicenseStatusChange[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Backhoe_CurrentStatus AD_Reference_ID=1000121 */
	public static final int BACKHOE_CURRENTSTATUS_AD_Reference_ID=1000121;
	/** Prepare = P */
	public static final String BACKHOE_CURRENTSTATUS_Prepare = "P";
	/** Send For Deputy Director Approval = SDA */
	public static final String BACKHOE_CURRENTSTATUS_SendForDeputyDirectorApproval = "SDA";
	/** Active = A */
	public static final String BACKHOE_CURRENTSTATUS_Active = "A";
	/** Inactive = IN */
	public static final String BACKHOE_CURRENTSTATUS_Inactive = "IN";
	/** Send For Inspection Officer Approval = SIA */
	public static final String BACKHOE_CURRENTSTATUS_SendForInspectionOfficerApproval = "SIA";
	/** Set Backhoe_CurrentStatus.
		@param Backhoe_CurrentStatus 
		License Status o Backhoe Lisences
	  */
	public void setBackhoe_CurrentStatus (String Backhoe_CurrentStatus)
	{

		set_Value (COLUMNNAME_Backhoe_CurrentStatus, Backhoe_CurrentStatus);
	}

	/** Get Backhoe_CurrentStatus.
		@return License Status o Backhoe Lisences
	  */
	public String getBackhoe_CurrentStatus () 
	{
		return (String)get_Value(COLUMNNAME_Backhoe_CurrentStatus);
	}

	/** Backhoe_NextStatus AD_Reference_ID=1000107 */
	public static final int BACKHOE_NEXTSTATUS_AD_Reference_ID=1000107;
	/** Prepare = P */
	public static final String BACKHOE_NEXTSTATUS_Prepare = "P";
	/** Send for inspection Approval = SIA */
	public static final String BACKHOE_NEXTSTATUS_SendForInspectionApproval = "SIA";
	/** Send for diputy director Approval = SDDA */
	public static final String BACKHOE_NEXTSTATUS_SendForDiputyDirectorApproval = "SDDA";
	/** Send for director Approval = SDA */
	public static final String BACKHOE_NEXTSTATUS_SendForDirectorApproval = "SDA";
	/** Send for chairman approval = SCA */
	public static final String BACKHOE_NEXTSTATUS_SendForChairmanApproval = "SCA";
	/** Reject = R */
	public static final String BACKHOE_NEXTSTATUS_Reject = "R";
	/** Active = A */
	public static final String BACKHOE_NEXTSTATUS_Active = "A";
	/** Inactive = IN */
	public static final String BACKHOE_NEXTSTATUS_Inactive = "IN";
	/** Send for Legal Officer Approval = SAL */
	public static final String BACKHOE_NEXTSTATUS_SendForLegalOfficerApproval = "SAL";
	/** Record Not Completed = NC */
	public static final String BACKHOE_NEXTSTATUS_RecordNotCompleted = "NC";
	/** Incomplete Ownership = ICO */
	public static final String BACKHOE_NEXTSTATUS_IncompleteOwnership = "ICO";
	/** Close = CL */
	public static final String BACKHOE_NEXTSTATUS_Close = "CL";
	/** Ready for Accountant Approval = RFA */
	public static final String BACKHOE_NEXTSTATUS_ReadyForAccountantApproval = "RFA";
	/** Released = REL */
	public static final String BACKHOE_NEXTSTATUS_Released = "REL";
	/** Ready to Print = RTP */
	public static final String BACKHOE_NEXTSTATUS_ReadyToPrint = "RTP";
	/** Set Backhoe_NextStatus.
		@param Backhoe_NextStatus 
		License Status of Backhoe Lisences
	  */
	public void setBackhoe_NextStatus (String Backhoe_NextStatus)
	{

		set_Value (COLUMNNAME_Backhoe_NextStatus, Backhoe_NextStatus);
	}

	/** Get Backhoe_NextStatus.
		@return License Status of Backhoe Lisences
	  */
	public String getBackhoe_NextStatus () 
	{
		return (String)get_Value(COLUMNNAME_Backhoe_NextStatus);
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

	public org.topra.model.I_C_DealerFile getC_DealerFile() throws RuntimeException
    {
		return (org.topra.model.I_C_DealerFile)MTable.get(getCtx(), org.topra.model.I_C_DealerFile.Table_Name)
			.getPO(getC_DealerFile_ID(), get_TrxName());	}

	/** Set Dealer File Number ID.
		@param C_DealerFile_ID Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID)
	{
		if (C_DealerFile_ID < 1) 
			set_Value (COLUMNNAME_C_DealerFile_ID, null);
		else 
			set_Value (COLUMNNAME_C_DealerFile_ID, Integer.valueOf(C_DealerFile_ID));
	}

	/** Get Dealer File Number ID.
		@return Dealer File Number ID	  */
	public int getC_DealerFile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DealerFile_ID);
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

	/** Set License Status Change  ID.
		@param C_LicenseStatusChange_ID License Status Change  ID	  */
	public void setC_LicenseStatusChange_ID (int C_LicenseStatusChange_ID)
	{
		if (C_LicenseStatusChange_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_LicenseStatusChange_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_LicenseStatusChange_ID, Integer.valueOf(C_LicenseStatusChange_ID));
	}

	/** Get License Status Change  ID.
		@return License Status Change  ID	  */
	public int getC_LicenseStatusChange_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LicenseStatusChange_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Create Confirm.
		@param CreateConfirm Create Confirm	  */
	public void setCreateConfirm (String CreateConfirm)
	{
		set_Value (COLUMNNAME_CreateConfirm, CreateConfirm);
	}

	/** Get Create Confirm.
		@return Create Confirm	  */
	public String getCreateConfirm () 
	{
		return (String)get_Value(COLUMNNAME_CreateConfirm);
	}

	/** Set Gem Dealer License ID.
		@param D_DealerLicense_ID Gem Dealer License ID	  */
	public void setD_DealerLicense_ID (int D_DealerLicense_ID)
	{
		if (D_DealerLicense_ID < 1) 
			set_Value (COLUMNNAME_D_DealerLicense_ID, null);
		else 
			set_Value (COLUMNNAME_D_DealerLicense_ID, Integer.valueOf(D_DealerLicense_ID));
	}

	/** Get Gem Dealer License ID.
		@return Gem Dealer License ID	  */
	public int getD_DealerLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_D_DealerLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** DLJ_NextStatus AD_Reference_ID=1000025 */
	public static final int DLJ_NEXTSTATUS_AD_Reference_ID=1000025;
	/** Invoiced = INV */
	public static final String DLJ_NEXTSTATUS_Invoiced = "INV";
	/** Prepare = P */
	public static final String DLJ_NEXTSTATUS_Prepare = "P";
	/** Draft = DR */
	public static final String DLJ_NEXTSTATUS_Draft = "DR";
	/** Active = A */
	public static final String DLJ_NEXTSTATUS_Active = "A";
	/** Inactive = I */
	public static final String DLJ_NEXTSTATUS_Inactive = "I";
	/** Sent For Inspection Approval = SA */
	public static final String DLJ_NEXTSTATUS_SentForInspectionApproval = "SA";
	/** Sent For Deputy Director Approval = SDA */
	public static final String DLJ_NEXTSTATUS_SentForDeputyDirectorApproval = "SDA";
	/** Sent For Chairman Approval = SCA */
	public static final String DLJ_NEXTSTATUS_SentForChairmanApproval = "SCA";
	/** Modified = M */
	public static final String DLJ_NEXTSTATUS_Modified = "M";
	/** Set DLJ_NextStatus.
		@param DLJ_NextStatus 
		License Status of Dealer/Lapidaris's/juwellary/ Lisences
	  */
	public void setDLJ_NextStatus (String DLJ_NextStatus)
	{

		set_Value (COLUMNNAME_DLJ_NextStatus, DLJ_NextStatus);
	}

	/** Get DLJ_NextStatus.
		@return License Status of Dealer/Lapidaris's/juwellary/ Lisences
	  */
	public String getDLJ_NextStatus () 
	{
		return (String)get_Value(COLUMNNAME_DLJ_NextStatus);
	}

	/** Set IsBackhoe.
		@param IsBackhoe IsBackhoe	  */
	public void setIsBackhoe (boolean IsBackhoe)
	{
		set_Value (COLUMNNAME_IsBackhoe, Boolean.valueOf(IsBackhoe));
	}

	/** Get IsBackhoe.
		@return IsBackhoe	  */
	public boolean isBackhoe () 
	{
		Object oo = get_Value(COLUMNNAME_IsBackhoe);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsDLJ.
		@param IsDLJ IsDLJ	  */
	public void setIsDLJ (boolean IsDLJ)
	{
		set_Value (COLUMNNAME_IsDLJ, Boolean.valueOf(IsDLJ));
	}

	/** Get IsDLJ.
		@return IsDLJ	  */
	public boolean isDLJ () 
	{
		Object oo = get_Value(COLUMNNAME_IsDLJ);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set IsMining.
		@param IsMining IsMining	  */
	public void setIsMining (boolean IsMining)
	{
		set_Value (COLUMNNAME_IsMining, Boolean.valueOf(IsMining));
	}

	/** Get IsMining.
		@return IsMining	  */
	public boolean isMining () 
	{
		Object oo = get_Value(COLUMNNAME_IsMining);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** LicenseStatus AD_Reference_ID=1000025 */
	public static final int LICENSESTATUS_AD_Reference_ID=1000025;
	/** Invoiced = INV */
	public static final String LICENSESTATUS_Invoiced = "INV";
	/** Prepare = P */
	public static final String LICENSESTATUS_Prepare = "P";
	/** Draft = DR */
	public static final String LICENSESTATUS_Draft = "DR";
	/** Active = A */
	public static final String LICENSESTATUS_Active = "A";
	/** Inactive = I */
	public static final String LICENSESTATUS_Inactive = "I";
	/** Sent For Inspection Approval = SA */
	public static final String LICENSESTATUS_SentForInspectionApproval = "SA";
	/** Sent For Deputy Director Approval = SDA */
	public static final String LICENSESTATUS_SentForDeputyDirectorApproval = "SDA";
	/** Sent For Chairman Approval = SCA */
	public static final String LICENSESTATUS_SentForChairmanApproval = "SCA";
	/** Modified = M */
	public static final String LICENSESTATUS_Modified = "M";
	/** Set License Status.
		@param LicenseStatus 
		License Status of Dealer/Lapidaris's/juwellary Lisences
	  */
	public void setLicenseStatus (String LicenseStatus)
	{

		set_Value (COLUMNNAME_LicenseStatus, LicenseStatus);
	}

	/** Get License Status.
		@return License Status of Dealer/Lapidaris's/juwellary Lisences
	  */
	public String getLicenseStatus () 
	{
		return (String)get_Value(COLUMNNAME_LicenseStatus);
	}

	/** Mining_CurrentStatus AD_Reference_ID=1000107 */
	public static final int MINING_CURRENTSTATUS_AD_Reference_ID=1000107;
	/** Prepare = P */
	public static final String MINING_CURRENTSTATUS_Prepare = "P";
	/** Send for inspection Approval = SIA */
	public static final String MINING_CURRENTSTATUS_SendForInspectionApproval = "SIA";
	/** Send for diputy director Approval = SDDA */
	public static final String MINING_CURRENTSTATUS_SendForDiputyDirectorApproval = "SDDA";
	/** Send for director Approval = SDA */
	public static final String MINING_CURRENTSTATUS_SendForDirectorApproval = "SDA";
	/** Send for chairman approval = SCA */
	public static final String MINING_CURRENTSTATUS_SendForChairmanApproval = "SCA";
	/** Reject = R */
	public static final String MINING_CURRENTSTATUS_Reject = "R";
	/** Active = A */
	public static final String MINING_CURRENTSTATUS_Active = "A";
	/** Inactive = IN */
	public static final String MINING_CURRENTSTATUS_Inactive = "IN";
	/** Send for Legal Officer Approval = SAL */
	public static final String MINING_CURRENTSTATUS_SendForLegalOfficerApproval = "SAL";
	/** Record Not Completed = NC */
	public static final String MINING_CURRENTSTATUS_RecordNotCompleted = "NC";
	/** Incomplete Ownership = ICO */
	public static final String MINING_CURRENTSTATUS_IncompleteOwnership = "ICO";
	/** Close = CL */
	public static final String MINING_CURRENTSTATUS_Close = "CL";
	/** Ready for Accountant Approval = RFA */
	public static final String MINING_CURRENTSTATUS_ReadyForAccountantApproval = "RFA";
	/** Released = REL */
	public static final String MINING_CURRENTSTATUS_Released = "REL";
	/** Ready to Print = RTP */
	public static final String MINING_CURRENTSTATUS_ReadyToPrint = "RTP";
	/** Set Mining_CurrentStatus.
		@param Mining_CurrentStatus 
		License Status of Mining Lisences
	  */
	public void setMining_CurrentStatus (String Mining_CurrentStatus)
	{

		set_Value (COLUMNNAME_Mining_CurrentStatus, Mining_CurrentStatus);
	}

	/** Get Mining_CurrentStatus.
		@return License Status of Mining Lisences
	  */
	public String getMining_CurrentStatus () 
	{
		return (String)get_Value(COLUMNNAME_Mining_CurrentStatus);
	}

	/** Mining_NextStatus AD_Reference_ID=1000107 */
	public static final int MINING_NEXTSTATUS_AD_Reference_ID=1000107;
	/** Prepare = P */
	public static final String MINING_NEXTSTATUS_Prepare = "P";
	/** Send for inspection Approval = SIA */
	public static final String MINING_NEXTSTATUS_SendForInspectionApproval = "SIA";
	/** Send for diputy director Approval = SDDA */
	public static final String MINING_NEXTSTATUS_SendForDiputyDirectorApproval = "SDDA";
	/** Send for director Approval = SDA */
	public static final String MINING_NEXTSTATUS_SendForDirectorApproval = "SDA";
	/** Send for chairman approval = SCA */
	public static final String MINING_NEXTSTATUS_SendForChairmanApproval = "SCA";
	/** Reject = R */
	public static final String MINING_NEXTSTATUS_Reject = "R";
	/** Active = A */
	public static final String MINING_NEXTSTATUS_Active = "A";
	/** Inactive = IN */
	public static final String MINING_NEXTSTATUS_Inactive = "IN";
	/** Send for Legal Officer Approval = SAL */
	public static final String MINING_NEXTSTATUS_SendForLegalOfficerApproval = "SAL";
	/** Record Not Completed = NC */
	public static final String MINING_NEXTSTATUS_RecordNotCompleted = "NC";
	/** Incomplete Ownership = ICO */
	public static final String MINING_NEXTSTATUS_IncompleteOwnership = "ICO";
	/** Close = CL */
	public static final String MINING_NEXTSTATUS_Close = "CL";
	/** Ready for Accountant Approval = RFA */
	public static final String MINING_NEXTSTATUS_ReadyForAccountantApproval = "RFA";
	/** Released = REL */
	public static final String MINING_NEXTSTATUS_Released = "REL";
	/** Ready to Print = RTP */
	public static final String MINING_NEXTSTATUS_ReadyToPrint = "RTP";
	/** Set Mining_NextStatus.
		@param Mining_NextStatus 
		License Status of Mining Lisences
	  */
	public void setMining_NextStatus (String Mining_NextStatus)
	{

		set_Value (COLUMNNAME_Mining_NextStatus, Mining_NextStatus);
	}

	/** Get Mining_NextStatus.
		@return License Status of Mining Lisences
	  */
	public String getMining_NextStatus () 
	{
		return (String)get_Value(COLUMNNAME_Mining_NextStatus);
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
}