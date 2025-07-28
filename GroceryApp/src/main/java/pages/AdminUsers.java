package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUsers {

	public WebDriver driver;

	public AdminUsers(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(////div[@class='alert alert-success alert-dismissible']")
	WebElement statusChangingAlert;

	@FindBy(xpath = "(//span[text()='Active'])[1]")
	WebElement activeStatus;

	@FindBy(xpath = "//span[text()='Inactive']")
	WebElement inactiveStatus;

	public void clickActiveStatus() {
		activeStatus.click();
	}

	public boolean isStatusChangingAlertDisplayed() {
		return statusChangingAlert.isDisplayed();
	}

}
