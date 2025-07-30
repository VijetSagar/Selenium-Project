package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FakerUtility;
import utilities.GeneralUtility;

public class ManageFooterText {

	FakerUtility fake = new FakerUtility();
	GeneralUtility general = new GeneralUtility();
	public WebDriver driver;

	public ManageFooterText(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class='fas fa-edit'])[1]")
	WebElement actionButtonFooter;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneFooter;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailFooter;

	@FindBy(xpath = "//textarea[@name='address']")
	WebElement addressFooter;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement footerUpdatingAlert;

	@FindBy(xpath = "//button[@name='Update']")
	WebElement updateFooter;

	public ManageFooterText clickActionFooter() {
		actionButtonFooter.click();
		return this;
	}

	public ManageFooterText enterPhoneNo() {
		phoneFooter.clear();
		String phoneNo = fake.generatePhoneNumber();
		phoneFooter.sendKeys(phoneNo);
		return this;
	}

	public ManageFooterText enterEmail() {
		emailFooter.clear();
		String gmail = fake.generateGmail();
		emailFooter.sendKeys(gmail);
		return this;
	}

	public ManageFooterText enterAddress() {
		addressFooter.clear();
		String address = fake.generateAddress();
		addressFooter.sendKeys(address);
		return this;
	}

	public ManageFooterText clickFooterUpdate() {
		updateFooter.click();
		return this;
	}

	public boolean isFooterUpdatingAlertDisplayed() {
		return footerUpdatingAlert.isDisplayed();
	}

}
