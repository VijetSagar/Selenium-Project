package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.HomePage;
import pages.LogInPage;

public class LogOutTest extends BaseClassOfSupermarket {
	
	LogInPage login;
	HomePage home;
	
	@Test
	public void verifyLogOut() throws IOException {

		login = new LogInPage(driver);
		home=login.logInUsingExcel();
	    home.clickUserAdmin();
	    home.clickLogout();
		boolean logOutConfirmation = login.isSignInElementDisplayed();
		Assert.assertTrue(logOutConfirmation, ConstantsClass.lo_verifyLogOut);
	}
}
