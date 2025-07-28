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

	public void clickNewButton() {
		newButton.click();
	}

	public void enterNewNews() {
		EnterNewsField.clear();
		EnterNewsField.sendKeys("Kakkanada is in Orange alert");
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public boolean isNewNewsAlertDisplayed() {
		return newsCreationAlert.isDisplayed();
	}

	public void clickDeleteButton() {
		deleteButton.click();
	}

	public void newsDeletion() {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
	}

	public boolean isNEWSDeletionAlertDisplayed() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("One of the NEWS has deleted");
		return newsDeletionAlert.isDisplayed();
	}

	public void clickUpdateAction() {
		updateAction.click();
	}

	public void clickUpdateButton() {
		updateButton.click();
	}

	public boolean isNEWSUpdatingAlertDisplayed() {
		return newsUpdationAlert.isDisplayed();
	}

	public void clickSearch1() {
		searchButton.click();
	}

	public void searchNEWS() {
		titleField.click();
		titleField.sendKeys("business World");
	}

	public void clickSearch2() {
		search2.click();
	}

	public void findSample() {
		try {
			if (newsSample.isDisplayed()) {
				System.out.println("We find sample");
			}
		} catch (Exception e) {
			System.out.println("We could not find sample NEWS");
		}
	}

}
