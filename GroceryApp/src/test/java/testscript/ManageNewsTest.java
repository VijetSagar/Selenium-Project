package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageNews;

public class ManageNewsTest extends BaseClassOfSupermarket {
	@Test
	public void verifySuccessfulNewsCreation() throws IOException {
		LogInPage news = new LogInPage(driver);
		news.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageNews();
		ManageNews manage = new ManageNews(driver);
		manage.clickNewButton();
		manage.enterNewNews();
		manage.clickSaveButton();

		boolean newNEWS = manage.isNewNewsAlertDisplayed();
		Assert.assertTrue(newNEWS, "No new NEWS");

	}

	@Test(groups="selected")
	public void verifyNewsDeletion() throws IOException {
		LogInPage news = new LogInPage(driver);
		news.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageNews();
		ManageNews manage = new ManageNews(driver);
		manage.clickDeleteButton();
		manage.newsDeletion();

		boolean deleteNEWS = manage.isNEWSDeletionAlertDisplayed();
		Assert.assertTrue(deleteNEWS, "No NEWS deleted");

	}

	@Test(groups="selected")
	public void verifyNewsUpdating() throws IOException {
		LogInPage news = new LogInPage(driver);
		news.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageNews();
		ManageNews manage = new ManageNews(driver);
		manage.clickUpdateAction();
		manage.enterNewNews();
		manage.clickUpdateButton();

		boolean updateNEWS = manage.isNEWSUpdatingAlertDisplayed();
		Assert.assertTrue(updateNEWS, "No NEWS updated");

	}

	@Test
	public void verifysampleNEWSsearching() throws IOException {
		LogInPage news = new LogInPage(driver);
		news.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageNews();
		ManageNews manage = new ManageNews(driver);
		manage.clickSearch1();
		manage.searchNEWS();
		manage.clickSearch2();
		manage.findSample();

	}

}
