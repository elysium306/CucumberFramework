package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Integration", 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = {"pretty", "html:./target/cucumber-reports/IntegrationTests.html", "json:./target/cucumber-reports/IntegrationTests.json", "junit:./target/cucumber-reports/IntegrationTests.xml" }, 
		monochrome = true)
public class IntegrationTests {
}
