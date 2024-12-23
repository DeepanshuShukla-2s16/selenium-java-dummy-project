package project.souce.ui.tests;



import org.openqa.selenium.WebDriver;

import project.souce.helper.DriverProvider;
import project.souce.services.CartPage;

public class Cart {
	WebDriver driver;
	
	public Cart(){
		this.driver = DriverProvider.getLocalDriver();
	}
	
	public void testCheckItemsAddedInCartProperly() {
		CartPage cart = new CartPage();
		cart.openUrl();
		cart.checkTotalItemsInCart(2);
		cart.buyItems();
	}
}
