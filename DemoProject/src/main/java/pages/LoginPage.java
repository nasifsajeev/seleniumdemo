package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") WebElement alert;
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void enterTheUsername(String username2) {
		username.sendKeys(username2);
	}
	
	public void enterThePassword(String password2) {
		password.sendKeys(password2);
	}
	
	public void clickTheSignin() {
		signin.click();
	}
	
	public boolean isHomePageLoaded() {
		return dashboard.isDisplayed();	
	}
	
	public boolean isAlertShown() {
		return alert.isDisplayed();
	}

}
