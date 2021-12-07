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

/** Generated Interface for C_ReceivingNoteLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ReceivingNoteLine 
{

    /** TableName=C_ReceivingNoteLine */
    public static final String Table_Name = "C_ReceivingNoteLine";

    /** AD_Table_ID=1000002 */
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

    /** Column name C_ArticleStd_ID */
    public static final String COLUMNNAME_C_ArticleStd_ID = "C_ArticleStd_ID";

	/** Set C_ArticleStd ID	  */
	public void setC_ArticleStd_ID (int C_ArticleStd_ID);

	/** Get C_ArticleStd ID	  */
	public int getC_ArticleStd_ID();

	//public I_C_ArticleStd getC_ArticleStd() throws RuntimeException;

    /** Column name C_ArticleTypes_ID */
    public static final String COLUMNNAME_C_ArticleTypes_ID = "C_ArticleTypes_ID";

	/** Set C_ArticleTypes ID	  */
	public void setC_ArticleTypes_ID (int C_ArticleTypes_ID);

	/** Get C_ArticleTypes ID	  */
	public int getC_ArticleTypes_ID();

//	public I_C_ArticleTypes getC_ArticleTypes() throws RuntimeException;

    /** Column name C_Color_ID */
    public static final String COLUMNNAME_C_Color_ID = "C_Color_ID";

	/** Set Color	  */
	public void setC_Color_ID (int C_Color_ID);

	/** Get Color	  */
	public int getC_Color_ID();

	public org.topra.model.I_C_Color getC_Color() throws RuntimeException;

    /** Column name C_GemItems_ID */
    public static final String COLUMNNAME_C_GemItems_ID = "C_GemItems_ID";

	/** Set Item Name	  */
	public void setC_GemItems_ID (int C_GemItems_ID);

	/** Get Item Name	  */
	public int getC_GemItems_ID();

