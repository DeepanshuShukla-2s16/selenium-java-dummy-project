package project.souce.tests.run;

import project.souce.services.OrderCompletionPage;
import project.souce.ui.tests.Cart;
import project.souce.ui.tests.CheckoutInfo;
import project.souce.ui.tests.Inventory;
import project.souce.ui.tests.Login;

public class RunTests {

	public static void main(String[] args) {
		Login login = new Login();
		login.testLoginWithValidUsernameAndPAssword();
		Inventory inventory = new Inventory();
		inventory.testAddItemsInCart();
		Cart cart = new Cart();
		cart.testCheckItemsAddedInCartProperly();
		CheckoutInfo info = new CheckoutInfo();
		info.testPlaceOrderWithVaildName();
		OrderCompletionPage complete = new OrderCompletionPage();
		complete.checkOrderPlacedSuccessfully();
		
	}
}
