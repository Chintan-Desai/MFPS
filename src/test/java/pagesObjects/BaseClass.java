package pagesObjects;

import com.relevantcodes.extentreports.ExtentReports;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import utility.Helper;

public class BaseClass
{
	public WebDriver driver;
	public ExtentReports report;
	public String reportPath;

	@BeforeSuite
	public void setupReport()
	{
		reportPath=System.getProperty("user.dir")+"/Reports/MFPSpplication"+Helper.getCurrentDateAndTime()+".html";
		report=new ExtentReports(reportPath);
		
	}
	
	@Parameters("Browser")
	@BeforeClass
	public void startBrowser(String browser)
	{
		driver=BrowserFactory.startApplication(browser,DataProviderFactory.getConfig().getTestUrl());
	}

	@AfterSuite
	public void generateReport()
	{
		report.flush();
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		driver.get(reportPath);
		//driver.close();
	}
}
