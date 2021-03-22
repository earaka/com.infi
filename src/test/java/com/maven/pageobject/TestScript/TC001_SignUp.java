package com.maven.pageobject.TestScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maven.base.testbase;

import pages.SignupPage;

public class TC001_SignUp extends testbase{
	
	SignupPage signupPage;
	
	@BeforeTest
	public void setUp()
	{
		openBrowser();
		signupPage=new SignupPage();
	}
	
	@Test
	public void validate_click_createAccount()
	{
		signupPage.click_createAccount();
	}

	@Test
	public void validate_sendKeys_fullName()
	{
		signupPage.verifySignup("Admin");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
}
