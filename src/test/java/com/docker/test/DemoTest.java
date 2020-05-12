package com.docker.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class DemoTest {

	@Test
	public void Test1() {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/main/resources/drivers/chromedriver3");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/chromedriver4");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("start-maximized"); 
		options.addArguments("disable-infobars"); 
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox"); 
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testdwh2.agmednet.net/");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "AG Mednet Portal");

	}

}
