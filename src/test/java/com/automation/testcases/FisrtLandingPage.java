package com.automation.testcases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.LogManager;
import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.pages.LandingPage;
import com.automation.pages.ProductPage;
import com.automation.utilities.BrowserFactory;

import jdk.internal.org.jline.utils.Log;

public class FisrtLandingPage {
	
	WebDriver driver;
	@Test
	
	
	public void LoginApp()
	
	{
		driver=BrowserFactory.StartApplication(driver,"chrome", "https://www.bigsmall.in/");
		
		System.out.println(driver.getTitle());
		Log.info("navigating to the product page");
		LandingPage page=new LandingPage(driver);
		
		page.wtsNew().click();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		ProductPage prod=new ProductPage(driver);
		prod.prod().click();
	}

}
