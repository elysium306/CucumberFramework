package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features = "./src/test/resources/features", 
		glue = "steps", 
		plugin = {"pretty", "html:./target/TestCukeRunner.html", "json:./target/TestCukeRunner.json", "junit:./target/TestCukeRunner.xml" }, 
		monochrome = true)
public class TestCukeRunner {

	// dryRun = we are telling to cucumber to run only the scenario steps, not the
	// implementation

}
