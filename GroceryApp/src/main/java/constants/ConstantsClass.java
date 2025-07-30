package constants;

public class ConstantsClass {

	public static final String TESTDATAFILE = System.getProperty("user.dir")
			+ "\\src\\test\\resources\\Testdata\\GroceryApp.xlsx";

	public static final String CONFIGFILE = System.getProperty("user.dir")
			+ "\\src\\main\\resources\\Config.properties";

	public static final String lp_verifyValidLogIn = "homepage has not loaded";
	
	public static final String lp_verifyValidUsernameInvalidPassword = "Alert has not displayed";
	
	public static final String lp_verifyInvalidUsernameValidPassword = "Alert has not displayed";
	
	public static final String lp_verifyInvalidCredentials = "Alert has not displayed";
	
	public static final String lp_verifyLogInWithSetOfCredentials = "Alert has not displayed";
	
	
	
	public static final String au_verifyStatusChanging = "No changes in status";
	
	
	public static final String lo_verifyLogOut = "LogOut has failed";
	
	public static final String mcon_verifySuccessfulContactUpdating = "No contact updation";
	
	public static final String mf_verifyFooterTextUpdating = "No Footer text updated";
	
	public static final String mn_verifySuccessfulNewsCreation = "No new NEWS";
	
	public static final String mn_verifyNewsDeletion = "No NEWS deleted";
	
	public static final String mn_verifyNewsUpdating = "No NEWS updated";
	
	public static final String mn_verifysampleNEWSsearching = "This sample is not present";
	
	public static final String mc_verifyCategorySearching = "This category is present";
}
