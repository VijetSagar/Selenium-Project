package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageCategory;

public class ManageCategoryTest extends BaseClassOfSupermarket {
	@Test
	public void verifyCategorySearching() throws IOException {

		LogInPage contact = new LogInPage(driver);
		contact.logInUsingExcel();
		HomePage home = new HomePage(driver);
		home.clickManageCategory();
		ManageCategory manage = new ManageCategory(driver);
		manage.clickCategorySearchButton();
		manage.enterCategory();
		manage.clickSearch2Button();
		manage.isParticularCategoryDisplayed();

	}
}
