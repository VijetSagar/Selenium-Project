package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageFooterText;

public class ManageFooterTextTest extends BaseClassOfSupermarket {
	
	LogInPage login;
	HomePage home;
	ManageFooterText manage;
	
	
	
	
	
	@Test
	public void verifyFooterTextUpdating() throws IOException {

		login= new LogInPage(driver);
		home=login.logInUsingExcel();
		manage=home.clickManageFooterText().clickActionFooter().enterAddress()
		.enterEmail().enterPhoneNo().clickFooterUpdate();


		boolean isFooterTextUpdated = manage.isFooterUpdatingAlertDisplayed();
		Assert.assertTrue(isFooterTextUpdated, ConstantsClass.mf_verifyFooterTextUpdating);

	}
}
