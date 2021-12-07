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
package org.topra.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_GemMining
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_GemMining 
{

    /** TableName=C_GemMining */
    public static final String Table_Name = "C_GemMining";

    /** AD_Table_ID=1000058 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name C_GemMining_ID */
    public static final String COLUMNNAME_C_GemMining_ID = "C_GemMining_ID";

	/** Set GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID);

	/** Get GemMininig ID	  */
	public int getC_GemMining_ID();

    /** Column name C_Invoice_ID */
    public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

	/** Set Invoice.
	  * Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID);

	/** Get Invoice.
	  * Invoice Identifier
	  */
	public int getC_Invoice_ID();

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException;

    /** Column name C_LandDetails_ID */
    public static final String COLUMNNAME_C_LandDetails_ID = "C_LandDetails_ID";

	/** Set Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID);

	/** Get Land Details ID	  */
	public int getC_LandDetails_ID();

	public org.topra.model.I_C_LandDetails getC_LandDetails() throws RuntimeException;

    /** Column name C_MiningLandName_ID */
    public static final String COLUMNNAME_C_MiningLandName_ID = "C_MiningLandName_ID";

	/** Set C_MiningLandName ID	  */
	public void setC_MiningLandName_ID (int C_MiningLandName_ID);

	/** Get C_MiningLandName ID	  */
	public int getC_MiningLandName_ID();

	public org.topra.model.I_C_LandDetails getC_MiningLandName() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateConfirm */
    public static final String COLUMNNAME_DateConfirm = "DateConfirm";

	/** Set Date Confirm.
	  * Date Confirm of this Order
	  */
	public void setDateConfirm (Timestamp DateConfirm);

	/** Get Date Confirm.
	  * Date Confirm of this Order
	  */
	public Timestamp getDateConfirm();

    /** Column name DateStart */
    public static final String COLUMNNAME_DateStart = "DateStart";

	/** Set Date Start.
	  * Date Start for this Order
	  */
	public void setDateStart (Timestamp DateStart);

	/** Get Date Start.
	  * Date Start for this Order
	  */
	public Timestamp getDateStart();

    /** Column name DateTo */
    public static final String COLUMNNAME_DateTo = "DateTo";

	/** Set Date To.
	  * End date of a date range
	  */
	public void setDateTo (Timestamp DateTo);

	/** Get Date To.
	  * End date of a date range
	  */
	public Timestamp getDateTo();

    /** Column name DepositReleaseStatus */
    public static final String COLUMNNAME_DepositReleaseStatus = "DepositReleaseStatus";

	/** Set DepositReleaseStatus	  */
	public void setDepositReleaseStatus (String DepositReleaseStatus);

	/** Get DepositReleaseStatus	  */
	public String getDepositReleaseStatus();

    /** Column name DepositReleaseType */
    public static final String COLUMNNAME_DepositReleaseType = "DepositReleaseType";

	/** Set DepositReleaseType	  */
	public void setDepositReleaseType (String DepositReleaseType);

	/** Get DepositReleaseType	  */
	public String getDepositReleaseType();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsRenewal */
    public static final String COLUMNNAME_IsRenewal = "IsRenewal";

	/** Set IsRenewal	  */
	public void setIsRenewal (String IsRenewal);

	/** Get IsRenewal	  */
	public String getIsRenewal();

    /** Column name IsUpgrade */
    public static final String COLUMNNAME_IsUpgrade = "IsUpgrade";

	/** Set IsUpgrade	  */
	public void setIsUpgrade (boolean IsUpgrade);

	/** Get IsUpgrade	  */
	public boolean isUpgrade();

    /** Column name LandName */
    public static final String COLUMNNAME_LandName = "LandName";

	/** Set Name of the Land	  */
	public void setLandName (int LandName);

	/** Get Name of the Land	  */
	public int getLandName();

	public org.topra.model.I_C_LandDetails getLandN() throws RuntimeException;

    /** Column name LastActiveYear */
    public static final String COLUMNNAME_LastActiveYear = "LastActiveYear";

	/** Set Last Active Year	  */
	public void setLastActiveYear (String LastActiveYear);

	/** Get Last Active Year	  */
	public String getLastActiveYear();

    /** Column name LicenseStatus */
    public static final String COLUMNNAME_LicenseStatus = "LicenseStatus";

	/** Set License Status	  */
	public void setLicenseStatus (String LicenseStatus);

	/** Get License Status	  */
	public String getLicenseStatus();

    /** Column name NoOfMine */
    public static final String COLUMNNAME_NoOfMine = "NoOfMine";

	/** Set NoOfMine	  */
	public void setNoOfMine (int NoOfMine);

	/** Get NoOfMine	  */
	public int getNoOfMine();

    /** Column name PrintApproval */
    public static final String COLUMNNAME_PrintApproval = "PrintApproval";

	/** Set PrintApproval	  */
	public void setPrintApproval (String PrintApproval);

	/** Get PrintApproval	  */
	public String getPrintApproval();

    /** Column name PrintBtn */
    public static final String COLUMNNAME_PrintBtn = "PrintBtn";

	/** Set PrintBtn	  */
	public void setPrintBtn (String PrintBtn);

	/** Get PrintBtn	  */
	public String getPrintBtn();

    /** Column name PrintDocument */
    public static final String COLUMNNAME_PrintDocument = "PrintDocument";

	/** Set Print Document.
	  * Document to print
	  */
	public void setPrintDocument (String PrintDocument);

	/** Get Print Document.
	  * Document to print
	  */
	public String getPrintDocument();

    /** Column name Printed */
    public static final String COLUMNNAME_Printed = "Printed";

	/** Set Printed	  */
	public void setPrinted (boolean Printed);

	/** Get Printed	  */
	public boolean isPrinted();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name StockValue */
    public static final String COLUMNNAME_StockValue = "StockValue";

	/** Set Stock Value	  */
	public void setStockValue (int StockValue);

	/** Get Stock Value	  */
	public int getStockValue();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();

    /** Column name ViewRecord */
    public static final String COLUMNNAME_ViewRecord = "ViewRecord";

	/** Set ViewRecord	  */
	public void setViewRecord (String ViewRecord);

	/** Get ViewRecord	  */
	public String getViewRecord();

    /** Column name ZoomRecord */
    public static final String COLUMNNAME_ZoomRecord = "ZoomRecord";

	/** Set ZoomRecord	  */
	public void setZoomRecord (String ZoomRecord);

	/** Get ZoomRecord	  */
	public String getZoomRecord();
}
