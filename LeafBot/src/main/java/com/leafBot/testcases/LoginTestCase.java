package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.HomePage;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginTestCase extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
		
		/*LoginPage page = new LoginPage();
		page.enterUsername(username);
		page.enterPassword(password);
		page.clickLogin();
		
		HomePage page1 = new HomePage();
		page1.clickLogout();*/
	}
}
