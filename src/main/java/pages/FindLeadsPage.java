package pages;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers{
	
	public FindLeadsPage(){
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Leads Page", "FAIL");
		}
	}
	
	public FindLeadsPage enterFirstName(String data){
		enterByXpath("(//*[@name='firstName'])[3]", data);
		return this;
	}
	
	
	public FindLeadsPage clickFindLeads(){
		clickByXpath("//button[text()='Find Leads']");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public ViewLeadPage clickFirstLead(){
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		return new ViewLeadPage();
	}	
	
	
	

}
