package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {

	private WebDriver driver;
	
	
		public Products(WebDriver driver)
		{
			this.driver=driver;
		}
		
		
		By addtocartLocator = By.xpath("(//button[text()='Add to cart'])");
		By cartLinkBtn = By.cssSelector("a.shopping_cart_link");
		
		
		
		public void addItemToCard(List<Integer> itemIndex)
		{
			for (int index : itemIndex)
			{
				By specificAddToCartlocator = By.xpath("(//button[text()='Add to cart'])[" + index + "]");
				driver.findElement(specificAddToCartlocator).click();
				
			}
			
		}
		
		public void clickCartBtn()
		{
			driver.findElement(cartLinkBtn).click();
		}
		
}
