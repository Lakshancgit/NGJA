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

/** Generated Model for C_MiningLicenseSinhala
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_MiningLicenseSinhala extends PO implements I_C_MiningLicenseSinhala, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200213L;

    /** Standard Constructor */
    public X_C_MiningLicenseSinhala (Properties ctx, int C_MiningLicenseSinhala_ID, String trxName)
    {
      super (ctx, C_MiningLicenseSinhala_ID, trxName);
      /** if (C_MiningLicenseSinhala_ID == 0)
        {
			setC_MiningLicenseSinhala_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_MiningLicenseSinhala (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_MiningLicenseSinhala[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set GemMininig ID.
		@param C_GemMining_ID GemMininig ID	  */
	public void setC_GemMining_ID (int C_GemMining_ID)
	{
		if (C_GemMining_ID < 1) 
			set_Value (COLUMNNAME_C_GemMining_ID, null);
		else 
			set_Value (COLUMNNAME_C_GemMining_ID, Integer.valueOf(C_GemMining_ID));
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

	/** Set Mining License (Sinhala) ID.
		@param C_MiningLicenseSinhala_ID Mining License (Sinhala) ID	  */
	public void setC_MiningLicenseSinhala_ID (int C_MiningLicenseSinhala_ID)
	{
		if (C_MiningLicenseSinhala_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_MiningLicenseSinhala_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_MiningLicenseSinhala_ID, Integer.valueOf(C_MiningLicenseSinhala_ID));
	}

	/** Get Mining License (Sinhala) ID.
		@return Mining License (Sinhala) ID	  */
	public int getC_MiningLicenseSinhala_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MiningLicenseSinhala_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date Confirm.
		@param DateConfirm 
		Date Confirm of this Order
	  */
	public void setDateConfirm (String DateConfirm)
	{
		set_Value (COLUMNNAME_DateConfirm, DateConfirm);
	}

	/** Get Date Confirm.
		@return Date Confirm of this Order
	  */
	public String getDateConfirm () 
	{
		return (String)get_Value(COLUMNNAME_DateConfirm);
	}

	/** District AD_Reference_ID=1000061 */
	public static final int DISTRICT_AD_Reference_ID=1000061;
	/** Ampara = Ampara */
	public static final String DISTRICT_Ampara = "Ampara";
	/** Anuradhapura = Anuradhapura */
	public static final String DISTRICT_Anuradhapura = "Anuradhapura";
	/** Badulla = Badulla */
	public static final String DISTRICT_Badulla = "Badulla";
	/** Batticaloa = Batticaloa */
	public static final String DISTRICT_Batticaloa = "Batticaloa";
	/** Colombo = Colombo */
	public static final String DISTRICT_Colombo = "Colombo";
	/** Galle = Galle */
	public static final String DISTRICT_Galle = "Galle";
	/** Gampaha = Gampaha */
	public static final String DISTRICT_Gampaha = "Gampaha";
	/** Hambantota = Hambantota */
	public static final String DISTRICT_Hambantota = "Hambantota";
	/** Jaffna = Jaffna */
	public static final String DISTRICT_Jaffna = "Jaffna";
	/** Kalutara = Kalutara */
	public static final String DISTRICT_Kalutara = "Kalutara";
	/** Kandy = Kandy */
	public static final String DISTRICT_Kandy = "Kandy";
	/** Kegalle = Kegalle */
	public static final String DISTRICT_Kegalle = "Kegalle";
	/** Kilinochchi = Kilinochchi */
	public static final String DISTRICT_Kilinochchi = "Kilinochchi";
	/** Kurunegala = Kurunegala */
	public static final String DISTRICT_Kurunegala = "Kurunegala";
	/** Mannar = Mannar */
	public static final String DISTRICT_Mannar = "Mannar";
	/** Matale = Matale */
	public static final String DISTRICT_Matale = "Matale";
	/** Matara = Matara */
	public static final String DISTRICT_Matara = "Matara";
	/** Monaragala = Monaragala */
	public static final String DISTRICT_Monaragala = "Monaragala";
	/** Mullaitivu = Mullaitivu */
	public static final String DISTRICT_Mullaitivu = "Mullaitivu";
	/** Nuwara Eliya = Nuwara Eliya */
	public static final String DISTRICT_NuwaraEliya = "Nuwara Eliya";
	/** Polonnaruwa = Polonnaruwa */
	public static final String DISTRICT_Polonnaruwa = "Polonnaruwa";
	/** Puttalam = Puttalam */
	public static final String DISTRICT_Puttalam = "Puttalam";
	/** Ratnapura = Ratnapura */
	public static final String DISTRICT_Ratnapura = "Ratnapura";
	/** Trincomalee = Trincomalee */
	public static final String DISTRICT_Trincomalee = "Trincomalee";
	/** Vavuniya = Vavuniya */
	public static final String DISTRICT_Vavuniya = "Vavuniya";
	/** Set District.
		@param District District	  */
	public void setDistrict (String District)
	{

		set_Value (COLUMNNAME_District, District);
	}

	/** Get District.
		@return District	  */
	public String getDistrict () 
	{
		return (String)get_Value(COLUMNNAME_District);
	}

	/** Set Divisional Secretary Head Office.
		@param DiviSecHeadOff Divisional Secretary Head Office	  */
	public void setDiviSecHeadOff (String DiviSecHeadOff)
	{
		set_Value (COLUMNNAME_DiviSecHeadOff, DiviSecHeadOff);
	}

	/** Get Divisional Secretary Head Office.
		@return Divisional Secretary Head Office	  */
	public String getDiviSecHeadOff () 
	{
		return (String)get_Value(COLUMNNAME_DiviSecHeadOff);
	}

	/** Set Divisional Secretary Office.
		@param DiviSecOffice Divisional Secretary Office	  */
	public void setDiviSecOffice (String DiviSecOffice)
	{
		set_Value (COLUMNNAME_DiviSecOffice, DiviSecOffice);
	}

	/** Get Divisional Secretary Office.
		@return Divisional Secretary Office	  */
	public String getDiviSecOffice () 
	{
		return (String)get_Value(COLUMNNAME_DiviSecOffice);
	}

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set ExpiryDateOfLicense.
		@param ExpiryDateOfLicense ExpiryDateOfLicense	  */
	public void setExpiryDateOfLicense (String ExpiryDateOfLicense)
	{
		set_Value (COLUMNNAME_ExpiryDateOfLicense, ExpiryDateOfLicense);
	}

	/** Get ExpiryDateOfLicense.
		@return ExpiryDateOfLicense	  */
	public String getExpiryDateOfLicense () 
	{
		return (String)get_Value(COLUMNNAME_ExpiryDateOfLicense);
	}

	/** Set Printed.
		@param IsPrinted 
		Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted)
	{
		set_Value (COLUMNNAME_IsPrinted, Boolean.valueOf(IsPrinted));
	}

	/** Get Printed.
		@return Indicates if this document / line is printed
	  */
	public boolean isPrinted () 
	{
		Object oo = get_Value(COLUMNNAME_IsPrinted);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Saved.
		@param IsSaved Saved	  */
	public void setIsSaved (boolean IsSaved)
	{
		set_Value (COLUMNNAME_IsSaved, Boolean.valueOf(IsSaved));
	}

	/** Get Saved.
		@return Saved	  */
	public boolean isSaved () 
	{
		Object oo = get_Value(COLUMNNAME_IsSaved);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Name of the Land.
		@param LandName Name of the Land	  */
	public void setLandName (String LandName)
	{
		set_Value (COLUMNNAME_LandName, LandName);
	}

	/** Get Name of the Land.
		@return Name of the Land	  */
	public String getLandName () 
	{
		return (String)get_Value(COLUMNNAME_LandName);
	}

	/** LandNature AD_Reference_ID=1000066 */
	public static final int LANDNATURE_AD_Reference_ID=1000066;
	/** Goda = G */
	public static final String LANDNATURE_Goda = "G";
	/** Paddy = P */
	public static final String LANDNATURE_Paddy = "P";
	/** Goda & Paddy = GP */
	public static final String LANDNATURE_GodaPaddy = "GP";
	/** Swamp = S */
	public static final String LANDNATURE_Swamp = "S";
	/** Meadow = M */
	public static final String LANDNATURE_Meadow = "M";
	/** Set Nature of the Land.
		@param LandNature Nature of the Land	  */
	public void setLandNature (String LandNature)
	{

		set_Value (COLUMNNAME_LandNature, LandNature);
	}

	/** Get Nature of the Land.
		@return Nature of the Land	  */
	public String getLandNature () 
	{
		return (String)get_Value(COLUMNNAME_LandNature);
	}

	/** Set MiningLicenseNo.
		@param MiningLicenseNo MiningLicenseNo	  */
	public void setMiningLicenseNo (String MiningLicenseNo)
	{
		set_Value (COLUMNNAME_MiningLicenseNo, MiningLicenseNo);
	}

	/** Get MiningLicenseNo.
		@return MiningLicenseNo	  */
	public String getMiningLicenseNo () 
	{
		return (String)get_Value(COLUMNNAME_MiningLicenseNo);
	}

	/** Set NIC & Name.
		@param NICnName NIC & Name	  */
	public void setNICnName (String NICnName)
	{
		set_Value (COLUMNNAME_NICnName, NICnName);
	}

	/** Get NIC & Name.
		@return NIC & Name	  */
	public String getNICnName () 
	{
		return (String)get_Value(COLUMNNAME_NICnName);
	}

	/** Set NoOfMine.
		@param NoOfMine NoOfMine	  */
	public void setNoOfMine (String NoOfMine)
	{
		set_Value (COLUMNNAME_NoOfMine, NoOfMine);
	}

	/** Get NoOfMine.
		@return NoOfMine	  */
	public String getNoOfMine () 
	{
		return (String)get_Value(COLUMNNAME_NoOfMine);
	}

	/** Set specialConditions.
		@param specialConditions specialConditions	  */
	public void setspecialConditions (String specialConditions)
	{
		set_Value (COLUMNNAME_specialConditions, specialConditions);
	}

	/** Get specialConditions.
		@return specialConditions	  */
	public String getspecialConditions () 
	{
		return (String)get_Value(COLUMNNAME_specialConditions);
	}

	/** Set To East.
		@param ToEast To East	  */
	public void setToEast (String ToEast)
	{
		set_Value (COLUMNNAME_ToEast, ToEast);
	}

	/** Get To East.
		@return To East	  */
	public String getToEast () 
	{
		return (String)get_Value(COLUMNNAME_ToEast);
	}

	/** Set To North.
		@param ToNorth To North	  */
	public void setToNorth (String ToNorth)
	{
		set_Value (COLUMNNAME_ToNorth, ToNorth);
	}

	/** Get To North.
		@return To North	  */
	public String getToNorth () 
	{
		return (String)get_Value(COLUMNNAME_ToNorth);
	}

	/** Set To South.
		@param ToSouth To South	  */
	public void setToSouth (String ToSouth)
	{
		set_Value (COLUMNNAME_ToSouth, ToSouth);
	}

	/** Get To South.
		@return To South	  */
	public String getToSouth () 
	{
		return (String)get_Value(COLUMNNAME_ToSouth);
	}

	/** Set To West.
		@param ToWest To West	  */
	public void setToWest (String ToWest)
	{
		set_Value (COLUMNNAME_ToWest, ToWest);
	}

	/** Get To West.
		@return To West	  */
	public String getToWest () 
	{
		return (String)get_Value(COLUMNNAME_ToWest);
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

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Village.
		@param Village Village	  */
	public void setVillage (String Village)
	{
		set_Value (COLUMNNAME_Village, Village);
	}

	/** Get Village.
		@return Village	  */
	public String getVillage () 
	{
		return (String)get_Value(COLUMNNAME_Village);
	}
}