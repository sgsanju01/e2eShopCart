package trainningProjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*click on starting
		 *  date of calendar */
		driver.findElement(By.cssSelector("input[placeholder='Start date']")).click();
		
		/*getting the
		 * month name from calendar*/
		WebElement monthName = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		
		/*Matching if month name is meet the expectation or not */
		
		while(!monthName.getText().contains("October"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		//driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		
		
		
		
		
		/*Taking days name and want to click on 16th july */ 
		
		List<WebElement> days = driver.findElements(By.className("day"));
		
		int daysize = days.size();
		
		for(int i=0 ; i<daysize ; i++)
		{
			
			String clickDays = days.get(i).getText();
			
			if(clickDays.equalsIgnoreCase("16"))
			{
			days.get(i).click();
			break;
			}
			
		}
		
		
		
		
	}

}
