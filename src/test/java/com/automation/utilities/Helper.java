package com.automation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {

	//screenshots,alerts,frames,multiple windows
	public static void captureScreenshot(WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshots/Framework"+ getCurrentDateTime() +".png"));
	}
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
		
		
	}
}
