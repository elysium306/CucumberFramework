package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true, 
		features = "src/test/resources/features/demosites/login.feature", 
		glue = "steps", 
		plugin = {"pretty", "html:./target/DryRunner.html", "json:./target/DryRunner.json", "junit:./target/DryRunner.xml" }, 
		monochrome = true)
public class TestDryRunner {
	// steps
}
