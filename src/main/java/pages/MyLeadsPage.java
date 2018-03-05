package pages;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers{
	
	public MyLeadsPage(){
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not My Leads Page", "FAIL");
		}
	}
	
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLeads(){
		clickByLink("Find Leads");
		return new FindLeadsPage();
	}
	
	
	
	
	
	
	
	
	

}
