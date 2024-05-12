package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoPage;
import utils.BrowserUtils;
import utils.Drivers;

public class SauceDemoLogin {
	WebDriver driver = Drivers.getDriver();

	SauceDemoPage page = new SauceDemoPage();
	BrowserUtils utils = new BrowserUtils();

	// 1. Scenario
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String username, String password) {
		page.usernameField.sendKeys(username);
		page.passwordField.sendKeys(password);
	}

	@And("I click on the login button")
	public void i_click_on_the_login_button() {
		page.loginBtn.click();
	}

	@Then("I should be in the home page")
	public void i_should_be_in_the_home_page() {
		utils.waitUntilElementVisible(page.HomePageInventoryContainner);
		Assert.assertTrue(page.HomePageInventoryContainner.isDisplayed());
	}

	@And("There should be {int} items in the home page")
	public void there_should_be_items_in_the_home_page(Integer int1) {
		int actualSize = page.itemTitles.size();
		Assert.assertTrue(actualSize == int1);
	}

	// 2. Scenario invalid test steps

	@Then("I should not be in the home page")
	public void i_should_not_be_in_the_home_page() {
		Assert.assertFalse(utils.isElementPresent(page.HomePageInventoryContainner));
	}

	@Then("There should an error message {string}")
	public void there_should_an_error_message(String expectedErrorMessage) {
		String actualErrorMessage = page.loginErrorMessage.getText();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

	// 3. Scenario
	@When("user enters username")
	public void user_enters_username() {
		System.out.println("user enters username");
	}

	@And("user enters password")
	public void user_enters_password() {
		System.out.println("user enters password");
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("user clicks on login");
	}

	@Then("user should see confirmation message")
	public void user_should_see_confirmation_message() {
		System.out.println("user should see confirmation message");
	}

}
