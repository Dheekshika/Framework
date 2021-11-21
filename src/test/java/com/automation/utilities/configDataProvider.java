package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDataProvider {
    Properties pro;
	public configDataProvider() throws IOException
	{
		File src=new File("./Config/config.properties");
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	}
	public String getDataFromConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
	public String getBrowser()
	{
		return pro.getProperty("Browser");
		
	}
	public String getStagingUrl()
	{
		return pro.getProperty("url");
	}
}
