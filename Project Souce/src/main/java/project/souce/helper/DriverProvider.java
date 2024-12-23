package project.souce.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

	public static WebDriver driver = null;
	
	public static WebDriver getLocalDriver() {
		if(DriverProvider.driver == null) {
			DriverProvider.driver = new ChromeDriver();
		}
		return DriverProvider.driver;
	}
}
