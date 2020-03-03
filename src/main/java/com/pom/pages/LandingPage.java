package com.pom.pages;

import org.openqa.selenium.WebDriver;
import com.pom.objrep.LandingPageProp;
import com.pom.utils.WebDriverUtils;
public class LandingPage extends WebDriverUtils implements LandingPageProp{
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public SignInPage clickSignIn() {
		click(signLocator); 
		return new SignInPage(driver);
	}
}

