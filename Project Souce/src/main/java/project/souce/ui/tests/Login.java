package project.souce.ui.tests;

import project.souce.services.LoginPage;
public class Login {

	private final String USERNAME = "standard_user";
	private final String PASSWORD = "secret_sauce";
	
	public void testLoginWithValidUsernameAndPAssword() {
		LoginPage login = new LoginPage();
		
		login.openUrl();
		login.getTitle("Swag Labs");
		login.enterUsername(USERNAME);
		login.enterPassword(PASSWORD);
		login.clickLoginBtn();
	}
}
