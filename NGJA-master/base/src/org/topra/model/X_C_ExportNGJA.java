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

/** Generated Model for C_ExportNGJA
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_C_ExportNGJA extends PO implements I_C_ExportNGJA, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200102L;

    /** Standard Constructor */
    public X_C_ExportNGJA (Properties ctx, int C_ExportNGJA_ID, String trxName)
    {
      super (ctx, C_ExportNGJA_ID, trxName);
      /** if (C_ExportNGJA_ID == 0)
        {
			setC_ExportItemType_ID (0);
			setC_ExportNGJA_ID (0);
			setC_ExportServiceType_ID (0);
			setC_ExpServiceTypeLine_ID (0);
			setEXPDeliveryType (null);
			setLicenseNumber_ID (0);
			setTotalWeightType (null);
        } */
    }

    /** Load Constructor */
    public X_C_ExportNGJA (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_ExportNGJA[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Adedd Value.
		@param AdeddValue Adedd Value	  */
	public void setAdeddValue (BigDecimal AdeddValue)
	{
		set_Value (COLUMNNAME_AdeddValue, AdeddValue);
	}

	/** Get Adedd Value.
		@return Adedd Value	  */
	public BigDecimal getAdeddValue () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AdeddValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Adedd Value in FC.
		@param AdeddValueIinFC Adedd Value in FC	  */
	public void setAdeddValueIinFC (BigDecimal AdeddValueIinFC)
	{
		set_Value (COLUMNNAME_AdeddValueIinFC, AdeddValueIinFC);
	}

	/** Get Adedd Value in FC.
		@return Adedd Value in FC	  */
	public BigDecimal getAdeddValueIinFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AdeddValueIinFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Air Freight In Foreign Currency.
		@param AirFreightInFC Air Freight In Foreign Currency	  */
	public void setAirFreightInFC (BigDecimal AirFreightInFC)
	{
		set_Value (COLUMNNAME_AirFreightInFC, AirFreightInFC);
	}

	/** Get Air Freight In Foreign Currency.
		@return Air Freight In Foreign Currency	  */
	public BigDecimal getAirFreightInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AirFreightInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Air Freight In Rs.
		@param AirFreightInRS Air Freight In Rs	  */
	public void setAirFreightInRS (BigDecimal AirFreightInRS)
	{
		set_Value (COLUMNNAME_AirFreightInRS, AirFreightInRS);
	}

	/** Get Air Freight In Rs.
		@return Air Freight In Rs	  */
	public BigDecimal getAirFreightInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AirFreightInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Business Reg No.
		@param BusRegNo Business Reg No	  */
	public void setBusRegNo (String BusRegNo)
	{
		set_Value (COLUMNNAME_BusRegNo, BusRegNo);
	}

	/** Get Business Reg No.
		@return Business Reg No	  */
	public String getBusRegNo () 
	{
		return (String)get_Value(COLUMNNAME_BusRegNo);
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

	public org.compiere.model.I_C_Country getC_Country() throws RuntimeException
    {
		return (org.compiere.model.I_C_Country)MTable.get(getCtx(), org.compiere.model.I_C_Country.Table_Name)
			.getPO(getC_Country_ID(), get_TrxName());	}

	/** Set Country.
		@param C_Country_ID 
		Country 
	  */
	public void setC_Country_ID (int C_Country_ID)
	{
		if (C_Country_ID < 1) 
			set_Value (COLUMNNAME_C_Country_ID, null);
		else 
			set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
	}

	/** Get Country.
		@return Country 
	  */
	public int getC_Country_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
    {
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_DealerFile getC_DealerFile() throws RuntimeException
    {
		return (org.topra.model.I_C_DealerFile)MTable.get(getCtx(), org.topra.model.I_C_DealerFile.Table_Name)
			.getPO(getC_DealerFile_ID(), get_TrxName());	}

	/** Set Dealer File Number ID.
		@param C_DealerFile_ID Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID)
	{
		if (C_DealerFile_ID < 1) 
			set_Value (COLUMNNAME_C_DealerFile_ID, null);
		else 
			set_Value (COLUMNNAME_C_DealerFile_ID, Integer.valueOf(C_DealerFile_ID));
	}

	/** Get Dealer File Number ID.
		@return Dealer File Number ID	  */
	public int getC_DealerFile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DealerFile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_ExportItemType getC_ExportItemType() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportItemType)MTable.get(getCtx(), org.topra.model.I_C_ExportItemType.Table_Name)
			.getPO(getC_ExportItemType_ID(), get_TrxName());	}

	/** Set Export Item Types ID.
		@param C_ExportItemType_ID Export Item Types ID	  */
	public void setC_ExportItemType_ID (int C_ExportItemType_ID)
	{
		if (C_ExportItemType_ID < 1) 
			set_Value (COLUMNNAME_C_ExportItemType_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportItemType_ID, Integer.valueOf(C_ExportItemType_ID));
	}

	/** Get Export Item Types ID.
		@return Export Item Types ID	  */
	public int getC_ExportItemType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportItemType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_ExportNGJA ID.
		@param C_ExportNGJA_ID C_ExportNGJA ID	  */
	public void setC_ExportNGJA_ID (int C_ExportNGJA_ID)
	{
		if (C_ExportNGJA_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_ExportNGJA_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_ExportNGJA_ID, Integer.valueOf(C_ExportNGJA_ID));
	}

	/** Get C_ExportNGJA ID.
		@return C_ExportNGJA ID	  */
	public int getC_ExportNGJA_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportNGJA_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_ExportServiceType getC_ExportServiceType() throws RuntimeException
    {
		return (org.topra.model.I_C_ExportServiceType)MTable.get(getCtx(), org.topra.model.I_C_ExportServiceType.Table_Name)
			.getPO(getC_ExportServiceType_ID(), get_TrxName());	}

	/** Set Export Service Types ID.
		@param C_ExportServiceType_ID Export Service Types ID	  */
	public void setC_ExportServiceType_ID (int C_ExportServiceType_ID)
	{
		if (C_ExportServiceType_ID < 1) 
			set_Value (COLUMNNAME_C_ExportServiceType_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExportServiceType_ID, Integer.valueOf(C_ExportServiceType_ID));
	}

	/** Get Export Service Types ID.
		@return Export Service Types ID	  */
	public int getC_ExportServiceType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExportServiceType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.topra.model.I_C_ExpServiceTypeLine getC_ExpServiceTypeLine() throws RuntimeException
    {
		return (org.topra.model.I_C_ExpServiceTypeLine)MTable.get(getCtx(), org.topra.model.I_C_ExpServiceTypeLine.Table_Name)
			.getPO(getC_ExpServiceTypeLine_ID(), get_TrxName());	}

	/** Set Export Service Type Line ID.
		@param C_ExpServiceTypeLine_ID Export Service Type Line ID	  */
	public void setC_ExpServiceTypeLine_ID (int C_ExpServiceTypeLine_ID)
	{
		if (C_ExpServiceTypeLine_ID < 1) 
			set_Value (COLUMNNAME_C_ExpServiceTypeLine_ID, null);
		else 
			set_Value (COLUMNNAME_C_ExpServiceTypeLine_ID, Integer.valueOf(C_ExpServiceTypeLine_ID));
	}

	/** Get Export Service Type Line ID.
		@return Export Service Type Line ID	  */
	public int getC_ExpServiceTypeLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ExpServiceTypeLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CIF Value In Foreign Currency.
		@param CIFValueInFC CIF Value In Foreign Currency	  */
	public void setCIFValueInFC (BigDecimal CIFValueInFC)
	{
		throw new IllegalArgumentException ("CIFValueInFC is virtual column");	}

	/** Get CIF Value In Foreign Currency.
		@return CIF Value In Foreign Currency	  */
	public BigDecimal getCIFValueInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CIFValueInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set CIF Value In Rs.
		@param CIFValueInRS CIF Value In Rs	  */
	public void setCIFValueInRS (BigDecimal CIFValueInRS)
	{
		throw new IllegalArgumentException ("CIFValueInRS is virtual column");	}

	/** Get CIF Value In Rs.
		@return CIF Value In Rs	  */
	public BigDecimal getCIFValueInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CIFValueInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Consig Country.
		@param ConCountry_ID Consig Country	  */
	public void setConCountry_ID (int ConCountry_ID)
	{
		if (ConCountry_ID < 1) 
			set_Value (COLUMNNAME_ConCountry_ID, null);
		else 
			set_Value (COLUMNNAME_ConCountry_ID, Integer.valueOf(ConCountry_ID));
	}

	/** Get Consig Country.
		@return Consig Country	  */
	public int getConCountry_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ConCountry_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set City.
		@param ConsigAddCity City	  */
	public void setConsigAddCity (String ConsigAddCity)
	{
		set_Value (COLUMNNAME_ConsigAddCity, ConsigAddCity);
	}

	/** Get City.
		@return City	  */
	public String getConsigAddCity () 
	{
		return (String)get_Value(COLUMNNAME_ConsigAddCity);
	}

	/** Set Address 4.
		@param ConsigAddFour Address 4	  */
	public void setConsigAddFour (String ConsigAddFour)
	{
		set_Value (COLUMNNAME_ConsigAddFour, ConsigAddFour);
	}

	/** Get Address 4.
		@return Address 4	  */
	public String getConsigAddFour () 
	{
		return (String)get_Value(COLUMNNAME_ConsigAddFour);
	}

	/** Set Address 1.
		@param ConsigAddOne Address 1	  */
	public void setConsigAddOne (String ConsigAddOne)
	{
		set_Value (COLUMNNAME_ConsigAddOne, ConsigAddOne);
	}

	/** Get Address 1.
		@return Address 1	  */
	public String getConsigAddOne () 
	{
		return (String)get_Value(COLUMNNAME_ConsigAddOne);
	}

	/** Set Address 3.
		@param ConsigAddThree Address 3	  */
	public void setConsigAddThree (String ConsigAddThree)
	{
		set_Value (COLUMNNAME_ConsigAddThree, ConsigAddThree);
	}

	/** Get Address 3.
		@return Address 3	  */
	public String getConsigAddThree () 
	{
		return (String)get_Value(COLUMNNAME_ConsigAddThree);
	}

	/** Set Address 2.
		@param ConsigAddTwo Address 2	  */
	public void setConsigAddTwo (String ConsigAddTwo)
	{
		set_Value (COLUMNNAME_ConsigAddTwo, ConsigAddTwo);
	}

	/** Get Address 2.
		@return Address 2	  */
	public String getConsigAddTwo () 
	{
		return (String)get_Value(COLUMNNAME_ConsigAddTwo);
	}

	/** Set Tele No.
		@param ConsigneeTeleNo Tele No	  */
	public void setConsigneeTeleNo (String ConsigneeTeleNo)
	{
		set_Value (COLUMNNAME_ConsigneeTeleNo, ConsigneeTeleNo);
	}

	/** Get Tele No.
		@return Tele No	  */
	public String getConsigneeTeleNo () 
	{
		return (String)get_Value(COLUMNNAME_ConsigneeTeleNo);
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

	/** Set Custom Officer.
		@param CustomOfficer Custom Officer	  */
	public void setCustomOfficer (String CustomOfficer)
	{
		set_Value (COLUMNNAME_CustomOfficer, CustomOfficer);
	}

	/** Get Custom Officer.
		@return Custom Officer	  */
	public String getCustomOfficer () 
	{
		return (String)get_Value(COLUMNNAME_CustomOfficer);
	}

	/** Set Custom T No.
		@param CustomTNO Custom T No	  */
	public void setCustomTNO (String CustomTNO)
	{
		set_Value (COLUMNNAME_CustomTNO, CustomTNO);
	}

	/** Get Custom T No.
		@return Custom T No	  */
	public String getCustomTNO () 
	{
		return (String)get_Value(COLUMNNAME_CustomTNO);
	}

	public org.topra.model.I_D_DealerLicense getDealerLicens() throws RuntimeException
    {
		return (org.topra.model.I_D_DealerLicense)MTable.get(getCtx(), org.topra.model.I_D_DealerLicense.Table_Name)
			.getPO(getDealerLicenseNo(), get_TrxName());	}

	/** Set Dealer License No.
		@param DealerLicenseNo Dealer License No	  */
	public void setDealerLicenseNo (int DealerLicenseNo)
	{
		set_Value (COLUMNNAME_DealerLicenseNo, Integer.valueOf(DealerLicenseNo));
	}

	/** Get Dealer License No.
		@return Dealer License No	  */
	public int getDealerLicenseNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DealerLicenseNo);
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

	/** DocumentStatus AD_Reference_ID=1000105 */
	public static final int DOCUMENTSTATUS_AD_Reference_ID=1000105;
	/** Prepared = PR */
	public static final String DOCUMENTSTATUS_Prepared = "PR";
	/** Voided = VO */
	public static final String DOCUMENTSTATUS_Voided = "VO";
	/** Exported = E */
	public static final String DOCUMENTSTATUS_Exported = "E";
	/** Send For AD-Officer Approval = AD */
	public static final String DOCUMENTSTATUS_SendForAD_OfficerApproval = "AD";
	/** Send For MA Confirmation = MAC */
	public static final String DOCUMENTSTATUS_SendForMAConfirmation = "MAC";
	/** Send For AD-Officer Final Approval = ADF */
	public static final String DOCUMENTSTATUS_SendForAD_OfficerFinalApproval = "ADF";
	/** Send For Implementation Officer Approval = SIOA */
	public static final String DOCUMENTSTATUS_SendForImplementationOfficerApproval = "SIOA";
	/** Set Document Status.
		@param DocumentStatus Document Status	  */
	public void setDocumentStatus (String DocumentStatus)
	{

		set_Value (COLUMNNAME_DocumentStatus, DocumentStatus);
	}

	/** Get Document Status.
		@return Document Status	  */
	public String getDocumentStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocumentStatus);
	}

	/** Set Export Date.
		@param ExpDate Export Date	  */
	public void setExpDate (Timestamp ExpDate)
	{
		set_Value (COLUMNNAME_ExpDate, ExpDate);
	}

	/** Get Export Date.
		@return Export Date	  */
	public Timestamp getExpDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ExpDate);
	}

	/** EXPDeliveryType AD_Reference_ID=1000087 */
	public static final int EXPDELIVERYTYPE_AD_Reference_ID=1000087;
	/** By Registered Air Mail = R */
	public static final String EXPDELIVERYTYPE_ByRegisteredAirMail = "R";
	/** Personnally Carried = P */
	public static final String EXPDELIVERYTYPE_PersonnallyCarried = "P";
	/** By Air Freight = F */
	public static final String EXPDELIVERYTYPE_ByAirFreight = "F";
	/** Courier Service = C */
	public static final String EXPDELIVERYTYPE_CourierService = "C";
	/** Hand Carry = H */
	public static final String EXPDELIVERYTYPE_HandCarry = "H";
	/** EMS = E */
	public static final String EXPDELIVERYTYPE_EMS = "E";
	/** Set Delivery Type.
		@param EXPDeliveryType Delivery Type	  */
	public void setEXPDeliveryType (String EXPDeliveryType)
	{

		set_Value (COLUMNNAME_EXPDeliveryType, EXPDeliveryType);
	}

	/** Get Delivery Type.
		@return Delivery Type	  */
	public String getEXPDeliveryType () 
	{
		return (String)get_Value(COLUMNNAME_EXPDeliveryType);
	}

	/** Set Export Expire Date.
		@param ExpExpireDate Export Expire Date	  */
	public void setExpExpireDate (Timestamp ExpExpireDate)
	{
		set_Value (COLUMNNAME_ExpExpireDate, ExpExpireDate);
	}

	/** Get Export Expire Date.
		@return Export Expire Date	  */
	public Timestamp getExpExpireDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ExpExpireDate);
	}

	/** Set Export License No.
		@param ExportLicenseNo Export License No	  */
	public void setExportLicenseNo (String ExportLicenseNo)
	{
		set_Value (COLUMNNAME_ExportLicenseNo, ExportLicenseNo);
	}

	/** Get Export License No.
		@return Export License No	  */
	public String getExportLicenseNo () 
	{
		return (String)get_Value(COLUMNNAME_ExportLicenseNo);
	}

	/** ExportTypes AD_Reference_ID=1000091 */
	public static final int EXPORTTYPES_AD_Reference_ID=1000091;
	/** Exhibition Jewellery = EXJ */
	public static final String EXPORTTYPES_ExhibitionJewellery = "EXJ";
	/** Exhibition Gem = EXG */
	public static final String EXPORTTYPES_ExhibitionGem = "EXG";
	/** Personnal Carried Gem Export = PCGE */
	public static final String EXPORTTYPES_PersonnalCarriedGemExport = "PCGE";
	/** Personnal Carried Jem Export = PCJE */
	public static final String EXPORTTYPES_PersonnalCarriedJemExport = "PCJE";
	/** Set Export Types.
		@param ExportTypes Export Types	  */
	public void setExportTypes (String ExportTypes)
	{

		set_Value (COLUMNNAME_ExportTypes, ExportTypes);
	}

	/** Get Export Types.
		@return Export Types	  */
	public String getExportTypes () 
	{
		return (String)get_Value(COLUMNNAME_ExportTypes);
	}

	/** ExpPrice AD_Reference_ID=1000086 */
	public static final int EXPPRICE_AD_Reference_ID=1000086;
	/** C.I.F. = C */
	public static final String EXPPRICE_CIF = "C";
	/** Set Price.
		@param ExpPrice Price	  */
	public void setExpPrice (String ExpPrice)
	{

		set_Value (COLUMNNAME_ExpPrice, ExpPrice);
	}

	/** Get Price.
		@return Price	  */
	public String getExpPrice () 
	{
		return (String)get_Value(COLUMNNAME_ExpPrice);
	}

	/** ExpStatus AD_Reference_ID=1000139 */
	public static final int EXPSTATUS_AD_Reference_ID=1000139;
	/** Temp = T */
	public static final String EXPSTATUS_Temp = "T";
	/** Registerd = R */
	public static final String EXPSTATUS_Registerd = "R";
	/** Set ExpStatus.
		@param ExpStatus ExpStatus	  */
	public void setExpStatus (String ExpStatus)
	{

		set_Value (COLUMNNAME_ExpStatus, ExpStatus);
	}

	/** Get ExpStatus.
		@return ExpStatus	  */
	public String getExpStatus () 
	{
		return (String)get_Value(COLUMNNAME_ExpStatus);
	}

	/** ExpTerms AD_Reference_ID=1000085 */
	public static final int EXPTERMS_AD_Reference_ID=1000085;
	/** Consigment Basis = C */
	public static final String EXPTERMS_ConsigmentBasis = "C";
	/** Advance Payment = A */
	public static final String EXPTERMS_AdvancePayment = "A";
	/** Other = O */
	public static final String EXPTERMS_Other = "O";
	/** Set Terms.
		@param ExpTerms Terms	  */
	public void setExpTerms (String ExpTerms)
	{

		set_Value (COLUMNNAME_ExpTerms, ExpTerms);
	}

	/** Get Terms.
		@return Terms	  */
	public String getExpTerms () 
	{
		return (String)get_Value(COLUMNNAME_ExpTerms);
	}

	/** Set FOB Value In Rs.
		@param FOBInRS FOB Value In Rs	  */
	public void setFOBInRS (BigDecimal FOBInRS)
	{
		throw new IllegalArgumentException ("FOBInRS is virtual column");	}

	/** Get FOB Value In Rs.
		@return FOB Value In Rs	  */
	public BigDecimal getFOBInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FOBInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set FOB Value in Foreign Currency.
		@param FOBValueFC FOB Value in Foreign Currency	  */
	public void setFOBValueFC (BigDecimal FOBValueFC)
	{
		throw new IllegalArgumentException ("FOBValueFC is virtual column");	}

	/** Get FOB Value in Foreign Currency.
		@return FOB Value in Foreign Currency	  */
	public BigDecimal getFOBValueFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FOBValueFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Generate To.
		@param GenerateTo 
		Generate To
	  */
	public void setGenerateTo (String GenerateTo)
	{
		set_Value (COLUMNNAME_GenerateTo, GenerateTo);
	}

	/** Get Generate To.
		@return Generate To
	  */
	public String getGenerateTo () 
	{
		return (String)get_Value(COLUMNNAME_GenerateTo);
	}

	/** Set Insuarance In Foreign Currency.
		@param InsuaranceInFC Insuarance In Foreign Currency	  */
	public void setInsuaranceInFC (BigDecimal InsuaranceInFC)
	{
		set_Value (COLUMNNAME_InsuaranceInFC, InsuaranceInFC);
	}

	/** Get Insuarance In Foreign Currency.
		@return Insuarance In Foreign Currency	  */
	public BigDecimal getInsuaranceInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InsuaranceInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Insuarance In Rs.
		@param InsuaranceInRS Insuarance In Rs	  */
	public void setInsuaranceInRS (BigDecimal InsuaranceInRS)
	{
		set_Value (COLUMNNAME_InsuaranceInRS, InsuaranceInRS);
	}

	/** Get Insuarance In Rs.
		@return Insuarance In Rs	  */
	public BigDecimal getInsuaranceInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_InsuaranceInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Invoice No.
		@param InvoiceNo Invoice No	  */
	public void setInvoiceNo (String InvoiceNo)
	{
		set_Value (COLUMNNAME_InvoiceNo, InvoiceNo);
	}

	/** Get Invoice No.
		@return Invoice No	  */
	public String getInvoiceNo () 
	{
		return (String)get_Value(COLUMNNAME_InvoiceNo);
	}

	/** Set Invoice Subbmit Date.
		@param InvoiceSubmitDate Invoice Subbmit Date	  */
	public void setInvoiceSubmitDate (Timestamp InvoiceSubmitDate)
	{
		set_Value (COLUMNNAME_InvoiceSubmitDate, InvoiceSubmitDate);
	}

	/** Get Invoice Subbmit Date.
		@return Invoice Subbmit Date	  */
	public Timestamp getInvoiceSubmitDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_InvoiceSubmitDate);
	}

	/** Set Extended.
		@param IsExtended Extended	  */
	public void setIsExtended (boolean IsExtended)
	{
		set_Value (COLUMNNAME_IsExtended, Boolean.valueOf(IsExtended));
	}

	/** Get Extended.
		@return Extended	  */
	public boolean isExtended () 
	{
		Object oo = get_Value(COLUMNNAME_IsExtended);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Import.
		@param IsImport Import	  */
	public void setIsImport (boolean IsImport)
	{
		set_Value (COLUMNNAME_IsImport, Boolean.valueOf(IsImport));
	}

	/** Get Import.
		@return Import	  */
	public boolean isImport () 
	{
		Object oo = get_Value(COLUMNNAME_IsImport);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Jewellery License No.
		@param JewelleryLicenseNo Jewellery License No	  */
	public void setJewelleryLicenseNo (String JewelleryLicenseNo)
	{
		set_Value (COLUMNNAME_JewelleryLicenseNo, JewelleryLicenseNo);
	}

	/** Get Jewellery License No.
		@return Jewellery License No	  */
	public String getJewelleryLicenseNo () 
	{
		return (String)get_Value(COLUMNNAME_JewelleryLicenseNo);
	}

	/** Set Lapidary License No.
		@param LapidaryLicenseNo Lapidary License No	  */
	public void setLapidaryLicenseNo (String LapidaryLicenseNo)
	{
		set_Value (COLUMNNAME_LapidaryLicenseNo, LapidaryLicenseNo);
	}

	/** Get Lapidary License No.
		@return Lapidary License No	  */
	public String getLapidaryLicenseNo () 
	{
		return (String)get_Value(COLUMNNAME_LapidaryLicenseNo);
	}

	/** Set License End Date.
		@param LicenseEndDate License End Date	  */
	public void setLicenseEndDate (Timestamp LicenseEndDate)
	{
		set_Value (COLUMNNAME_LicenseEndDate, LicenseEndDate);
	}

	/** Get License End Date.
		@return License End Date	  */
	public Timestamp getLicenseEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LicenseEndDate);
	}

	public org.topra.model.I_D_DealerLicense getLicenseNumber() throws RuntimeException
    {
		return (org.topra.model.I_D_DealerLicense)MTable.get(getCtx(), org.topra.model.I_D_DealerLicense.Table_Name)
			.getPO(getLicenseNumber_ID(), get_TrxName());	}

	/** Set License Number.
		@param LicenseNumber_ID License Number	  */
	public void setLicenseNumber_ID (int LicenseNumber_ID)
	{
		if (LicenseNumber_ID < 1) 
			set_Value (COLUMNNAME_LicenseNumber_ID, null);
		else 
			set_Value (COLUMNNAME_LicenseNumber_ID, Integer.valueOf(LicenseNumber_ID));
	}

	/** Get License Number.
		@return License Number	  */
	public int getLicenseNumber_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LicenseNumber_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_DocType getLicenseType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getLicenseType_ID(), get_TrxName());	}

	/** Set License Type.
		@param LicenseType_ID License Type	  */
	public void setLicenseType_ID (int LicenseType_ID)
	{
		if (LicenseType_ID < 1) 
			set_Value (COLUMNNAME_LicenseType_ID, null);
		else 
			set_Value (COLUMNNAME_LicenseType_ID, Integer.valueOf(LicenseType_ID));
	}

	/** Get License Type.
		@return License Type	  */
	public int getLicenseType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LicenseType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Logo.
		@param Logo_ID Logo	  */
	public void setLogo_ID (int Logo_ID)
	{
		if (Logo_ID < 1) 
			set_Value (COLUMNNAME_Logo_ID, null);
		else 
			set_Value (COLUMNNAME_Logo_ID, Integer.valueOf(Logo_ID));
	}

	/** Get Logo.
		@return Logo	  */
	public int getLogo_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Logo_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name of the Consignee.
		@param NameConsignee Name of the Consignee	  */
	public void setNameConsignee (String NameConsignee)
	{
		set_Value (COLUMNNAME_NameConsignee, NameConsignee);
	}

	/** Get Name of the Consignee.
		@return Name of the Consignee	  */
	public String getNameConsignee () 
	{
		return (String)get_Value(COLUMNNAME_NameConsignee);
	}

	/** Set NIC/Passport Number.
		@param NICPassNo NIC/Passport Number	  */
	public void setNICPassNo (String NICPassNo)
	{
		set_Value (COLUMNNAME_NICPassNo, NICPassNo);
	}

	/** Get NIC/Passport Number.
		@return NIC/Passport Number	  */
	public String getNICPassNo () 
	{
		return (String)get_Value(COLUMNNAME_NICPassNo);
	}

	/** Set No Of Pkgs.
		@param NoOfPkgs No Of Pkgs	  */
	public void setNoOfPkgs (int NoOfPkgs)
	{
		set_Value (COLUMNNAME_NoOfPkgs, Integer.valueOf(NoOfPkgs));
	}

	/** Get No Of Pkgs.
		@return No Of Pkgs	  */
	public int getNoOfPkgs () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_NoOfPkgs);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Number Of Pieces.
		@param OverTenNumOfPieces Number Of Pieces	  */
	public void setOverTenNumOfPieces (BigDecimal OverTenNumOfPieces)
	{
		set_Value (COLUMNNAME_OverTenNumOfPieces, OverTenNumOfPieces);
	}

	/** Get Number Of Pieces.
		@return Number Of Pieces	  */
	public BigDecimal getOverTenNumOfPieces () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OverTenNumOfPieces);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total Weight.
		@param OverTenTotalWeight Total Weight	  */
	public void setOverTenTotalWeight (BigDecimal OverTenTotalWeight)
	{
		set_Value (COLUMNNAME_OverTenTotalWeight, OverTenTotalWeight);
	}

	/** Get Total Weight.
		@return Total Weight	  */
	public BigDecimal getOverTenTotalWeight () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OverTenTotalWeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Personnal Carrier Passport No.
		@param PerCarrierPassNo Personnal Carrier Passport No	  */
	public void setPerCarrierPassNo (String PerCarrierPassNo)
	{
		set_Value (COLUMNNAME_PerCarrierPassNo, PerCarrierPassNo);
	}

	/** Get Personnal Carrier Passport No.
		@return Personnal Carrier Passport No	  */
	public String getPerCarrierPassNo () 
	{
		return (String)get_Value(COLUMNNAME_PerCarrierPassNo);
	}

	/** Set Personnal Carrier Name.
		@param PerCarryName Personnal Carrier Name	  */
	public void setPerCarryName (String PerCarryName)
	{
		set_Value (COLUMNNAME_PerCarryName, PerCarryName);
	}

	/** Get Personnal Carrier Name.
		@return Personnal Carrier Name	  */
	public String getPerCarryName () 
	{
		return (String)get_Value(COLUMNNAME_PerCarryName);
	}

	/** Set Postage In Foreign Currency.
		@param PostageInFC Postage In Foreign Currency	  */
	public void setPostageInFC (BigDecimal PostageInFC)
	{
		set_Value (COLUMNNAME_PostageInFC, PostageInFC);
	}

	/** Get Postage In Foreign Currency.
		@return Postage In Foreign Currency	  */
	public BigDecimal getPostageInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PostageInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Postage In Rs.
		@param PostageInRS Postage In Rs	  */
	public void setPostageInRS (BigDecimal PostageInRS)
	{
		set_Value (COLUMNNAME_PostageInRS, PostageInRS);
	}

	/** Get Postage In Rs.
		@return Postage In Rs	  */
	public BigDecimal getPostageInRS () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PostageInRS);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Process.
		@param ProcessDocument Process	  */
	public void setProcessDocument (String ProcessDocument)
	{
		set_Value (COLUMNNAME_ProcessDocument, ProcessDocument);
	}

	/** Get Process.
		@return Process	  */
	public String getProcessDocument () 
	{
		return (String)get_Value(COLUMNNAME_ProcessDocument);
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

	/** Set Rate Of Foreign Currency.
		@param RateFC Rate Of Foreign Currency	  */
	public void setRateFC (BigDecimal RateFC)
	{
		set_Value (COLUMNNAME_RateFC, RateFC);
	}

	/** Get Rate Of Foreign Currency.
		@return Rate Of Foreign Currency	  */
	public BigDecimal getRateFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RateFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Refference Number.
		@param RefNo Refference Number	  */
	public void setRefNo (String RefNo)
	{
		set_Value (COLUMNNAME_RefNo, RefNo);
	}

	/** Get Refference Number.
		@return Refference Number	  */
	public String getRefNo () 
	{
		return (String)get_Value(COLUMNNAME_RefNo);
	}

	/** Set ReturnStatus.
		@param ReturnStatus ReturnStatus	  */
	public void setReturnStatus (String ReturnStatus)
	{
		set_Value (COLUMNNAME_ReturnStatus, ReturnStatus);
	}

	/** Get ReturnStatus.
		@return ReturnStatus	  */
	public String getReturnStatus () 
	{
		return (String)get_Value(COLUMNNAME_ReturnStatus);
	}

	/** Set Stock Value.
		@param StockValue Stock Value	  */
	public void setStockValue (int StockValue)
	{
		set_Value (COLUMNNAME_StockValue, Integer.valueOf(StockValue));
	}

	/** Get Stock Value.
		@return Stock Value	  */
	public int getStockValue () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_StockValue);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Total Amount In Foreign Currency.
		@param TotalAmtInFC Total Amount In Foreign Currency	  */
	public void setTotalAmtInFC (BigDecimal TotalAmtInFC)
	{
		throw new IllegalArgumentException ("TotalAmtInFC is virtual column");	}

	/** Get Total Amount In Foreign Currency.
		@return Total Amount In Foreign Currency	  */
	public BigDecimal getTotalAmtInFC () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalAmtInFC);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Total No Of Lot.
		@param TotalNoOfLot Total No Of Lot	  */
	public void setTotalNoOfLot (int TotalNoOfLot)
	{
		throw new IllegalArgumentException ("TotalNoOfLot is virtual column");	}

	/** Get Total No Of Lot.
		@return Total No Of Lot	  */
	public int getTotalNoOfLot () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TotalNoOfLot);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Total No Of PCS.
		@param TotalNoOfPCS Total No Of PCS	  */
	public void setTotalNoOfPCS (int TotalNoOfPCS)
	{
		throw new IllegalArgumentException ("TotalNoOfPCS is virtual column");	}

	/** Get Total No Of PCS.
		@return Total No Of PCS	  */
	public int getTotalNoOfPCS () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TotalNoOfPCS);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Total Weight Amount.
		@param TotalWeightAmt Total Weight Amount	  */
	public void setTotalWeightAmt (BigDecimal TotalWeightAmt)
	{
		throw new IllegalArgumentException ("TotalWeightAmt is virtual column");	}

	/** Get Total Weight Amount.
		@return Total Weight Amount	  */
	public BigDecimal getTotalWeightAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TotalWeightAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** TotalWeightType AD_Reference_ID=1000089 */
	public static final int TOTALWEIGHTTYPE_AD_Reference_ID=1000089;
	/** cts = C */
	public static final String TOTALWEIGHTTYPE_Cts = "C";
	/** Gram = G */
	public static final String TOTALWEIGHTTYPE_Gram = "G";
	/** Kilogram = KG */
	public static final String TOTALWEIGHTTYPE_Kilogram = "KG";
	/** Millimeter = MM */
	public static final String TOTALWEIGHTTYPE_Millimeter = "MM";
	/** Set Total Weight Type.
		@param TotalWeightType Total Weight Type	  */
	public void setTotalWeightType (String TotalWeightType)
	{

		set_Value (COLUMNNAME_TotalWeightType, TotalWeightType);
	}

	/** Get Total Weight Type.
		@return Total Weight Type	  */
	public String getTotalWeightType () 
	{
		return (String)get_Value(COLUMNNAME_TotalWeightType);
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

	public org.compiere.model.I_C_BPartner getValuarN() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getValuarName(), get_TrxName());	}

	/** Set Valuar Name.
		@param ValuarName Valuar Name	  */
	public void setValuarName (int ValuarName)
	{
		set_Value (COLUMNNAME_ValuarName, Integer.valueOf(ValuarName));
	}

	/** Get Valuar Name.
		@return Valuar Name	  */
	public int getValuarName () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ValuarName);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Valuation Date.
		@param ValuationDate Valuation Date	  */
	public void setValuationDate (Timestamp ValuationDate)
	{
		set_Value (COLUMNNAME_ValuationDate, ValuationDate);
	}

	/** Get Valuation Date.
		@return Valuation Date	  */
	public Timestamp getValuationDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ValuationDate);
	}

	/** Set ViewInfoBtn.
		@param ViewInfoBtn ViewInfoBtn	  */
	public void setViewInfoBtn (String ViewInfoBtn)
	{
		set_Value (COLUMNNAME_ViewInfoBtn, ViewInfoBtn);
	}

	/** Get ViewInfoBtn.
		@return ViewInfoBtn	  */
	public String getViewInfoBtn () 
	{
		return (String)get_Value(COLUMNNAME_ViewInfoBtn);
	}

	/** Set Load Informations.
		@param ZoomBtn Load Informations	  */
	public void setZoomBtn (String ZoomBtn)
	{
		set_Value (COLUMNNAME_ZoomBtn, ZoomBtn);
	}

	/** Get Load Informations.
		@return Load Informations	  */
	public String getZoomBtn () 
	{
		return (String)get_Value(COLUMNNAME_ZoomBtn);
	}
}