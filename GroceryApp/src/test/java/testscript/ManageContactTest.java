package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageContact;
import utilities.FakerUtility;

public class ManageContactTest extends BaseClassOfSupermarket {
	@Test
	public void verifySuccessfulContactUpdating() throws IOException {

		FakerUtility fakerr = new FakerUtility();
		LogInPage contact = new LogInPage(driver);
		contact.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageContact();
		ManageContact manage = new ManageContact(driver);
		manage.clickAction();
		manage.enterPhoneNo();
		manage.enterEmail();
		manage.enterAddress();
		manage.enterDeliveryTime();
		manage.enterDeliverCharge();
		manage.clickUpdate();

		boolean contactUpdating = manage.isContactUpdatingAlertDisplayed();
		Assert.assertTrue(contactUpdating, "No contact updation");

	}
}
