package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BrowserFactory {
	
	
	public static WebDriver StartApplication(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
	      driver=new ChromeDriver();
	     
	     }
		else if(browserName.equals("firefox"))
		{
			
		}
		else if(browserName.equals("IE"))
		{
			
		}
		else
		{
			System.out.println("we do not support this browser");
		}
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 driver.get(appURL);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 return driver;
	}
    public static void quitBrowser()
    {
    	
    }
    
}
