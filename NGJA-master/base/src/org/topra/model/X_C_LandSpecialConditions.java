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
/** Generated Model - DO NOT CHANGE */
package org.topra.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for C_LandSpecialConditions
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_LandSpecialConditions extends PO implements I_C_LandSpecialConditions, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190517L;

    /** Standard Constructor */
    public X_C_LandSpecialConditions (Properties ctx, int C_LandSpecialConditions_ID, String trxName)
    {
      super (ctx, C_LandSpecialConditions_ID, trxName);
      /** if (C_LandSpecialConditions_ID == 0)
        {
			setC_LandSpecialConditions_ID (0);
			setUUID (null);
// 0
        } */
    }

    /** Load Constructor */
    public X_C_LandSpecialConditions (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_LandSpecialConditions[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Land Details ID.
		@param C_LandDetails_ID Land Details ID	  */
	public void setC_LandDetails_ID (int C_LandDetails_ID)
	{
		if (C_LandDetails_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_LandDetails_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_LandDetails_ID, Integer.valueOf(C_LandDetails_ID));
	}

	/** Get Land Details ID.
		@return Land Details ID	  */
	public int getC_LandDetails_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandDetails_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Special Conditions ID.
		@param C_LandSpecialConditions_ID Special Conditions ID	  */
	public void setC_LandSpecialConditions_ID (int C_LandSpecialConditions_ID)
	{
		if (C_LandSpecialConditions_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_LandSpecialConditions_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_LandSpecialConditions_ID, Integer.valueOf(C_LandSpecialConditions_ID));
	}

	/** Get Special Conditions ID.
		@return Special Conditions ID	  */
	public int getC_LandSpecialConditions_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandSpecialConditions_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Mining License Upgrade ID.
		@param C_MiningLicenseUpgrade_ID Mining License Upgrade ID	  */
	public void setC_MiningLicenseUpgrade_ID (int C_MiningLicenseUpgrade_ID)
	{
		if (C_MiningLicenseUpgrade_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MiningLicenseUpgrade_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MiningLicenseUpgrade_ID, Integer.valueOf(C_MiningLicenseUpgrade_ID));
	}

	/** Get Mining License Upgrade ID.
		@return Mining License Upgrade ID	  */
	public int getC_MiningLicenseUpgrade_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MiningLicenseUpgrade_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set FeetsForBuildings.
		@param FeetsForBuildings FeetsForBuildings	  */
	public void setFeetsForBuildings (BigDecimal FeetsForBuildings)
	{
		set_Value (COLUMNNAME_FeetsForBuildings, FeetsForBuildings);
	}

	/** Get FeetsForBuildings.
		@return FeetsForBuildings	  */
	public BigDecimal getFeetsForBuildings () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForBuildings);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForCanel.
		@param FeetsForCanel FeetsForCanel	  */
	public void setFeetsForCanel (BigDecimal FeetsForCanel)
	{
		set_Value (COLUMNNAME_FeetsForCanel, FeetsForCanel);
	}

	/** Get FeetsForCanel.
		@return FeetsForCanel	  */
	public BigDecimal getFeetsForCanel () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForCanel);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForDCanel.
		@param FeetsForDCanel FeetsForDCanel	  */
	public void setFeetsForDCanel (BigDecimal FeetsForDCanel)
	{
		set_Value (COLUMNNAME_FeetsForDCanel, FeetsForDCanel);
	}

	/** Get FeetsForDCanel.
		@return FeetsForDCanel	  */
	public BigDecimal getFeetsForDCanel () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForDCanel);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForHitentionETowers.
		@param FeetsForHitentionETowers FeetsForHitentionETowers	  */
	public void setFeetsForHitentionETowers (BigDecimal FeetsForHitentionETowers)
	{
		set_Value (COLUMNNAME_FeetsForHitentionETowers, FeetsForHitentionETowers);
	}

	/** Get FeetsForHitentionETowers.
		@return FeetsForHitentionETowers	  */
	public BigDecimal getFeetsForHitentionETowers () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForHitentionETowers);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForHouses.
		@param FeetsForHouses FeetsForHouses	  */
	public void setFeetsForHouses (BigDecimal FeetsForHouses)
	{
		set_Value (COLUMNNAME_FeetsForHouses, FeetsForHouses);
	}

	/** Get FeetsForHouses.
		@return FeetsForHouses	  */
	public BigDecimal getFeetsForHouses () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForHouses);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForMainRoad.
		@param FeetsForMainRoad FeetsForMainRoad	  */
	public void setFeetsForMainRoad (BigDecimal FeetsForMainRoad)
	{
		set_Value (COLUMNNAME_FeetsForMainRoad, FeetsForMainRoad);
	}

	/** Get FeetsForMainRoad.
		@return FeetsForMainRoad	  */
	public BigDecimal getFeetsForMainRoad () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForMainRoad);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForNearbyGlands.
		@param FeetsForNearbyGlands FeetsForNearbyGlands	  */
	public void setFeetsForNearbyGlands (BigDecimal FeetsForNearbyGlands)
	{
		set_Value (COLUMNNAME_FeetsForNearbyGlands, FeetsForNearbyGlands);
	}

	/** Get FeetsForNearbyGlands.
		@return FeetsForNearbyGlands	  */
	public BigDecimal getFeetsForNearbyGlands () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForNearbyGlands);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForNearbyOrCrossRiver.
		@param FeetsForNearbyOrCrossRiver FeetsForNearbyOrCrossRiver	  */
	public void setFeetsForNearbyOrCrossRiver (BigDecimal FeetsForNearbyOrCrossRiver)
	{
		set_Value (COLUMNNAME_FeetsForNearbyOrCrossRiver, FeetsForNearbyOrCrossRiver);
	}

	/** Get FeetsForNearbyOrCrossRiver.
		@return FeetsForNearbyOrCrossRiver	  */
	public BigDecimal getFeetsForNearbyOrCrossRiver () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForNearbyOrCrossRiver);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForPCanel.
		@param FeetsForPCanel FeetsForPCanel	  */
	public void setFeetsForPCanel (BigDecimal FeetsForPCanel)
	{
		set_Value (COLUMNNAME_FeetsForPCanel, FeetsForPCanel);
	}

	/** Get FeetsForPCanel.
		@return FeetsForPCanel	  */
	public BigDecimal getFeetsForPCanel () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForPCanel);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForPublicBuildings.
		@param FeetsForPublicBuildings FeetsForPublicBuildings	  */
	public void setFeetsForPublicBuildings (BigDecimal FeetsForPublicBuildings)
	{
		set_Value (COLUMNNAME_FeetsForPublicBuildings, FeetsForPublicBuildings);
	}

	/** Get FeetsForPublicBuildings.
		@return FeetsForPublicBuildings	  */
	public BigDecimal getFeetsForPublicBuildings () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForPublicBuildings);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForPublicPlaces.
		@param FeetsForPublicPlaces FeetsForPublicPlaces	  */
	public void setFeetsForPublicPlaces (BigDecimal FeetsForPublicPlaces)
	{
		set_Value (COLUMNNAME_FeetsForPublicPlaces, FeetsForPublicPlaces);
	}

	/** Get FeetsForPublicPlaces.
		@return FeetsForPublicPlaces	  */
	public BigDecimal getFeetsForPublicPlaces () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForPublicPlaces);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForRoads.
		@param FeetsForRoads FeetsForRoads	  */
	public void setFeetsForRoads (BigDecimal FeetsForRoads)
	{
		set_Value (COLUMNNAME_FeetsForRoads, FeetsForRoads);
	}

	/** Get FeetsForRoads.
		@return FeetsForRoads	  */
	public BigDecimal getFeetsForRoads () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForRoads);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FeetsForStream.
		@param FeetsForStream FeetsForStream	  */
	public void setFeetsForStream (BigDecimal FeetsForStream)
	{
		set_Value (COLUMNNAME_FeetsForStream, FeetsForStream);
	}

	/** Get FeetsForStream.
		@return FeetsForStream	  */
	public BigDecimal getFeetsForStream () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FeetsForStream);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Status AD_Reference_ID=1000172 */
	public static final int STATUS_AD_Reference_ID=1000172;
	/** Valid = V */
	public static final String STATUS_Valid = "V";
	/** Invalid = IN */
	public static final String STATUS_Invalid = "IN";
	/** Set Status.
		@param Status 
		Status of the currently running check
	  */
	public void setStatus (String Status)
	{

		set_Value (COLUMNNAME_Status, Status);
	}

	/** Get Status.
		@return Status of the currently running check
	  */
	public String getStatus () 
	{
		return (String)get_Value(COLUMNNAME_Status);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}