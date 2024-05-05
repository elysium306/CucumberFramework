package steps;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Driver;

public class Hooks {

	@Before
	public void setUp() {
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Driver.getDriver().manage().window().maximize();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "./reports/screenshot/screenshot");
		}
		Driver.quitDriver();
	}

}
