package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.base.BaseClass;

public class RegistrationPage extends BaseClass{
	
	@FindBy(xpath="//title[contains(text(),'Register Account')]")
	WebElement title;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confpassword;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement button;

	
	@FindBy(xpath="//input[@name='agree']")
	WebElement checkbox;
	
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean pagefieldvalidator()
	{
		boolean b1 = username.isDisplayed();
		boolean b2 = lastname.isDisplayed();
		boolean b3 = email.isDisplayed();
		boolean b4 = phonenumber.isDisplayed();
		boolean b5 = password.isDisplayed();
		boolean b6 = button.isDisplayed();
		boolean b7 = checkbox.isDisplayed();
	if(b1==b2==b3==b4==b5==b6==b7==true)
	{
		return true;
	}
	else
		return false;
	}
	
	public String  validatepagetitle()
	{
		return title.getText();
	}

}
