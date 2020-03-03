package com.pom.dao;
import org.apache.commons.lang.RandomStringUtils;
	public class BeanFactory {
	public void setDataForCreateNewUser(CreateUserBean createUserBean) {
		createUserBean.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		createUserBean.setFristName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setLastName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setPassword("Manoj@123");
		createUserBean.setAddress(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setCity(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setState("5");
		createUserBean.setZipcode("00000");
		createUserBean.setPhoneNumber(RandomStringUtils.randomNumeric(10));
		createUserBean.setAlias(RandomStringUtils.randomAlphabetic(5));
	}
	public void setDataForEditUserDetails(PersonalInformationBean personalInformationBean) {
		personalInformationBean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		personalInformationBean.setLastName(RandomStringUtils.randomAlphabetic(5));
		personalInformationBean.setPassword("Manoj@123");
	}
}
