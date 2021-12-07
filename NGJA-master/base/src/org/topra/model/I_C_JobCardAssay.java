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

/** Generated Interface for C_JobCardAssay
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_JobCardAssay 
{

    /** TableName=C_JobCardAssay */
    public static final String Table_Name = "C_JobCardAssay";

    /** AD_Table_ID=1000033 */
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

    /** Column name C_JobCardAssay_ID */
    public static final String COLUMNNAME_C_JobCardAssay_ID = "C_JobCardAssay_ID";

	/** Set C_JobCardAssay ID	  */
	public void setC_JobCardAssay_ID (int C_JobCardAssay_ID);

	/** Get C_JobCardAssay ID	  */
	public int getC_JobCardAssay_ID();

    /** Column name C_ReceivingNote_ID */
    public static final String COLUMNNAME_C_ReceivingNote_ID = "C_ReceivingNote_ID";

	/** Set Receiving Note ID	  */
	public void setC_ReceivingNote_ID (int C_ReceivingNote_ID);

	/** Get Receiving Note ID	  */
	public int getC_ReceivingNote_ID();

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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

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

    /** Column name hmValue */
    public static final String COLUMNNAME_hmValue = "hmValue";

	/** Set Hallmarked Value	  */
	public void sethmValue (String hmValue);

	/** Get Hallmarked Value	  */
	public String gethmValue();

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

    /** Column name karat */
    public static final String COLUMNNAME_karat = "karat";

	/** Set KARAT	  */
	public void setkarat (String karat);

	/** Get KARAT	  */
	public String getkarat();

    /** Column name me01 */
    public static final String COLUMNNAME_me01 = "me01";

	/** Set Fire Assay	  */
	public void setme01 (boolean me01);

	/** Get Fire Assay	  */
	public boolean isme01();

    /** Column name me02 */
    public static final String COLUMNNAME_me02 = "me02";

	/** Set Atomic Absorption Spectrometry	  */
	public void setme02 (boolean me02);

	/** Get Atomic Absorption Spectrometry	  */
	public boolean isme02();

    /** Column name me03 */
    public static final String COLUMNNAME_me03 = "me03";

	/** Set Protentiometric Titration	  */
	public void setme03 (boolean me03);

	/** Get Protentiometric Titration	  */
	public boolean isme03();

    /** Column name me04 */
    public static final String COLUMNNAME_me04 = "me04";

	/** Set EDXRF Spectrometry	  */
	public void setme04 (boolean me04);

	/** Get EDXRF Spectrometry	  */
	public boolean isme04();

    /** Column name me05 */
    public static final String COLUMNNAME_me05 = "me05";

	/** Set Other	  */
	public void setme05 (boolean me05);

	/** Get Other	  */
	public boolean isme05();

    /** Column name OpeningDate */
    public static final String COLUMNNAME_OpeningDate = "OpeningDate";

	/** Set Opening Date	  */
	public void setOpeningDate (Timestamp OpeningDate);

	/** Get Opening Date	  */
	public Timestamp getOpeningDate();

    /** Column name pptGold */
    public static final String COLUMNNAME_pptGold = "pptGold";

	/** Set PPT GOLD	  */
	public void setpptGold (int pptGold);

	/** Get PPT GOLD	  */
	public int getpptGold();

    /** Column name pptPlatinum */
    public static final String COLUMNNAME_pptPlatinum = "pptPlatinum";

	/** Set PPT PLATINUM	  */
	public void setpptPlatinum (int pptPlatinum);

	/** Get PPT PLATINUM	  */
	public int getpptPlatinum();

    /** Column name pptSilver */
    public static final String COLUMNNAME_pptSilver = "pptSilver";

	/** Set PPT SILVER	  */
	public void setpptSilver (int pptSilver);

	/** Get PPT SILVER	  */
	public int getpptSilver();

    /** Column name rs01 */
    public static final String COLUMNNAME_rs01 = "rs01";

	/** Set Article's below standard which submitted	  */
	public void setrs01 (boolean rs01);

	/** Get Article's below standard which submitted	  */
	public boolean isrs01();

    /** Column name rs02 */
    public static final String COLUMNNAME_rs02 = "rs02";

	/** Set Solder below required fineness standard	  */
	public void setrs02 (boolean rs02);

	/** Get Solder below required fineness standard	  */
	public boolean isrs02();

    /** Column name rs03 */
    public static final String COLUMNNAME_rs03 = "rs03";

	/** Set Excessive use of solder alloy used for joining parts	  */
	public void setrs03 (boolean rs03);

	/** Get Excessive use of solder alloy used for joining parts	  */
	public boolean isrs03();

    /** Column name rs04 */
    public static final String COLUMNNAME_rs04 = "rs04";

	/** Set Unauthorized base metal parts / fillings	  */
	public void setrs04 (boolean rs04);

	/** Get Unauthorized base metal parts / fillings	  */
	public boolean isrs04();

    /** Column name rs05 */
    public static final String COLUMNNAME_rs05 = "rs05";

	/** Set Unauthorized base metal plating	  */
	public void setrs05 (boolean rs05);

	/** Get Unauthorized base metal plating	  */
	public boolean isrs05();

    /** Column name rs06 */
    public static final String COLUMNNAME_rs06 = "rs06";

	/** Set No suitable place to stamp the Hallmark	  */
	public void setrs06 (boolean rs06);

	/** Get No suitable place to stamp the Hallmark	  */
	public boolean isrs06();

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
