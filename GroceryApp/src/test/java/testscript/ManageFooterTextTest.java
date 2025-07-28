package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageFooterText;

public class ManageFooterTextTest extends BaseClassOfSupermarket {
	@Test
	public void verifyFooterTextUpdating() throws IOException {

		LogInPage foot = new LogInPage(driver);
		foot.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageFooterText();
		ManageFooterText manage = new ManageFooterText(driver);
		manage.clickActionFooter();
		manage.enterAddress();
		manage.enterEmail();
		manage.enterPhoneNo();
		manage.clickFooterUpdate();

		boolean isFooterTextUpdated = manage.isFooterUpdatingAlertDisplayed();
		Assert.assertTrue(isFooterTextUpdated, "No Footer text updated");

	}
}
