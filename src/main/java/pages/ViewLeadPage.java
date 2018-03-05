package pages;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers{
	
	public ViewLeadPage(){
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}
	}
	
	public ViewLeadPage verifyFirstName(String text){
		verifyTextById("viewLead_firstName_sp", text);
		return this;
	}
	
	
	public MyLeadsPage clickDelete(){
		clickByLink("Delete");
		return new MyLeadsPage();
	}
	

}
