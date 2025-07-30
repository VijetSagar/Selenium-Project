package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClassOfSupermarket;
import constants.ConstantsClass;
import pages.HomePage;
import pages.LogInPage;
import pages.ManageCategory;

public class ManageCategoryTest extends BaseClassOfSupermarket {
	LogInPage login;
	HomePage home;
	ManageCategory manage;
	
	@Test
	public void verifyCategorySearching() throws IOException {

		 login = new LogInPage(driver);
		home=login.logInUsingExcel();
	    manage=home.clickManageCategory().clickCategorySearchButton().enterCategory("Matt").clickSearch2Button().isParticularCategoryDisplayed();
		
	    boolean noResult = manage.isSampleCategoryDisplayed();
		Assert.assertTrue(noResult, ConstantsClass.mc_verifyCategorySearching);

	    
	}
}
