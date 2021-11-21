package com.automation.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.pages.LandingPage;
import com.automation.pages.ProductPage;
import com.automation.pages.SearchBox;
import com.automation.pages.SearchBox2;
import com.automation.utilities.BrowserFactory;

public class searchPage2 {
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
        SearchBox2 sr=new SearchBox2(driver);
        sr.search().sendKeys("New year gifts");
        sr.search().sendKeys(Keys.ARROW_DOWN);
        sr.search().sendKeys(Keys.ENTER);
       sr.productLink().click();
       sr.dropdown().click();
       sr.price().click();
       
        
        
		
	}

}
