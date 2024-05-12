package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonPage;
import utils.BrowserUtils;
import utils.Drivers;
import utils.PropertyReader;

public class AmazonLoginSteps {
	private WebDriver driver = Drivers.getDriver();

	BrowserUtils utils = new BrowserUtils();
	AmazonPage amazonHome = new AmazonPage();

	@Given("I am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		driver.get(PropertyReader.getProperty("amazonURL"));
	}

	@Then("Sign in button is displayed")
	public void sign_in_button_is_displayed() {
		Assert.assertTrue(amazonHome.signinSecurelyBtn.isDisplayed());
	}

	@When("I click on signin button")
	public void i_click_on_signin_button() {
		amazonHome.signinSecurelyBtn.click();
	}

	@Then("I should be directed to login page")
	public void i_should_be_directed_to_login_page() {
		utils.waitUntilElementVisible(amazonHome.signinText);
		Assert.assertTrue(amazonHome.signinText.isDisplayed());
	}

	// the amazon invalid email test

	@Given("I am on the amazon signin page")
	public void i_am_on_the_amazon_signin_page() {
		driver.get(PropertyReader.getProperty("amazonURL"));
		amazonHome.signinSecurelyBtn.click();
		utils.waitUntilElementVisible(amazonHome.signinText);
		Assert.assertTrue(amazonHome.signinText.isDisplayed());
	}

	@When("I enter invalid user email {string}")
	public void i_enter_invalid_user_email(String invalidUserEmail) {
		amazonHome.signinEmailField.sendKeys(invalidUserEmail);
	}

	@And("I clicked on continue button")
	public void i_clicked_on_continue_button() {
		amazonHome.signinContinueBtn.click();
	}

	@Then("An error message {string} should display")
	public void an_error_message_should_display(String errorMessage) {
		utils.waitUntilElementVisible(amazonHome.signinErrorMessageHeader);
		String actualErrorMessageHeader = amazonHome.signinErrorMessageHeader.getText();
		Assert.assertEquals(actualErrorMessageHeader, errorMessage);
	}

	@But("The password field should not display")
	public void the_password_field_should_not_display() {
		Assert.assertFalse(utils.isElementPresent(amazonHome.signinPasswordField));
	}

	// amazon search tests

	@When("I enter the search term {string}")
	public void i_enter_the_search_term(String item) {
		amazonHome.searchInputField.sendKeys(item);
	}

	@When("I click on search button")
	public void i_click_on_search_button() { // "coffee mug"
		amazonHome.searchButton.click();
	}

	@Then("I should see the search item {string} on search result page")
	public void i_should_see_the_search_item_on_search_result_page(String item) {
		utils.waitUntilElementVisible(amazonHome.searchResultText);
		String searchResultText = amazonHome.searchResultText.getText();
		String actualResultText = searchResultText.substring(1, searchResultText.length() - 1);

		Assert.assertEquals(actualResultText, item);
	}

}
