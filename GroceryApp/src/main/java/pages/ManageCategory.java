package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCategory {

	public WebDriver driver;

	public ManageCategory(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement categorySearchButton;

	@FindBy(xpath = "//input[@placeholder='Category']")
	WebElement categoryField;

	@FindBy(xpath = "//button[@name='Search']")
	WebElement search2Button;

	@FindBy(xpath = "//td[text()='Matt']")
	WebElement categoryTitle;
	
	@FindBy(xpath = "//center[text()='.........RESULT NOT FOUND.......']")
	WebElement noResultText;

	public ManageCategory clickCategorySearchButton() {
		categorySearchButton.click();
		return this;
	}

	public ManageCategory enterCategory(String category) {
		categoryField.clear();
		categoryField.sendKeys(category);
		return this;
	}

	public ManageCategory clickSearch2Button() {
		search2Button.click();
		return this;
	}

	public ManageCategory isParticularCategoryDisplayed() {
		try {
			if (categoryTitle.isDisplayed()) {
				System.out.println("We find sample category");
			}
		} catch (Exception e) {
			System.out.println("The Result not found");
		}
		return this;
	}
	
	public boolean isSampleCategoryDisplayed() {
		return noResultText.isDisplayed();
	}

	
}
