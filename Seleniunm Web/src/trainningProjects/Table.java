package trainningProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
		
		driver.findElement(By.xpath("//details/summary")).click();
		
		/*driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
		
		WebElement table = driver.findElement(By.cssSelector("table[id='mytable']"));
		
		List<WebElement> tagtotalRow = table.findElements(By.tagName("td"));
		
		int totalRow = tagtotalRow.size();
		System.out.println(totalRow);
		System.out.println(table.findElement(By.tagName("tbody")).getText());
		
		List <WebElement> columnvalue = table.findElements(By.xpath("//tbody/tr/td[2]"));
		
		int valueOfColumn = columnvalue.size();
		float sum=0;
		for(int i=0 ; i<valueOfColumn; i++)
		{
			String secondcolumnvalue = columnvalue.get(i).getText();
			System.out.println(secondcolumnvalue);
			sum= sum + Float.parseFloat(secondcolumnvalue);
			
		}
		
		System.out.println("Total value of column = "+ sum);
*/
	}

}
