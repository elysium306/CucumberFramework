package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true,
		features="./src/test/resources/features/demosites",
		glue="steps",
		plugin = {"pretty", "html:./reports/demosites_pretty.html", "json:./reports/demosites_pretty.json"},
		monochrome = true)
public class DemositesTests {
}
