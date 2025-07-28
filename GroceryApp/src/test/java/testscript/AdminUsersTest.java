package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import pages.AdminUsers;
import pages.HomePage;
import pages.LogInPage;

public class AdminUsersTest extends BaseClassOfSupermarket {
	@Test
	public void verifyStatusChanging() throws IOException {

		LogInPage admin = new LogInPage(driver);
		admin.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageContact();
		AdminUsers user = new AdminUsers(driver);
		user.clickActiveStatus();

		boolean statusChanging = user.isStatusChangingAlertDisplayed();
		Assert.assertTrue(statusChanging, "No changes in status");
	}
}
