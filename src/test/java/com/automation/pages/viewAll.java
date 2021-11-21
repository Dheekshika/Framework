package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class viewAll {
WebDriver driver;
public viewAll(WebDriver driver)
{
	this.driver=driver;
	
}
By viewAll=By.xpath("//a[contains(text(),'View All')]");

public WebElement viewAll()
{
	return driver.findElement(viewAll);
}
}
