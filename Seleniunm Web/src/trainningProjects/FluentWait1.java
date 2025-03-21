package trainningProjects;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver(); // ChromeDriver is a class which is implement in WebDrier interface
		driver.manage().window().maximize();
		
		
		driver.get("https://testpages.herokuapp.com/styled/progress-bars-sync.html");
		
		WebElement status = driver.findElement(By.id("progressbar2"));
		WebElement status1 = driver.findElement(By.id("status"));
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(40))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {

				if (status1.getText().equals("Stopped")) {
			
					System.out.println(status);
					System.out.println(status.getAttribute("value"));
					System.out.println(status1.getText());
					return status1;
				} else {
					return null;

				}
			}
		});
		WebElement status3 = driver.findElement(By.id("status"));
		System.out.println(status.getAttribute("value"));
		System.out.println(foo.getAttribute("value"));
		System.out.println(status3.getText());
	
		
	}

}
