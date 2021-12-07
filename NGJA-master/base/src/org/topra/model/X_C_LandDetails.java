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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for C_LandDetails
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_LandDetails extends PO implements I_C_LandDetails, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20190424L;

    /** Standard Constructor */
    public X_C_LandDetails (Properties ctx, int C_LandDetails_ID, String trxName)
    {
      super (ctx, C_LandDetails_ID, trxName);
      /** if (C_LandDetails_ID == 0)
        {
			setC_LandDetails_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_LandDetails (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_LandDetails[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Proposed Manager/Administrator Name.
		@param AdminMangerName Proposed Manager/Administrator Name	  */
	public void setAdminMangerName (String AdminMangerName)
	{
		set_Value (COLUMNNAME_AdminMangerName, AdminMangerName);
	}

	/** Get Proposed Manager/Administrator Name.
		@return Proposed Manager/Administrator Name	  */
	public String getAdminMangerName () 
	{
		return (String)get_Value(COLUMNNAME_AdminMangerName);
	}

	/** ApplicationStatus AD_Reference_ID=1000124 */
	public static final int APPLICATIONSTATUS_AD_Reference_ID=1000124;
	/** Send For RM Approval = RM */
	public static final String APPLICATIONSTATUS_SendForRMApproval = "RM";
	/** Send For EO Officer = EO */
	public static final String APPLICATIONSTATUS_SendForEOOfficer = "EO";
	/** Ready for License Entry = RLE */
	public static final String APPLICATIONSTATUS_ReadyForLicenseEntry = "RLE";
	/** Prepare = P */
	public static final String APPLICATIONSTATUS_Prepare = "P";
	/** EO Approved = EOA */
	public static final String APPLICATIONSTATUS_EOApproved = "EOA";
	/** Objection = OBJ */
	public static final String APPLICATIONSTATUS_Objection = "OBJ";
	/** Close = CL */
	public static final String APPLICATIONSTATUS_Close = "CL";
	/** Set ApplicationStatus.
		@param ApplicationStatus ApplicationStatus	  */
	public void setApplicationStatus (String ApplicationStatus)
	{

		set_Value (COLUMNNAME_ApplicationStatus, ApplicationStatus);
	}

	/** Get ApplicationStatus.
		@return ApplicationStatus	  */
	public String getApplicationStatus () 
	{
		return (String)get_Value(COLUMNNAME_ApplicationStatus);
	}

	/** BelongsToOther AD_Reference_ID=1000070 */
	public static final int BELONGSTOOTHER_AD_Reference_ID=1000070;
	/** Yes = Y */
	public static final String BELONGSTOOTHER_Yes = "Y";
	/** No = N */
	public static final String BELONGSTOOTHER_No = "N";
	/** Set Land Belongs to the Temple/Fane/Manorial.
		@param BelongsToOther Land Belongs to the Temple/Fane/Manorial	  */
	public void setBelongsToOther (String BelongsToOther)
	{

		set_Value (COLUMNNAME_BelongsToOther, BelongsToOther);
	}

	/** Get Land Belongs to the Temple/Fane/Manorial.
		@return Land Belongs to the Temple/Fane/Manorial	  */
	public String getBelongsToOther () 
	{
		return (String)get_Value(COLUMNNAME_BelongsToOther);
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
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
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

	public org.topra.model.I_C_GemMining getC_GemMining() throws RuntimeException
    {
		return (org.topra.model.I_C_GemMining)MTable.get(getCtx(), org.topra.model.I_C_GemMining.Table_Name)
			.getPO(getC_GemMining_ID(), get_TrxName());	}

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

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
    {
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_Name)
			.getPO(getC_Invoice_ID(), get_TrxName());	}

	/** Set Invoice.
		@param C_Invoice_ID 
		Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1) 
			set_Value (COLUMNNAME_C_Invoice_ID, null);
		else 
			set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set C_MiningLandName ID.
		@param C_MiningLandName_ID C_MiningLandName ID	  */
	public void setC_MiningLandName_ID (int C_MiningLandName_ID)
	{
		if (C_MiningLandName_ID < 1) 
			set_Value (COLUMNNAME_C_MiningLandName_ID, null);
		else 
			set_Value (COLUMNNAME_C_MiningLandName_ID, Integer.valueOf(C_MiningLandName_ID));
	}

	/** Get C_MiningLandName ID.
		@return C_MiningLandName ID	  */
	public int getC_MiningLandName_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_MiningLandName_ID);
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

	/** Set Date.
		@param Date1 
		Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set Deed Number.
		@param DeedNumber Deed Number	  */
	public void setDeedNumber (String DeedNumber)
	{
		set_Value (COLUMNNAME_DeedNumber, DeedNumber);
	}

	/** Get Deed Number.
		@return Deed Number	  */
	public String getDeedNumber () 
	{
		return (String)get_Value(COLUMNNAME_DeedNumber);
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
	/**  Kegalle = Kegalle */
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

//	public org.topra.model.I_C_DiviSecOffice getDiviSecOff() throws RuntimeException
//    {
//		return (org.topra.model.I_C_DiviSecOffice)MTable.get(getCtx(), org.topra.model.I_C_DiviSecOffice.Table_Name)
//			.getPO(getDiviSecOffice(), get_TrxName());	}

	/** Set Divisional Secretary Office.
		@param DiviSecOffice Divisional Secretary Office	  */
	public void setDiviSecOffice (int DiviSecOffice)
	{
		set_Value (COLUMNNAME_DiviSecOffice, Integer.valueOf(DiviSecOffice));
	}

	/** Get Divisional Secretary Office.
		@return Divisional Secretary Office	  */
	public int getDiviSecOffice () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DiviSecOffice);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

