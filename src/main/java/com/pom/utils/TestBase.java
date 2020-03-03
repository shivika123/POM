package com.pom.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBase implements SetUp{
	WebDriver driver;
	/**
	 * starting point of creating a driver
	 * @return driver 
	 */
	public WebDriver intilizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		return driver;
	}
	public void enterURL(String url) {
		driver.get(url);
	}
}

