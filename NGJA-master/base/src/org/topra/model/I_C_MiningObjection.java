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

/** Generated Interface for C_MiningObjection
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_MiningObjection 
{

    /** TableName=C_MiningObjection */
    public static final String Table_Name = "C_MiningObjection";

    /** AD_Table_ID=1000060 */
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

    /** Column name C_GemMining_ID */
    public static final String COLUMNNAME_C_GemMining_ID = "C_GemMining_ID";

	/** Set GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID);

	/** Get GemMininig ID	  */
	public int getC_GemMining_ID();

    /** Column name C_LandDetails_ID */
    public static final String COLUMNNAME_C_LandDetails_ID = "C_LandDetails_ID";

	/** Set Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID);

	/** Get Land Details ID	  */
	public int getC_LandDetails_ID();

    /** Column name C_MiningObjection_ID */
    public static final String COLUMNNAME_C_MiningObjection_ID = "C_MiningObjection_ID";

	/** Set ObjectionHandeling ID	  */
	public void setC_MiningObjection_ID (int C_MiningObjection_ID);

	/** Get ObjectionHandeling ID	  */
	public int getC_MiningObjection_ID();

    /** Column name Comments */
    public static final String COLUMNNAME_Comments = "Comments";

	/** Set Comments.
	  * Comments or additional information
	  */
	public void setComments (String Comments);

	/** Get Comments.
	  * Comments or additional information
	  */
	public String getComments();

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

    /** Column name ISObjection */
    public static final String COLUMNNAME_ISObjection = "ISObjection";

	/** Set ISObjection	  */
	public void setISObjection (String ISObjection);

	/** Get ISObjection	  */
	public String getISObjection();

    /** Column name ObjectionDocNo */
    public static final String COLUMNNAME_ObjectionDocNo = "ObjectionDocNo";

	/** Set ObjectionDocNo	  */
	public void setObjectionDocNo (String ObjectionDocNo);

	/** Get ObjectionDocNo	  */
	public String getObjectionDocNo();

    /** Column name ObjectionResult */
    public static final String COLUMNNAME_ObjectionResult = "ObjectionResult";

	/** Set ObjectionResult	  */
	public void setObjectionResult (String ObjectionResult);

	/** Get ObjectionResult	  */
	public String getObjectionResult();

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
