package trainningProjects;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WndowClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver(); // ChromeDriver is a class which is implement in WebDrier interface
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		WebDriverWait w = new WebDriverWait (driver , 20);
		driver.findElement(By.partialLinkText("Follow On Twitt")).click();
		
		System.out.println(driver.getTitle());
		
		//Thread.sleep(5000);
		w.until(ExpectedConditions.titleContains("Selenium Easy (@seleniumeasy) / Twitter"));

		Set<String> ids = driver.getWindowHandles(); // now achieve all the
														// parent and child
														// window using
														// getWindowHandles()
														// method
		
		Iterator <String> it = ids.iterator();
		String patentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		
		System.out.println(driver.getTitle());
		
	}

}


























