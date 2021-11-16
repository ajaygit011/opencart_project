package com.opencart.testcases;

import static com.opencart.utils.OpencartUtils.takeScreenShot;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.base.BaseClass;
import com.opencart.pages.HomePage;
import com.opencart.pages.IndexPage;
import com.opencart.pages.LoginPage;

public class HomePageTest extends BaseClass{
	IndexPage index;
	LoginPage login;
	HomePage home;
	
	public HomePageTest()
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
		
	
	}
	
	@Test(priority=1)
	public void searchfieldTest()
	{
		boolean b =home.searchboxvalidation();
		Assert.assertTrue(b);
		
	}
	
	@Test(priority=2)
	public void addtocartvalidation()
	{
		boolean b =home.addtocartvalidation();
		Assert.assertTrue(b);
		
	}
	
	@Test(priority=3)
	public void searchOpration()
	{
	
		
		home.search("phone");
		try {
			takeScreenShot("phone_ss");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		//Assert.assertTrue(b);
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	

}
