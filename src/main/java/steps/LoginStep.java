package steps;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.*;

import pages.LoginPage;
import pages.Products;

public class LoginStep {

	WebDriver driver;
	LoginPage loginPage;
	BaseClass baseClass;
	Products products;
	
	
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

				
				@When("I add the 1st and 4th items to the cart")
				public void i_add_the_1st_and_4th_items_to_the_cart() {
					products = new Products(driver);
					
					List<Integer> itemsToAdd = Arrays.asList(1,3);
					products.addItemToCard(itemsToAdd);
					
					
				}

				@When("I click cart button")
				public void i_click_cart_button() {
				    
				}

				@Then("I should be redirected to the Your Cart page")
				public void i_should_be_redirected_to_the_your_cart_page() {
				   
				}

				@When("I click on the Checkout button")
				public void i_click_on_the_checkout_button() {
				   
				}

				@Then("I should be checkout page")
				public void i_should_be_checkout_page() {
				   
				}

				@When("I fill up firstname {string} and lastname {string} and zipcode {int}")
				public void i_fill_up_firstname_and_lastname_and_zipcode(String string, String string2, Integer int1) {
				   
				}

				@When("click on the Continue button")
				public void click_on_the_continue_button() {
				    
				}

				@Then("I should on the Payment page")
				public void i_should_on_the_payment_page() {
				   
				}

				@Then("total price of purchased items")
				public void total_price_of_purchased_items() {
				  
				}

				@Then("click on Finish button")
				public void click_on_finish_button() {
				    
				}

				@Then("I should on the orderdaetails page")
				public void i_should_on_the_orderdaetails_page() {
				  
				}

}
