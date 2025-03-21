package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPaymentPage {

	private WebDriver driver;

	public CheckoutPaymentPage(WebDriver driver) {
		this.driver = driver;
	}

By titleOfCheckoutOverview = By.cssSelector("span.title");
By price_total = By.xpath("//div[text()='Price Total']");

By sub_total = By.cssSelector("div.summary_subtotal_label");
By tax_amount = By.cssSelector("div.summary_tax_label");
By total_amount = By.cssSelector("div.summary_total_label");
By finish_btn = By.cssSelector("#finish");

	public void checkOutOverview()

	{
		String actualCheckoutOverviewTitle = driver.findElement(titleOfCheckoutOverview).getText();

		String expectedCheckoutOverViewTitle = "Checkout: Overview";

		Assert.assertEquals(actualCheckoutOverviewTitle, expectedCheckoutOverViewTitle);

	}

	public void checkOutAmount() {
		String totalPriceSummary = driver.findElement(price_total).getText();

		System.out.println("-----" + totalPriceSummary + " Amount Summary------");

		String subTotal = driver.findElement(sub_total).getText();

		System.out.printf("%-15s  %10s%n", "Sub Total :  ", subTotal.replaceAll("[^0-9$]", ""));

		String taxAmount = driver.findElement(tax_amount).getText();

		System.out.printf("%-15s  %10s%n", "Tax amount :  ", taxAmount.replaceAll("[^0-9$]", ""));

		String totalAmount = driver.findElement(total_amount).getText();

		System.out.printf("%-15s  %10s%n", "Total Amount : ", totalAmount.replaceAll("[^0-9$]", ""));

	}
	
	public void clickOnFinishBtn()
	{
		driver.findElement(finish_btn).click();
	}

}
