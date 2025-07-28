package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class LogInPage {

	public WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userNameField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement SignInButton;

	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alertMessageOfInvalid;

	@FindBy(xpath = "//img[@alt='AdminLTE Logo']")
	WebElement homepageElement;

	@FindBy(xpath = "//p[text()='Sign in to start your session']")
	WebElement signInElement;

	public void enterUsername(String userName) {
		userNameField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickSignIn() {
		SignInButton.click();
	}

	public boolean isHomepageLoaded() {
		return homepageElement.isDisplayed();
	}

	public boolean isAlertDisplayed() {
		return alertMessageOfInvalid.isDisplayed();
	}

	public void logInUsingExcel() throws IOException {
		String username = ExcelUtility.readStringData(4, 0, "LogInSheet");

		String password = ExcelUtility.readStringData(4, 1, "LogInSheet");
		userNameField.sendKeys(username);
		passwordField.sendKeys(password);
		SignInButton.click();
	}

	public boolean isSignInElementDisplayed() {
		return signInElement.isDisplayed();
	}

}
