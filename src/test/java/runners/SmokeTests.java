package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@SmokeTest", 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = { "pretty",
		"html:./target/cucumber-reports/SmokeTests.html", "json:./target/cucumber-reports/SmokeTests.json",
		"junit:./target/cucumber-reports/SmokeTests.xml" }, 
		monochrome = true)
public class SmokeTests {
}
