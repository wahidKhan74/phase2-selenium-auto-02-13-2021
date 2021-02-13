package com.ecommerce.webapp.test.phase2_selenium_auto_02_13_2021;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGithub {

	public static void testLogin() {
		WebDriver driver = RuntimeDriver.getWebDriver();
		final String siteURL = "https://github.com/login";		
		driver.get(siteURL);

		driver.findElement(By.id("login_field")).sendKeys(LoginCreds.username);
		driver.findElement(By.id("password")).sendKeys(LoginCreds.password);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/input[14]")).submit();
	}
}
