package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Integration", 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = {"pretty", "html:./target/IntegrationTests.html", "json:./target/IntegrationTests.json", "junit:./target/IntegrationTests.xml" }, 
		monochrome = true)
public class IntegrationTests {
}
