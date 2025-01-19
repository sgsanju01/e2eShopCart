package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginStep {

	WebDriver driver;
	LoginPage loginPage;

	@Given("I launch the SauceDemo application")
	public void i_launch_the_sauce_demo_application() {
		System.out.println("****Launching the browser***");

		WebDriverManager.chromedriver().clearDriverCache().setup();

		// Set ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); // Let OS choose free port

		// Start ChromeDriver
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		loginPage = new LoginPage(driver);

	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String username, String password) {

		// initiate login page object

		loginPage.addUserNameAndPassword(username, password);
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
