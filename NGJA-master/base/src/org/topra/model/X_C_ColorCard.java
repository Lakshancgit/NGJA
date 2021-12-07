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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for C_ColorCard
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ColorCard extends PO implements I_C_ColorCard, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20181206L;

    /** Standard Constructor */
    public X_C_ColorCard (Properties ctx, int C_ColorCard_ID, String trxName)
    {
      super (ctx, C_ColorCard_ID, trxName);
      /** if (C_ColorCard_ID == 0)
        {
        } */
    }

    /** Load Constructor */
    public X_C_ColorCard (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ColorCard[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AppStatus.
		@param AppStatus AppStatus	  */
	public void setAppStatus (String AppStatus)
	{
		set_Value (COLUMNNAME_AppStatus, AppStatus);
	}

	/** Get AppStatus.
		@return AppStatus	  */
	public String getAppStatus () 
	{
		return (String)get_Value(COLUMNNAME_AppStatus);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Color Card ID.
		@param C_ColorCard_ID Color Card ID	  */
	public void setC_ColorCard_ID (int C_ColorCard_ID)
	{
		if (C_ColorCard_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ColorCard_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ColorCard_ID, Integer.valueOf(C_ColorCard_ID));
	}

	/** Get Color Card ID.
		@return Color Card ID	  */
	public int getC_ColorCard_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ColorCard_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** CCStatus AD_Reference_ID=1000048 */
	public static final int CCSTATUS_AD_Reference_ID=1000048;
	/** Active = A */
	public static final String CCSTATUS_Active = "A";
	/** Inactive = I */
	public static final String CCSTATUS_Inactive = "I";
	/** Prepare = P */
	public static final String CCSTATUS_Prepare = "P";
	/** Send For Approval = SP */
	public static final String CCSTATUS_SendForApproval = "SP";
	/** Set Color Card Status.
		@param CCStatus Color Card Status	  */
	public void setCCStatus (String CCStatus)
	{

		set_Value (COLUMNNAME_CCStatus, CCStatus);
	}

	/** Get Color Card Status.
		@return Color Card Status	  */
	public String getCCStatus () 
	{
		return (String)get_Value(COLUMNNAME_CCStatus);
	}

	/** Set CC Owner NIC.
		@param ColorCardOwnerNic CC Owner NIC	  */
	public void setColorCardOwnerNic (String ColorCardOwnerNic)
	{
		set_Value (COLUMNNAME_ColorCardOwnerNic, ColorCardOwnerNic);
	}

	/** Get CC Owner NIC.
		@return CC Owner NIC	  */
	public String getColorCardOwnerNic () 
	{
		return (String)get_Value(COLUMNNAME_ColorCardOwnerNic);
	}

	/** ColorCardType AD_Reference_ID=1000018 */
	public static final int COLORCARDTYPE_AD_Reference_ID=1000018;
	/** Gold = G */
	public static final String COLORCARDTYPE_Gold = "G";
	/** Platinum = P */
	public static final String COLORCARDTYPE_Platinum = "P";
	/** BRONZE = B */
	public static final String COLORCARDTYPE_BRONZE = "B";
	/** SILVER = S */
	public static final String COLORCARDTYPE_SILVER = "S";
	/** Set Color Card Type.
		@param ColorCardType Color Card Type	  */
	public void setColorCardType (String ColorCardType)
	{

		set_Value (COLUMNNAME_ColorCardType, ColorCardType);
	}

	/** Get Color Card Type.
		@return Color Card Type	  */
	public String getColorCardType () 
	{
		return (String)get_Value(COLUMNNAME_ColorCardType);
	}

	/** Set Name Of The CC Owner.
		@param ColorOwnerName Name Of The CC Owner	  */
	public void setColorOwnerName (String ColorOwnerName)
	{
		set_Value (COLUMNNAME_ColorOwnerName, ColorOwnerName);
	}

	/** Get Name Of The CC Owner.
		@return Name Of The CC Owner	  */
	public String getColorOwnerName () 
	{
		return (String)get_Value(COLUMNNAME_ColorOwnerName);
	}

	/** Set Company Name.
		@param CompanyName Company Name	  */
	public void setCompanyName (String CompanyName)
	{
		set_Value (COLUMNNAME_CompanyName, CompanyName);
	}

	/** Get Company Name.
		@return Company Name	  */
	public String getCompanyName () 
	{
		return (String)get_Value(COLUMNNAME_CompanyName);
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

	public org.topra.model.I_D_DealerLicense getD_DealerLicense() throws RuntimeException
    {
		return (org.topra.model.I_D_DealerLicense)MTable.get(getCtx(), org.topra.model.I_D_DealerLicense.Table_Name)
			.getPO(getD_DealerLicense_ID(), get_TrxName());	}

	/** Set Gem Dealer License ID.
		@param D_DealerLicense_ID Gem Dealer License ID	  */
	public void setD_DealerLicense_ID (int D_DealerLicense_ID)
	{
		if (D_DealerLicense_ID < 1) 
			set_Value (COLUMNNAME_D_DealerLicense_ID, null);
		else 
			set_Value (COLUMNNAME_D_DealerLicense_ID, Integer.valueOf(D_DealerLicense_ID));
	}

	/** Get Gem Dealer License ID.
		@return Gem Dealer License ID	  */
	public int getD_DealerLicense_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_D_DealerLicense_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Gem Stock Value.
		@param gem_stock_value Gem Stock Value	  */
	public void setgem_stock_value (String gem_stock_value)
	{
		throw new IllegalArgumentException ("gem_stock_value is virtual column");	}

	/** Get Gem Stock Value.
		@return Gem Stock Value	  */
	public String getgem_stock_value () 
	{
		return (String)get_Value(COLUMNNAME_gem_stock_value);
	}

	/** Set License End Date.
		@param LicenseEndDate License End Date	  */
	public void setLicenseEndDate (Timestamp LicenseEndDate)
	{
		throw new IllegalArgumentException ("LicenseEndDate is virtual column");	}

	/** Get License End Date.
		@return License End Date	  */
	public Timestamp getLicenseEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LicenseEndDate);
	}

	/** Set Print Document.
		@param PrintDocument 
		Document to print
	  */
	public void setPrintDocument (String PrintDocument)
	{
		set_Value (COLUMNNAME_PrintDocument, PrintDocument);
	}

	/** Get Print Document.
		@return Document to print
	  */
	public String getPrintDocument () 
	{
		return (String)get_Value(COLUMNNAME_PrintDocument);
	}

	/** Set Printed.
		@param Printed Printed	  */
	public void setPrinted (boolean Printed)
	{
		set_Value (COLUMNNAME_Printed, Boolean.valueOf(Printed));
	}

	/** Get Printed.
		@return Printed	  */
	public boolean isPrinted () 
	{
		Object oo = get_Value(COLUMNNAME_Printed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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