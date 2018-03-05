package pages;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers{
	
	public CreateLeadPage(){
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}
	}
	
	public CreateLeadPage enterCompanyName(String data){
		enterById("createLeadForm_companyName", data);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String data){
		enterById("createLeadForm_firstName", data);
		return this;
	}
	
	public CreateLeadPage enterLastName(String data){
		enterById("createLeadForm_lastName", data);
		return this;
	}
	
	
	public ViewLeadPage clickCreateLead(){
		clickByName("submitButton");
		return new ViewLeadPage();
	}
	
	
	
	
	

}
