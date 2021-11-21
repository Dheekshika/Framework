package com.automation.testcases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.LogManager;
import org.jsoup.Connection.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.pages.LandingPage;
import com.automation.pages.ProductPage;
import com.automation.pages.viewAll;
import com.automation.utilities.BrowserFactory;

import jdk.internal.org.jline.utils.Log;

public class ViewAllPage {
	
	WebDriver driver;
	@Test
	
	
	public void LoginApp()
	
	{
		driver=BrowserFactory.StartApplication(driver,"chrome", "https://www.bigsmall.in/");
		
		viewAll page=new viewAll(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		
		page.viewAll().click();
		
	
	
		
		
	}

}
