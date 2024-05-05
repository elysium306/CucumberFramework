package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class AmazonPage {

	public AmazonPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement loginLink;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchInputField;

	@FindBy(id = "nav-search-submit-button")
	public WebElement searchButton;

	@FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
	public WebElement searchResultText;

	@FindBy(linkText = "Sign in securely")
	public WebElement signinSecurelyBtn;

	@FindBy(xpath = "//div[@class='a-box']//h1[@class='a-spacing-small']")
	public WebElement signinText;

	@FindBy(id = "ap_email")
	public WebElement signinEmailField;

	@FindBy(id = "continue")
	public WebElement signinContinueBtn;

	@FindBy(xpath = "//h4[@class='a-alert-heading']")
	public WebElement signinErrorMessageHeader;

	@FindBy(id = "ap_password")
	public WebElement signinPasswordField;
}
