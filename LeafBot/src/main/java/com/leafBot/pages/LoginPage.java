package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage enterUsername(String data) {
		locateElement("Id", "username").sendKeys(data);
		//driver.findElementById("username").sendKeys(data);
		return this;
	}

	public LoginPage enterPassword(String data) {
		//driver.findElementById("password").sendKeys(data);
		locateElement("Id","password").sendKeys(data);
		return this;
	}

	public HomePage clickLogin() {
		locateElement("ClassName","decorativeSubmit").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		/*
		 * HomePage page = new HomePage(); return page;
		 */
		return new HomePage();
	}

	
}
