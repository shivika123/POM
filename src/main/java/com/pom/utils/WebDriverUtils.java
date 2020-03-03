package com.pom.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtils {
	WebDriver driver;
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void click(By prop) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(prop));
		driver.findElement(prop).click();
		
	}
	public void enterText(By prop,String value) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(prop));
		cleatValueFromTextBox(prop);
		driver.findElement(prop).sendKeys(value);
	}
	public void cleatValueFromTextBox(By prop) {
		driver.findElement(prop).clear();
	}
	public void selectValueFromDropDown(By prop,String value) {
		new Select(driver.findElement(prop)).selectByValue(value);
	}
	public void selectValueFromDropDown(By prop,int index) {
		new Select(driver.findElement(prop)).selectByIndex(index);
	}
	public String getText(By prop) {
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(prop));
		return driver.findElement(prop).getText();
	}

}
