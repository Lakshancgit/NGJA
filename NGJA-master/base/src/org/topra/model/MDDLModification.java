package org.topra.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;

public class MDDLModification extends X_D_DLModification {

	public MDDLModification(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MDDLModification(Properties ctx, int D_DLModification_ID, String trxName) {
		super(ctx, D_DLModification_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	protected boolean beforeSave(boolean newRecord) {
		
		return true;
	} // beforeSave

}
