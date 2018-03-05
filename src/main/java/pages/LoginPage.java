package pages;

import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers{
	
	public LoginPage(){
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Login Page", "FAIL");
		}
	}
	
	public LoginPage enterUserName(String uname){
		enterById("username", uname);
		return this;
	}
	
	public LoginPage enterPassword(String data){
		enterByName("PASSWORD", data);
		return this;
	}
	
	public HomePage clickLogin(){
		clickByClassName("decorativeSubmit");		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	

}
