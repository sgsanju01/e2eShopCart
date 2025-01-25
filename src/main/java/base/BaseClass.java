package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
	
	
		public WebDriver initializeDriver()
		{
			WebDriverManager.chromedriver().clearDriverCache().setup();
	
			// Set ChromeOptions
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*"); // Let OS choose free port
	
			// Start ChromeDriver
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			return driver;
		}
	
	
		public void tearDown()
		{
			
			if(driver != null)
			{
				driver.quit();
			}
		}
}
