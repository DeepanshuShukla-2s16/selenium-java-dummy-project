package project.souce.ui.tests;

import project.souce.services.InventoryPage;


public class Inventory {

		
		public void testAddItemsInCart() {
			InventoryPage inventory = new InventoryPage();
			
			inventory.openUrl();
			inventory.addToCartItems();	
	}
}
