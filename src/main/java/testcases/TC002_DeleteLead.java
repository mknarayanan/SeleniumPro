package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.LeafTapsWrappers;

public class TC002_DeleteLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValues(){
		testCaseName = "TC002";
		testDescription = "Delete Lead";
		browserName = "chrome";
		dataSheetName = "TC002";
		authors = "Babu";
		category = "smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String un, String pwd,
			String fn) {
		
		new LoginPage()
		.enterUserName(un)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fn)
		.clickFindLeads()
		.clickFirstLead()
		.clickDelete();
		
		
		
		
	}
}
