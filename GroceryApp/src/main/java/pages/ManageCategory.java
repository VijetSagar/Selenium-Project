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

	public void clickCategorySearchButton() {
		categorySearchButton.click();
	}

	public void enterCategory() {
		categoryField.clear();
		categoryField.sendKeys("Matt");
	}

	public void clickSearch2Button() {
		search2Button.click();
	}

	public void isParticularCategoryDisplayed() {
		try {
			if (categoryTitle.isDisplayed()) {
				System.out.println("We find sample category");
			}
		} catch (Exception e) {
			System.out.println("The Result not found");
		}
	}

}
