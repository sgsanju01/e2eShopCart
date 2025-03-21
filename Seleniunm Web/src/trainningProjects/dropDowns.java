package trainningProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropDowns {

public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");


driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000l);

/*Using for Loop
for (int i=1 ; i<4 ; i++)
{
driver.findElement(By.id("hrefIncAdt")).click();

}*/

//Using While loop 

int i=1;

while(i<4)
{
	driver.findElement(By.id("hrefIncAdt")).click();
	i++;
}



Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
Thread.sleep(2000l);


driver.findElement(By.id("btnclosepaxoption")).click();


/*Select drpDown = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']")));
drpDown.selectByValue("AED");
*/
		
		
	}

}
