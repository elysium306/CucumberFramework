package steps;

import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PropertyReader;

public class DemoBlaze extends BaseTest {

	@Given("I went to demoblaze landing page")
	public void i_want_to_write_a_step_with_precondition() {
		driver.get(PropertyReader.getProperty("demoblaze"));
		String title = driver.getTitle();
		assertNotNull(title, "Assert Title is not null");
	}

	@And("Clicked on login option")
	public void clicked_on_login_option() {
		driver.findElement(By.id("login2")).click();
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {
		String username = PropertyReader.getProperty("dbUsername");
		String password = PropertyReader.getProperty("dbPassword");
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);

	}

	@And("Clicked on signin button")
	public void clicked_on_signin_button() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@And("Logout option should be available")
	public void logout_option_should_be_available() {
		assertTrue(driver.findElement(By.id("logout2")).isDisplayed());
	}

	@Then("welcome message should be displayed")
	public void welcome_message_should_be_displayed() {
		WebElement welcomeMsg = driver.findElement(By.id("nameofuser"));
		System.out.println("--- Welcome Message: " + welcomeMsg.getText());
		assertTrue(welcomeMsg.isDisplayed());
	}

}
