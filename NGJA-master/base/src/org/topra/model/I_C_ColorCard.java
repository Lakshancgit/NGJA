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

/** Generated Interface for C_ColorCard
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ColorCard 
{

    /** TableName=C_ColorCard */
    public static final String Table_Name = "C_ColorCard";

    /** AD_Table_ID=1000031 */
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

	/** Set AppStatus	  */
	public void setAppStatus (String AppStatus);

	/** Get AppStatus	  */
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

    /** Column name C_ColorCard_ID */
    public static final String COLUMNNAME_C_ColorCard_ID = "C_ColorCard_ID";

	/** Set Color Card ID	  */
	public void setC_ColorCard_ID (int C_ColorCard_ID);

	/** Get Color Card ID	  */
	public int getC_ColorCard_ID();

    /** Column name CCStatus */
    public static final String COLUMNNAME_CCStatus = "CCStatus";

	/** Set Color Card Status	  */
	public void setCCStatus (String CCStatus);

	/** Get Color Card Status	  */
	public String getCCStatus();

    /** Column name ColorCardOwnerNic */
    public static final String COLUMNNAME_ColorCardOwnerNic = "ColorCardOwnerNic";

	/** Set CC Owner NIC	  */
	public void setColorCardOwnerNic (String ColorCardOwnerNic);

	/** Get CC Owner NIC	  */
	public String getColorCardOwnerNic();

    /** Column name ColorCardType */
    public static final String COLUMNNAME_ColorCardType = "ColorCardType";

	/** Set Color Card Type	  */
	public void setColorCardType (String ColorCardType);

	/** Get Color Card Type	  */
	public String getColorCardType();

    /** Column name ColorOwnerName */
    public static final String COLUMNNAME_ColorOwnerName = "ColorOwnerName";

	/** Set Name Of The CC Owner	  */
	public void setColorOwnerName (String ColorOwnerName);

	/** Get Name Of The CC Owner	  */
	public String getColorOwnerName();

    /** Column name CompanyName */
    public static final String COLUMNNAME_CompanyName = "CompanyName";

	/** Set Company Name	  */
	public void setCompanyName (String CompanyName);

	/** Get Company Name	  */
	public String getCompanyName();

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

	public org.topra.model.I_D_DealerLicense getD_DealerLicense() throws RuntimeException;

    /** Column name gem_stock_value */
    public static final String COLUMNNAME_gem_stock_value = "gem_stock_value";

	/** Set Gem Stock Value	  */
	public void setgem_stock_value (String gem_stock_value);

	/** Get Gem Stock Value	  */
	public String getgem_stock_value();

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

    /** Column name LicenseEndDate */
    public static final String COLUMNNAME_LicenseEndDate = "LicenseEndDate";

	/** Set License End Date	  */
	public void setLicenseEndDate (Timestamp LicenseEndDate);

	/** Get License End Date	  */
	public Timestamp getLicenseEndDate();

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
