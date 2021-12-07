package org.topra.smartbrowse;

import java.util.Properties;

import org.compiere.model.GridField;
import org.eevolution.grid.BrowserCallOutEngine;
import org.eevolution.grid.BrowserRow;

//org.topra.smartbrowse.TestSmartBrowse.calSum
public class TestSmartBrowse extends BrowserCallOutEngine{
	
	public String calSum(Properties ctx,  int WindowNo, BrowserRow row, 
			GridField field, Object value, Object oldValue,int currentRow, int currentColumn) {
		
		System.out.println("TestSmartBrowse");
		
		return "";
	}

}
