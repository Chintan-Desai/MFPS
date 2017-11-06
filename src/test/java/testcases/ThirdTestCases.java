package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdTestCases {

	@Test(priority=1,description="This Test will start browser in new Sesssion")
	public void startBrowser() 
	{
		Reporter.log("Browser Started", true);
		
	}

	@Test(priority=2,description="This will login to application using given credentials")
	public void loginApplication() 
	{
		String expected="Login";
		
		Assert.assertTrue(expected.contains("Login"));
		
		Reporter.log("Login Done",true);
	}

	@Test(priority=3,dependsOnMethods="loginApplication")
	public void makePayment()
	{
		Reporter.log("Payment done", true);
	}

	@Test(priority=4, dependsOnMethods={"makePayment"})
	public void logOutApplication()
	{
		Reporter.log("logOut DOne", true);
	}

	@Test(priority=5,dependsOnMethods="logOutApplication")
	public void closeApplication() 
	{
		Reporter.log("closed Application", false);
	}

}
