package trainningProjects;



import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyAddToCartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		        
		String[] productCollectoinName  =
			{
				"HTML5 Forms",
				"HTML5 WebApp Develpment",
				"JS Data Structures and Algorithm",
				"Mastering JavaScript",
				"Selenium Ruby",
				"Thinking in HTML" };
		
		driver.get("http://practice.automationtesting.in/shop/"); //launch the site
		
		Thread.sleep(3000);
		List<WebElement> productname = driver.findElements(By.tagName("h3"));
		
		
		for(int j=0; j<productCollectoinName.length; j++)
		{
			for (int i=0; i<productname.size() ; i++)
			{
				
			
				String finalName = productname.get(i).getText();
				System.out.println(finalName);
				
				//List prodcutCollectionList = Arrays.asList(productCollectoinName); 
				
				if(finalName.equals(productCollectoinName[j]))
				{
					
					driver.findElements(By.cssSelector("a.button,product_type_simple add_to_cart_button,ajax_add_to_cart")).get(i).click();		
				}
				
				
		}
		
			
			
		}
		
		//System.out.println(productname);

	}

}
