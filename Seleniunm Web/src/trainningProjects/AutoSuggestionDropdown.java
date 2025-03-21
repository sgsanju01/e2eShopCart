package trainningProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		
				
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		/*driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("AHM");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("AUR");
		*/

		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		//Select searchDropdown = new Select(driver.findElement(By.id("country")));
		WebElement searchDropdown = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		searchDropdown.click();
		
		WebElement searchDropdown1 = driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown'] //input[@class='select2-search__field']"));
				searchDropdown1.sendKeys("a");
		searchDropdown1.sendKeys(Keys.ENTER);
		
	}

}
