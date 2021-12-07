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

/** Generated Interface for C_ValuationCertificate
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_ValuationCertificate 
{

    /** TableName=C_ValuationCertificate */
    public static final String Table_Name = "C_ValuationCertificate";

    /** AD_Table_ID=1000036 */
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

    /** Column name C_JobCardValuation_ID */
    public static final String COLUMNNAME_C_JobCardValuation_ID = "C_JobCardValuation_ID";

	/** Set Job Card Number	  */
	public void setC_JobCardValuation_ID (int C_JobCardValuation_ID);

	/** Get Job Card Number	  */
	public int getC_JobCardValuation_ID();

	public org.topra.model.I_C_JobCardValuation getC_JobCardValuation() throws RuntimeException;

    /** Column name CreatDetail */
    public static final String COLUMNNAME_CreatDetail = "CreatDetail";

	/** Set Create Detail Certficate.
	  * Create Detail Certficate
	  */
	public void setCreatDetail (String CreatDetail);

	/** Get Create Detail Certficate.
	  * Create Detail Certficate
	  */
	public String getCreatDetail();

    /** Column name CreateBriefNote */
    public static final String COLUMNNAME_CreateBriefNote = "CreateBriefNote";

	/** Set Create Brief Note.
	  * Create Brief Note
	  */
	public void setCreateBriefNote (String CreateBriefNote);

	/** Get Create Brief Note.
	  * Create Brief Note
	  */
	public String getCreateBriefNote();

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

    /** Column name CreatePhoto */
    public static final String COLUMNNAME_CreatePhoto = "CreatePhoto";

	/** Set Create Photo Certificate.
	  * Create Photo Certificate
	  */
	public void setCreatePhoto (String CreatePhoto);

	/** Get Create Photo Certificate.
	  * Create Photo Certificate
	  */
	public String getCreatePhoto();

    /** Column name CreatPhotoMemo */
    public static final String COLUMNNAME_CreatPhotoMemo = "CreatPhotoMemo";

	/** Set Create PhotoMemo Certficate.
	  * Create PhotoMemo Certficate
	  */
	public void setCreatPhotoMemo (String CreatPhotoMemo);

	/** Get Create PhotoMemo Certficate.
	  * Create PhotoMemo Certficate
	  */
	public String getCreatPhotoMemo();

    /** Column name C_ValuationCertificate_ID */
    public static final String COLUMNNAME_C_ValuationCertificate_ID = "C_ValuationCertificate_ID";

	/** Set Valuation Certificate ID	  */
	public void setC_ValuationCertificate_ID (int C_ValuationCertificate_ID);

	/** Get Valuation Certificate ID	  */
	public int getC_ValuationCertificate_ID();

    /** Column name DatePrinted */
    public static final String COLUMNNAME_DatePrinted = "DatePrinted";

	/** Set Date printed.
	  * Date the document was printed.
	  */
	public void setDatePrinted (Timestamp DatePrinted);

	/** Get Date printed.
	  * Date the document was printed.
	  */
	public Timestamp getDatePrinted();

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

    /** Column name DetailCertStatus */
    public static final String COLUMNNAME_DetailCertStatus = "DetailCertStatus";

	/** Set Detailed Certificate Status	  */
	public void setDetailCertStatus (String DetailCertStatus);

	/** Get Detailed Certificate Status	  */
	public String getDetailCertStatus();

    /** Column name DocumentNoDetail */
    public static final String COLUMNNAME_DocumentNoDetail = "DocumentNoDetail";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNoDetail (String DocumentNoDetail);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNoDetail();

    /** Column name DocumentNoMemo */
    public static final String COLUMNNAME_DocumentNoMemo = "DocumentNoMemo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNoMemo (String DocumentNoMemo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNoMemo();

    /** Column name DocumentNoPhoto */
    public static final String COLUMNNAME_DocumentNoPhoto = "DocumentNoPhoto";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNoPhoto (String DocumentNoPhoto);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNoPhoto();

    /** Column name DocumentNoPhotoMemo */
    public static final String COLUMNNAME_DocumentNoPhotoMemo = "DocumentNoPhotoMemo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNoPhotoMemo (String DocumentNoPhotoMemo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNoPhotoMemo();

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

    /** Column name isDetailedCertificate */
    public static final String COLUMNNAME_isDetailedCertificate = "isDetailedCertificate";

	/** Set Detailed Certificate	  */
	public void setisDetailedCertificate (boolean isDetailedCertificate);

	/** Get Detailed Certificate	  */
	public boolean isDetailedCertificate();

    /** Column name isMemo */
    public static final String COLUMNNAME_isMemo = "isMemo";

	/** Set Memo	  */
	public void setisMemo (boolean isMemo);

	/** Get Memo	  */
	public boolean isMemo();

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

    /** Column name IsPrinted */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";

	/** Set Printed.
	  * Indicates if this document / line is printed
	  */
	public void setIsPrinted (boolean IsPrinted);

	/** Get Printed.
	  * Indicates if this document / line is printed
	  */
	public boolean isPrinted();

    /** Column name MemoCertStatus */
    public static final String COLUMNNAME_MemoCertStatus = "MemoCertStatus";

	/** Set Memo Certificate Status	  */
	public void setMemoCertStatus (String MemoCertStatus);

	/** Get Memo Certificate Status	  */
	public String getMemoCertStatus();

    /** Column name NormalHeat */
    public static final String COLUMNNAME_NormalHeat = "NormalHeat";

	/** Set NormalHeat	  */
	public void setNormalHeat (String NormalHeat);

	/** Get NormalHeat	  */
	public String getNormalHeat();

    /** Column name NormalHeatPhoto */
    public static final String COLUMNNAME_NormalHeatPhoto = "NormalHeatPhoto";

	/** Set Normal/Heat	  */
	public void setNormalHeatPhoto (String NormalHeatPhoto);

	/** Get Normal/Heat	  */
	public String getNormalHeatPhoto();

    /** Column name PhotoCertStatus */
    public static final String COLUMNNAME_PhotoCertStatus = "PhotoCertStatus";

	/** Set Photo Certificate Status	  */
	public void setPhotoCertStatus (String PhotoCertStatus);

	/** Get Photo Certificate Status	  */
	public String getPhotoCertStatus();

    /** Column name PhotoMemoCertStatus */
    public static final String COLUMNNAME_PhotoMemoCertStatus = "PhotoMemoCertStatus";

	/** Set Photo Memo Certificate Status	  */
	public void setPhotoMemoCertStatus (String PhotoMemoCertStatus);

	/** Get Photo Memo Certificate Status	  */
	public String getPhotoMemoCertStatus();

    /** Column name PrintDocument */
    public static final String COLUMNNAME_PrintDocument = "PrintDocument";

	/** Set Print Document.
	  * Document to print
	  */
	public void setPrintDocument (String PrintDocument);

	/** Get Print Document.
	  * Document to print
	  */
	public String getPrintDocument();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name ReasonCancelMemo */
    public static final String COLUMNNAME_ReasonCancelMemo = "ReasonCancelMemo";

	/** Set Comments	  */
	public void setReasonCancelMemo (String ReasonCancelMemo);

	/** Get Comments	  */
	public String getReasonCancelMemo();

    /** Column name ReasonCancelPhotoMemo */
    public static final String COLUMNNAME_ReasonCancelPhotoMemo = "ReasonCancelPhotoMemo";

	/** Set Comments	  */
	public void setReasonCancelPhotoMemo (String ReasonCancelPhotoMemo);

	/** Get Comments	  */
	public String getReasonCancelPhotoMemo();

    /** Column name ReasonDetailCan */
    public static final String COLUMNNAME_ReasonDetailCan = "ReasonDetailCan";

	/** Set Comments	  */
	public void setReasonDetailCan (String ReasonDetailCan);

	/** Get Comments	  */
	public String getReasonDetailCan();

    /** Column name ReasonPhotoCancel */
    public static final String COLUMNNAME_ReasonPhotoCancel = "ReasonPhotoCancel";

	/** Set Comments	  */
	public void setReasonPhotoCancel (String ReasonPhotoCancel);

	/** Get Comments	  */
	public String getReasonPhotoCancel();

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
