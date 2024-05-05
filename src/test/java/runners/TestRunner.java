package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@UpdateTradeWithDatatable", 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = {
		"pretty", "html:Reports/htmlReport.html", "json:Reports/jsonReport.json" }, 
		monochrome = true)
public class TestRunner {

	// dryRun = we are telling to cucumber to run only the scenario steps, not the
	// implementation

}
