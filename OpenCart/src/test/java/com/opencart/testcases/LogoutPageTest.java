package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.HomePage;
import com.opencart.pages.IndexPage;
import com.opencart.pages.LogOutPage;
import com.opencart.pages.LoginPage;

public class LogoutPageTest extends BaseClass {
	IndexPage index;
	HomePage home;
	LoginPage login;
	LogOutPage logout;
	
	
	public LogoutPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initalization();
		index= new IndexPage();
		login=index.getLoginPage();
		home=login.loginFunction(property.getProperty("email"), property.getProperty("pass"));
		logout=home.getLogoutPage();
		
	}
	
	@Test(priority=1)
	public void titlevalidation() 
	{
	

		String s1=logout.getTitle();
		Assert.assertEquals("Account Logout", s1);
	}
	
	@Test(priority=2)
	public void buttonvalidation()
	{
		
		Assert.assertTrue(logout.continuebuttonvalidation());
	}
	
	@Test(priority=3)
	public void continuebuttonclick()
	{
		System.out.println(logout.continuebuttonvalidation());
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	

}
