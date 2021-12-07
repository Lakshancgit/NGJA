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

/** Generated Interface for D_DLModification
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_D_DLModification 
{

    /** TableName=D_DLModification */
    public static final String Table_Name = "D_DLModification";

    /** AD_Table_ID=1000105 */
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

    /** Column name C_DealerFile_ID */
    public static final String COLUMNNAME_C_DealerFile_ID = "C_DealerFile_ID";

	/** Set Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID);

	/** Get Dealer File Number ID	  */
	public int getC_DealerFile_ID();

	public org.topra.model.I_C_DealerFile getC_DealerFile() throws RuntimeException;

    /** Column name C_Location_ID */
    public static final String COLUMNNAME_C_Location_ID = "C_Location_ID";

	/** Set Address.
	  * Location or Address
	  */
	public void setC_Location_ID (int C_Location_ID);

	/** Get Address.
	  * Location or Address
	  */
	public int getC_Location_ID();

	public I_C_Location getC_Location() throws RuntimeException;

    /** Column name C_OldBPartner_ID */
    public static final String COLUMNNAME_C_OldBPartner_ID = "C_OldBPartner_ID";

	/** Set C_OldBPartner_ID.
	  * Identifies a Business Partner
	  */
	public void setC_OldBPartner_ID (int C_OldBPartner_ID);

	/** Get C_OldBPartner_ID.
	  * Identifies a Business Partner
	  */
	public int getC_OldBPartner_ID();

	public org.compiere.model.I_C_BPartner getC_OldBPartner() throws RuntimeException;

    /** Column name C_OldLocation_ID */
    public static final String COLUMNNAME_C_OldLocation_ID = "C_OldLocation_ID";

	/** Set Address.
	  * Location or Address
	  */
	public void setC_OldLocation_ID (int C_OldLocation_ID);

	/** Get Address.
	  * Location or Address
	  */
	public int getC_OldLocation_ID();

	public I_C_Location getC_OldLocation() throws RuntimeException;

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

	public org.topra.model.I_D_DealerLicense getD_DealerLicense() throws RuntimeException;

    /** Column name D_DLModification_ID */
    public static final String COLUMNNAME_D_DLModification_ID = "D_DLModification_ID";

	/** Set D_DLModification ID	  */
	public void setD_DLModification_ID (int D_DLModification_ID);

	/** Get D_DLModification ID	  */
	public int getD_DLModification_ID();

    /** Column name D_NDealerLicense_ID */
    public static final String COLUMNNAME_D_NDealerLicense_ID = "D_NDealerLicense_ID";

	/** Set D_NDealerLicense_ID	  */
	public void setD_NDealerLicense_ID (int D_NDealerLicense_ID);

	/** Get D_NDealerLicense_ID	  */
	public int getD_NDealerLicense_ID();

	public org.topra.model.I_D_DealerLicense getD_NDealerLicense() throws RuntimeException;

    /** Column name gem_stock_value */
    public static final String COLUMNNAME_gem_stock_value = "gem_stock_value";

	/** Set Gem Stock Value	  */
	public void setgem_stock_value (int gem_stock_value);

	/** Get Gem Stock Value	  */
	public int getgem_stock_value();

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

    /** Column name IsDLMtypeAddress */
    public static final String COLUMNNAME_IsDLMtypeAddress = "IsDLMtypeAddress";

	/** Set IsDLMtypeAddress	  */
	public void setIsDLMtypeAddress (boolean IsDLMtypeAddress);

	/** Get IsDLMtypeAddress	  */
	public boolean isDLMtypeAddress();

    /** Column name IsDLMtypeName */
    public static final String COLUMNNAME_IsDLMtypeName = "IsDLMtypeName";

	/** Set IsDLMtypeName	  */
	public void setIsDLMtypeName (boolean IsDLMtypeName);

	/** Get IsDLMtypeName	  */
	public boolean isDLMtypeName();

    /** Column name IsDLMtypeStock */
    public static final String COLUMNNAME_IsDLMtypeStock = "IsDLMtypeStock";

	/** Set IsDLMtypeStock	  */
	public void setIsDLMtypeStock (boolean IsDLMtypeStock);

	/** Get IsDLMtypeStock	  */
	public boolean isDLMtypeStock();

    /** Column name OldStockValue */
    public static final String COLUMNNAME_OldStockValue = "OldStockValue";

	/** Set Old Stock Value	  */
	public void setOldStockValue (int OldStockValue);

	/** Get Old Stock Value	  */
	public int getOldStockValue();

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
