package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Drivers;

public class BaseTest {
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
