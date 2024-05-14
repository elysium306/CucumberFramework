package utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	Alert alert;
	WebDriverWait letswait;
	static Select letsSelect;

	public void switchToAlert(WebDriver driver) {
		alert = driver.switchTo().alert();
	}

	public String alertGetText(WebDriver driver) {
		switchToAlert(driver);
		return alert.getText();
	}

	public void alertAccept(WebDriver driver) {
		switchToAlert(driver);
		alert.accept();
	}

	public void alertDismiss(WebDriver driver) {
		switchToAlert(driver);
		alert.dismiss();
	}

	public void sendKeysOnAlert(WebDriver driver, String name) {
		switchToAlert(driver);
		alert.sendKeys(name);
	}

	public void waitUntilAlertIsPresent(WebDriver driver) {
		letswait = new WebDriverWait(driver, Duration.ofSeconds(10));
		letswait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitUntilElementVisible(WebElement element) {
		letswait = new WebDriverWait(Drivers.getDriver(), Duration.ofSeconds(10));
		letswait.until(ExpectedConditions.visibilityOf(element));
	}

	public void selectByVisibleText(WebElement selectElement, String optionToSelect) {
		letsSelect = new Select(selectElement);
		letsSelect.selectByVisibleText(optionToSelect);
	}

	public void clearValueOnTheField(WebElement element) {
		String temp = element.getAttribute("value");
		for (int i = 0; i < temp.length(); i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
	}

	public boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
}
