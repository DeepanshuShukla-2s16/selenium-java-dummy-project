package project.souce.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import project.souce.helper.DriverProvider;

public class OrderCompletionPage {
	WebDriver driver;
	private final String  ORDER_COMPLETION_PAGE_URL = "https://www.saucedemo.com/checkout-complete.html";
	
	public OrderCompletionPage(){
		this.driver = DriverProvider.getLocalDriver();
	}
	
	public void openUrl() 
	{
		driver.get(ORDER_COMPLETION_PAGE_URL);
		driver.manage().window().maximize();
	}
	
	public void checkOrderPlacedSuccessfully() {		
		String completionMsg = driver.findElement(By.xpath("//*[@id='checkout_complete_container']/h2")).getText();
		
		if(completionMsg.equals("Thank you for your order!")) {
			System.out.println("Assertion Passed!");
			System.out.println("Test Passed! successfully");
		}else {
			System.err.println("test failed!");
		}
	}
	
	
}
