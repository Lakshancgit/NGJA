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

/** Generated Interface for C_JobCardValuation
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_JobCardValuation 
{

    /** TableName=C_JobCardValuation */
    public static final String Table_Name = "C_JobCardValuation";

    /** AD_Table_ID=1000001 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name ActualWeight */
    public static final String COLUMNNAME_ActualWeight = "ActualWeight";

	/** Set Actual Weight	  */
	public void setActualWeight (String ActualWeight);

	/** Get Actual Weight	  */
	public String getActualWeight();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Image_ID */
    public static final String COLUMNNAME_AD_Image_ID = "AD_Image_ID";

	/** Set Image.
	  * Image or Icon
	  */
	public void setAD_Image_ID (int AD_Image_ID);

	/** Get Image.
	  * Image or Icon
	  */
	public int getAD_Image_ID();

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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name Breadth */
    public static final String COLUMNNAME_Breadth = "Breadth";

	/** Set Breadth	  */
	public void setBreadth (String Breadth);

	/** Get Breadth	  */
	public String getBreadth();

    /** Column name C_AbsorpSpec_ID */
    public static final String COLUMNNAME_C_AbsorpSpec_ID = "C_AbsorpSpec_ID";

	/** Set Absorption Spectrum	  */
	public void setC_AbsorpSpec_ID (int C_AbsorpSpec_ID);

	/** Get Absorption Spectrum	  */
	public int getC_AbsorpSpec_ID();

	//public I_C_AbsorpSpec getC_AbsorpSpec() throws RuntimeException;

    /** Column name C_Color_ID */
    public static final String COLUMNNAME_C_Color_ID = "C_Color_ID";

	/** Set Color	  */
	public void setC_Color_ID (int C_Color_ID);

	/** Get Color	  */
	public int getC_Color_ID();

	public org.topra.model.I_C_Color getC_Color() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name CetificateNo */
    public static final String COLUMNNAME_CetificateNo = "CetificateNo";

	/** Set Cetificate No.
	  * Document sequence number of the document
	  */
	public void setCetificateNo (String CetificateNo);

	/** Get Cetificate No.
	  * Document sequence number of the document
	  */
	public String getCetificateNo();

    /** Column name C_GemItems_ID */
    public static final String COLUMNNAME_C_GemItems_ID = "C_GemItems_ID";

	/** Set Item Name	  */
	public void setC_GemItems_ID (int C_GemItems_ID);

	/** Get Item Name	  */
	public int getC_GemItems_ID();

	//public I_C_GemItems getC_GemItems() throws RuntimeException;

    /** Column name C_JobCardValuation_ID */
    public static final String COLUMNNAME_C_JobCardValuation_ID = "C_JobCardValuation_ID";

	/** Set Job Card Number	  */
	public void setC_JobCardValuation_ID (int C_JobCardValuation_ID);

	/** Get Job Card Number	  */
	public int getC_JobCardValuation_ID();

    /** Column name C_LongWave_ID */
    public static final String COLUMNNAME_C_LongWave_ID = "C_LongWave_ID";

	/** Set Long Wave	  */
	public void setC_LongWave_ID (int C_LongWave_ID);

	/** Get Long Wave	  */
	public int getC_LongWave_ID();

	//public I_C_LongWave getC_LongWave() throws RuntimeException;

    /** Column name C_Pleochroism_ID */
    public static final String COLUMNNAME_C_Pleochroism_ID = "C_Pleochroism_ID";

	/** Set Pleochroism	  */
	public void setC_Pleochroism_ID (int C_Pleochroism_ID);

	/** Get Pleochroism	  */
	public int getC_Pleochroism_ID();

	//public I_C_Pleochroism getC_Pleochroism() throws RuntimeException;

    /** Column name C_Polariscope_ID */
    public static final String COLUMNNAME_C_Polariscope_ID = "C_Polariscope_ID";

	/** Set Polariscope	  */
	public void setC_Polariscope_ID (int C_Polariscope_ID);

	/** Get Polariscope	  */
	public int getC_Polariscope_ID();

	//public I_C_Polariscope getC_Polariscope() throws RuntimeException;

    /** Column name C_RCPolish_ID */
    public static final String COLUMNNAME_C_RCPolish_ID = "C_RCPolish_ID";

	/** Set Rough/Cut & Polish	  */
	public void setC_RCPolish_ID (int C_RCPolish_ID);

	/** Get Rough/Cut & Polish	  */
	public int getC_RCPolish_ID();

	public org.topra.model.I_C_RCPolish getC_RCPolish() throws RuntimeException;

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

    /** Column name C_ReceivingNoteLine_ID */
    public static final String COLUMNNAME_C_ReceivingNoteLine_ID = "C_ReceivingNoteLine_ID";

	/** Set Receiving Note Line	  */
	public void setC_ReceivingNoteLine_ID (int C_ReceivingNoteLine_ID);

	/** Get Receiving Note Line	  */
	public int getC_ReceivingNoteLine_ID();

    /** Column name C_Shape_ID */
    public static final String COLUMNNAME_C_Shape_ID = "C_Shape_ID";

	/** Set Shape	  */
	public void setC_Shape_ID (int C_Shape_ID);

	/** Get Shape	  */
	public int getC_Shape_ID();

	public org.topra.model.I_C_Shape getC_Shape() throws RuntimeException;

    /** Column name C_ShortWave_ID */
    public static final String COLUMNNAME_C_ShortWave_ID = "C_ShortWave_ID";

	/** Set Short Wave	  */
	public void setC_ShortWave_ID (int C_ShortWave_ID);

	/** Get Short Wave	  */
	public int getC_ShortWave_ID();

	//public I_C_ShortWave getC_ShortWave() throws RuntimeException;

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name FinalRemarksCmnt */
    public static final String COLUMNNAME_FinalRemarksCmnt = "FinalRemarksCmnt";

	/** Set Final Remark/Comment	  */
	public void setFinalRemarksCmnt (int FinalRemarksCmnt);

	/** Get Final Remark/Comment	  */
	public int getFinalRemarksCmnt();

