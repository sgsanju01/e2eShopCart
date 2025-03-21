package trainningProjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\sanjay\\project\\ChromeDriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		int j = 0;

		String[] vegName = { "Brocolli", "Cucumber" }; // Adding products name
														// in array list

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise"); // launch
																			// the
																			// site

		Thread.sleep(5000); // sleep for 5 sec

		// using here WebElement
		// taking cssSelector using productname

		List<WebElement> productName = driver.findElements(By.cssSelector("h4.product-name")); // taking
																								// the
																								// name
																								// of
																								// product

		for (int i = 0; i < productName.size(); i++) // taking loop to iterate
														// to total 30 product

		{
			// Brocolli - 1 kg

			String[] spilitString = productName.get(i).getText().split("-"); // here
																				// spilitString[0]
																				// =
																				// Brocolli
																				// and
																				// spilitString[1]
																				// =
																				// 1
																				// kg
			String formatedNames = spilitString[0].trim(); // Trim method used
															// to reduce the
															// space after the
															// brocolli

			// String productVegName = productName.get(i).getText(); //grab the
			// all product text
			List vegNameList = Arrays.asList(vegName);

			if (vegNameList.contains(formatedNames)) {
				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == 2) {
					break;
				}
			}

		}

	}

}
