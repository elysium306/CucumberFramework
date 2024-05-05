package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true, 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = {"pretty", "html:./reports/dryrun_pretty.html", "json:./reports/dryrun_pretty.json" }, 
		monochrome = true)
public class DryRunner {
}
