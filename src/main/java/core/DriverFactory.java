package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DriverFactory {
	//private static WebDriver driver;
	
	private DriverFactory() {}
	
	//criar diver
	/*public static WebDriver getDriver() {
		if(driver == null) {
			driver = new FirefoxDriver();
		}
		return driver;
	}*/
	
	//matar driver
	/*public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}*/
	
}
