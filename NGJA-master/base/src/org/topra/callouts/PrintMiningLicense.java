package org.topra.callouts;


import java.awt.Desktop;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.logging.Level;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.JobName;
import net.sf.jasperreports.engine.export.HtmlExporter;
import org.adempiere.exceptions.AdempiereException;
import org.adempiere.exceptions.DBException;
import org.compiere.apps.ADialog;
import org.compiere.db.CConnection;
import org.compiere.interfaces.MD5;
import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MAttachment;
import org.compiere.model.MAttachmentEntry;
import org.compiere.model.MProcess;
import org.compiere.model.MTab;
import org.compiere.model.PrintInfo;
import org.compiere.model.X_AD_PInstance_Para;
import org.compiere.print.MPrintFormat;
import org.compiere.print.PrintUtil;
import org.compiere.print.ServerReportCtl;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.report.JRViewerProvider;
import org.compiere.report.ReportStarter;
import org.compiere.report.SwingJRViewerProvider;
import org.compiere.report.ReportStarter.JasperData;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DigestOfFile;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Language;
import org.compiere.util.Trx;
import org.compiere.util.Util;
import org.topra.model.HardCoded;
import org.topra.model.MCGemMining;
import org.topra.model.MCValuationCertificate;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.view.JasperViewer;

public class PrintMiningLicense extends CalloutEngine {

	private static JasperPrint jasperPrint;
	private File reportFile = null;
	private ProcessInfo processInfo;
	private MAttachment attachment;

	public String startProcess(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		
		if (mTab.getRecord_ID() == -1)
			return "";

		if(ADialog.ask(WindowNo, null, "Print Confirmation", "Do I print this?")){
		int table_ID = 1000036;
		int record_ID = mTab.getRecord_ID();
		MCGemMining licence = new MCGemMining(ctx, record_ID, mTab.getTrxInfo());
		ProcessInfo pi = new ProcessInfo("Mining Certificate", 1000086, table_ID, record_ID);
		pi.setAD_User_ID(Env.getAD_User_ID(ctx));
		pi.setAD_Client_ID(Env.getAD_Client_ID(ctx));
		String Name = pi.getTitle();
		File reportFile = null;
		int Record_ID = mTab.getRecord_ID();
		HashMap<String, Object> params = new HashMap<String, Object>();

		System.out.println("getReportData(pi, mTab.getTrxInfo())                ========= "
				+ getReportData(pi, mTab.getTrxInfo()));
		reportFile = downloadAttachment(getReportData(pi, mTab.getTrxInfo()), pi.getAD_Process_ID(), ctx, mTab);

		//
		JasperReport jasperReport = processReport(reportFile);
		// Validate and do it

		if (Record_ID > 0) {
			params.put("RECORD_ID", new Integer(Record_ID));
			params.put("Record_ID", new Integer(Record_ID));
		}

		Connection conn = null;

		try {
			conn = getConnection();
			jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);
			if(jasperPrint != null) {
				
				JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\Users\\Public\\Documents\\MyJasperReport.html");
				File htmlFile = new File("C:\\Users\\Public\\Documents\\MyJasperReport.html");
				Desktop.getDesktop().browse(htmlFile.toURI());
				licence.setPrinted(true);
				licence.save();
				System.out.println(
						"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			}
			
		} catch (JRException e) {
			log.severe("ReportStarter.startProcess: Can not run report - " + e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}}
		return "";
	}

	protected Connection getConnection() {
		return DB.getConnectionRW();
	}

	private File downloadAttachment(String reportPath, int AD_Process_ID, Properties ctx, GridTab mTab) {

		String name = reportPath.substring("attachment:".length()).trim();
		MProcess process = new MProcess(ctx, AD_Process_ID, mTab.getTrxInfo());

		attachment = process.getAttachment();
		if (attachment != null) {
			MAttachmentEntry[] entries = attachment.getEntries();
			MAttachmentEntry entry = null;
			for (int i = 0; i < entries.length; i++) {
				if (entries[i].getName().equals(name)) {
					entry = entries[i];
					break;
				}
			}
			if (entry != null) {
				reportFile = getAttachmentEntryFile(entry);
			}
		}
		return reportFile;
	}

	protected JasperReport processReport(File reportFile) {
		log.info("reportFile.getAbsolutePath() = " + reportFile.getAbsolutePath());
		JasperReport jasperReport = null;

		String jasperName = reportFile.getName();
		int pos = jasperName.indexOf('.');
		if (pos != -1)
			jasperName = jasperName.substring(0, pos);
		File reportDir = reportFile.getParentFile();

		// test if the compiled report exists
		File jasperFile = new File(reportDir.getAbsolutePath(), jasperName + ".jasper");
		if (jasperFile.exists()) { // test time
			if (reportFile.lastModified() == jasperFile.lastModified()) {
				log.info(" no need to compile use " + jasperFile.getAbsolutePath());
				try {
					jasperReport = (JasperReport) JRLoader.loadObject(jasperFile);
				} catch (JRException e) {
					log.severe("Can not load report - " + e.getMessage());
				}
			}

		}
		return jasperReport;
	}

	private File getAttachmentEntryFile(MAttachmentEntry entry) {
		String localFile = System.getProperty("java.io.tmpdir") + System.getProperty("file.separator")
				+ entry.getName();
		String downloadedLocalFile = System.getProperty("java.io.tmpdir") + System.getProperty("file.separator") + "TMP"
				+ entry.getName();
		File reportFile = new File(localFile);
		if (reportFile.exists()) {
			String localMD5hash = DigestOfFile.GetLocalMD5Hash(reportFile);
			String entryMD5hash = DigestOfFile.getMD5Hash(entry.getData());
			if (localMD5hash.equals(entryMD5hash)) {
				log.info(" no need to download: local report is up-to-date");
			} else {
				log.info(" report on server is different that local one, download and replace");
				File downloadedFile = new File(downloadedLocalFile);
				entry.getFile(downloadedFile);
				if (!reportFile.delete()) {
					throw new AdempiereException("Cannot delete temporary file " + reportFile.toString());
				}
				if (!downloadedFile.renameTo(reportFile)) {
					throw new AdempiereException("Cannot rename temporary file " + downloadedFile.toString() + " to "
							+ reportFile.toString());
				}
			}
		} else {
			entry.getFile(reportFile);
		}
		return reportFile;
	}

	public String getReportData(ProcessInfo pi, String trxName) {
		log.info("");
		String sql = "SELECT pr.JasperReport, pr.IsDirectPrint " + "FROM AD_Process pr " + "WHERE pr.AD_Process_ID = "
				+ pi.getAD_Process_ID();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DB.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY, trxName);
			rs = pstmt.executeQuery();
			String path = null;
			if (rs.next()) {
				path = rs.getString(1);

			} else {
				log.severe("data not found; sql = " + sql);
				return null;
			}

			return path;
		} catch (SQLException e) {
			throw new DBException(e, sql);
		} finally {
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;
		}
	}

}
