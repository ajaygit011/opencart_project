package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.opencart.utils.OpencartUtils.takeScreenShot;

import java.io.IOException;

import com.opencart.base.BaseClass;

public class ProductPage extends BaseClass{
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtocart;
	

	
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String addtocart() 
	{
		addtocart.click();
		
		try {
			takeScreenShot("cart_screen_shot");
			return "ss taken";
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return "ss taken";
		
		
	}

}
