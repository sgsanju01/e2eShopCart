package pages;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage {
	
	private WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By getTitle = By.cssSelector("span.title");
	By checkOut = By.cssSelector("#checkout");
	
	
	public  void getCartTitlePage()
	{
		String actualtitleOfCart = driver.findElement(getTitle).getText();
		System.out.println("Title of the cart page is : " + actualtitleOfCart );
		
		String expectedTitleOfCart = "Your Cart";
		
		Assert.assertEquals(actualtitleOfCart, expectedTitleOfCart);
	}
	
	public void clickOnCheckOutBtn()
	{
		driver.findElement(checkOut).click();
	}

}
