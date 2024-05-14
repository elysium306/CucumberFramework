package base;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Drivers;

public class Hooks {
	WebDriver driver;

	@Before
	public void setUp() {
		driver = Drivers.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Driver.getDriver().manage().window().maximize();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
		}
		driver.quit();
	}
}
