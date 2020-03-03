package com.pom.pages;

import org.openqa.selenium.WebDriver;

import com.pom.dao.CreateUserBean;
import com.pom.objrep.SignInPageProp;
import com.pom.utils.WebDriverUtils;
public class SignInPage extends WebDriverUtils implements SignInPageProp {
	WebDriver driver;
	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void enterEmailAddress(CreateUserBean createUserBean) {
		enterText(emailLocator,createUserBean.getEmailAddress());
	}
	public CreateAccountPage clickCreateAccountButton() {
		click(createAccountLocator);
		return new CreateAccountPage(driver);
	}
}

