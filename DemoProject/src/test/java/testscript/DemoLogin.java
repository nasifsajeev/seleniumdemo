package testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoLogin extends Base{
	
	@Test
	public void login_ValidUsernameAndPassword() {
		String username1 = "admin";
		String password1 = "admin";
//		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(username1);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(password1);
		WebElement submit_button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		submit_button.click();
		WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean isHomepageloaded = dashboard.isDisplayed();
		Assert.assertTrue(isHomepageloaded);
	}
	
	@Test
	public void login_ValidUsernameInvalidPassword() {
		String username1 = "admin";
		String password2 = "dhfkudhfkudh";
//		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(username1);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(password2);
		WebElement submit_button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		submit_button.click();	
	}
	
	@Test
	public void login_InvalidUsernameValidPassword() {
		String username2 = "dskjfhdkjhf";
		String password1 = "admin";
//		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(username2);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(password1);
		WebElement submit_button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		submit_button.click();	
	}
	
	@Test
	public void login_InvalidUsernameInvalidPassword() {
		String username2 = "dskjfhdkjhf";
		String password2 = "dshfkjdshf";
//		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(username2);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(password2);
		WebElement submit_button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		submit_button.click();	
	}
	
	
	
	

}