//	public I_C_GemItems getC_GemItems() throws RuntimeException;

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

    /** Column name C_ReceivingNote_ID */
    public static final String COLUMNNAME_C_ReceivingNote_ID = "C_ReceivingNote_ID";

	/** Set Receiving Note ID	  */
	public void setC_ReceivingNote_ID (int C_ReceivingNote_ID);

	/** Get Receiving Note ID	  */
	public int getC_ReceivingNote_ID();

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

    /** Column name DetaCertNo */
    public static final String COLUMNNAME_DetaCertNo = "DetaCertNo";

	/** Set Detailed Certificate Number	  */
	public void setDetaCertNo (String DetaCertNo);

	/** Get Detailed Certificate Number	  */
	public String getDetaCertNo();

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

    /** Column name is10 */
    public static final String COLUMNNAME_is10 = "is10";

	/** Set 10 Kt	  */
	public void setis10 (boolean is10);

	/** Get 10 Kt	  */
	public boolean is10();

    /** Column name is14 */
    public static final String COLUMNNAME_is14 = "is14";

	/** Set 14 Kt	  */
	public void setis14 (boolean is14);

	/** Get 14 Kt	  */
	public boolean is14();

    /** Column name is18 */
    public static final String COLUMNNAME_is18 = "is18";

	/** Set 18 Kt	  */
	public void setis18 (boolean is18);

	/** Get 18 Kt	  */
	public boolean is18();

    /** Column name is21 */
    public static final String COLUMNNAME_is21 = "is21";

	/** Set 21 Kt	  */
	public void setis21 (boolean is21);

	/** Get 21 Kt	  */
	public boolean is21();

    /** Column name is22 */
    public static final String COLUMNNAME_is22 = "is22";

	/** Set 22 Kt	  */
	public void setis22 (boolean is22);

	/** Get 22 Kt	  */
	public boolean is22();

    /** Column name is24 */
    public static final String COLUMNNAME_is24 = "is24";

	/** Set 24 Kt	  */
	public void setis24 (boolean is24);

	/** Get 24 Kt	  */
	public boolean is24();

    /** Column name is8 */
    public static final String COLUMNNAME_is8 = "is8";

	/** Set 8 Kt	  */
	public void setis8 (boolean is8);

	/** Get 8 Kt	  */
	public boolean is8();

    /** Column name is800s */
    public static final String COLUMNNAME_is800s = "is800s";

	/** Set 800	  */
	public void setis800s (boolean is800s);

	/** Get 800	  */
	public boolean is800s();

    /** Column name is850p */
    public static final String COLUMNNAME_is850p = "is850p";

	/** Set 850	  */
	public void setis850p (boolean is850p);

	/** Get 850	  */
	public boolean is850p();

    /** Column name is9 */
    public static final String COLUMNNAME_is9 = "is9";

	/** Set 9 Kt	  */
	public void setis9 (boolean is9);

	/** Get 9 Kt	  */
	public boolean is9();

    /** Column name is900p */
    public static final String COLUMNNAME_is900p = "is900p";

	/** Set 900	  */
	public void setis900p (boolean is900p);

	/** Get 900	  */
	public boolean is900p();

    /** Column name is925s */
    public static final String COLUMNNAME_is925s = "is925s";

	/** Set 925	  */
	public void setis925s (boolean is925s);

	/** Get 925	  */
	public boolean is925s();

    /** Column name is950p */
    public static final String COLUMNNAME_is950p = "is950p";

	/** Set 950	  */
	public void setis950p (boolean is950p);

	/** Get 950	  */
	public boolean is950p();

    /** Column name is999p */
    public static final String COLUMNNAME_is999p = "is999p";

	/** Set 999	  */
	public void setis999p (boolean is999p);

	/** Get 999	  */
	public boolean is999p();

    /** Column name is999s */
    public static final String COLUMNNAME_is999s = "is999s";

	/** Set 999	  */
	public void setis999s (boolean is999s);

	/** Get 999	  */
	public boolean is999s();

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

    /** Column name isAddintoWeb */
    public static final String COLUMNNAME_isAddintoWeb = "isAddintoWeb";

	/** Set Add into Web	  */
	public void setisAddintoWeb (boolean isAddintoWeb);

	/** Get Add into Web	  */
	public boolean isAddintoWeb();

    /** Column name isDetailedCertificate */
    public static final String COLUMNNAME_isDetailedCertificate = "isDetailedCertificate";

	/** Set Detailed Certificate	  */
	public void setisDetailedCertificate (boolean isDetailedCertificate);

	/** Get Detailed Certificate	  */
	public boolean isDetailedCertificate();

    /** Column name isHallmark */
    public static final String COLUMNNAME_isHallmark = "isHallmark";

	/** Set Is Hallmark ?	  */
	public void setisHallmark (boolean isHallmark);

	/** Get Is Hallmark ?	  */
	public boolean isHallmark();

    /** Column name isJewellery */
    public static final String COLUMNNAME_isJewellery = "isJewellery";

	/** Set Jewellery	  */
	public void setisJewellery (boolean isJewellery);

	/** Get Jewellery	  */
	public boolean isJewellery();

    /** Column name isMemo */
    public static final String COLUMNNAME_isMemo = "isMemo";

	/** Set Memo	  */
	public void setisMemo (boolean isMemo);

	/** Get Memo	  */
	public boolean isMemo();

    /** Column name IsOtherMetal */
    public static final String COLUMNNAME_IsOtherMetal = "IsOtherMetal";

	/** Set Any Other Metals	  */
	public void setIsOtherMetal (boolean IsOtherMetal);

	/** Get Any Other Metals	  */
	public boolean isOtherMetal();

    /** Column name isPhotoCertificate */
    public static final String COLUMNNAME_isPhotoCertificate = "isPhotoCertificate";

	/** Set Photo Certificate	  */
	public void setisPhotoCertificate (boolean isPhotoCertificate);

	/** Get Photo Certificate	  */
	public boolean isPhotoCertificate();

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

    /** Column name IsSponceMark */
    public static final String COLUMNNAME_IsSponceMark = "IsSponceMark";

	/** Set Is Sponsor's Mark Printed	  */
	public void setIsSponceMark (boolean IsSponceMark);

	/** Get Is Sponsor's Mark Printed	  */
	public boolean isSponceMark();

    /** Column name itemCount */
    public static final String COLUMNNAME_itemCount = "itemCount";

	/** Set Item Count	  */
	public void setitemCount (int itemCount);

	/** Get Item Count	  */
	public int getitemCount();

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name MemoCertNo */
    public static final String COLUMNNAME_MemoCertNo = "MemoCertNo";

	/** Set Memo Certificate Number	  */
	public void setMemoCertNo (String MemoCertNo);

	/** Get Memo Certificate Number	  */
	public String getMemoCertNo();

    /** Column name NormalHeat */
    public static final String COLUMNNAME_NormalHeat = "NormalHeat";

	/** Set Normal/Heat	  */
	public void setNormalHeat (String NormalHeat);

	/** Get Normal/Heat	  */
	public String getNormalHeat();

    /** Column name NormalHeatPhoto */
    public static final String COLUMNNAME_NormalHeatPhoto = "NormalHeatPhoto";

	/** Set Normal/Heat	  */
	public void setNormalHeatPhoto (String NormalHeatPhoto);

	/** Get Normal/Heat	  */
	public String getNormalHeatPhoto();

    /** Column name PhotoCertiColour */
    public static final String COLUMNNAME_PhotoCertiColour = "PhotoCertiColour";

	/** Set Photo Certificate Colour	  */
	public void setPhotoCertiColour (String PhotoCertiColour);

	/** Get Photo Certificate Colour	  */
	public String getPhotoCertiColour();

    /** Column name PhotoCertNo */
    public static final String COLUMNNAME_PhotoCertNo = "PhotoCertNo";

	/** Set Photo Certificate Number	  */
	public void setPhotoCertNo (String PhotoCertNo);

	/** Get Photo Certificate Number	  */
	public String getPhotoCertNo();

    /** Column name Remarks */
    public static final String COLUMNNAME_Remarks = "Remarks";

	/** Set Remarks.
	  * Remarks
	  */
	public void setRemarks (String Remarks);

	/** Get Remarks.
	  * Remarks
	  */
	public String getRemarks();

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

    /** Column name Weight */
    public static final String COLUMNNAME_Weight = "Weight";

	/** Set Weight.
	  * Weight of a product
	  */
	public void setWeight (String Weight);

	/** Get Weight.
	  * Weight of a product
	  */
	public String getWeight();
}
