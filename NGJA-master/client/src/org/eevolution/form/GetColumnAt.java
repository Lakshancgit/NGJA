package org.eevolution.form;

//Author Chathuranga
//get the column index from data table 

import org.compiere.model.GridField;
import org.eevolution.grid.VBrowserTable;

public class GetColumnAt {
	
	public static int getColumnAt(VBrowserTable detail , String clumnName) {
		
		int i = 0;
		for (;i < detail.getModel().getColumnCount(); i++) {
			GridField gf = detail.getGridFieldAt(0, i);
			if(gf.getColumnName().equals(clumnName))
				return i;
		}
		
		return i;
	}
}
