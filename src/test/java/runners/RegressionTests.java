package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@Regression",
		features="./src/test/resources/features",
		glue="steps",
		plugin = {"pretty", "html:./target/RegressionTests.html", "json:./target/RegressionTests.json", "junit:./target/RegressionTests.xml" },
		monochrome = true)
public class RegressionTests {
}
