package org.topra.modelvalidator;

import org.compiere.FA.model.ModelValidator;
import org.compiere.model.MClient;
import org.compiere.model.MPayment;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.PO;
import org.compiere.util.CLogger;

//Auther Lakshan

public class Validator extends ModelValidator {

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(Validator.class);
	/** Client			*/
	private int		m_AD_Client_ID = -1;
	
	@Override
	public void initialize(ModelValidationEngine engine, MClient client) {
		
		if (client != null) {
			m_AD_Client_ID = client.getAD_Client_ID();
			log.info(client.toString());
		}	
		else
			log.info("Initializing global validator: "+this.toString());
		
		engine.addModelChange(MPayment.Table_Name, this);
		
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
		
		
		if(po.get_TableName().equals(MPayment.Table_Name)){
			MPayment payment = (MPayment) po;
			
			if(payment.getTenderType().equals(MPayment.TENDERTYPE_Check) ){
				if(payment.getCheckNo() == null || payment.getCheckNo().isEmpty()){
					PayementCheckNo pcn = new PayementCheckNo();
					pcn.setBankWiseCheckSequence(payment);
				}
			}
			
		}
		
		return null;
	}
}
