package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	private WebElement adminUsersTab;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	private WebElement manageNewsTab;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[8]")
	private WebElement manageFooterTextTab;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[3]")
	private WebElement manageContactTab;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[9]")
	private WebElement manageCategoryTab;

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	private WebElement userAdmin;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	private WebElement logOutButton;

	public void clickAdminUsersTab() {
		adminUsersTab.click();
	}

	public void clickManageNews() {
		manageNewsTab.click();
	}

	public void clickManageFooterText() {
		manageFooterTextTab.click();
	}

	public void clickManageContact() {
		manageContactTab.click();
	}

	public void clickManageCategory() {
		manageCategoryTab.click();
	}

	public void clickUserAdmin() {
		userAdmin.click();
	}

	public void clickLogout() {
		logOutButton.click();
	}

}
