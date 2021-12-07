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

/** Generated Interface for C_ExportServiceType
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ExportServiceType 
{

    /** TableName=C_ExportServiceType */
    public static final String Table_Name = "C_ExportServiceType";

    /** AD_Table_ID=1000062 */
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

    /** Column name C_ExportItemType_ID */
    public static final String COLUMNNAME_C_ExportItemType_ID = "C_ExportItemType_ID";

	/** Set Export Item Types ID	  */
	public void setC_ExportItemType_ID (int C_ExportItemType_ID);

	/** Get Export Item Types ID	  */
	public int getC_ExportItemType_ID();

	public org.topra.model.I_C_ExportItemType getC_ExportItemType() throws RuntimeException;

    /** Column name C_ExportServiceType_ID */
    public static final String COLUMNNAME_C_ExportServiceType_ID = "C_ExportServiceType_ID";

	/** Set Export Service Types ID	  */
	public void setC_ExportServiceType_ID (int C_ExportServiceType_ID);

	/** Get Export Service Types ID	  */
	public int getC_ExportServiceType_ID();

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

    /** Column name DicisionMakingAddedValue */
    public static final String COLUMNNAME_DicisionMakingAddedValue = "DicisionMakingAddedValue";

	/** Set DicisionMakingBasedOnAddedValue	  */
	public void setDicisionMakingAddedValue (BigDecimal DicisionMakingAddedValue);

	/** Get DicisionMakingBasedOnAddedValue	  */
	public BigDecimal getDicisionMakingAddedValue();

    /** Column name DicisionMakingPrice */
    public static final String COLUMNNAME_DicisionMakingPrice = "DicisionMakingPrice";

	/** Set DicisionMakingPrice	  */
	public void setDicisionMakingPrice (BigDecimal DicisionMakingPrice);

	/** Get DicisionMakingPrice	  */
	public BigDecimal getDicisionMakingPrice();

    /** Column name ExpItemType_ID */
    public static final String COLUMNNAME_ExpItemType_ID = "ExpItemType_ID";

	/** Set Exp Item Type	  */
	public void setExpItemType_ID (int ExpItemType_ID);

	/** Get Exp Item Type	  */
	public int getExpItemType_ID();

	public org.topra.model.I_C_ExportItemType getExpItemType() throws RuntimeException;

    /** Column name FinePercentage */
    public static final String COLUMNNAME_FinePercentage = "FinePercentage";

	/** Set Fine Percentage Amount	  */
	public void setFinePercentage (BigDecimal FinePercentage);

	/** Get Fine Percentage Amount	  */
	public BigDecimal getFinePercentage();

    /** Column name FOBCal */
    public static final String COLUMNNAME_FOBCal = "FOBCal";

	/** Set FOB	  */
	public void setFOBCal (boolean FOBCal);

	/** Get FOB	  */
	public boolean isFOBCal();

    /** Column name FOBCalForiegn */
    public static final String COLUMNNAME_FOBCalForiegn = "FOBCalForiegn";

	/** Set FOB in Foriegn	  */
	public void setFOBCalForiegn (boolean FOBCalForiegn);

	/** Get FOB in Foriegn	  */
	public boolean isFOBCalForiegn();

    /** Column name ImportPercentage */
    public static final String COLUMNNAME_ImportPercentage = "ImportPercentage";

	/** Set Import Percentage	  */
	public void setImportPercentage (BigDecimal ImportPercentage);

	/** Get Import Percentage	  */
	public BigDecimal getImportPercentage();

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

    /** Column name IsImported */
    public static final String COLUMNNAME_IsImported = "IsImported";

	/** Set Is Imported.
	  * The record is active in the system
	  */
	public void setIsImported (boolean IsImported);

	/** Get Is Imported.
	  * The record is active in the system
	  */
	public boolean isImported();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name PercentageAmount */
    public static final String COLUMNNAME_PercentageAmount = "PercentageAmount";

	/** Set Percentage Amount	  */
	public void setPercentageAmount (BigDecimal PercentageAmount);

	/** Get Percentage Amount	  */
	public BigDecimal getPercentageAmount();

    /** Column name PercentageAmountReturn */
    public static final String COLUMNNAME_PercentageAmountReturn = "PercentageAmountReturn";

	/** Set Percentage Amount Return	  */
	public void setPercentageAmountReturn (BigDecimal PercentageAmountReturn);

	/** Get Percentage Amount Return	  */
	public BigDecimal getPercentageAmountReturn();

    /** Column name QuantityBased */
    public static final String COLUMNNAME_QuantityBased = "QuantityBased";

	/** Set Quantity Based	  */
	public void setQuantityBased (boolean QuantityBased);

	/** Get Quantity Based	  */
	public boolean isQuantityBased();

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
