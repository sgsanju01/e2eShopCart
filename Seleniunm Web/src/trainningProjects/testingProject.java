package trainningProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingProject {

	public static void main(String[] args) {

		//System.out.println("test");
		
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

		//driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
		/*String pageTitle = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current Page Title is : " + pageTitle);
		System.out.println("My current url is : " + currentURL);
		
		driver.get("https://testpages.herokuapp.com/styled/index.html");
		*/
		
		//Synatax of Xpath : //tagname[@attribute='value'] - Xpath
		//driver.findElement(By.xpath("//a[@href='/test']")).click();
		
		//Syntax of CSS : tagName[attribute='value'] 
		
		//driver.findElement(By.cssSelector("a[href='/test]")).click();
		
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.xpath("//span[@id='fsr']/a[1]")).click();
		//driver.close();
		
		
	}

}
