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

/** Generated Interface for C_AuctionLicense
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_AuctionLicense 
{

    /** TableName=C_AuctionLicense */
    public static final String Table_Name = "C_AuctionLicense";

    /** AD_Table_ID=1000065 */
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

    /** Column name AuctionLicesneStatus */
    public static final String COLUMNNAME_AuctionLicesneStatus = "AuctionLicesneStatus";

	/** Set AuctionLicesneStatus	  */
	public void setAuctionLicesneStatus (String AuctionLicesneStatus);

	/** Get AuctionLicesneStatus	  */
	public String getAuctionLicesneStatus();

    /** Column name AuctionPlace */
    public static final String COLUMNNAME_AuctionPlace = "AuctionPlace";

	/** Set AuctionPlace	  */
	public void setAuctionPlace (String AuctionPlace);

	/** Get AuctionPlace	  */
	public String getAuctionPlace();

    /** Column name C_AuctionLicense_ID */
    public static final String COLUMNNAME_C_AuctionLicense_ID = "C_AuctionLicense_ID";

	/** Set AuctionLicense ID	  */
	public void setC_AuctionLicense_ID (int C_AuctionLicense_ID);

	/** Get AuctionLicense ID	  */
	public int getC_AuctionLicense_ID();

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

	public org.topra.model.I_C_GemMining getC_GemMining() throws RuntimeException;

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

    /** Column name DateFinish */
    public static final String COLUMNNAME_DateFinish = "DateFinish";

	/** Set Finish Date.
	  * Finish or (planned) completion date
	  */
	public void setDateFinish (Timestamp DateFinish);

	/** Get Finish Date.
	  * Finish or (planned) completion date
	  */
	public Timestamp getDateFinish();

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

    /** Column name EndDate */
    public static final String COLUMNNAME_EndDate = "EndDate";

	/** Set End Date.
	  * Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate);

	/** Get End Date.
	  * Last effective date (inclusive)
	  */
	public Timestamp getEndDate();

    /** Column name EndTime */
    public static final String COLUMNNAME_EndTime = "EndTime";

	/** Set End Time.
	  * End of the time span
	  */
	public void setEndTime (Timestamp EndTime);

	/** Get End Time.
	  * End of the time span
	  */
	public Timestamp getEndTime();

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

    /** Column name LastActiveYear */
    public static final String COLUMNNAME_LastActiveYear = "LastActiveYear";

	/** Set Last Active Year	  */
	public void setLastActiveYear (String LastActiveYear);

	/** Get Last Active Year	  */
	public String getLastActiveYear();

    /** Column name NoOfApprovedGemPitM */
    public static final String COLUMNNAME_NoOfApprovedGemPitM = "NoOfApprovedGemPitM";

	/** Set NoOfApprovedGemPitM	  */
	public void setNoOfApprovedGemPitM (int NoOfApprovedGemPitM);

	/** Get NoOfApprovedGemPitM	  */
	public int getNoOfApprovedGemPitM();

    /** Column name NoOfApprovedGemPitN */
    public static final String COLUMNNAME_NoOfApprovedGemPitN = "NoOfApprovedGemPitN";

	/** Set NoOfApprovedGemPitN	  */
	public void setNoOfApprovedGemPitN (int NoOfApprovedGemPitN);

	/** Get NoOfApprovedGemPitN	  */
	public int getNoOfApprovedGemPitN();

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

    /** Column name StartDate */
    public static final String COLUMNNAME_StartDate = "StartDate";

	/** Set Start Date.
	  * First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate);

	/** Get Start Date.
	  * First effective day (inclusive)
	  */
	public Timestamp getStartDate();

    /** Column name StartTime */
    public static final String COLUMNNAME_StartTime = "StartTime";

	/** Set Start Time.
	  * Time started
	  */
	public void setStartTime (Timestamp StartTime);

	/** Get Start Time.
	  * Time started
	  */
	public Timestamp getStartTime();

    /** Column name TotalGemValue */
    public static final String COLUMNNAME_TotalGemValue = "TotalGemValue";

	/** Set TotalGemValue	  */
	public void setTotalGemValue (BigDecimal TotalGemValue);

	/** Get TotalGemValue	  */
	public BigDecimal getTotalGemValue();

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

    /** Column name ValueNumber */
    public static final String COLUMNNAME_ValueNumber = "ValueNumber";

	/** Set Value.
	  * Numeric Value
	  */
	public void setValueNumber (BigDecimal ValueNumber);

	/** Get Value.
	  * Numeric Value
	  */
	public BigDecimal getValueNumber();

    /** Column name ViewRecord */
    public static final String COLUMNNAME_ViewRecord = "ViewRecord";

	/** Set ViewRecord	  */
	public void setViewRecord (String ViewRecord);

	/** Get ViewRecord	  */
	public String getViewRecord();

    /** Column name ZoomBtn */
    public static final String COLUMNNAME_ZoomBtn = "ZoomBtn";

	/** Set Load Informations	  */
	public void setZoomBtn (String ZoomBtn);

	/** Get Load Informations	  */
	public String getZoomBtn();
}
