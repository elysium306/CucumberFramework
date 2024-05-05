package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Smoke",
		features="./src/test/resources/features/DemoBlaze.feature",
		glue="steps",
		plugin = {"pretty", "html:./reports/smoke_pretty.html", "json:./reports/smoke_pretty.json"},
		monochrome = true)
public class DemoBlazeTests {
}
