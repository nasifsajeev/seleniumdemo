package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class LogoutTest extends Base{
	
	
	@Test
	public void verifyTheUserIsAbleToLogoutTheHomePage() throws IOException {
		
//		String username = "admin";
//		String password = "admin";
		String username = ExcelUtility.getStringDate(1, 0, "loginpage");
		String password = ExcelUtility.getStringDate(1, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();
		
		HomePage logoutpage = new HomePage(driver);
		logoutpage.clickTheAdminPanel();
		logoutpage.clikcTheLogoutButton();
		boolean signinpage = logoutpage.isSignPageLoaded();
		Assert.assertTrue(signinpage);
	}

}
