package pages;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers{
	
	public MyHomePage(){
		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not My Home Page", "FAIL");
		}
	}
	
	public MyLeadsPage clickLeads(){
		clickByLink("Leads");
		return new MyLeadsPage();
	}
	
	
	
	
	
	
	
	
	

}
