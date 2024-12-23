package project.souce.ui.tests;

import project.souce.services.CheckoutInformationPage;

public class CheckoutInfo {


	public void testPlaceOrderWithVaildName() {
		CheckoutInformationPage orderPlace = new CheckoutInformationPage();
		orderPlace.openUrl();
		orderPlace.enterFirstName("Sumit");
		orderPlace.enterLastName("singh");
		orderPlace.enterZipOrPostalCode("652343");
		orderPlace.placeOrder();
		orderPlace.finishOrder();
	}
}
