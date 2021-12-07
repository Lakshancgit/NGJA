package org.topra.callouts;

import java.util.Properties;
import org.compiere.apps.ADialog;
import org.compiere.apps.ProcessCtl;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MProcess;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Env;
import org.topra.model.HardCoded;
import org.topra.model.MCReceivingNote;

//org.topra.callouts.PrintReceivingNote.processIt

public class PrintReceivingNote extends CalloutEngine {

	public void processIt(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {

		if (mTab.getRecord_ID() == -1)
			return;

		MCReceivingNote mcReceivingNote = new MCReceivingNote(ctx, mTab.getRecord_ID(), mTab.getTrxInfo());

		if (ADialog.ask(WindowNo, null, "Print Confirmation", "Do I print this?")) {

			int Process_ID;

			if (mcReceivingNote.getC_DocType_ID() == HardCoded.JewelleryReceivingDocType_ID) {
				Process_ID = HardCoded.RecievingNoteAssayReportProcess_ID;
			} else {
				Process_ID = HardCoded.RecievingNoteReportProcess_ID;
			}
			MProcess process = new MProcess(ctx, Process_ID, mTab.getTrxInfo());
			int table_ID = 1000003;
			int record_ID = mcReceivingNote.get_ID();
			ProcessInfo processInfo = new ProcessInfo("Receiving Note", Process_ID, table_ID, record_ID);
			processInfo.setAD_User_ID(Env.getAD_User_ID(ctx));
			processInfo.setAD_Client_ID(Env.getAD_Client_ID(ctx));
			processInfo.setPrintPreview(!process.isDirectPrint());
			ProcessCtl.process(null, mTab.getWindowNo(), processInfo, null);
			mcReceivingNote.setProcessed(true);
			mcReceivingNote.isPrinted();
			mcReceivingNote.save();
			mTab.dataRefresh(true);
			return;
		}
	}
}
