package trainningProjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/bus-tickets");

		driver.findElement(By.id("txtSource")).click();

		driver.findElement(By.id("txtSource")).sendKeys("mum");
		Thread.sleep(2000);

		// javascipt DOM can extract hidden element
		// beacause selenium can not identitfied hiddeen element
		// investigate the properties o object if it has any hidden text

		// javascriptexecutor

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String srcCity = "return document.getElementsByClassName(\"D120_search_input_wrap\").item(0).getElementsByTagName(\"li\")";

		List<WebElement> list = (List<WebElement>) js.executeScript(srcCity);
		
	

		for (int i = 0; i < list.size(); i++)
		{
			String cityname = list.get(i).getText();

			if (cityname.equalsIgnoreCase("Andheri East, Mumbai"))
			{
				list.get(i).click();
				break;
			}

		}
		
		
		driver.findElement(By.id("txtDestination")).click();
		driver.findElement(By.id("txtDestination")).sendKeys("pune"); //Kharadi, Pune
		Thread.sleep(3000);
		
		String destCity = "return document.getElementsByClassName(\"D120_search_input_wrap\").item(1).getElementsByTagName(\"li\")";	
		
	List<WebElement> destCityList = (List<WebElement>) js.executeScript(destCity);
	

	
	for(int j=0 ; j < destCityList.size() ; j++)
	{
		String destinationCityName = destCityList.get(j).getText();
		
		System.out.println(destinationCityName);
		
		
		
		if(destinationCityName.equalsIgnoreCase("Wakad, Pune"))
		{
			
			destCityList.get(j).click();
			break;
		}
		
	}
		
		
		
		
		
		
		

	}

}
