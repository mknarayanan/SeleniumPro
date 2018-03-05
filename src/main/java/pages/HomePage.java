package pages;

import wrappers.LeafTapsWrappers;

public class HomePage extends LeafTapsWrappers{
	
	public HomePage(){
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	
	public MyHomePage clickCRMSFA(){
		clickByLink("CRM/SFA");
		return new MyHomePage();
	}
	
	
	
	
	
	
	
	
	

}
