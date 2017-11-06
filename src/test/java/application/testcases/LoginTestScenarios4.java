package application.testcases;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import factory.DataProviderFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pagesObjects.BaseClass;
import pagesObjects.LogIn;
import pagesObjects.LogOut;
import utility.Helper;

public class LoginTestScenarios4 extends BaseClass {

	ExtentTest logger;
	@Test(description = "This test will verify user is able to login with valid crendentials")
	public void loginWithValidCredentials() 
	{
		logger = report.startTest("LoginValidation Test");

		logger.log(LogStatus.INFO, "Browser and Application are up and running");

		LogIn login = PageFactory.initElements(driver, LogIn.class);
		LogOut logout = PageFactory.initElements(driver, LogOut.class);

		try {
			login.loginApplicationWithSync(DataProviderFactory.getExcel().getStringData("Login", 1, 0),
					DataProviderFactory.getExcel().getStringData("Login", 1, 1));

			logger.log(LogStatus.PASS, "Login Successfully in Application. ");
			logger.log(LogStatus.INFO,"Login User: "+ logout.getLoggedInUser().getText());

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "Login Functionality is not working.!!");

			Assert.assertTrue(false);
		}

	}

	@Test(description = "Logout user", dependsOnMethods = "loginWithValidCredentials" )
	public void logOut() 
	{
		logger = report.startTest("Logout user test case");

		LogOut logout = PageFactory.initElements(driver, LogOut.class);

		logout.logOffUser();

		logger.log(LogStatus.PASS, "User is able to logout successfully");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {

			String path = Helper.captureScreenshot(driver);

			logger.log(LogStatus.FAIL, result.getThrowable().getMessage());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(path));

		}
		if (ITestResult.SUCCESS == result.getStatus()) {

			String path = Helper.captureScreenshot(driver);
			logger.log(LogStatus.PASS, logger.addScreenCapture(path));
		}

		report.endTest(logger);

	}

}
