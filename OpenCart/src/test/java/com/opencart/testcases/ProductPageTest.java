package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.HomePage;
import com.opencart.pages.IndexPage;
import com.opencart.pages.LoginPage;
import com.opencart.pages.ProductPage;

public class ProductPageTest extends BaseClass{

	IndexPage index;
	LoginPage login;
	HomePage home;
	ProductPage product;
	
	public ProductPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initalization();
		index = new IndexPage();
		login=index.getLoginPage();
		String s1= property.getProperty("email");
		String s2=property.getProperty("pass");
		home=login.loginFunction(s1, s2);
		product=home.productDetails();
		
	
	}
	@Test(priority=1)
	public void itemaddtocart()
	{
		String s1 =product.addtocart();
		Assert.assertEquals("ss taken", s1);
	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
