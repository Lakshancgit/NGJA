package org.topra.model;

import java.io.File;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MInvoice;
import org.compiere.model.MPayment;
import org.compiere.process.DocAction;

public class MCExportDetails extends X_C_ExportDetails implements DocAction{

	public MCExportDetails(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MCExportDetails(Properties ctx, int C_ExportDetails_ID, String trxName) {
		super(ctx, C_ExportDetails_ID, trxName);
		// TODO Auto-generated constructor stub
	}
	
	
	protected boolean beforeSave(boolean newRecord)
	{
		this.setFOBInRS(this.getFOBValueFC().multiply(this.getRateFC()));
		this.setInsuaranceInRS(this.getInsuaranceInFC().multiply(this.getRateFC()));
		this.setAirFreightInRS(this.getAirFreightInFC().multiply(this.getRateFC()));
		this.setPostageInRS(this.getPostageInFC().multiply(this.getRateFC()));
		this.setCIFValueInFC(this.getFOBValueFC().add(this.getInsuaranceInFC().add(this.getAirFreightInFC()).add(this.getPostageInFC())));
		this.setCIFValueInRS(this.getCIFValueInFC().multiply(this.getRateFC()));
		this.setTotalAmtInFC(this.getCIFValueInFC());
		this.setTotalAmt(this.getTotalAmtInFC().multiply(this.getRateFC()));
		return true;
		
	}	//	beforeSave

	@Override
	public boolean processIt(String action) throws Exception {
		if(getDocStatus().equalsIgnoreCase("DR") && action.equals("CO")){
			this.completeIt();
		}else if(getDocStatus().equalsIgnoreCase("CO") && getDocAction().equals("VO")) {
				this.voidIt();
		}else if(getDocStatus().equalsIgnoreCase("CO") && action.equals("CL")){
			throw new  AdempiereException("Document Close function is activated!");
		}else if(getDocStatus().equalsIgnoreCase("CO") && action.equals("CL")){
			throw new  AdempiereException("Document Void function is activated!");
		}
		return true;
		
	}

	@Override
	public boolean unlockIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean invalidateIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String prepareIt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String completeIt() {
		if (this.getC_Invoice_ID()!=0) {
			MInvoice invoice = new MInvoice(this.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());
			if (invoice.getDocStatus().equalsIgnoreCase("CO")) {
				System.out.println("Complete");
				setProcessed(true);
				setDocStatus(STATUS_Completed);
				setDocAction(DOCACTION_Void);
				return DocAction.STATUS_Completed;
			}else {
				throw new AdempiereException("Invoice is not completed");
			}
		}else {
			throw new AdempiereException("No invoice attached");
		}
		
	}

	@Override
	public boolean voidIt() {
		System.out.println("Voided");
		setProcessed(true);
		setDocStatus(STATUS_Voided);
		setDocAction(DOCACTION_None);
		return true;
		
	}

	@Override
	public boolean closeIt() {
		this.setDocStatus("CL");
		this.setDocAction(DOCACTION_None);
		return true;
	}

	@Override
	public boolean reverseCorrectIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reverseAccrualIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reActivateIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDocumentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File createPDF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProcessMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDoc_User_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigDecimal getApprovalAmt() {
		// TODO Auto-generated method stub
		return null;
	}

}
