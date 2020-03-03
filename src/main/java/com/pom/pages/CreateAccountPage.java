package com.pom.pages;

import org.openqa.selenium.WebDriver;
import com.pom.dao.CreateUserBean;
import com.pom.objrep.CreateAccountProp;
import com.pom.utils.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils  implements CreateAccountProp{
	
	WebDriver driver;
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void enterFirstName(CreateUserBean createUserBean){
		enterText(FIRSTNAME_LOCATOR,createUserBean.getFristName());
	}
	
	public void enterLastName(CreateUserBean createUserBean) {
		enterText(LASTNAME_LOCATOR,createUserBean.getLastName());	
	}
	public void enterPassword(CreateUserBean createUserBean) {
		enterText(PASSWORD_LOCATOR,createUserBean.getPassword());
	}
	public void enterAddres(CreateUserBean createUserBean) {
		enterText(ADDRESS_LOCATOR,createUserBean.getAddress());
	}
	public void enterCityName(CreateUserBean createUserBean) {
		enterText(CITY_LOCATOR,createUserBean.getCity());
	}
	public void selectState(CreateUserBean createUserBean) {
		selectValueFromDropDown(STATE_LOCATOR, createUserBean.getState());
	}
	
	public void enterPostalCode(CreateUserBean createUserBean) {
		enterText(POSTALCODE_LOCATOR, createUserBean.getZipcode());
	}
	public void enterPhoneNumber(CreateUserBean createUserBean) {
		enterText(PHONENUMBER_LOCATOR, createUserBean.getPhoneNumber());
	}
	public void enterAlias(CreateUserBean createUserBean) {
		enterText(ALIAS_LOCTOR, createUserBean.getAlias());
	}
	public void createAccount(CreateUserBean createUserBean) {
		enterFirstName(createUserBean);
		enterLastName(createUserBean);
		enterPassword(createUserBean);
		enterAddres(createUserBean);
		enterCityName(createUserBean);
		selectState(createUserBean);
		enterPostalCode(createUserBean);
		enterPhoneNumber(createUserBean);
		enterAlias(createUserBean);
	}
	public MyAccountPage clickRegister() {
		click(REGISTER_LOCATOR);
		return new MyAccountPage(driver);
	}
}
