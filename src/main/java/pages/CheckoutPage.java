package pages;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	private WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	By fName = By.cssSelector("#first-name");
	By lName = By.cssSelector("#last-name");
	By pinCode = By.cssSelector("#postal-code");
	By continueBtn = By.cssSelector("#continue");

	By checkOutPageTitle = By.cssSelector("span.title");

	public void enterFirstName(String firstName)

	{
		driver.findElement(fName).sendKeys(firstName);
	}

	public void enterLastName(String lastName)

	{
		driver.findElement(lName).sendKeys(lastName);
	}

	public void enterPostalCode(String postalCode)

	{
		driver.findElement(pinCode).sendKeys(postalCode);

	}

	public void checkOutPageTitleText() {
		String actualTitle = driver.findElement(checkOutPageTitle).getText();

		String expectedTitle = "Checkout: Your Information";

		Assert.assertEquals(actualTitle, expectedTitle);

		System.out.println("Title of checkout overview page is " + actualTitle);

	}

	public void clickContinueBtn() {
		driver.findElement(continueBtn).click();
	}

}
