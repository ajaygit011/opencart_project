package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.AddToCartPage;
import com.opencart.pages.HomePage;
import com.opencart.pages.IndexPage;
import com.opencart.pages.LoginPage;

public class AddToCartTest  extends BaseClass {
	IndexPage index;
	LoginPage login;
	HomePage home;
	AddToCartPage cart;
	
	public AddToCartTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initalization();
		index = new IndexPage();
		login = index.getLoginPage();
		home=login.loginFunction(property.getProperty("email"), property.getProperty("pass"));
		cart=home.cartpage();
	}
	
	
	@Test(priority=1)
	public void CartPageTitle()
	{
		String s1 =cart.titleOfAddtoCart();
		
		Assert.assertEquals("Shopping Cart", s1);
	}
	
	@Test(priority=2)
	public void continuebutton()
	{
		Assert.assertTrue(cart.continuebutton());
	}
	
	
	@Test(priority=3)
	public void productInCart()
	{
		System.out.println(cart.itemTableDisplayed());
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
