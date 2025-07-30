package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageCategory;
import pages.ManageContact;
import utilities.FakerUtility;

public class ManageContactTest extends BaseClassOfSupermarket {
	LogInPage login;
	HomePage home;
	ManageContact manage;
	
	
	@Test
	public void verifySuccessfulContactUpdating() throws IOException {

		login= new LogInPage(driver);
		home=login.logInUsingExcel();
		manage=home.clickManageContact().clickAction().enterPhoneNo().enterEmail().enterAddress().enterDeliveryTime().enterDeliverCharge().clickUpdate();

		boolean contactUpdating = manage.isContactUpdatingAlertDisplayed();
		Assert.assertTrue(contactUpdating, ConstantsClass.mcon_verifySuccessfulContactUpdating);

	}
}
