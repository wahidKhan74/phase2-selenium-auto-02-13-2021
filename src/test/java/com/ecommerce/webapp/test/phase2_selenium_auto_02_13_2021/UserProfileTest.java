package com.ecommerce.webapp.test.phase2_selenium_auto_02_13_2021;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserProfileTest {
	
	WebDriver driver;
	final String siteURL = "file:///C:/Users/HOME/Desktop/Siimplilearn/phase2-selenium-auto-02-13-2021/static/index.html";
	final String driverPATH = "C:\\Users\\HOME\\Desktop\\Siimplilearn\\phase2-selenium-auto-02-13-2021\\driver\\driver\\chromedriver.exe";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", driverPATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(siteURL);
	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

	@Test
	public void testUserProfileUpload() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("waheedkhan74");
		driver.findElement(By.id("email")).sendKeys("waheedkhan@gmail.com");
		driver.findElement(By.id("profile")).sendKeys("Solution Architect");
		driver.findElement(By.id("address")).sendKeys("ABC Complex 201, ABC Lane");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).click();
		
	}

}
