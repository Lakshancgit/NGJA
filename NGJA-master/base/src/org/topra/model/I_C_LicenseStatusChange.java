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

/** Generated Interface for C_LicenseStatusChange
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_LicenseStatusChange 
{

    /** TableName=C_LicenseStatusChange */
    public static final String Table_Name = "C_LicenseStatusChange";

    /** AD_Table_ID=1000107 */
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

    /** Column name Backhoe_CurrentStatus */
    public static final String COLUMNNAME_Backhoe_CurrentStatus = "Backhoe_CurrentStatus";

	/** Set Backhoe_CurrentStatus.
	  * License Status o Backhoe Lisences
	  */
	public void setBackhoe_CurrentStatus (String Backhoe_CurrentStatus);

	/** Get Backhoe_CurrentStatus.
	  * License Status o Backhoe Lisences
	  */
	public String getBackhoe_CurrentStatus();

    /** Column name Backhoe_NextStatus */
    public static final String COLUMNNAME_Backhoe_NextStatus = "Backhoe_NextStatus";

	/** Set Backhoe_NextStatus.
	  * License Status of Backhoe Lisences
	  */
	public void setBackhoe_NextStatus (String Backhoe_NextStatus);

	/** Get Backhoe_NextStatus.
	  * License Status of Backhoe Lisences
	  */
	public String getBackhoe_NextStatus();

    /** Column name C_BackhoeService_ID */
    public static final String COLUMNNAME_C_BackhoeService_ID = "C_BackhoeService_ID";

	/** Set BackhoeService ID	  */
	public void setC_BackhoeService_ID (int C_BackhoeService_ID);

	/** Get BackhoeService ID	  */
	public int getC_BackhoeService_ID();

	public org.topra.model.I_C_BackhoeService getC_BackhoeService() throws RuntimeException;

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

    /** Column name C_LicenseStatusChange_ID */
    public static final String COLUMNNAME_C_LicenseStatusChange_ID = "C_LicenseStatusChange_ID";

	/** Set License Status Change  ID	  */
	public void setC_LicenseStatusChange_ID (int C_LicenseStatusChange_ID);

	/** Get License Status Change  ID	  */
	public int getC_LicenseStatusChange_ID();

    /** Column name CreateConfirm */
    public static final String COLUMNNAME_CreateConfirm = "CreateConfirm";

	/** Set Create Confirm	  */
	public void setCreateConfirm (String CreateConfirm);

	/** Get Create Confirm	  */
	public String getCreateConfirm();

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

    /** Column name DLJ_NextStatus */
    public static final String COLUMNNAME_DLJ_NextStatus = "DLJ_NextStatus";

	/** Set DLJ_NextStatus.
	  * License Status of Dealer/Lapidaris's/juwellary/ Lisences
	  */
	public void setDLJ_NextStatus (String DLJ_NextStatus);

	/** Get DLJ_NextStatus.
	  * License Status of Dealer/Lapidaris's/juwellary/ Lisences
	  */
	public String getDLJ_NextStatus();

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

    /** Column name IsBackhoe */
    public static final String COLUMNNAME_IsBackhoe = "IsBackhoe";

	/** Set IsBackhoe	  */
	public void setIsBackhoe (boolean IsBackhoe);

	/** Get IsBackhoe	  */
	public boolean isBackhoe();

    /** Column name IsDLJ */
    public static final String COLUMNNAME_IsDLJ = "IsDLJ";

	/** Set IsDLJ	  */
	public void setIsDLJ (boolean IsDLJ);

	/** Get IsDLJ	  */
	public boolean isDLJ();

    /** Column name IsMining */
    public static final String COLUMNNAME_IsMining = "IsMining";

	/** Set IsMining	  */
	public void setIsMining (boolean IsMining);

	/** Get IsMining	  */
	public boolean isMining();

    /** Column name LicenseStatus */
    public static final String COLUMNNAME_LicenseStatus = "LicenseStatus";

	/** Set License Status.
	  * License Status of Dealer/Lapidaris's/juwellary Lisences
	  */
	public void setLicenseStatus (String LicenseStatus);

	/** Get License Status.
	  * License Status of Dealer/Lapidaris's/juwellary Lisences
	  */
	public String getLicenseStatus();

    /** Column name Mining_CurrentStatus */
    public static final String COLUMNNAME_Mining_CurrentStatus = "Mining_CurrentStatus";

	/** Set Mining_CurrentStatus.
	  * License Status of Mining Lisences
	  */
	public void setMining_CurrentStatus (String Mining_CurrentStatus);

	/** Get Mining_CurrentStatus.
	  * License Status of Mining Lisences
	  */
	public String getMining_CurrentStatus();

    /** Column name Mining_NextStatus */
    public static final String COLUMNNAME_Mining_NextStatus = "Mining_NextStatus";

	/** Set Mining_NextStatus.
	  * License Status of Mining Lisences
	  */
	public void setMining_NextStatus (String Mining_NextStatus);

	/** Get Mining_NextStatus.
	  * License Status of Mining Lisences
	  */
	public String getMining_NextStatus();

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
