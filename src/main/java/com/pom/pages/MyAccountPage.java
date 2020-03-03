package com.pom.pages;

import org.openqa.selenium.WebDriver;
import com.pom.objrep.MyAccountPageProp;
import com.pom.utils.WebDriverUtils;
public class MyAccountPage extends WebDriverUtils implements MyAccountPageProp {
	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public String getAccountName() {
		System.out.println("Actual text ::: "+getText(ACCOUNTNAME_LOCATOR));
		return getText(ACCOUNTNAME_LOCATOR);
	}
	public PersonalInformationPage clickMyPersonalInformation() {
		click(PEROSNALINFO_LOCATOR);
		return new PersonalInformationPage(driver);
	}
}
