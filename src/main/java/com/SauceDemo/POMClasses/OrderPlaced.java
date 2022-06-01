package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPlaced 
{
private WebDriver driver;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backtoproducts;
	public void backtoproductsclick()
	{
		backtoproducts.click();
	}
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement ordertxt;
	public void getordertxt()
	{
		System.out.println(ordertxt.getText());
	}
	
	public OrderPlaced(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
