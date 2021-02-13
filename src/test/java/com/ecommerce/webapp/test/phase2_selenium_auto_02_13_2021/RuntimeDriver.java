package com.ecommerce.webapp.test.phase2_selenium_auto_02_13_2021;

import org.openqa.selenium.WebDriver;

public class RuntimeDriver {
	
	private static WebDriver webDriver;

	public static WebDriver getWebDriver() {
		return webDriver;
	}

	public static void setWebDriver(WebDriver webDriver) {
		RuntimeDriver.webDriver = webDriver;
	}

}
