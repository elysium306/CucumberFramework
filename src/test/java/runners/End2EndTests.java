package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@End2End", 
		features = "./src/test/resources/features", 
		glue = "steps", 
				plugin = {"pretty", "html:./target/cucumber-reports/End2EndTests.html", "json:./target/cucumber-reports/End2EndTests.json", "junit:./target/cucumber-reports/End2EndTests.xml" }, 
		monochrome = true)
public class End2EndTests {
}
