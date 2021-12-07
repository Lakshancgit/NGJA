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

/** Generated Interface for C_LandSpecialConditions
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_LandSpecialConditions 
{

    /** TableName=C_LandSpecialConditions */
    public static final String Table_Name = "C_LandSpecialConditions";

    /** AD_Table_ID=1000086 */
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

    /** Column name C_LandDetails_ID */
    public static final String COLUMNNAME_C_LandDetails_ID = "C_LandDetails_ID";

	/** Set Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID);

	/** Get Land Details ID	  */
	public int getC_LandDetails_ID();

    /** Column name C_LandSpecialConditions_ID */
    public static final String COLUMNNAME_C_LandSpecialConditions_ID = "C_LandSpecialConditions_ID";

	/** Set Special Conditions ID	  */
	public void setC_LandSpecialConditions_ID (int C_LandSpecialConditions_ID);

	/** Get Special Conditions ID	  */
	public int getC_LandSpecialConditions_ID();

    /** Column name C_MiningLicenseUpgrade_ID */
    public static final String COLUMNNAME_C_MiningLicenseUpgrade_ID = "C_MiningLicenseUpgrade_ID";

	/** Set Mining License Upgrade ID	  */
	public void setC_MiningLicenseUpgrade_ID (int C_MiningLicenseUpgrade_ID);

	/** Get Mining License Upgrade ID	  */
	public int getC_MiningLicenseUpgrade_ID();

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

    /** Column name FeetsForBuildings */
    public static final String COLUMNNAME_FeetsForBuildings = "FeetsForBuildings";

	/** Set FeetsForBuildings	  */
	public void setFeetsForBuildings (BigDecimal FeetsForBuildings);

	/** Get FeetsForBuildings	  */
	public BigDecimal getFeetsForBuildings();

    /** Column name FeetsForCanel */
    public static final String COLUMNNAME_FeetsForCanel = "FeetsForCanel";

	/** Set FeetsForCanel	  */
	public void setFeetsForCanel (BigDecimal FeetsForCanel);

	/** Get FeetsForCanel	  */
	public BigDecimal getFeetsForCanel();

    /** Column name FeetsForDCanel */
    public static final String COLUMNNAME_FeetsForDCanel = "FeetsForDCanel";

	/** Set FeetsForDCanel	  */
	public void setFeetsForDCanel (BigDecimal FeetsForDCanel);

	/** Get FeetsForDCanel	  */
	public BigDecimal getFeetsForDCanel();

    /** Column name FeetsForHitentionETowers */
    public static final String COLUMNNAME_FeetsForHitentionETowers = "FeetsForHitentionETowers";

	/** Set FeetsForHitentionETowers	  */
	public void setFeetsForHitentionETowers (BigDecimal FeetsForHitentionETowers);

	/** Get FeetsForHitentionETowers	  */
	public BigDecimal getFeetsForHitentionETowers();

    /** Column name FeetsForHouses */
    public static final String COLUMNNAME_FeetsForHouses = "FeetsForHouses";

	/** Set FeetsForHouses	  */
	public void setFeetsForHouses (BigDecimal FeetsForHouses);

	/** Get FeetsForHouses	  */
	public BigDecimal getFeetsForHouses();

    /** Column name FeetsForMainRoad */
    public static final String COLUMNNAME_FeetsForMainRoad = "FeetsForMainRoad";

	/** Set FeetsForMainRoad	  */
	public void setFeetsForMainRoad (BigDecimal FeetsForMainRoad);

	/** Get FeetsForMainRoad	  */
	public BigDecimal getFeetsForMainRoad();

    /** Column name FeetsForNearbyGlands */
    public static final String COLUMNNAME_FeetsForNearbyGlands = "FeetsForNearbyGlands";

	/** Set FeetsForNearbyGlands	  */
	public void setFeetsForNearbyGlands (BigDecimal FeetsForNearbyGlands);

	/** Get FeetsForNearbyGlands	  */
	public BigDecimal getFeetsForNearbyGlands();

    /** Column name FeetsForNearbyOrCrossRiver */
    public static final String COLUMNNAME_FeetsForNearbyOrCrossRiver = "FeetsForNearbyOrCrossRiver";

	/** Set FeetsForNearbyOrCrossRiver	  */
	public void setFeetsForNearbyOrCrossRiver (BigDecimal FeetsForNearbyOrCrossRiver);

	/** Get FeetsForNearbyOrCrossRiver	  */
	public BigDecimal getFeetsForNearbyOrCrossRiver();

    /** Column name FeetsForPCanel */
    public static final String COLUMNNAME_FeetsForPCanel = "FeetsForPCanel";

	/** Set FeetsForPCanel	  */
	public void setFeetsForPCanel (BigDecimal FeetsForPCanel);

	/** Get FeetsForPCanel	  */
	public BigDecimal getFeetsForPCanel();

    /** Column name FeetsForPublicBuildings */
    public static final String COLUMNNAME_FeetsForPublicBuildings = "FeetsForPublicBuildings";

	/** Set FeetsForPublicBuildings	  */
	public void setFeetsForPublicBuildings (BigDecimal FeetsForPublicBuildings);

	/** Get FeetsForPublicBuildings	  */
	public BigDecimal getFeetsForPublicBuildings();

    /** Column name FeetsForPublicPlaces */
    public static final String COLUMNNAME_FeetsForPublicPlaces = "FeetsForPublicPlaces";

	/** Set FeetsForPublicPlaces	  */
	public void setFeetsForPublicPlaces (BigDecimal FeetsForPublicPlaces);

	/** Get FeetsForPublicPlaces	  */
	public BigDecimal getFeetsForPublicPlaces();

    /** Column name FeetsForRoads */
    public static final String COLUMNNAME_FeetsForRoads = "FeetsForRoads";

	/** Set FeetsForRoads	  */
	public void setFeetsForRoads (BigDecimal FeetsForRoads);

	/** Get FeetsForRoads	  */
	public BigDecimal getFeetsForRoads();

    /** Column name FeetsForStream */
    public static final String COLUMNNAME_FeetsForStream = "FeetsForStream";

	/** Set FeetsForStream	  */
	public void setFeetsForStream (BigDecimal FeetsForStream);

	/** Get FeetsForStream	  */
	public BigDecimal getFeetsForStream();

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
