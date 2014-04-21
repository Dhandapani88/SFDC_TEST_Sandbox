package com.sample.automation.data;

import org.testng.annotations.DataProvider;



public class SfdcDataProvider {

	@DataProvider(name = "logindetails")
	public static Object[][] extract() throws Exception{
      
		TableData l=new TableData();
		Object[][] retObjArr=l.getTableArray("D:\\Allegis\\RWS_Saleforce\\InfoStretch_Test_Automation_Framework\\SampleTestAutomationProject\\resources\\data\\testdata.xls",
              "userlogin", "Credentials");
      return(retObjArr);
	}
}