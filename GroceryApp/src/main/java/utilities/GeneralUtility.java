package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtility {
	WebDriver driver;

	public String selectDropdownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}

	public String selectDropdownWithIndex(WebElement element, int indexNo) {
		Select object = new Select(element);
		object.selectByIndex(indexNo);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}

	public void selectDropdownWithVisibleText(WebElement element, String textValue) {
		Select object = new Select(element);
		object.selectByVisibleText(textValue);
		WebElement selectedElement = object.getFirstSelectedOption();
		selectedElement.click();
	}

	public void clickElementByJSE(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public void scrollPageByJSE(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(x,y)", "");

	}

	public String generateCurrentDateAndTime() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyhhmmss");
		return formatter.format(date);
	}

	public void acceptAlert(WebElement element, WebDriver driver) {
		element.click();
		driver.switchTo().alert().accept();
	}

	public void dismissAlert(WebElement element, WebDriver driver) {
		element.click();
		driver.switchTo().alert().dismiss();
	}

	public void acceptPromptAlert(WebElement element, WebDriver driver, String message) {
		element.click();
		driver.switchTo().alert().sendKeys(message);
		driver.switchTo().alert().accept();
	}

	public void dismissPromptAlert(WebElement element, WebDriver driver, String message) {
		element.click();
		driver.switchTo().alert().sendKeys(message);
		driver.switchTo().alert().dismiss();
	}

	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();

	}

	public void mouseHover(WebElement element, WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

}
