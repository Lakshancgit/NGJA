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

/** Generated Interface for C_OverTen
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_OverTen 
{

    /** TableName=C_OverTen */
    public static final String Table_Name = "C_OverTen";

    /** AD_Table_ID=1000057 */
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

    /** Column name Breadth */
    public static final String COLUMNNAME_Breadth = "Breadth";

	/** Set Breadth	  */
	public void setBreadth (String Breadth);

	/** Get Breadth	  */
	public String getBreadth();

    /** Column name C_Color_ID */
    public static final String COLUMNNAME_C_Color_ID = "C_Color_ID";

	/** Set Color	  */
	public void setC_Color_ID (int C_Color_ID);

	/** Get Color	  */
	public int getC_Color_ID();

	public org.topra.model.I_C_Color getC_Color() throws RuntimeException;

    /** Column name C_ExpItems_ID */
    public static final String COLUMNNAME_C_ExpItems_ID = "C_ExpItems_ID";

	/** Set Export Item Name ID	  */
	public void setC_ExpItems_ID (int C_ExpItems_ID);

	/** Get Export Item Name ID	  */
	public int getC_ExpItems_ID();

	public org.topra.model.I_C_ExpItems getC_ExpItems() throws RuntimeException;

    /** Column name C_ExportNGJALine_ID */
    public static final String COLUMNNAME_C_ExportNGJALine_ID = "C_ExportNGJALine_ID";

	/** Set C_ExportNGJALine ID	  */
	public void setC_ExportNGJALine_ID (int C_ExportNGJALine_ID);

	/** Get C_ExportNGJALine ID	  */
	public int getC_ExportNGJALine_ID();

    /** Column name C_GemItems_ID */
    public static final String COLUMNNAME_C_GemItems_ID = "C_GemItems_ID";

	/** Set Item Name	  */
	public void setC_GemItems_ID (int C_GemItems_ID);

	/** Get Item Name	  */
	public int getC_GemItems_ID();

//	public I_C_GemItems getC_GemItems() throws RuntimeException;

    /** Column name C_OverTen_ID */
    public static final String COLUMNNAME_C_OverTen_ID = "C_OverTen_ID";

	/** Set C_OverTen ID	  */
	public void setC_OverTen_ID (int C_OverTen_ID);

	/** Get C_OverTen ID	  */
	public int getC_OverTen_ID();

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

    /** Column name C_Shape_ID */
    public static final String COLUMNNAME_C_Shape_ID = "C_Shape_ID";

	/** Set Shape	  */
	public void setC_Shape_ID (int C_Shape_ID);

	/** Get Shape	  */
	public int getC_Shape_ID();

	public org.topra.model.I_C_Shape getC_Shape() throws RuntimeException;

    /** Column name CusEnteredWeight */
    public static final String COLUMNNAME_CusEnteredWeight = "CusEnteredWeight";

	/** Set Customer Entered Weight	  */
	public void setCusEnteredWeight (BigDecimal CusEnteredWeight);

	/** Get Customer Entered Weight	  */
	public BigDecimal getCusEnteredWeight();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (int Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public int getDescription();

	public org.topra.model.I_C_ExportNGJALine getDescript() throws RuntimeException;

    /** Column name DesOfIclusions */
    public static final String COLUMNNAME_DesOfIclusions = "DesOfIclusions";

	/** Set Description Of the Inclutions	  */
	public void setDesOfIclusions (String DesOfIclusions);

	/** Get Description Of the Inclutions	  */
	public String getDesOfIclusions();

    /** Column name Height */
    public static final String COLUMNNAME_Height = "Height";

	/** Set Height	  */
	public void setHeight (String Height);

	/** Get Height	  */
	public String getHeight();

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

    /** Column name Length */
    public static final String COLUMNNAME_Length = "Length";

	/** Set Length	  */
	public void setLength (String Length);

	/** Get Length	  */
	public String getLength();

    /** Column name OverTenItem */
    public static final String COLUMNNAME_OverTenItem = "OverTenItem";

	/** Set OverTenItem	  */
	public void setOverTenItem (String OverTenItem);

	/** Get OverTenItem	  */
	public String getOverTenItem();

    /** Column name ReturnedWeight */
    public static final String COLUMNNAME_ReturnedWeight = "ReturnedWeight";

	/** Set Returned Weight	  */
	public void setReturnedWeight (BigDecimal ReturnedWeight);

	/** Get Returned Weight	  */
	public BigDecimal getReturnedWeight();

    /** Column name ReturnStatus */
    public static final String COLUMNNAME_ReturnStatus = "ReturnStatus";

	/** Set ReturnStatus	  */
	public void setReturnStatus (String ReturnStatus);

	/** Get ReturnStatus	  */
	public String getReturnStatus();

    /** Column name TotalWeightType */
    public static final String COLUMNNAME_TotalWeightType = "TotalWeightType";

	/** Set Total Weight Type	  */
	public void setTotalWeightType (String TotalWeightType);

	/** Get Total Weight Type	  */
	public String getTotalWeightType();

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

    /** Column name VarianceOfWweight */
    public static final String COLUMNNAME_VarianceOfWweight = "VarianceOfWweight";

	/** Set Variance Of Weight	  */
	public void setVarianceOfWweight (BigDecimal VarianceOfWweight);

	/** Get Variance Of Weight	  */
	public BigDecimal getVarianceOfWweight();

    /** Column name Weight */
    public static final String COLUMNNAME_Weight = "Weight";

	/** Set Weight.
	  * Weight of a product
	  */
	public void setWeight (BigDecimal Weight);

	/** Get Weight.
	  * Weight of a product
	  */
	public BigDecimal getWeight();
}
