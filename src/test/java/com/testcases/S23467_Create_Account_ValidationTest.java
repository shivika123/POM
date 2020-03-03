package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.dao.BeanFactory;
import com.pom.dao.CreateUserBean;
import com.pom.dao.PersonalInformationBean;
import com.pom.pages.CreateAccountPage;
import com.pom.pages.LandingPage;
import com.pom.pages.MyAccountPage;
import com.pom.pages.PersonalInformationPage;
import com.pom.pages.SignInPage;
import com.pom.utils.TestBase;

public class S23467_Create_Account_ValidationTest extends TestBase{

	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
	driver=intilizeDriver();
	enterURL(AUTOMATION_URL);
	}
	
	@Test
	public void createAccountTestCase() {
	LandingPage landingPage=new LandingPage(driver);
	SignInPage page=landingPage.clickSignIn();
	BeanFactory beanFactory=new BeanFactory();
	CreateUserBean createUserBean=new CreateUserBean();
	beanFactory.setDataForCreateNewUser(createUserBean);
	page.enterEmailAddress(createUserBean);
	CreateAccountPage accountPage=page.clickCreateAccountButton();
	accountPage.createAccount(createUserBean);
	MyAccountPage myAccountPage=accountPage.clickRegister();
	Assert.assertEquals(myAccountPage.getAccountName(), createUserBean.getFristName()+" "+createUserBean.getLastName());
	
	}
	@Test
	public void m1() {
		System.out.println("hello");
	}
	
	@Test
	public void editAccountTestCase() {
	LandingPage landingPage=new LandingPage(driver);
	SignInPage page=landingPage.clickSignIn();
	
	BeanFactory beanFactory=new BeanFactory();
	
	CreateUserBean createUserBean=new CreateUserBean();
	beanFactory.setDataForCreateNewUser(createUserBean);
	page.enterEmailAddress(createUserBean);
	CreateAccountPage accountPage=page.clickCreateAccountButton();
	accountPage.createAccount(createUserBean);
	MyAccountPage myAccountPage=accountPage.clickRegister();
	
	PersonalInformationPage personalInformationPage=myAccountPage.clickMyPersonalInformation();
	PersonalInformationBean personalInformationBean=new PersonalInformationBean();
	beanFactory.setDataForEditUserDetails(personalInformationBean);
	personalInformationPage.editFirstName(personalInformationBean);
	personalInformationPage.editLastName(personalInformationBean);
	personalInformationPage.enterCurrentPassword(personalInformationBean);
	myAccountPage=personalInformationPage.clickSaveButton();
	
	Assert.assertEquals(myAccountPage.getAccountName().toLowerCase(), personalInformationBean.getFirstName().toLowerCase()+" "+personalInformationBean.getLastName().toLowerCase());
	
	}
}