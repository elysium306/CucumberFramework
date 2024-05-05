package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@Regression",
		features="./src/test/resources/features",
		glue="steps",
		plugin = {"pretty", "html:reports/regression_pretty.html","json:reports/regression_pretty.json"},
		monochrome = true)
public class RegressionTests {
}
