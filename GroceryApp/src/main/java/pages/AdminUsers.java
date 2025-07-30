package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class AdminUsers {

	WaitUtility waits=new WaitUtility();
	public WebDriver driver;

	public AdminUsers(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement statusChangingAlert;

	@FindBy(xpath = "(//span[text()='Active'])[1]")
	WebElement activeStatus;

	@FindBy(xpath = "//span[text()='Inactive']")
	WebElement inactiveStatus;

	public AdminUsers clickActiveStatus() {
		waits.waitForWebElementClickable(driver, activeStatus);
		activeStatus.click();
		return this;
	}

	public boolean isStatusChangingAlertDisplayed() {
		return statusChangingAlert.isDisplayed();
		 
	}
     
}
