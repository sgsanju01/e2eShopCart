package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Defining locators name of LoginPage
	By loginUsernameLocator = By.cssSelector("#user-name");
	By loginPasswordLocator = By.cssSelector("#password");
	By loginBtnLocator = By.cssSelector("#login-button");
	
	//Defining methods for login Page
	
	//adding username and password field
	public void addUserNameAndPassword(String username, String password)
	{
		driver.findElement(loginUsernameLocator).sendKeys(username);
		driver.findElement(loginPasswordLocator).sendKeys(password);
	}
	
	//click on login button
	public void clickLoginBtn()
	{
		driver.findElement(loginBtnLocator).click();
	}

	public void pageTitle()
	{
		String pageTitle = driver.getTitle();
		System.out.println("Current Page Title is : " + pageTitle);
	}
}
