package project.souce.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.souce.helper.DriverProvider;


public class InventoryPage {

	WebDriver driver;
	private final String  INVENTORY_PAGE_URL = "https://www.saucedemo.com/inventory.html";
	
	public InventoryPage() {
		this.driver = DriverProvider.getLocalDriver();
	}
	
	public void openUrl() 
	{
		driver.get(INVENTORY_PAGE_URL);
		driver.manage().window().maximize();
	}
	
	public void addToCartItems() {
		WebElement addToCartBtn1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		addToCartBtn1.click();
		WebElement addToCartBtn2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		addToCartBtn2.click();
	}
	
}
