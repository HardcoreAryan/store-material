package com.StepDefination;

import com.pages.loginpage;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagesteps {

	loginpage login = new loginpage();
	
	
	

@Given("user launch site url")
public void user_launch_site_url() {
  
	
}

@When("user enter username and password")
public void user_enter_username_and_password() {
	   login.enterUserAndPassword();
}

@When("user click on login button")
public void user_click_on_login_button() {
	 login.clickOnLoginBtn();
}

@Then("validate user is sucessfully loggedIn")
public void Validate_user_is_sucessfully_logged_In() {
	   
}
	
	
	
	
}
