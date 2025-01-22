package steps;


import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.*;

import pages.LoginPage;

public class LoginStep {

	WebDriver driver;
	LoginPage loginPage;
	BaseClass baseClass;
	
	
				@Given("I launch the SauceDemo application")
				public void i_launch_the_sauce_demo_application() {
					
					baseClass = new BaseClass();
					driver = baseClass.initializeDriver();
					loginPage = new LoginPage(driver);
					
			
				}
			
				@When("I enter username {string} and password {string}")
				public void i_enter_username_and_password(String username, String password) {
			
						loginPage.addUserName(username);
						loginPage.addUserdPassword(password);
						
				}
			
				@When("I click on the login button")
				public void i_click_on_the_login_button() {
			
						loginPage.clickLoginBtn();
				}
			
				@Then("I should be redirected to the inventory page")
				public void i_should_be_redirected_to_the_inventory_page() {
					
						loginPage.pageTitle();
			
				}

}
