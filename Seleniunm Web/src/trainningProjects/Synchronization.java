package trainningProjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

		
		
driver.get("https://testpages.herokuapp.com/styled/progress-bars-sync.html");
WebDriverWait w = new WebDriverWait(driver, 20); // Using of explicit wait 

List<WebElement> n  = driver.findElements(By.xpath("//progress[@value='100']"));

w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Stopped']")));
		
		//WebElement status = driver.findElement(By.xpath("//p[@id='status']"));
		
		
		System.out.println(driver.findElement(By.xpath("//p[@id='status']")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
		WebDriverWait w = new WebDriverWait(driver, 10); // Using of explicit wait 
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //using of implicit wait 
		
		
		w.until(ExpectedConditions.elementToBeClickable(By.id("button00"))); 
				
		driver.findElement(By.id("button00")).click(); 
		
		w.until(ExpectedConditions.elementToBeClickable(By.id("button01"))); 
		
		driver.findElement(By.id("button01")).click(); 
		
		
       w.until(ExpectedConditions.elementToBeClickable(By.id("button02"))); 
		
		driver.findElement(By.id("button02")).click(); 
		
		 w.until(ExpectedConditions.elementToBeClickable(By.id("button03"))); 
			
			driver.findElement(By.id("button03")).click(); 
		
		
		System.out.println(driver.findElement(By.id("buttonmessage")).getText());
		*/
	}

}
