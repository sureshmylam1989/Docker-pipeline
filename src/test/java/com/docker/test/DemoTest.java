package com.docker.test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import okhttp3.Challenge;

public class DemoTest {

	@Test
	public void Test1() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/main/resources/drivers/chromedriver2");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver4");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
//		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testdwh2.agmednet.net/");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "AG Mednet Portal");

	}

}
