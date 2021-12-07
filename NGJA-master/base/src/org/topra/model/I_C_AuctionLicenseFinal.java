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

/** Generated Interface for C_AuctionLicenseFinal
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_AuctionLicenseFinal 
{

    /** TableName=C_AuctionLicenseFinal */
    public static final String Table_Name = "C_AuctionLicenseFinal";

    /** AD_Table_ID=1000090 */
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

    /** Column name C_AuctionInvoice_ID */
    public static final String COLUMNNAME_C_AuctionInvoice_ID = "C_AuctionInvoice_ID";

	/** Set C_AuctionInvoice_ID	  */
	public void setC_AuctionInvoice_ID (int C_AuctionInvoice_ID);

	/** Get C_AuctionInvoice_ID	  */
	public int getC_AuctionInvoice_ID();

	public org.compiere.model.I_C_Invoice getC_AuctionInvoice() throws RuntimeException;

    /** Column name C_AuctionLicenseFinal_ID */
    public static final String COLUMNNAME_C_AuctionLicenseFinal_ID = "C_AuctionLicenseFinal_ID";

	/** Set AuctionLicenseFinal ID	  */
	public void setC_AuctionLicenseFinal_ID (int C_AuctionLicenseFinal_ID);

	/** Get AuctionLicenseFinal ID	  */
	public int getC_AuctionLicenseFinal_ID();

    /** Column name C_AuctionLicense_ID */
    public static final String COLUMNNAME_C_AuctionLicense_ID = "C_AuctionLicense_ID";

	/** Set AuctionLicense ID	  */
	public void setC_AuctionLicense_ID (int C_AuctionLicense_ID);

	/** Get AuctionLicense ID	  */
	public int getC_AuctionLicense_ID();

	public org.topra.model.I_C_AuctionLicense getC_AuctionLicense() throws RuntimeException;

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

    /** Column name Date1 */
    public static final String COLUMNNAME_Date1 = "Date1";

	/** Set Date.
	  * Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1);

	/** Get Date.
	  * Date when business is not conducted
	  */
	public Timestamp getDate1();

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

    /** Column name Status */
    public static final String COLUMNNAME_Status = "Status";

	/** Set Status.
	  * Status of the currently running check
	  */
	public void setStatus (String Status);

	/** Get Status.
	  * Status of the currently running check
	  */
	public String getStatus();

    /** Column name TaxFileNo */
    public static final String COLUMNNAME_TaxFileNo = "TaxFileNo";

	/** Set TaxFileNo	  */
	public void setTaxFileNo (String TaxFileNo);

	/** Get TaxFileNo	  */
	public String getTaxFileNo();

    /** Column name TaxValue */
    public static final String COLUMNNAME_TaxValue = "TaxValue";

	/** Set TaxValue	  */
	public void setTaxValue (String TaxValue);

	/** Get TaxValue	  */
	public String getTaxValue();

    /** Column name TotalGemSale */
    public static final String COLUMNNAME_TotalGemSale = "TotalGemSale";

	/** Set TotalGemSale	  */
	public void setTotalGemSale (BigDecimal TotalGemSale);

	/** Get TotalGemSale	  */
	public BigDecimal getTotalGemSale();

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
	public void setValueNumber (String ValueNumber);

	/** Get Value.
	  * Numeric Value
	  */
	public String getValueNumber();

    /** Column name ViewInfoBtn */
    public static final String COLUMNNAME_ViewInfoBtn = "ViewInfoBtn";

	/** Set ViewInfoBtn	  */
	public void setViewInfoBtn (String ViewInfoBtn);

	/** Get ViewInfoBtn	  */
	public String getViewInfoBtn();

    /** Column name ViewRecord */
    public static final String COLUMNNAME_ViewRecord = "ViewRecord";

	/** Set ViewRecord	  */
	public void setViewRecord (String ViewRecord);

	/** Get ViewRecord	  */
	public String getViewRecord();
}
