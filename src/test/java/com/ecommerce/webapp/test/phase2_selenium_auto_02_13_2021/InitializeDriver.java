package com.ecommerce.webapp.test.phase2_selenium_auto_02_13_2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {
	
	static WebDriver driver;
	final static String driverPATH = "C:\\Users\\HOME\\Desktop\\Siimplilearn\\phase2-selenium-auto-02-13-2021\\driver\\driver\\chromedriver.exe";
	
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", driverPATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		RuntimeDriver.setWebDriver(driver);
	}
}
