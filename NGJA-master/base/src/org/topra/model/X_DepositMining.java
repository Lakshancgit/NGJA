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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for DepositMining
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_DepositMining extends PO implements I_DepositMining, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20210312L;

    /** Standard Constructor */
    public X_DepositMining (Properties ctx, int DepositMining_ID, String trxName)
    {
      super (ctx, DepositMining_ID, trxName);
      /** if (DepositMining_ID == 0)
        {
			setC_Payment_ID (0);
			setDepositMining_ID (0);
        } */
    }

    /** Load Constructor */
    public X_DepositMining (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_DepositMining[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AuctionLicense ID.
		@param C_AuctionLicense_ID AuctionLicense ID	  */
	public void setC_AuctionLicense_ID (int C_AuctionLicense_ID)
	{
		if (C_AuctionLicense_ID < 1) 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, null);
		else 
			set_Value (COLUMNNAME_C_AuctionLicense_ID, Integer.valueOf(C_AuctionLicense_ID));
	}

	/** Get AuctionLicense ID.
		@return AuctionLicense ID	  */
	public int getC_AuctionLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AuctionLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set BackhoeService ID.
		@param C_BackhoeService_ID BackhoeService ID	  */
	public void setC_BackhoeService_ID (int C_BackhoeService_ID)
	{
		if (C_BackhoeService_ID < 1) 
			set_Value (COLUMNNAME_C_BackhoeService_ID, null);
		else 
			set_Value (COLUMNNAME_C_BackhoeService_ID, Integer.valueOf(C_BackhoeService_ID));
	}

	/** Get BackhoeService ID.
		@return BackhoeService ID	  */
	public int getC_BackhoeService_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BackhoeService_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GemMininig ID.
		@param C_GemMining_ID GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID)
	{
		if (C_GemMining_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_GemMining_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_GemMining_ID, Integer.valueOf(C_GemMining_ID));
	}

	/** Get GemMininig ID.
		@return GemMininig ID	  */
	public int getC_GemMining_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_GemMining_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set LandOfShares ID.
		@param C_LandOfShares_ID LandOfShares ID	  */
	public void setC_LandOfShares_ID (int C_LandOfShares_ID)
	{
		if (C_LandOfShares_ID < 1) 
			set_Value (COLUMNNAME_C_LandOfShares_ID, null);
		else 
			set_Value (COLUMNNAME_C_LandOfShares_ID, Integer.valueOf(C_LandOfShares_ID));
	}

	/** Get LandOfShares ID.
		@return LandOfShares ID	  */
	public int getC_LandOfShares_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_LandOfShares_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Mining License Upgrade ID.
		@param C_MiningLicenseUpgrade_ID Mining License Upgrade ID	  */
	public void setC_MiningLicenseUpgrade_ID (int C_MiningLicenseUpgrade_ID)
	{
		if (C_MiningLicenseUpgrade_ID < 1) 
			set_Value (COLUMNNAME_C_MiningLicenseUpgrade_ID, null);
		else 
			set_Value (COLUMNNAME_C_MiningLicenseUpgrade_ID, Integer.valueOf(C_MiningLicenseUpgrade_ID));
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

	public org.compiere.model.I_C_Payment getC_Payment() throws RuntimeException
    {
		return (org.compiere.model.I_C_Payment)MTable.get(getCtx(), org.compiere.model.I_C_Payment.Table_Name)
			.getPO(getC_Payment_ID(), get_TrxName());	}

	/** Set Payment.
		@param C_Payment_ID 
		Payment identifier
	  */
	public void setC_Payment_ID (int C_Payment_ID)
	{
		if (C_Payment_ID < 1) 
			set_Value (COLUMNNAME_C_Payment_ID, null);
		else 
			set_Value (COLUMNNAME_C_Payment_ID, Integer.valueOf(C_Payment_ID));
	}

	/** Get Payment.
		@return Payment identifier
	  */
	public int getC_Payment_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Payment_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set DepositMining ID.
		@param DepositMining_ID DepositMining ID	  */
	public void setDepositMining_ID (int DepositMining_ID)
	{
		if (DepositMining_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_DepositMining_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_DepositMining_ID, Integer.valueOf(DepositMining_ID));
	}

	/** Get DepositMining ID.
		@return DepositMining ID	  */
	public int getDepositMining_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DepositMining_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** DepositType AD_Reference_ID=1000163 */
	public static final int DEPOSITTYPE_AD_Reference_ID=1000163;
	/** Mining License = ML */
	public static final String DEPOSITTYPE_MiningLicense = "ML";
	/** Auction License = AL */
	public static final String DEPOSITTYPE_AuctionLicense = "AL";
	/** Backhoe License = BL */
	public static final String DEPOSITTYPE_BackhoeLicense = "BL";
	/** Land Of Shares = LS */
	public static final String DEPOSITTYPE_LandOfShares = "LS";
	/** Set DepositType.
		@param DepositType DepositType	  */
	public void setDepositType (String DepositType)
	{

		set_Value (COLUMNNAME_DepositType, DepositType);
	}

	/** Get DepositType.
		@return DepositType	  */
	public String getDepositType () 
	{
		return (String)get_Value(COLUMNNAME_DepositType);
	}

	/** Set IsUpgrade.
		@param IsUpgrade IsUpgrade	  */
	public void setIsUpgrade (boolean IsUpgrade)
	{
		set_Value (COLUMNNAME_IsUpgrade, Boolean.valueOf(IsUpgrade));
	}

	/** Get IsUpgrade.
		@return IsUpgrade	  */
	public boolean isUpgrade () 
	{
		Object oo = get_Value(COLUMNNAME_IsUpgrade);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** LicenseTypeMining AD_Reference_ID=1000171 */
	public static final int LICENSETYPEMINING_AD_Reference_ID=1000171;
	/** Mining License = ML */
	public static final String LICENSETYPEMINING_MiningLicense = "ML";
	/** Aution License = AL */
	public static final String LICENSETYPEMINING_AutionLicense = "AL";
	/** Backhoe License = BL */
	public static final String LICENSETYPEMINING_BackhoeLicense = "BL";
	/** Set LicenseTypeMining.
		@param LicenseTypeMining LicenseTypeMining	  */
	public void setLicenseTypeMining (String LicenseTypeMining)
	{

		set_Value (COLUMNNAME_LicenseTypeMining, LicenseTypeMining);
	}

	/** Get LicenseTypeMining.
		@return LicenseTypeMining	  */
	public String getLicenseTypeMining () 
	{
		return (String)get_Value(COLUMNNAME_LicenseTypeMining);
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