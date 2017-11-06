package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTestNG {

	@Test(priority=1,description="This Test will start browser in new Sesssion")
	public void startBrowser() {
		Reporter.log("Browser Started", true);
	}

	@Test(priority=2,description="This will login to application using given credentials")
	public void loginApplication() {
		Reporter.log("Login DOne", true);
	}

	@Test(priority=3)
	public void makePayment() {
		Reporter.log("Payment done", true);
	}

	@Test(priority=4)
	public void logOutApplication() {
		Reporter.log("logOut DOne", true);
	}

	@Test(priority=5)
	public void closeApplication() {
		Reporter.log("closed Application", false);
	}
	
	@Test(priority=-1)
	public void mukeshTest() {
		Reporter.log("closed Application", true);
	}

}
