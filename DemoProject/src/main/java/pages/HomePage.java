package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	@FindBy(xpath = "//li[@class='nav-item dropdown']") WebElement admin_link;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']") WebElement logout_button;
	@FindBy(xpath = "//b[text()='7rmart supermarket']") WebElement signin_page;
	
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'][1])")WebElement morenews_info;
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	public NewsManage newsMoreInfo() {
//		morenews_info.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", morenews_info);
		return new NewsManage(driver);
	}

	public void clickTheAdminPanel() {
		admin_link.click();
	}
	
	public void clikcTheLogoutButton() {
		logout_button.click();
	}
	
	public boolean isSignPageLoaded() {
		return signin_page.isDisplayed();
		
	}
	
	

}
