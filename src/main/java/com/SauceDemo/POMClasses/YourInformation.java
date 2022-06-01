package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformation 
{
private WebDriver driver;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	public void sendfirstname()
	{
		firstname.sendKeys("Aniket");
	}
	
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	public void sendlastname()
	{
		lastname.sendKeys("Bhosale");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalcode;
	public void sendpostalcode()
	{
		postalcode.sendKeys("413102");
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancel;
	public void cancelClick()
	{
		cancel.click();
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueBtn;
	public void continueclick()
	{
		continueBtn.click();
	}
	
	public YourInformation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
