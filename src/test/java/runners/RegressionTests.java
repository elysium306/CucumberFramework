package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@Regression",
		features="./src/test/resources/features",
		glue="steps",
		plugin = {"pretty", "html:./target/cucumber-reports/RegressionTests.html", "json:./target/cucumber-reports/RegressionTests.json", "junit:./target/cucumber-reports/RegressionTests.xml" },
		monochrome = true)
public class RegressionTests {
}
