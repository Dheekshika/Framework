package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
WebDriver driver;
public LandingPage(WebDriver driver)
{
	this.driver=driver;
	
}
By WtsNew=By.xpath("//button[contains(text(),\"What's New\")]");

public WebElement wtsNew()
{
	return driver.findElement(WtsNew);
}
}
