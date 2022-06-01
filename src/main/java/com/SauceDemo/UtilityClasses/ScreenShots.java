package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class ScreenShots 
{
	private  WebDriver driver;
	
	public void takescreenshot(String x) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./ScreenShots/"+x+".jpg");
		FileHandler.copy(Source, Dest);
	}
	
	public ScreenShots(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
}
