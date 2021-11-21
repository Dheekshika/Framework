package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox {
WebDriver driver;
public SearchBox(WebDriver driver)
{
	this.driver=driver;
	
}
By serach=By.xpath("//input[@type='search']");
By TableLamp=By.xpath("//span[contains(text(),'Panda Bedside Table Lamp with Pen Stand')]");
By wishlist=By.xpath("//span[contains(text(),'Add to Wishlist')]");
public WebElement search()
{
	return driver.findElement(serach);
}
public WebElement lamp()
{
	return driver.findElement(TableLamp);
	
}
public WebElement wishlist()
{
	return driver.findElement(wishlist);
}
}
