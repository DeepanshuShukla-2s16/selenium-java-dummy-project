package project.souce.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.souce.helper.DriverProvider;

public class LoginPage {
	WebDriver driver;
	
	private final String  LOGIN_PAGE_URL = "https://www.saucedemo.com/";
	
	//constructor
	public LoginPage()
	{
		this.driver = DriverProvider.getLocalDriver();
	}
	
	
	
	
	public void openUrl() 
	{
		driver.get(LOGIN_PAGE_URL);
	}
	
	
	public void getTitle(String title) 
	{
		
		if(driver.getTitle().equals(title)) {
			System.out.println("assertion passed");
		}else {
			System.err.println("test failed");
			System.exit(0);
		}
	}
	
	public void enterUsername(String username) {
		WebElement textBox = driver.findElement(By.name("user-name"));
		textBox.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		WebElement textBox = driver.findElement(By.name("password"));
		textBox.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
	}
}
