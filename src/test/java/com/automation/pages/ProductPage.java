package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
WebDriver driver;
public ProductPage(WebDriver driver)
{
	this.driver=driver;
	
}
By Product=By.xpath("//div[contains(text(),'Naruto Chibi Action Figure - Set of 6')]");

public WebElement prod()
{
	return driver.findElement(Product);
}
}
