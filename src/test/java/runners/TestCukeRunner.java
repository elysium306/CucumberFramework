package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false, 
		tags = "@DPDemo", 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = {
		"pretty", "html:./target/cucumber-reports/TestCukeRunner.html",	"json:./target/cucumber-reports/TestCukeRunner.json",
		"junit:./target/cucumber-reports/TestCukeRunner.xml" }, 
		monochrome = true)
public class TestCukeRunner {

	// dryRun = we are telling to cucumber to run only the scenario steps, not the
	// implementation

}
