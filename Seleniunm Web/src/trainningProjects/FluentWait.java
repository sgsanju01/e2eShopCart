/*package trainningProjects;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver(); // ChromeDriver is a class which is implement in WebDrier interface
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/progress-bars-sync.html");
		
		//wait is interaface , fluentwait is a class which is implement in wait interface 
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath("//*[text()='Stopped']"));
			}
		});
	}

}
*/