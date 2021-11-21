package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.pages.LandingPage;
import com.automation.pages.ProductPage;
import com.automation.utilities.BrowserFactory;

public class verifyTitle {
	WebDriver driver;
	@Test
	public void LoginApp()
	{
		driver=BrowserFactory.StartApplication(driver,"chrome", "https://www.bigsmall.in/");
		System.out.println(driver.getTitle());
	
		LandingPage page=new LandingPage(driver);
		page.wtsNew().click();
		ProductPage prod=new ProductPage(driver);
		prod.prod().click();
        System.out.println(driver.getTitle());
		
	}

}