//	public org.topra.model.I_C_ValFinalRemarks getFinalRemarksC() throws RuntimeException;

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

    /** Column name isAddintoWebJC */
    public static final String COLUMNNAME_isAddintoWebJC = "isAddintoWebJC";

	/** Set Add in to Web	  */
	public void setisAddintoWebJC (boolean isAddintoWebJC);

	/** Get Add in to Web	  */
	public boolean isAddintoWebJC();

    /** Column name isDetailJC */
    public static final String COLUMNNAME_isDetailJC = "isDetailJC";

	/** Set Detail Certificate	  */
	public void setisDetailJC (boolean isDetailJC);

	/** Get Detail Certificate	  */
	public boolean isDetailJC();

    /** Column name isJewelleryJC */
    public static final String COLUMNNAME_isJewelleryJC = "isJewelleryJC";

	/** Set Jewellery	  */
	public void setisJewelleryJC (boolean isJewelleryJC);

	/** Get Jewellery	  */
	public boolean isJewelleryJC();

    /** Column name isMemoJC */
    public static final String COLUMNNAME_isMemoJC = "isMemoJC";

	/** Set Memo	  */
	public void setisMemoJC (boolean isMemoJC);

	/** Get Memo	  */
	public boolean isMemoJC();

    /** Column name isOpaque */
    public static final String COLUMNNAME_isOpaque = "isOpaque";

	/** Set Opaque	  */
	public void setisOpaque (boolean isOpaque);

	/** Get Opaque	  */
	public boolean isOpaque();

    /** Column name isPhotoJC */
    public static final String COLUMNNAME_isPhotoJC = "isPhotoJC";

	/** Set Photo Certificate	  */
	public void setisPhotoJC (boolean isPhotoJC);

	/** Get Photo Certificate	  */
	public boolean isPhotoJC();

    /** Column name isPhotoMemo */
    public static final String COLUMNNAME_isPhotoMemo = "isPhotoMemo";

	/** Set Photo Memo	  */
	public void setisPhotoMemo (boolean isPhotoMemo);

	/** Get Photo Memo	  */
	public boolean isPhotoMemo();

    /** Column name isSaleInWeb */
    public static final String COLUMNNAME_isSaleInWeb = "isSaleInWeb";

	/** Set Sale in Web	  */
	public void setisSaleInWeb (boolean isSaleInWeb);

	/** Get Sale in Web	  */
	public boolean isSaleInWeb();

    /** Column name isTranslucent */
    public static final String COLUMNNAME_isTranslucent = "isTranslucent";

	/** Set Translucent	  */
	public void setisTranslucent (boolean isTranslucent);

	/** Get Translucent	  */
	public boolean isTranslucent();

    /** Column name isTransparant */
    public static final String COLUMNNAME_isTransparant = "isTransparant";

	/** Set Transparant	  */
	public void setisTransparant (boolean isTransparant);

	/** Get Transparant	  */
	public boolean isTransparant();

    /** Column name JobCardStatus */
    public static final String COLUMNNAME_JobCardStatus = "JobCardStatus";

	/** Set Job Card Status	  */
	public void setJobCardStatus (String JobCardStatus);

	/** Get Job Card Status	  */
	public String getJobCardStatus();

    /** Column name Length */
    public static final String COLUMNNAME_Length = "Length";

	/** Set Length	  */
	public void setLength (String Length);

	/** Get Length	  */
	public String getLength();

    /** Column name Lense */
    public static final String COLUMNNAME_Lense = "Lense";

	/** Set Lense (X)	  */
	public void setLense (String Lense);

	/** Get Lense (X)	  */
	public String getLense();

    /** Column name LineNo */
    public static final String COLUMNNAME_LineNo = "LineNo";

	/** Set Line.
	  * Line No
	  */
	public void setLineNo (int LineNo);

	/** Get Line.
	  * Line No
	  */
	public int getLineNo();

    /** Column name MicroscopeCerti */
    public static final String COLUMNNAME_MicroscopeCerti = "MicroscopeCerti";

	/** Set Microscope	  */
	public void setMicroscopeCerti (boolean MicroscopeCerti);

	/** Get Microscope	  */
	public boolean isMicroscopeCerti();

    /** Column name MicroscopeGOne */
    public static final String COLUMNNAME_MicroscopeGOne = "MicroscopeGOne";

	/** Set Microscope	  */
	public void setMicroscopeGOne (boolean MicroscopeGOne);

	/** Get Microscope	  */
	public boolean isMicroscopeGOne();

    /** Column name MicroscopicExamination */
    public static final String COLUMNNAME_MicroscopicExamination = "MicroscopicExamination";

	/** Set Microscopic Examination	  */
	public void setMicroscopicExamination (String MicroscopicExamination);

	/** Get Microscopic Examination	  */
	public String getMicroscopicExamination();

    /** Column name NormalHeatDetal */
    public static final String COLUMNNAME_NormalHeatDetal = "NormalHeatDetal";

	/** Set Normal/Heat	  */
	public void setNormalHeatDetal (String NormalHeatDetal);

	/** Get Normal/Heat	  */
	public String getNormalHeatDetal();

    /** Column name NormalHeatPhotoJC */
    public static final String COLUMNNAME_NormalHeatPhotoJC = "NormalHeatPhotoJC";

	/** Set Normal/Heat	  */
	public void setNormalHeatPhotoJC (String NormalHeatPhotoJC);

	/** Get Normal/Heat	  */
	public String getNormalHeatPhotoJC();

    /** Column name Other */
    public static final String COLUMNNAME_Other = "Other";

	/** Set Other	  */
	public void setOther (String Other);

	/** Get Other	  */
	public String getOther();

    /** Column name PhotoCertiColour */
    public static final String COLUMNNAME_PhotoCertiColour = "PhotoCertiColour";

	/** Set Photo Certificate Colour	  */
	public void setPhotoCertiColour (String PhotoCertiColour);

	/** Get Photo Certificate Colour	  */
	public String getPhotoCertiColour();

    /** Column name PolariscopeGOne */
    public static final String COLUMNNAME_PolariscopeGOne = "PolariscopeGOne";

	/** Set Polariscope	  */
	public void setPolariscopeGOne (boolean PolariscopeGOne);

	/** Get Polariscope	  */
	public boolean isPolariscopeGOne();

    /** Column name PoloriscopeCerti */
    public static final String COLUMNNAME_PoloriscopeCerti = "PoloriscopeCerti";

	/** Set Poloriscope	  */
	public void setPoloriscopeCerti (boolean PoloriscopeCerti);

	/** Get Poloriscope	  */
	public boolean isPoloriscopeCerti();

    /** Column name RefractiveIndex */
    public static final String COLUMNNAME_RefractiveIndex = "RefractiveIndex";

	/** Set Refractive Index	  */
	public void setRefractiveIndex (String RefractiveIndex);

	/** Get Refractive Index	  */
	public String getRefractiveIndex();

    /** Column name RefractorMeterCerti */
    public static final String COLUMNNAME_RefractorMeterCerti = "RefractorMeterCerti";

	/** Set Refractor Meter	  */
	public void setRefractorMeterCerti (boolean RefractorMeterCerti);

	/** Get Refractor Meter	  */
	public boolean isRefractorMeterCerti();

    /** Column name RefractorMeterGOne */
    public static final String COLUMNNAME_RefractorMeterGOne = "RefractorMeterGOne";

	/** Set Refractor Meter	  */
	public void setRefractorMeterGOne (boolean RefractorMeterGOne);

	/** Get Refractor Meter	  */
	public boolean isRefractorMeterGOne();

    /** Column name RemarksCerti */
    public static final String COLUMNNAME_RemarksCerti = "RemarksCerti";

	/** Set Remarks	  */
	public void setRemarksCerti (String RemarksCerti);

	/** Get Remarks	  */
	public String getRemarksCerti();

    /** Column name RemarksGOne */
    public static final String COLUMNNAME_RemarksGOne = "RemarksGOne";

	/** Set Remarks	  */
	public void setRemarksGOne (String RemarksGOne);

	/** Get Remarks	  */
	public String getRemarksGOne();

    /** Column name Speci */
    public static final String COLUMNNAME_Speci = "Speci";

	/** Set Species	  */
	public void setSpeci (int Speci);

	/** Get Species	  */
	public int getSpeci();

	//public I_C_Specieses getSp() throws RuntimeException;

    /** Column name SpecificGravity */
    public static final String COLUMNNAME_SpecificGravity = "SpecificGravity";

	/** Set Specific Gravity	  */
	public void setSpecificGravity (String SpecificGravity);

	/** Get Specific Gravity	  */
	public String getSpecificGravity();

    /** Column name SpectroscopeCerti */
    public static final String COLUMNNAME_SpectroscopeCerti = "SpectroscopeCerti";

	/** Set Spectroscope	  */
	public void setSpectroscopeCerti (boolean SpectroscopeCerti);

	/** Get Spectroscope	  */
	public boolean isSpectroscopeCerti();

    /** Column name SpectroscopeGOne */
    public static final String COLUMNNAME_SpectroscopeGOne = "SpectroscopeGOne";

	/** Set Spectroscope	  */
	public void setSpectroscopeGOne (boolean SpectroscopeGOne);

	/** Get Spectroscope	  */
	public boolean isSpectroscopeGOne();

    /** Column name TypeOfCut */
    public static final String COLUMNNAME_TypeOfCut = "TypeOfCut";

	/** Set Type Of Cut	  */
	public void setTypeOfCut (int TypeOfCut);

	/** Get Type Of Cut	  */
	public int getTypeOfCut();

	//public I_C_TypeofCut getTypeOf() throws RuntimeException;

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

    /** Column name User1_ID */
    public static final String COLUMNNAME_User1_ID = "User1_ID";

	/** Set User 2.
	  * User defined list element #1
	  */
	public void setUser1_ID (int User1_ID);

	/** Get User 2.
	  * User defined list element #1
	  */
	public int getUser1_ID();

	public org.compiere.model.I_AD_User getUser1() throws RuntimeException;

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

    /** Column name UVLampCerti */
    public static final String COLUMNNAME_UVLampCerti = "UVLampCerti";

	/** Set UV Lamp	  */
	public void setUVLampCerti (boolean UVLampCerti);

	/** Get UV Lamp	  */
	public boolean isUVLampCerti();

    /** Column name UVLampGOne */
    public static final String COLUMNNAME_UVLampGOne = "UVLampGOne";

	/** Set UV Lamp	  */
	public void setUVLampGOne (boolean UVLampGOne);

	/** Get UV Lamp	  */
	public boolean isUVLampGOne();

    /** Column name ValMesureUnit */
    public static final String COLUMNNAME_ValMesureUnit = "ValMesureUnit";

	/** Set Mesure Unit	  */
	public void setValMesureUnit (String ValMesureUnit);

	/** Get Mesure Unit	  */
	public String getValMesureUnit();

    /** Column name Vari */
    public static final String COLUMNNAME_Vari = "Vari";

	/** Set Variety	  */
	public void setVari (int Vari);

	/** Get Variety	  */
	public int getVari();

//	public I_C_Variety getV() throws RuntimeException;

    /** Column name WeightRN */
    public static final String COLUMNNAME_WeightRN = "WeightRN";

	/** Set Weight (In Receiving Note)	  */
	public void setWeightRN (String WeightRN);

	/** Get Weight (In Receiving Note)	  */
	public String getWeightRN();
}
