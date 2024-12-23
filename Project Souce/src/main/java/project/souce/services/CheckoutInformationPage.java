package project.souce.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.souce.helper.DriverProvider;

public class CheckoutInformationPage {
	
	WebDriver driver;
	private final String  CHECKOUT_INFO_PAGE_URL = "https://www.saucedemo.com/checkout-step-one.html";
	private final String  ORDER_PLACE_PAGE_URL = "https://www.saucedemo.com/checkout-step-two.html";
	
	
	public CheckoutInformationPage() {
		this.driver = DriverProvider.getLocalDriver();
	}
	
	public void openUrl() 
	{
		driver.get(CHECKOUT_INFO_PAGE_URL);
		driver.manage().window().maximize();
	}
	
	public void enterFirstName(String firstName) {
		WebElement textBox = driver.findElement(By.xpath("//*[@id='first-name']"));
		textBox.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		WebElement textBox = driver.findElement(By.xpath("//*[@id='last-name']"));
		textBox.sendKeys(lastName);
	}
	public void enterZipOrPostalCode(String postalCode) {
		WebElement textBox = driver.findElement(By.xpath("//*[@id='postal-code']"));
		textBox.sendKeys(postalCode);
	}
	
	public void placeOrder() {
		WebElement orderPlaceBtn = driver.findElement(By.xpath("//*[@id='continue']"));
		orderPlaceBtn.click();
	}
	
	public void finishOrder() {
		driver.get(ORDER_PLACE_PAGE_URL);
		WebElement orderFinishBtn = driver.findElement(By.xpath("//*[@id='finish']"));
		orderFinishBtn.click();
	}
}
