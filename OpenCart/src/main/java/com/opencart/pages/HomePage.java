package com.opencart.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.base.BaseClass;


public class HomePage extends BaseClass{
	
	@FindBy(xpath="//input[@name='search']")
	WebElement searchbox;
	
	
	@FindBy(xpath="//div[@id='cart']//button")
	
	WebElement addtocart;
	
	@FindBy(xpath="//span[@class='input-group-btn']//button")
	WebElement search;
	
	@FindBy(xpath="//a[@title='Shopping Cart']")
	WebElement addtocartlink;
	
	@FindBy(xpath="//td//img[@title='MacBook']")
	WebElement macbookimg;
	
	@FindBy(xpath="//a[contains(.,'Logout')]")
	WebElement logoutlink;
	
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccount;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean searchboxvalidation()
	{
		boolean b =searchbox.isDisplayed();
		return b;
	}
	
	public boolean addtocartvalidation()
	{
		return addtocart.isDisplayed();
	}
	
	public void search(String product)
	{
		searchbox.sendKeys(product);
		search.click();
		
	}
	
	public AddToCartPage  cartpage()
	{
		addtocartlink.click();
		return new AddToCartPage();
	}
	
	
	public LogOutPage getLogoutPage()
	{
		myaccount.click();
		logoutlink.click();
		
		return new LogOutPage();
	}
	
	
	
}
