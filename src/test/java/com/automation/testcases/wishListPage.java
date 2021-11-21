package com.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.pages.DropDown;
import com.automation.pages.LandingPage;
import com.automation.pages.ProductPage;
import com.automation.pages.SearchBox;
import com.automation.pages.Wishlist;
import com.automation.utilities.BrowserFactory;

import jdk.internal.org.jline.utils.Log;

public class wishListPage {
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
        SearchBox s=new SearchBox(driver);
        s.search().sendKeys("Panda");
        s.search().sendKeys(Keys.ARROW_DOWN);
        s.search().sendKeys(Keys.ENTER);
        s.lamp().click();
        s.wishlist().click();
        Wishlist list=new Wishlist(driver);
        list.wishListPage().click();
        list.AddToCart().click();
        DropDown d=new DropDown(driver);
        d.dropDown().click();
        
      
        
		
	}

}
