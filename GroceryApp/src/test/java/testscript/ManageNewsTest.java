package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageFooterText;
import pages.ManageNews;

public class ManageNewsTest extends BaseClassOfSupermarket {
	
	LogInPage login;
	HomePage home;
	ManageNews manage;
	@Test
	public void verifySuccessfulNewsCreation() throws IOException {
		login= new LogInPage(driver);
		home=login.logInUsingExcel();
		manage=home.clickManageNews().clickNewButton().enterNewNews("Kakkanad is in Orange alert").clickSaveButton();

		boolean newNEWS = manage.isNewNewsAlertDisplayed();
		Assert.assertTrue(newNEWS, ConstantsClass.mn_verifySuccessfulNewsCreation);

	}

	@Test(groups="smoke")
	public void verifyNewsDeletion() throws IOException {
		login= new LogInPage(driver);
		home=login.logInUsingExcel();
		manage=home.clickManageNews().clickDeleteButton().newsDeletion();

		boolean deleteNEWS = manage.isNEWSDeletionAlertDisplayed();
		Assert.assertTrue(deleteNEWS, ConstantsClass.mn_verifyNewsDeletion);

	}

	@Test(groups="smoke")
	public void verifyNewsUpdating() throws IOException {
		login= new LogInPage(driver);
		home=login.logInUsingExcel();
		manage=home.clickManageNews().clickUpdateAction().enterNewNews("business world").clickUpdateButton();

		boolean updateNEWS = manage.isNEWSUpdatingAlertDisplayed();
		Assert.assertTrue(updateNEWS, ConstantsClass.mn_verifyNewsUpdating);

	}

	@Test
	public void verifysampleNEWSsearching() throws IOException {
		login= new LogInPage(driver);
		home=login.logInUsingExcel();
		manage=home.clickManageNews().clickSearch1().searchNEWS("business world").clickSearch2().findSample();
		
		boolean verifySample = manage.isNEWSSampleDisplayed();
		Assert.assertTrue(verifySample, ConstantsClass.mn_verifysampleNEWSsearching);


	}

}
