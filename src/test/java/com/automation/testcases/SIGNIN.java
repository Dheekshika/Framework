package com.automation.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.automation.pages.LandingPage;
import com.automation.pages.ProductPage;
import com.automation.pages.SignIn;
import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;
import com.automation.utilities.configDataProvider;

public class SIGNIN {
	WebDriver driver;
	public configDataProvider config;
	
	@Test
	public void LoginApp() throws IOException
	{
		Reporter.log("Test started",true);
		
		ExcelDataProvider excel=new ExcelDataProvider();
		config=new configDataProvider();
		
		
		
		
		driver=BrowserFactory.StartApplication(driver,config.getBrowser(), config.getStagingUrl());
		
		System.out.println(driver.getTitle());
		Reporter.log("Title got printed",true);
	
		LandingPage page=new LandingPage(driver);
		page.wtsNew().click();
		ProductPage prod=new ProductPage(driver);
		prod.prod().click();
        System.out.println(driver.getTitle());
        SignIn sp=new SignIn(driver);
        Reporter.log("Navigated to signin page",true);
		sp.Signin().click();
		sp.email().sendKeys(excel.getStringData("SignIn", 0, 0));
		sp.password().sendKeys(excel.getStringData("SignIn", 0, 1));
		sp.password().sendKeys(Keys.ENTER);
		Helper.captureScreenshot(driver);
		
		 Reporter.log("Test completed",true);
		
	}
	@AfterMethod
    public void tearDownMethod(ITestResult result) throws IOException
    {
    	if(result.getStatus()==ITestResult.FAILURE);
    	{
    		Helper.captureScreenshot(driver);
    		
    		
    	}
    
    }
      
}
