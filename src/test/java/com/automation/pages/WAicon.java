package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WAicon {
WebDriver driver;
public WAicon(WebDriver driver)
{
	this.driver=driver;
	
}
By serach=By.xpath("//input[@type='search']");
By Products=By.xpath("//a[@class=\"snize-main-panel-controls-products active\"]");
By dropdown=By.xpath("//a[@class=\"snize-main-panel-dropdown-button\"]");
By price=By.xpath("//a[@class=\"snize-main-panel-dropdown-price-asc\"]");
By icon=By.xpath("//img[@class=\"wa-chat-btn-icon-image-only\"]");
public WebElement search()
{
	return driver.findElement(serach);
}
public WebElement productLink()
{
	return driver.findElement(Products);
}
public WebElement dropdown()
{
	return driver.findElement(dropdown);
}
public WebElement price()
{
	return driver.findElement(price);
}
public WebElement whatsapp()
{
	return driver.findElement(icon);
}
}
