package testscript;

import java.io.IOException;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NewsManage;
import utilities.ExcelUtility;

public class NewsTest extends Base{
	
	
	@Test(groups="regression")
	public void verifyTheUserIsAbleToCreateTheNews() throws IOException {
//		String news_message = "Messi scored a goal again";
		
//		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		String username = ExcelUtility.getStringDate(1, 0, "loginpage");
		String password = ExcelUtility.getStringDate(1, 1, "loginpage");
		String newsmessage = ExcelUtility.getStringDate(1, 0, "newspage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignin();

		NewsManage newsmanage = new NewsManage(driver);
		newsmanage.newsInfo();
		newsmanage.createNews();
		newsmanage.enterNews(newsmessage);
		newsmanage.saveNews();
		boolean alertmessage = newsmanage.isAlertShown();
		Assert.assertTrue(alertmessage);
	}

}
