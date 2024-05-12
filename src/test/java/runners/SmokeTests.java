package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@SmokeTest", 
		features = "./src/test/resources/features", 
		glue = "steps", 
				plugin = {"pretty", "html:./target/SmokeTests.html", "json:./target/SmokeTests.json", "junit:./target/SmokeTests.xml" }, 
		monochrome = true)
public class SmokeTests {
}
