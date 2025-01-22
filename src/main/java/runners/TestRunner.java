package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					features = "/e2eDemo/src/test/java/features" ,
					glue = {"steps"} , 
					plugin = {"pretty" , "html:target/cucumber-reports.html"} ,
					monochrome = true
					
				)

public class TestRunner {

}
