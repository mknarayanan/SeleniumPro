package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValues(){
		testCaseName = "TC001";
		testDescription = "Create Lead";
		browserName = "chrome";
		dataSheetName = "TC001";
		authors = "Babu";
		category = "smoke";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String un, String pwd, String cn, 
			String fn, String ln) {
		
		new LoginPage()
		.enterUserName(un)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cn)
		.enterFirstName(fn)
		.enterLastName(ln)
		.clickCreateLead()
		.verifyFirstName(fn);		
		
		
		
		
	}
}