//	public org.topra.model.I_C_ElectoralDivision getElectroDivis() throws RuntimeException
//    {
//		return (org.topra.model.I_C_ElectoralDivision)MTable.get(getCtx(), org.topra.model.I_C_ElectoralDivision.Table_Name)
//			.getPO(getElectroDivision(), get_TrxName());	}

	/** Set Electro Division.
		@param ElectroDivision Electro Division	  */
	public void setElectroDivision (int ElectroDivision)
	{
		set_Value (COLUMNNAME_ElectroDivision, Integer.valueOf(ElectroDivision));
	}

	/** Get Electro Division.
		@return Electro Division	  */
	public int getElectroDivision () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ElectroDivision);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set EOCheckedDate.
		@param EOCheckedDate EOCheckedDate	  */
	public void setEOCheckedDate (Timestamp EOCheckedDate)
	{
		set_Value (COLUMNNAME_EOCheckedDate, EOCheckedDate);
	}

	/** Get EOCheckedDate.
		@return EOCheckedDate	  */
	public Timestamp getEOCheckedDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EOCheckedDate);
	}

//	public org.topra.model.I_C_GNDivision getGramaNDivis() throws RuntimeException
//    {
//		return (org.topra.model.I_C_GNDivision)MTable.get(getCtx(), org.topra.model.I_C_GNDivision.Table_Name)
//			.getPO(getGramaNDivision(), get_TrxName());	}

	/** Set Grama Niladari Division.
		@param GramaNDivision Grama Niladari Division	  */
	public void setGramaNDivision (int GramaNDivision)
	{
		set_Value (COLUMNNAME_GramaNDivision, Integer.valueOf(GramaNDivision));
	}

	/** Get Grama Niladari Division.
		@return Grama Niladari Division	  */
	public int getGramaNDivision () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GramaNDivision);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** ISEditedByEO AD_Reference_ID=1000125 */
	public static final int ISEDITEDBYEO_AD_Reference_ID=1000125;
	/** Yes = Y */
	public static final String ISEDITEDBYEO_Yes = "Y";
	/** No = N */
	public static final String ISEDITEDBYEO_No = "N";
	/** Set ISEditedByEO.
		@param ISEditedByEO ISEditedByEO	  */
	public void setISEditedByEO (String ISEditedByEO)
	{

		set_Value (COLUMNNAME_ISEditedByEO, ISEditedByEO);
	}

	/** Get ISEditedByEO.
		@return ISEditedByEO	  */
	public String getISEditedByEO () 
	{
		return (String)get_Value(COLUMNNAME_ISEditedByEO);
	}

	/** isGotPreference AD_Reference_ID=1000071 */
	public static final int ISGOTPREFERENCE_AD_Reference_ID=1000071;
	/** Yes = Y */
	public static final String ISGOTPREFERENCE_Yes = "Y";
	/** No = N */
	public static final String ISGOTPREFERENCE_No = "N";
	/** Set Is Got Preference in Written.
		@param isGotPreference Is Got Preference in Written	  */
	public void setisGotPreference (String isGotPreference)
	{

		set_Value (COLUMNNAME_isGotPreference, isGotPreference);
	}

	/** Get Is Got Preference in Written.
		@return Is Got Preference in Written	  */
	public String getisGotPreference () 
	{
		return (String)get_Value(COLUMNNAME_isGotPreference);
	}

	/** IsTradeLicense AD_Reference_ID=1000072 */
	public static final int ISTRADELICENSE_AD_Reference_ID=1000072;
	/** Yes = Y */
	public static final String ISTRADELICENSE_Yes = "Y";
	/** No = N */
	public static final String ISTRADELICENSE_No = "N";
	/** Set Applicant has the Gem Trade License.
		@param IsTradeLicense Applicant has the Gem Trade License	  */
	public void setIsTradeLicense (String IsTradeLicense)
	{

		set_Value (COLUMNNAME_IsTradeLicense, IsTradeLicense);
	}

	/** Get Applicant has the Gem Trade License.
		@return Applicant has the Gem Trade License	  */
	public String getIsTradeLicense () 
	{
		return (String)get_Value(COLUMNNAME_IsTradeLicense);
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

	/** Set L_Acres.
		@param L_Acres L_Acres	  */
	public void setL_Acres (BigDecimal L_Acres)
	{
		set_Value (COLUMNNAME_L_Acres, L_Acres);
	}

	/** Get L_Acres.
		@return L_Acres	  */
	public BigDecimal getL_Acres () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_L_Acres);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Land Area.
		@param LandArea Land Area	  */
	public void setLandArea (String LandArea)
	{
		set_Value (COLUMNNAME_LandArea, LandArea);
	}

	/** Get Land Area.
		@return Land Area	  */
	public String getLandArea () 
	{
		return (String)get_Value(COLUMNNAME_LandArea);
	}

	/** LandBelongsToGov AD_Reference_ID=1000069 */
	public static final int LANDBELONGSTOGOV_AD_Reference_ID=1000069;
	/** NO = N */
	public static final String LANDBELONGSTOGOV_NO = "N";
	/** Yes = Y */
	public static final String LANDBELONGSTOGOV_Yes = "Y";
	/** Set Land Belongs to the Government.
		@param LandBelongsToGov Land Belongs to the Government	  */
	public void setLandBelongsToGov (String LandBelongsToGov)
	{

		set_Value (COLUMNNAME_LandBelongsToGov, LandBelongsToGov);
	}

	/** Get Land Belongs to the Government.
		@return Land Belongs to the Government	  */
	public String getLandBelongsToGov () 
	{
		return (String)get_Value(COLUMNNAME_LandBelongsToGov);
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

	/** LandType AD_Reference_ID=1000117 */
	public static final int LANDTYPE_AD_Reference_ID=1000117;
	/** Government = G */
	public static final String LANDTYPE_Government = "G";
	/** Private = P */
	public static final String LANDTYPE_Private = "P";
	/** Tender Land = T */
	public static final String LANDTYPE_TenderLand = "T";
	/** Auction Land = A */
	public static final String LANDTYPE_AuctionLand = "A";
	/** Other = O */
	public static final String LANDTYPE_Other = "O";
	/** LRC = LRC */
	public static final String LANDTYPE_LRC = "LRC";
	/** Set LandType.
		@param LandType LandType	  */
	public void setLandType (String LandType)
	{

		set_Value (COLUMNNAME_LandType, LandType);
	}

	/** Get LandType.
		@return LandType	  */
	public String getLandType () 
	{
		return (String)get_Value(COLUMNNAME_LandType);
	}

	/** Set L_FeetsFromBordertoEast.
		@param L_FeetsFromBordertoEast L_FeetsFromBordertoEast	  */
	public void setL_FeetsFromBordertoEast (BigDecimal L_FeetsFromBordertoEast)
	{
		set_Value (COLUMNNAME_L_FeetsFromBordertoEast, L_FeetsFromBordertoEast);
	}

	/** Get L_FeetsFromBordertoEast.
		@return L_FeetsFromBordertoEast	  */
	public BigDecimal getL_FeetsFromBordertoEast () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_L_FeetsFromBordertoEast);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set L_FeetsFromBordertoNorth.
		@param L_FeetsFromBordertoNorth L_FeetsFromBordertoNorth	  */
	public void setL_FeetsFromBordertoNorth (BigDecimal L_FeetsFromBordertoNorth)
	{
		set_Value (COLUMNNAME_L_FeetsFromBordertoNorth, L_FeetsFromBordertoNorth);
	}

	/** Get L_FeetsFromBordertoNorth.
		@return L_FeetsFromBordertoNorth	  */
	public BigDecimal getL_FeetsFromBordertoNorth () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_L_FeetsFromBordertoNorth);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set L_FeetsFromBordertoSouth.
		@param L_FeetsFromBordertoSouth L_FeetsFromBordertoSouth	  */
	public void setL_FeetsFromBordertoSouth (BigDecimal L_FeetsFromBordertoSouth)
	{
		set_Value (COLUMNNAME_L_FeetsFromBordertoSouth, L_FeetsFromBordertoSouth);
	}

	/** Get L_FeetsFromBordertoSouth.
		@return L_FeetsFromBordertoSouth	  */
	public BigDecimal getL_FeetsFromBordertoSouth () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_L_FeetsFromBordertoSouth);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set L_FeetsFromBordertoWest.
		@param L_FeetsFromBordertoWest L_FeetsFromBordertoWest	  */
	public void setL_FeetsFromBordertoWest (BigDecimal L_FeetsFromBordertoWest)
	{
		set_Value (COLUMNNAME_L_FeetsFromBordertoWest, L_FeetsFromBordertoWest);
	}

	/** Get L_FeetsFromBordertoWest.
		@return L_FeetsFromBordertoWest	  */
	public BigDecimal getL_FeetsFromBordertoWest () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_L_FeetsFromBordertoWest);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set L_Purches.
		@param L_Purches L_Purches	  */
	public void setL_Purches (BigDecimal L_Purches)
	{
		set_Value (COLUMNNAME_L_Purches, L_Purches);
	}

	/** Get L_Purches.
		@return L_Purches	  */
	public BigDecimal getL_Purches () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_L_Purches);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set L_Roods.
		@param L_Roods L_Roods	  */
	public void setL_Roods (BigDecimal L_Roods)
	{
		set_Value (COLUMNNAME_L_Roods, L_Roods);
	}

	/** Get L_Roods.
		@return L_Roods	  */
	public BigDecimal getL_Roods () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_L_Roods);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Mineral Ownership.
		@param MineralOwnership Mineral Ownership	  */
	public void setMineralOwnership (String MineralOwnership)
	{
		set_Value (COLUMNNAME_MineralOwnership, MineralOwnership);
	}

	/** Get Mineral Ownership.
		@return Mineral Ownership	  */
	public String getMineralOwnership () 
	{
		return (String)get_Value(COLUMNNAME_MineralOwnership);
	}

	/** Set Name of the Conveyancer.
		@param NameOfConveyancer Name of the Conveyancer	  */
	public void setNameOfConveyancer (String NameOfConveyancer)
	{
		set_Value (COLUMNNAME_NameOfConveyancer, NameOfConveyancer);
	}

	/** Get Name of the Conveyancer.
		@return Name of the Conveyancer	  */
	public String getNameOfConveyancer () 
	{
		return (String)get_Value(COLUMNNAME_NameOfConveyancer);
	}

	/** NatureOfDeed AD_Reference_ID=1000067 */
	public static final int NATUREOFDEED_AD_Reference_ID=1000067;
	/** Free Hold = F */
	public static final String NATUREOFDEED_FreeHold = "F";
	/** Set Nature of the Deed.
		@param NatureOfDeed Nature of the Deed	  */
	public void setNatureOfDeed (String NatureOfDeed)
	{

		set_Value (COLUMNNAME_NatureOfDeed, NatureOfDeed);
	}

	/** Get Nature of the Deed.
		@return Nature of the Deed	  */
	public String getNatureOfDeed () 
	{
		return (String)get_Value(COLUMNNAME_NatureOfDeed);
	}

	/** Set Nearest Way to reach the Land.
		@param NearestWayToLand Nearest Way to reach the Land	  */
	public void setNearestWayToLand (String NearestWayToLand)
	{
		set_Value (COLUMNNAME_NearestWayToLand, NearestWayToLand);
	}

	/** Get Nearest Way to reach the Land.
		@return Nearest Way to reach the Land	  */
	public String getNearestWayToLand () 
	{
		return (String)get_Value(COLUMNNAME_NearestWayToLand);
	}

	/** Set North.
		@param North North	  */
	public void setNorth (String North)
	{
		set_Value (COLUMNNAME_North, North);
	}

	/** Get North.
		@return North	  */
	public String getNorth () 
	{
		return (String)get_Value(COLUMNNAME_North);
	}

	/** Set Number of Mines hope to minning at onece.
		@param NumMines Number of Mines hope to minning at onece	  */
	public void setNumMines (BigDecimal NumMines)
	{
		set_Value (COLUMNNAME_NumMines, NumMines);
	}

	/** Get Number of Mines hope to minning at onece.
		@return Number of Mines hope to minning at onece	  */
	public BigDecimal getNumMines () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_NumMines);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Plan & Plot Number.
		@param PlanPlotNum Plan & Plot Number	  */
	public void setPlanPlotNum (String PlanPlotNum)
	{
		set_Value (COLUMNNAME_PlanPlotNum, PlanPlotNum);
	}

	/** Get Plan & Plot Number.
		@return Plan & Plot Number	  */
	public String getPlanPlotNum () 
	{
		return (String)get_Value(COLUMNNAME_PlanPlotNum);
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

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Ratio of the Ownership.
		@param RatioOfOwnership Ratio of the Ownership	  */
	public void setRatioOfOwnership (String RatioOfOwnership)
	{
		set_Value (COLUMNNAME_RatioOfOwnership, RatioOfOwnership);
	}

	/** Get Ratio of the Ownership.
		@return Ratio of the Ownership	  */
	public String getRatioOfOwnership () 
	{
		return (String)get_Value(COLUMNNAME_RatioOfOwnership);
	}

	/** Set Number of Service Staff.
		@param ServiceStaff Number of Service Staff	  */
	public void setServiceStaff (BigDecimal ServiceStaff)
	{
		set_Value (COLUMNNAME_ServiceStaff, ServiceStaff);
	}

	/** Get Number of Service Staff.
		@return Number of Service Staff	  */
	public BigDecimal getServiceStaff () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ServiceStaff);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

//	public org.topra.model.I_C_Village getVillageDet() throws RuntimeException
//    {
//		return (org.topra.model.I_C_Village)MTable.get(getCtx(), org.topra.model.I_C_Village.Table_Name)
//			.getPO(getVillageDetail(), get_TrxName());	}

	/** Set Village.
		@param VillageDetail Village	  */
	public void setVillageDetail (int VillageDetail)
	{
		set_Value (COLUMNNAME_VillageDetail, Integer.valueOf(VillageDetail));
	}

	/** Get Village.
		@return Village	  */
	public int getVillageDetail () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_VillageDetail);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}