package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	
	@Test(groups="regression" , retryAnalyzer =retry.Retry.class)
	public void verifyTheUserIsAbleToLoginWithValidCredentials() throws IOException {
//		String username = "admin";
//		String password = "admin";
		String username = ExcelUtility.getStringDate(1, 0, "loginpage");
		String password = ExcelUtility.getStringDate(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		boolean homepage = loginpage.isHomePageLoaded();
		Assert.assertTrue(homepage);
		
	}
	
	
	@Test
	public void verifyTheUserIsNotAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException {
//		String username = "admin";
//		String password = "abcd";
		String username = ExcelUtility.getStringDate(2, 0, "loginpage");
		String password = ExcelUtility.getStringDate(2, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		boolean alertmessage = loginpage.isAlertShown();
		Assert.assertTrue(alertmessage);
		
		
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginWithInvalidUsernameAndValidPassword() throws IOException {
//		String username = "abcd";
//		String password = "admin";
		String username = ExcelUtility.getStringDate(3, 0, "loginpage");
		String password = ExcelUtility.getStringDate(3, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		boolean alertmessage = loginpage.isAlertShown();
		Assert.assertTrue(alertmessage);
		
		
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
//		String username = "abcd";
//		String password = "abcd";
		
		String username = ExcelUtility.getStringDate(4, 0, "loginpage");
		String password = ExcelUtility.getStringDate(4, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		boolean alertmessage = loginpage.isAlertShown();
		Assert.assertTrue(alertmessage);
		
		
	}

}
