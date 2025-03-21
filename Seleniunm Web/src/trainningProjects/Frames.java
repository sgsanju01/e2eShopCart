package trainningProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver(); // ChromeDriver is a class which is implement in WebDrier interface
		driver.manage().window().maximize();
		
		
		driver.get("https://testpages.herokuapp.com/styled/iframes-test.html");
		List <WebElement> frame = driver.findElements(By.tagName("iframe")); //taking all frames using tagname 
		
		System.out.println(frame.size()); //getting the size of all the frames 
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='thedynamichtml']"))); //need to focus on first frame 
		System.out.println(driver.findElement(By.xpath("//h1[text()='iFrame']")).getText()); //getting header text from inside the first frame
		
		driver.switchTo().defaultContent(); //need get back focus on default page because it'll not get set direct focus on second frame 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='theheaderhtml']"))); //setting the focus inside the second frames 
		System.out.println(driver.findElement(By.xpath("//h1[text()='Nested Page Example']")).getText()); //getting the text from second frames 
		
		
		
	
		
		
		
		/*driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		Actions a = new Actions(driver); //need to declare action class to use drag and drop properties 
		
		WebElement source =  driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();*/
		
		
		
		
		
		
	}

}
