package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	private WebDriver driver;
	private Select s;
	
	//WebElement prd1=driver.finelementby(By.xpath)
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement prd1;
	public void prd1click()
	{
		prd1.click();
	}
	
	
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	private WebElement prd2;
	public void prd2click()
	{
		prd2.click();
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement prd3;
	public void prd3click()
	{
		prd3.click();
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement prd4;
	public void prd4click()
	{
		prd4.click();
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']")
	private WebElement prd5;
	public void prd5click()
	{
		prd5.click();
	}
	
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']")
	private WebElement prd6;
	public void prd6click()
	{
		prd6.click();
	}
	
//	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
//	private WebElement addtocart1;
//	public void addtocart1click()
//	{
//		addtocart1.click();
//	}
//	
//	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
//	private WebElement addtocart2;
//	public void addtocart2click()
//	{
//		addtocart2.click();
//	}
//	
//	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
//	private WebElement addtocart3;
//	public void addtocart3click()
//	{
//		addtocart3.click();
//	}
//	
//	@FindBy(xpath="(//button[text()='Add to cart'])[4]")
//	private WebElement addtocart4;
//	public void addtocart4click()
//	{
//		addtocart4.click();
//	}
//	
//	@FindBy(xpath="(//button[text()='Add to cart'])[5]")
//	private WebElement addtocart5;
//	public void addtocart5click()
//	{
//		addtocart5.click();
//	}
//	
//	@FindBy(xpath="(//button[text()='Add to cart'])[6]")
//	private WebElement addtocart6;
//	public void addtocart6click()
//	{
//		addtocart6.click();
//	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> addtocart;
	public void addtocartclick()
	{
		for(int i=0;i<addtocart.size();i++)
		{
			addtocart.get(i).click();
		}
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement SideMenu;
	public void SideMenuclick()
	{
		SideMenu.click();
	}
	
	@FindBy(xpath="//a[@id='inventory_sidebar_link']")
	private WebElement allitems;
	public void allitemsclick()
	{
		allitems.click();
	}
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement about;
	public void aboutclick()
	{
		about.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	public void logoutclick()
	{
		logout.click();
	}
	
	@FindBy(xpath="//a[@id='reset_sidebar_link']")
	private WebElement resetappstate;
	public void resetappstateclick()
	{
		resetappstate.click();
	}
	
	@FindBy(xpath="//div[@id='shopping_cart_container']")
	private WebElement cart; 
	public void cartclick()
	{
		cart.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	public void filterclick()
	{
		filter.click();
		
		s=new Select(filter);
		s.selectByIndex(2);
//		s.selectByValue("za");
//		s.selectByIndex(2);
//		s.selectByVisibleText("Price (low to high)");
	}
	
	@FindBy(xpath="//button[@id='react-burger-cross-btn']")
	private WebElement sideclosebutton; 
	public void sideclosebuttonclick()
	{
		sideclosebutton.click();
	}
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
