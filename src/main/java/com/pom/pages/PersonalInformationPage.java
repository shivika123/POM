package com.pom.pages;

import org.openqa.selenium.WebDriver;

import com.pom.dao.PersonalInformationBean;
import com.pom.objrep.PersonalInformationPageProp;
import com.pom.utils.WebDriverUtils;
public class PersonalInformationPage extends WebDriverUtils implements PersonalInformationPageProp {
WebDriver driver;
	
	public PersonalInformationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void editFirstName(PersonalInformationBean personalInformationBean) {
		enterText(FIRSTNAME_LOCATOR, personalInformationBean.getFirstName());
	}
	
	public void editLastName(PersonalInformationBean personalInformationBean) {
		enterText(LASTNAME_LOCATOR, personalInformationBean.getLastName());
	}
	
	public void enterCurrentPassword(PersonalInformationBean personalInformationBean) {
		enterText(CURRENTPASSWORD_LOCATOR, personalInformationBean.getPassword());
	}
	
	public MyAccountPage clickSaveButton() {
		click(SAVEBUTTON_LOCATOR);
		return new MyAccountPage(driver);
	}
}