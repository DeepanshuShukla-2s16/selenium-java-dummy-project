package project.souce.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import project.souce.helper.DriverProvider;

public class CartPage {
	WebDriver driver;
	private final String  CART_PAGE_URL = "https://www.saucedemo.com/cart.html";
	
	public CartPage(){
		this.driver = DriverProvider.getLocalDriver();
	}
	
	public void openUrl() {
		driver.get(CART_PAGE_URL);
	}
	
	public void checkTotalItemsInCart(int totalExpect) {
		WebElement shipingCartElm = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		int totaladdedItems = Integer.parseInt(shipingCartElm.getText());
		if(totaladdedItems == totalExpect) {
			System.out.println("assertion passed");
		}
		else {
			System.err.println("test failed");
		}
	}
	
	public void buyItems() {
		WebElement ShoppingBtn = driver.findElement(By.xpath("//*[@id='checkout']"));
		ShoppingBtn.click();
	}
	
}
