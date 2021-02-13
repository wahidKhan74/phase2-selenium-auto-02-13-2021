package com.ecommerce.webapp.test.phase2_selenium_auto_02_13_2021;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadGithubUserProfileTest {
	
	

	@Before
	public void setUp() throws Exception {
		InitializeDriver.setUp();
	}

	@After
	public void tearDown() throws Exception {
		// driver.close();
	}

	@Test
	public void testForUploadProfile() throws InterruptedException, IOException {
		WebDriver driver = RuntimeDriver.getWebDriver();
		LoginGithub.testLogin();
		
		Thread.sleep(2000);
		
		// launch the profile page
		final String siteURL = "https://github.com/settings/profile";
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(siteURL);

		
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary/div"))
		.click();
		
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label"))
		.click();
		
		Thread.sleep(5000);
		
		// upload file with windows popup and close popup
		Runtime.getRuntime().exec("C:\\Users\\HOME\\Desktop\\AutoIT\\uploadfile.exe");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
