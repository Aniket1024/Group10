package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement prd1;
	public void prd1click()
	{
		prd1.click();
	}
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement remove;
	public void removeclick()
	{
		remove.click();
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueshopping;
	public void continueshoppingclick()
	{
		continueshopping.click();
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	public void checkoutclick()
	{
		checkout.click();
	}
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
