package trainningProjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkClickWithOptimazationCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver(); // ChromeDriver is a class which is implement in WebDrier interface
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		/*//Test cases : 
		 * 1. give me the all links count 
		 * 2. 
*/	
		
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		/*taking all the links available on the page */
		System.out.println("Total count of link text =  "+ driver.findElements(By.tagName("a")).size()); 
		
		
		/*taking all the links available on the Footer */
		WebElement footerDriver = driver.findElement(By.className("footer"));
		
		 System.out.println("Footer links are = "+ footerDriver.findElements(By.tagName("a")).size());
		
		 /*taking all the links available from the Footer of first column */
		 
		WebElement firstColumn = footerDriver.findElement(By.xpath("//footer/div/div[1]"));
		List<WebElement> columnSize = firstColumn.findElements(By.tagName("a"));

		System.out.println(firstColumn.getText());

		/* Click on the each link in first column */

		for (int i = 1; i < firstColumn.findElements(By.tagName("a")).size(); i++)

		{
			String clicktoOpenInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clicktoOpenInNewTab);
			Thread.sleep(3000);
		}
		
		
		Set<String> win = driver.getWindowHandles();
		Iterator<String> windID = win.iterator();
		int counter = 1;
		while(windID.hasNext())
			
		{
			driver.switchTo().window(windID.next());
			System.out.println(counter + driver.getTitle());
			counter++;
		}
		
		
		
		
		
		

	}

}
