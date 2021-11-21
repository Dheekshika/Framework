package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
WebDriver driver;
public SignIn(WebDriver driver)
{
	this.driver=driver;
	
}
By signIn=By.xpath("//span[contains(text(),'sign in')]");
By email=By.xpath("//input[@id='CustomerEmail']");
By password=By.xpath("//input[@id='CustomerPassword']");

public WebElement Signin()
{
	return driver.findElement(signIn);
}
public WebElement email()
{
	return driver.findElement(email);
}
public WebElement password()
{
	return driver.findElement(password);
}


}
