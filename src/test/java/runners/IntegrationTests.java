package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Integration", 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = { "pretty", "html:reports/integration_pretty.html", "json:reports/integration_pretty.json" }, 
		monochrome = true)
public class IntegrationTests {
}
