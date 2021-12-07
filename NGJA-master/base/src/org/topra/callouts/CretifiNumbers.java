package org.topra.callouts;

import java.util.Properties;

import org.compiere.apps.ADialog;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MSequence;
import org.topra.model.HardCoded;
import org.topra.model.MCValuationCertificate;


public class CretifiNumbers extends CalloutEngine {
	
	
//org.topra.callouts.CretifiNumbers.GenarateMemo	
public String GenarateMemo (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
	if(mTab.getRecord_ID() == -1) return "";
	
	if(ADialog.ask(WindowNo, null, "Create Certificate", "Are you sure?")){
	MSequence mSequenceMemo = new MSequence(ctx, HardCoded.MemoDocSequence_ID, mTab.getTrxInfo());
	MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
	String prefix,sufix;
	
	if(mSequenceMemo.getPrefix()== null) {
		prefix="";
	}else {
		prefix=mSequenceMemo.getPrefix();
	}
	
	if(mSequenceMemo.getSuffix()== null) {
		sufix="";
	}else {
		sufix=mSequenceMemo.getSuffix();
	}
	
	
	mcValuationCertificate.setDocumentNoMemo(prefix + String.valueOf(mSequenceMemo.getCurrentNext()) + sufix);
	mcValuationCertificate.save();
	mSequenceMemo.setCurrentNext(mSequenceMemo.getCurrentNext() + 1);
	mSequenceMemo.save();
	}
	mTab.dataRefresh(true);
	return "";
	}

//org.topra.callouts.CretifiNumbers.GenaratePhoto
public String GenaratePhoto (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
	if(mTab.getRecord_ID() == -1) return "";
	
	if(ADialog.ask(WindowNo, null, "Create Certificate", "Are you sure?")){
	MSequence mSequencePhoto = new MSequence(ctx, HardCoded.PhotoCertificateDocSequence_ID, mTab.getTrxInfo());
	MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
	String prefix,sufix;
	
	if(mSequencePhoto.getPrefix()== null) {
		prefix="";
	}else {
		prefix = mSequencePhoto.getPrefix();
	}
	
	if(mSequencePhoto.getSuffix()== null) {
		sufix="";
	}else {
		sufix=mSequencePhoto.getSuffix();
	}
	
	
	mcValuationCertificate.setDocumentNoPhoto( prefix + String.valueOf(mSequencePhoto.getCurrentNext()) + sufix);
	mcValuationCertificate.save();
	mSequencePhoto.setCurrentNext(mSequencePhoto.getCurrentNext() + 1);
	mSequencePhoto.save();
	}
	
	mTab.dataRefresh(true);
	return "";
	}

//org.topra.callouts.CretifiNumbers.GenarateDeatailed
public String GenarateDeatailed (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
	if(mTab.getRecord_ID() == -1) return "";
	
	if(ADialog.ask(WindowNo, null, "Create Certificate", "Are you sure?")){
	MSequence mSequenceDetailed = new MSequence(ctx, HardCoded.DetailedCertificateDocSequence_ID, mTab.getTrxInfo());
	MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
	String prefix,sufix;
	
	System.out.println("efw");
	if(mSequenceDetailed.getPrefix()== null) {
		prefix="";
	}else {
		prefix=mSequenceDetailed.getPrefix();
	}
	
	if(mSequenceDetailed.getSuffix()== null) {
		sufix="";
	}else {
		sufix=mSequenceDetailed.getSuffix();
	}
	
	mcValuationCertificate.setDocumentNoDetail(prefix + String.valueOf(mSequenceDetailed.getCurrentNext()) + sufix);
	mcValuationCertificate.save();
	mSequenceDetailed.setCurrentNext(mSequenceDetailed.getCurrentNext() + 1);
	mSequenceDetailed.save();
	}
	
	
	mTab.dataRefresh(true);
	return "";
	}


//org.topra.callouts.CretifiNumbers.GenaratePhotoMemo	
public String GenaratePhotoMemo (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value){
	
	if(mTab.getRecord_ID() == -1) return "";
	
	if(ADialog.ask(WindowNo, null, "Create Certificate", "Are you sure?")){
	MSequence mSequenceMemoPhoto = new MSequence(ctx, HardCoded.MemoPhotoDocSequence_ID, mTab.getTrxInfo());
	MCValuationCertificate mcValuationCertificate = new MCValuationCertificate(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());
	String prefix,sufix;
	
	if(mSequenceMemoPhoto.getPrefix()== null) {
		prefix="";
	}else {
		prefix=mSequenceMemoPhoto.getPrefix();
	}
	
	if(mSequenceMemoPhoto.getSuffix()== null) {
		sufix="";
	}else {
		sufix=mSequenceMemoPhoto.getSuffix();
	}
	
	
	mcValuationCertificate.setDocumentNoPhotoMemo(prefix + String.valueOf(mSequenceMemoPhoto.getCurrentNext()) + sufix);
	mcValuationCertificate.save();
	mSequenceMemoPhoto.setCurrentNext(mSequenceMemoPhoto.getCurrentNext() + 1);
	mSequenceMemoPhoto.save();
	}
	mTab.dataRefresh(true);
	return "";
	}

}
