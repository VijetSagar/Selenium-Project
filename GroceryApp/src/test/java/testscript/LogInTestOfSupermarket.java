package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.HomePage;
import pages.LogInPage;

public class LogInTestOfSupermarket extends BaseClassOfSupermarket {
	
	LogInPage login;
	HomePage home;
	
	@Test
	public void verifyValidLogIn() throws IOException {

		login = new LogInPage(driver);
		home=login.logInUsingExcel();

		boolean isHomepageLoaded =login.isHomepageLoaded();
		Assert.assertTrue(isHomepageLoaded, ConstantsClass.lp_verifyValidLogIn);
	}

	@Test
	public void verifyValidUsernameInvalidPassword() {
		login = new LogInPage(driver);
		home=login.enterUsername("admin").enterPassword("Tiger@321").clickSignIn();
		

		boolean isAlertMessageDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, ConstantsClass.lp_verifyValidUsernameInvalidPassword);
	}

	@Test
	public void verifyInvalidUsernameValidPassword() {
		login = new LogInPage(driver);
		home=login.enterUsername("scott").enterPassword("admin").clickSignIn();

		boolean isAlertMessageDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, ConstantsClass.lp_verifyInvalidUsernameValidPassword);
	}

	@Test
	public void verifyInvalidCredentials() {
		login = new LogInPage(driver);
		home=login.enterUsername("scott").enterPassword("admin@1").clickSignIn();


		boolean isAlertMessageDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, ConstantsClass.lp_verifyInvalidCredentials);
	}

	@Test(dataProvider = "logInDataProvider")
	public void verifyLogInWithSetOfCredentials(String userName, String password) {
		login = new LogInPage(driver);
		home=login.enterUsername(userName).enterPassword(password).clickSignIn();


		boolean isAlertMessageDisplayed = login.isAlertDisplayed();
		Assert.assertTrue(isAlertMessageDisplayed, ConstantsClass.lp_verifyLogInWithSetOfCredentials);
	}

	@DataProvider(name = "logInDataProvider")
	public Object[][] dpMethod() {
		return new Object[][] { { "admin", "admins" }, { "xyz", "obsqura" }, { "asc", "asdaf" }, { "gagaf", "gssf" } };
	}

}
