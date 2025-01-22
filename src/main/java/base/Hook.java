/*package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
	
	private static WebDriver driver;
	
		//	@Before
			public void setup()
			{
				if (driver == null) {
					
					WebDriverManager.chromedriver().setup();
					
					// Set ChromeOptions
					ChromeOptions options = new ChromeOptions();
					
					// Let OS choose free port
					options.addArguments("--remote-allow-origins=*"); 
			
					// Start ChromeDriver
					WebDriver driver = new ChromeDriver(options);
					driver.manage().window().maximize();
					driver.get("https://www.saucedemo.com/");
					
				}
				
			}
				
			
			
			//	@After
				public void tearDown()
				{
					if(driver != null)
					{
						driver.quit();
					}
				}
				
				public static WebDriver getDriver()
				{
					if (driver == null) {
			            throw new IllegalStateException("Driver not initialized. Did you forget to call setup()?");
			        }

					return driver;
				}
	
}
*/