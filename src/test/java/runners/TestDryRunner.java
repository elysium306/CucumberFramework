package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true, 
		features = "src/test/resources/features/demoFeatures", 
		glue = "steps", 
		plugin = {"pretty", "html:./target/cucumber-reports/DryRunner.html", "json:./target/cucumber-reports/DryRunner.json", "junit:./target/cucumber-reports/DryRunner.xml" }, 
		monochrome = true)
public class TestDryRunner {
	// steps
}
