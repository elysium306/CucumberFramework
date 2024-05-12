package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
//		tags = "",
		features="./src/test/resources/features/demosites",
		glue="steps",
		plugin = {"pretty", "html:./target/DemositesTests.html", "json:./target/DemositesTests.json", "junit:./target/DemositesTests.xml" },
		monochrome = true)
public class DemositesTests {
}
