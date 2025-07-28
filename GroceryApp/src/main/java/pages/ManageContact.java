package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FakerUtility;
import utilities.GeneralUtility;

public class ManageContact {

	FakerUtility fake = new FakerUtility();
	GeneralUtility general = new GeneralUtility();
	public WebDriver driver;

	public ManageContact(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	WebElement actionButton;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneField;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = "//textarea[@name='address']")
	WebElement addressField;

	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement deliveryTimeField;

	@FindBy(xpath = "//input[@id='del_limit']")
	WebElement deliveryChargeField;

	@FindBy(xpath = "//button[@name='Update']")
	WebElement updateButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement contactUpdationAlert;

	public void clickAction() {
		actionButton.click();
	}

	public void enterPhoneNo() {
		phoneField.clear();
		String phoneNo = fake.generatePhoneNumber();
		phoneField.sendKeys(phoneNo);
	}

	public void enterEmail() {
		emailField.clear();
		String gmail = fake.generateGmail();
		emailField.sendKeys(gmail);
	}

	public void enterAddress() {
		addressField.clear();
		String address = fake.generateAddress();
		addressField.sendKeys(address);
	}

	public void enterDeliveryTime() {
		deliveryTimeField.clear();
		String deliveryTime = general.generateCurrentDateAndTime();
		deliveryTimeField.sendKeys(deliveryTime);
	}

	public void enterDeliverCharge() {
		deliveryChargeField.clear();
		String deliveryCharge = fake.generateNumber();
		deliveryChargeField.sendKeys(deliveryCharge);
	}

	public void clickUpdate() {
		general.clickElementByJSE(updateButton, driver);
	}

	public boolean isContactUpdatingAlertDisplayed() {
		return contactUpdationAlert.isDisplayed();
	}

}
