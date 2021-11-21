package com.automation.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.automation.pages.LandingPage;
import com.automation.pages.ProductPage;
import com.automation.pages.SearchBox;
import com.automation.pages.SearchBox2;
import com.automation.pages.WAicon;
import com.automation.utilities.BrowserFactory;

public class WhatsappIcon {
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
       WAicon icon=new WAicon(driver);
        icon.search().sendKeys("New year gifts");
        icon.search().sendKeys(Keys.ARROW_DOWN);
        icon.search().sendKeys(Keys.ENTER);
       icon.productLink().click();
       icon.dropdown().click();
       icon.price().click();
       icon.whatsapp().click();
       
       
        
        
		
	}

}
