package org.topra.modelvalidator;

import org.compiere.model.MBankAccount;
import org.compiere.model.MBankAccountDoc;
import org.compiere.model.MPayment;
import org.compiere.util.DB;

public class PayementCheckNo {

	protected void setBankWiseCheckSequence(MPayment payment){
		
	
		MBankAccount bankAcc =  (MBankAccount) payment.getC_BankAccount();
		
		String sql = "SELECT MAX(C_BankAccountDoc_ID) FROM  C_BankAccountDoc"
			+ " WHERE PaymentRule = 'S' AND C_BankAccount_ID=? AND ISACTIVE = 'Y'";
		 
		int C_BankAccountDoc_ID = DB.getSQLValue(payment.get_TrxName(), sql, bankAcc.get_ID());
		
		if(C_BankAccountDoc_ID < 1) return;
		
		MBankAccountDoc accDoc = new MBankAccountDoc(payment.getCtx(), C_BankAccountDoc_ID, payment.get_TrxName());
		payment.setCheckNo(accDoc.getCurrentNext()+"");
		accDoc.setCurrentNext((accDoc.getCurrentNext() + 1));
		
		accDoc.save(payment.get_TrxName());
	}
}
