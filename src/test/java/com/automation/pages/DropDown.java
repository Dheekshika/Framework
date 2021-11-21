package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown {
WebDriver driver;
public DropDown(WebDriver driver)
{
	this.driver=driver;
	
}
By DropDown=By.xpath("//a[@data-dropdown-rel=\"gifts\"]");

public WebElement dropDown()
{
	return driver.findElement(DropDown);
}
}
