package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.utilities.XlUtils;

public class TC_LoginDDT_002 extends BaseClass {
	
	@Test
	public void loginDDT() {
		
	}
	
	@DataProvider(name="LoginData")
	void getData() throws IOException {
		
		String path = System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
				
		int rowNum = XlUtils.getRowCount(path, "Sheet1");
		int colCount = XlUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][] = new String[rowNum][colCount];
		
		for(int i=1;i<=rowNum;i++) {
			
			
		}
		
	}
	

}
