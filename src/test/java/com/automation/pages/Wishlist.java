package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wishlist {
WebDriver driver;
public Wishlist(WebDriver driver)
{
	this.driver=driver;
	
}
By wishlist=By.xpath("//span[contains(text(),'wish list')]");
By AddToCart=By.linkText("Add To Cart");
public WebElement wishListPage()
{
	return driver.findElement(wishlist);
}
public WebElement AddToCart()
{
	return driver.findElement(AddToCart);
}
}
