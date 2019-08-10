package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	
}
