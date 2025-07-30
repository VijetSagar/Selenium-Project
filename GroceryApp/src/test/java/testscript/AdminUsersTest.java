package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.AdminUsers;
import pages.HomePage;
import pages.LogInPage;


public class AdminUsersTest extends BaseClassOfSupermarket {
	LogInPage login;
	HomePage home;
	AdminUsers user;
	
	@Test
	public void verifyStatusChanging() throws IOException {

		 login = new LogInPage(driver);
		home=login.logInUsingExcel();
		user=home.clickAdminUsersTab().clickActiveStatus();


		boolean statusChanging = user.isStatusChangingAlertDisplayed();
		Assert.assertTrue(statusChanging, ConstantsClass.au_verifyStatusChanging);
	}
}
