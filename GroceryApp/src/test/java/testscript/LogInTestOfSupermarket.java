package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.LogInPage;

public class LogInTestOfSupermarket extends BaseClassOfSupermarket {
	@Test
	public void verifyValidLogIn() throws IOException {

		LogInPage logIn = new LogInPage(driver);
		// logIn.enterUsername("admin");
		// logIn.enterPassword("admin");
		// logIn.clickSignIn();
		logIn.logInUsingExcel();

		boolean isHomepageLoaded = logIn.isHomepageLoaded();
		Assert.assertTrue(isHomepageLoaded, ConstantsClass.lp_verifyValidLogIn);
	}

	@Test
	public void verifyValidUsernameInvalidPassword() {
		LogInPage logIn = new LogInPage(driver);
		logIn.enterUsername("admin");
		logIn.enterPassword("Tiger@321");
		logIn.clickSignIn();

		boolean isAlertMessageDisplayed = logIn.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, "Alert has not displayed");
	}

	@Test
	public void verifyInvalidUsernameValidPassword() {
		LogInPage logIn = new LogInPage(driver);
		logIn.enterUsername("Scott");
		logIn.enterPassword("admin");
		logIn.clickSignIn();

		boolean isAlertMessageDisplayed = logIn.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, "Alert has not displayed");
	}

	@Test
	public void verifyInvalidCredentials() {
		LogInPage logIn = new LogInPage(driver);
		logIn.enterUsername("Scott");
		logIn.enterPassword("Tiger@321");
		logIn.clickSignIn();

		boolean isAlertMessageDisplayed = logIn.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, "Alert has not displayed");
	}

	@Test(dataProvider = "logInDataProvider")
	public void verifyLogInWithSetOfCredentials(String userName, String password) {
		LogInPage logIn = new LogInPage(driver);
		logIn.enterUsername(userName);
		logIn.enterPassword(password);
		logIn.clickSignIn();

		boolean isAlertMessageDisplayed = logIn.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, "Alert has not displayed");
	}

	@DataProvider(name = "logInDataProvider")
	public Object[][] dpMethod() {
		return new Object[][] { { "admin", "admin" }, { "xyz", "obsqura" }, { "asc", "asdaf" }, { "gagaf", "gssf" } };
	}

}
