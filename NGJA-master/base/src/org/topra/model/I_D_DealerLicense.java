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

/** Generated Interface for D_DealerLicense
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_D_DealerLicense 
{

    /** TableName=D_DealerLicense */
    public static final String Table_Name = "D_DealerLicense";

    /** AD_Table_ID=1000005 */
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

    /** Column name AppStatus */
    public static final String COLUMNNAME_AppStatus = "AppStatus";

	/** Set Process Application	  */
	public void setAppStatus (String AppStatus);

	/** Get Process Application	  */
	public String getAppStatus();

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

    /** Column name C_DealerFile_ID */
    public static final String COLUMNNAME_C_DealerFile_ID = "C_DealerFile_ID";

	/** Set Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID);

	/** Get Dealer File Number ID	  */
	public int getC_DealerFile_ID();

	public org.topra.model.I_C_DealerFile getC_DealerFile() throws RuntimeException;

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

    /** Column name C_Payment_ID */
    public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

	/** Set Payment.
	  * Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID);

	/** Get Payment.
	  * Payment identifier
	  */
	public int getC_Payment_ID();

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException;

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

    /** Column name D_DealerLicense_ID */
    public static final String COLUMNNAME_D_DealerLicense_ID = "D_DealerLicense_ID";

	/** Set Gem Dealer License ID	  */
	public void setD_DealerLicense_ID (int D_DealerLicense_ID);

	/** Get Gem Dealer License ID	  */
	public int getD_DealerLicense_ID();

    /** Column name D_DLModification_ID */
    public static final String COLUMNNAME_D_DLModification_ID = "D_DLModification_ID";

	/** Set D_DLModification ID	  */
	public void setD_DLModification_ID (int D_DLModification_ID);

	/** Get D_DLModification ID	  */
	public int getD_DLModification_ID();

	public org.topra.model.I_D_DLModification getD_DLModification() throws RuntimeException;

    /** Column name DealerView */
    public static final String COLUMNNAME_DealerView = "DealerView";

	/** Set DealerView	  */
	public void setDealerView (String DealerView);

	/** Get DealerView	  */
	public String getDealerView();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

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

    /** Column name gem_stock_value */
    public static final String COLUMNNAME_gem_stock_value = "gem_stock_value";

	/** Set Gem Stock Value	  */
	public void setgem_stock_value (int gem_stock_value);

	/** Get Gem Stock Value	  */
	public int getgem_stock_value();

    /** Column name InactiveBtn */
    public static final String COLUMNNAME_InactiveBtn = "InactiveBtn";

	/** Set InactiveBtn	  */
	public void setInactiveBtn (String InactiveBtn);

	/** Get InactiveBtn	  */
	public String getInactiveBtn();

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

    /** Column name IsModified */
    public static final String COLUMNNAME_IsModified = "IsModified";

	/** Set Modified.
	  * The record is modified
	  */
	public void setIsModified (boolean IsModified);

	/** Get Modified.
	  * The record is modified
	  */
	public boolean isModified();

    /** Column name IsRenewal */
    public static final String COLUMNNAME_IsRenewal = "IsRenewal";

	/** Set IsRenewal	  */
	public void setIsRenewal (String IsRenewal);

	/** Get IsRenewal	  */
	public String getIsRenewal();

    /** Column name LastActiveYear */
    public static final String COLUMNNAME_LastActiveYear = "LastActiveYear";

	/** Set Last Active Year	  */
	public void setLastActiveYear (String LastActiveYear);

	/** Get Last Active Year	  */
	public String getLastActiveYear();

    /** Column name LicenseEndDate */
    public static final String COLUMNNAME_LicenseEndDate = "LicenseEndDate";

	/** Set License End Date	  */
	public void setLicenseEndDate (Timestamp LicenseEndDate);

	/** Get License End Date	  */
	public Timestamp getLicenseEndDate();

    /** Column name LicenseStartDate */
    public static final String COLUMNNAME_LicenseStartDate = "LicenseStartDate";

	/** Set License Start  Date	  */
	public void setLicenseStartDate (Timestamp LicenseStartDate);

	/** Get License Start  Date	  */
	public Timestamp getLicenseStartDate();

    /** Column name LicenseStatus */
    public static final String COLUMNNAME_LicenseStatus = "LicenseStatus";

	/** Set License Status	  */
	public void setLicenseStatus (String LicenseStatus);

	/** Get License Status	  */
	public String getLicenseStatus();

    /** Column name Modified */
    public static final String COLUMNNAME_Modified = "Modified";

	/** Set Modified	  */
	public void setModified (String Modified);

	/** Get Modified	  */
	public String getModified();

    /** Column name OtherStatus */
    public static final String COLUMNNAME_OtherStatus = "OtherStatus";

	/** Set OtherStatus	  */
	public void setOtherStatus (String OtherStatus);

	/** Get OtherStatus	  */
	public String getOtherStatus();

    /** Column name OverStoctValue */
    public static final String COLUMNNAME_OverStoctValue = "OverStoctValue";

	/** Set OverStoctValue	  */
	public void setOverStoctValue (boolean OverStoctValue);

	/** Get OverStoctValue	  */
	public boolean isOverStoctValue();

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

    /** Column name UPtoStoctValue */
    public static final String COLUMNNAME_UPtoStoctValue = "UPtoStoctValue";

	/** Set UPtoStoctValue	  */
	public void setUPtoStoctValue (boolean UPtoStoctValue);

	/** Get UPtoStoctValue	  */
	public boolean isUPtoStoctValue();

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
}
