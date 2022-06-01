package com.SauceDemo.TestClasses;

import java.io.IOException;

//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.BillingPage;
import com.SauceDemo.POMClasses.CartPage;
import com.SauceDemo.POMClasses.HomePage;
import com.SauceDemo.POMClasses.OrderPlaced;
import com.SauceDemo.POMClasses.YourInformation;
import com.SauceDemo.UtilityClasses.ScreenShots;

//import com.SauceDemo.POMClasses.HomePage;
//import com.SauceDemo.POMClasses.LoginPage;

public class TC01_LoginCheck extends TestBaseClass
{
	
	@Test
	public void TC01() throws InterruptedException 
	{
		
		String Expected_url="https://www.saucedemo.com/inventory.html";
		String Actual_url=driver.getCurrentUrl();
		
		if(Expected_url.equals(Actual_url))
		{
			System.out.println("Test Case is passed ");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
	}
	
	@Test
	public void TC02() throws InterruptedException, IOException 
	{
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.addtocartclick();
		Thread.sleep(3000);
		hp.cartclick();
		
		ScreenShots ss=new ScreenShots(driver);
		ss.takescreenshot("Cart");
		
		CartPage cp=new CartPage(driver);
		Thread.sleep(3000);
		cp.checkoutclick();
		
		YourInformation yi=new YourInformation(driver);
		Thread.sleep(3000);
		yi.sendfirstname();
		Thread.sleep(3000);
		yi.sendlastname();
		Thread.sleep(3000);
		yi.sendpostalcode();
		ss.takescreenshot("Information");
		Thread.sleep(3000);
		yi.continueclick();
		
		ss.takescreenshot("Bill");
		BillingPage bp=new BillingPage(driver);
		Thread.sleep(3000);
		bp.finishclick();
		
		ss.takescreenshot("Order Placed");
		
		String Expected_url="https://www.saucedemo.com/checkout-complete.html";
		String Actual_url=driver.getCurrentUrl();
		
		if(Expected_url.equals(Actual_url))
		{
			System.out.println("Test Case is passed ");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		OrderPlaced op=new OrderPlaced(driver);
		Thread.sleep(3000);
		op.backtoproductsclick();
	}
	
}
