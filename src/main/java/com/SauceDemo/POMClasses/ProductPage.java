package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement prd1;
	public void prd1click()
	{
		prd1.click();
	}
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement remove;
	public void removeclick()
	{
		remove.click();
	}
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backtoprd;
	public void backtoprdclick()
	{
		backtoprd.click();
	}
	
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
