package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsManage {
	
//	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'][1])")WebElement morenews_info;
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement new_button;
	@FindBy(xpath = "//textarea[@id='news']") WebElement news;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	@FindBy(xpath = "//button[text()='Save']") WebElement save_message;
	public WebDriver driver;
	
	public NewsManage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
		
	}

//	public void newsMoreInfo() {
//		morenews_info.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", morenews_info);
//	}
	
	
	public NewsManage createNews() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", new_button);
		return this;
	}
	
	
	public NewsManage enterNews(String newsmessage) {
		news.sendKeys(newsmessage);
		return this;
	}
	
	public NewsManage saveNews() {
		save_message.click();
		return this;
	}
	
	public boolean isAlertShown() {
		return alert.isDisplayed();
		
	}

	
	
	

}
