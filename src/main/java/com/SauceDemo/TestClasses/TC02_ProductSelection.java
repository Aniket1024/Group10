package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.BillingPage;
import com.SauceDemo.POMClasses.CartPage;
import com.SauceDemo.POMClasses.HomePage;
import com.SauceDemo.POMClasses.LoginPage;
import com.SauceDemo.POMClasses.OrderPlaced;
import com.SauceDemo.POMClasses.ProductPage;
import com.SauceDemo.POMClasses.YourInformation;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TC02_ProductSelection 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Open");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url Entered");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPage lp=new LoginPage(driver);
		
		Thread.sleep(3000);
		lp.sendusername();
		System.out.println("entered Username");
		
		Thread.sleep(3000);
		lp.sendpassword();
		System.out.println("entered Password");
		
		
		ScreenShots ss=new ScreenShots(driver);
		
		ss.takescreenshot("Login Page");
		Thread.sleep(3000);
		lp.loginclick();
		System.out.println("Clicked on Login");
		
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.prd1click();
		
		ss.takescreenshot("Product Click");
			
		//ProductPage pp=new ProductPage(driver);
		Thread.sleep(3000);
		hp.addtocartclick();
		hp.cartclick();
		
		
		CartPage cp=new CartPage(driver);
		Thread.sleep(3000);
		ss.takescreenshot("Cart");
		cp.checkoutclick();
		
		YourInformation yf=new YourInformation(driver);
		Thread.sleep(3000);
		yf.sendfirstname();
		Thread.sleep(3000);
		yf.sendlastname();
		Thread.sleep(3000);
		yf.sendpostalcode();
		Thread.sleep(3000);
		ss.takescreenshot("Customer Information");
		yf.continueclick();
		
		BillingPage bp=new BillingPage(driver);
		Thread.sleep(3000);
		ss.takescreenshot("Billing Page");
		bp.finishclick();
		
		OrderPlaced op=new OrderPlaced(driver);
		//Thread.sleep(3000);
		op.getordertxt();
		ss.takescreenshot("Order Placed");
		Thread.sleep(3000);
		
		op.backtoproductsclick();
		
		Thread.sleep(3000);
		hp.SideMenuclick();
		Thread.sleep(3000);
		hp.logoutclick();
		
		ss.takescreenshot("Logout");
		
	}
}
