package base;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Drivers;

public class TestBase {
	protected static final Logger log = LoggerFactory.getLogger(TestBase.class);
	protected WebDriver driver;

	@BeforeMethod
	public void enter() {
		driver = Drivers.getDriver();
	}

	@AfterMethod
	public void exit() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
