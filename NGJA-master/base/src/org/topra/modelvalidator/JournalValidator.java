package org.topra.modelvalidator;

import java.math.BigDecimal;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MClient;
import org.compiere.model.MJournalBatch;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.util.CLogger;


//Auther Lakshan
public class JournalValidator implements ModelValidator {

	private CLogger log = CLogger.getCLogger(getClass());
	private int m_AD_Client_ID =  -1;
	
	
	@Override
	public void initialize(ModelValidationEngine engine, MClient client) {
		if(client != null)
		 m_AD_Client_ID= client.getAD_Client_ID();
		
		engine.addDocValidate(MJournalBatch.Table_Name, this);

	}

	@Override
	public int getAD_Client_ID() {
        return m_AD_Client_ID;
	}

	@Override
	public String login(int AD_Org_ID, int AD_Role_ID, int AD_User_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String modelChange(PO po, int type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String docValidate(PO po, int timing) {
		if(timing== TIMING_BEFORE_PREPARE)
		{
			if (po.get_TableName().equals(MJournalBatch.Table_Name)) {
				
				MJournalBatch mJournalBatch = (MJournalBatch) po;
				BigDecimal cr = mJournalBatch.getTotalCr();
				BigDecimal dr = mJournalBatch.getTotalDr();
				if (cr.compareTo(dr)== 0){
					return null;
				}else 
				 {
					throw new AdempiereException("Unbalanced");
				}
			}
		}
		return null;
	}

}
