package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.HomePage;
import com.opencart.pages.IndexPage;
import com.opencart.pages.RegistrationPage;

public class RegistrationPageTest extends BaseClass {
	
	HomePage home;
	IndexPage index;
	RegistrationPage registration;
	
	
	public RegistrationPageTest()
	{
		super();
	}
	
	
	@BeforeTest
	public void setup()
	{
		initalization();
		index=new IndexPage();
		registration=index.getRegistrationPage();
		
	}
	
	
	@Test(priority=1)
	public void validateinputfields()
	{
		boolean b1 =registration.pagefieldvalidator();
		Assert.assertTrue(b1);
	}
	
	
	@Test(priority=2)
	public void validatePageTitle()
	{
		String expected = "Register Account";
		Assert.assertEquals(expected, "Register Account");
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
