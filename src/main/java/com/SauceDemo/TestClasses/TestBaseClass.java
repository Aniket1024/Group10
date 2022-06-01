package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePage;
import com.SauceDemo.POMClasses.LoginPage;
import com.SauceDemo.UtilityClasses.ScreenShots;

public class TestBaseClass 
{
	WebDriver driver;
	Logger log=Logger.getLogger("SauceDemo");

	@Parameters("BrowserName")
	
//	@BeforeSuite
//	public void beforeSuite()
//	{
//		
//		
//	}
	
	@BeforeTest
	public void beforeTest(String BrowserName)
	{
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName.equals("gecko"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser Open");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		driver.get("https://www.saucedemo.com/");
		log.info("Url Entered");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		
		Thread.sleep(3000);
		lp.sendusername();
		log.info("entered Username");
		
		Thread.sleep(3000);
		lp.sendpassword();
		log.info("entered Password");
		ScreenShots ss=new ScreenShots(driver);
		ss.takescreenshot("Login");
		
		Thread.sleep(3000);
		lp.loginclick();
		log.info("Clicked on Login");
		
		
	}
	
//	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		Thread.sleep(3000);
		hp.SideMenuclick();
		Thread.sleep(3000);
		hp.logoutclick();
	}
//	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
//	
	@AfterTest
	public void afterTest()
	{
		log.info("End Of the Program");  
	}
//	
//	@AfterSuite
//	public void afterSuite()
//	{
//		System.out.println("End Of the Program");
//	}
	
	
	
}
