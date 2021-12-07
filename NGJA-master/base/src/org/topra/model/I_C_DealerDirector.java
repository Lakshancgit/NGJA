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

/** Generated Interface for C_DealerDirector
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0
 */
public interface I_C_DealerDirector 
{

    /** TableName=C_DealerDirector */
    public static final String Table_Name = "C_DealerDirector";

    /** AD_Table_ID=1000054 */
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

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner .
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner .
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_DealerDirector_ID */
    public static final String COLUMNNAME_C_DealerDirector_ID = "C_DealerDirector_ID";

	/** Set DealerDirectorDetails ID	  */
	public void setC_DealerDirector_ID (int C_DealerDirector_ID);

	/** Get DealerDirectorDetails ID	  */
	public int getC_DealerDirector_ID();

    /** Column name C_DealerFile_ID */
    public static final String COLUMNNAME_C_DealerFile_ID = "C_DealerFile_ID";

	/** Set Dealer File Number ID	  */
	public void setC_DealerFile_ID (int C_DealerFile_ID);

	/** Get Dealer File Number ID	  */
	public int getC_DealerFile_ID();

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

    /** Column name DirectorName */
    public static final String COLUMNNAME_DirectorName = "DirectorName";

	/** Set Director Name	  */
	public void setDirectorName (String DirectorName);

	/** Get Director Name	  */
	public String getDirectorName();

    /** Column name DirectorName2 */
    public static final String COLUMNNAME_DirectorName2 = "DirectorName2";

	/** Set Director Name2	  */
	public void setDirectorName2 (String DirectorName2);

	/** Get Director Name2	  */
	public String getDirectorName2();

    /** Column name DirectorNIC */
    public static final String COLUMNNAME_DirectorNIC = "DirectorNIC";

	/** Set DirectorNIC	  */
	public void setDirectorNIC (String DirectorNIC);

	/** Get DirectorNIC	  */
	public String getDirectorNIC();

    /** Column name FileNo */
    public static final String COLUMNNAME_FileNo = "FileNo";

	/** Set FileNo	  */
	public void setFileNo (String FileNo);

	/** Get FileNo	  */
	public String getFileNo();

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
