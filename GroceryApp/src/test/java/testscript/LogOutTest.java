package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import pages.HomePage;
import pages.LogInPage;

public class LogOutTest extends BaseClassOfSupermarket {
	@Test
	public void verifyLogOut() throws IOException {

		LogInPage log = new LogInPage(driver);
		log.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickUserAdmin();
		home.clickLogout();

		boolean logOutConfirmation = log.isSignInElementDisplayed();
		Assert.assertTrue(logOutConfirmation, "LogOut has failed");
	}
}
