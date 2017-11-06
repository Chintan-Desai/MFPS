package application.testcases;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pagesObjects.BaseClass;
import pagesObjects.LogIn;
import pagesObjects.LogOut;
import utility.Helper;

public class LoginTestScenarios extends BaseClass {

	ExtentTest logger;

	@Test(description = "This test will verify user is able to login with valid crendentials")
	@Parameters({"Browser"})
	public void loginWithValidCredentials() 
	{
		logger = report.startTest("LoginValid");

		driver.get("https://qcwebportal.bbh.com");

		logger.log(LogStatus.INFO, "Browser and Application are up and running");

		LogIn login = PageFactory.initElements(driver, LogIn.class);
		LogOut logout = PageFactory.initElements(driver,LogOut.class);

		try {

			logger.log(LogStatus.PASS, "Browser and Application are up and running");
			login.loginApplicationWithSync("user123","password123");
			logger.log(LogStatus.PASS,"LogIn Successfully.");

			logout.logOffUser();
			logger.log(LogStatus.PASS,"Sucessfully Logout From Application");

		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "Login Func is not working");
			Assert.assertTrue(false);
		}

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {

			String path = Helper.captureScreenshot(driver);

			logger.log(LogStatus.FAIL, result.getThrowable().getMessage());
			logger.log(LogStatus.FAIL, logger.addScreenCapture(path));

		}

		report.endTest(logger);

	}

}
