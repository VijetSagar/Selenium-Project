package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtility;

public class ManageNews {

	public WebDriver driver;
	GeneralUtility general = new GeneralUtility();

	public ManageNews(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newButton;

	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	WebElement EnterNewsField;

	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement SignInButton;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement newsCreationAlert;

	@FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[1]")
	WebElement deleteButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']//parent::div[@class='col-sm-12']")
	WebElement newsDeletionAlert;

	@FindBy(xpath = "(//i[@class='fas fa-edit'])[2]")
	WebElement updateAction;

	@FindBy(xpath = "//button[@name='update']")
	WebElement updateButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement newsUpdationAlert;

	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	WebElement searchButton;

	@FindBy(xpath = "//input[@placeholder='Title']")
	WebElement titleField;

	@FindBy(xpath = "//button[@name='Search']")
	WebElement search2;

	@FindBy(xpath = "//td[text()='business world']")
	WebElement newsSample;

	public ManageNews clickNewButton() {
		newButton.click();
		return this;
	}

	public ManageNews enterNewNews(String news) {
		EnterNewsField.clear();
		EnterNewsField.sendKeys(news);
		return this;
	}

	public ManageNews clickSaveButton() {
		saveButton.click();
		return this;
	}

	public boolean isNewNewsAlertDisplayed() {
		return newsCreationAlert.isDisplayed();
		
	}

	public ManageNews clickDeleteButton() {
		deleteButton.click();
		return this;
	}

	public ManageNews newsDeletion() {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		return this;
	}

	public boolean isNEWSDeletionAlertDisplayed() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("One of the NEWS has deleted");
		return newsDeletionAlert.isDisplayed();
	}

	public ManageNews clickUpdateAction() {
		updateAction.click();
		return this;
	}

	public ManageNews clickUpdateButton() {
		updateButton.click();
		return this;
	}

	public boolean isNEWSUpdatingAlertDisplayed() {
		return newsUpdationAlert.isDisplayed();
	}

	public ManageNews clickSearch1() {
		searchButton.click();
		return this;
	}

	public ManageNews searchNEWS(String sample) {
		titleField.click();
		titleField.sendKeys(sample);
		return this;
	}

	public ManageNews clickSearch2() {
		search2.click();
		return this;
	}

	public ManageNews findSample() {
		try {
			if (newsSample.isDisplayed()) {
				System.out.println("We find sample");
			}
		} catch (Exception e) {
			System.out.println("We could not find sample NEWS");
		}
		return this;
	}
	
	
	public boolean isNEWSSampleDisplayed() {
		return newsSample.isDisplayed();
	}

}
