package chrome;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.MediaEntityBuilder;

public class ExtentReport {

	@Test
	public void test() throws IOException
	{
		
		ExtentHtmlReporter report=new ExtentHtmlReporter("./Reports/Framework.html");
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(report);
		ExtentTest logger= extent.createTest("Login test");
		logger.log(Status.INFO, "Login to biggsmall.in");
		logger.log(Status.PASS, "signin page");
		extent.flush();
		ExtentTest logger2= extent.createTest("test add to cart");
		logger2.log(Status.INFO,"check whether the p"
				+ "roduct is added to cart");
		logger2.log(Status.PASS, "add to cart page");
		extent.flush();
		ExtentTest logger3= extent.createTest("SearchBox test");
		logger2.log(Status.INFO,"search box test");
		logger2.log(Status.PASS, "search test");
		logger2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		
	        // test with snapshot
		logger2.addScreenCaptureFromPath("C:\\Users\\kirub\\OneDrive\\Pictures\\Screenshots\\report.png");
		extent.flush();
		
		
		 
		 
		
	}
}
