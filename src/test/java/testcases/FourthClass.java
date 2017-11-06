package testcases;

import org.testng.Assert;
import org.testng.annotations.*;

public class FourthClass 
{

	
	@BeforeSuite
	public void setup()
	{
		
		System.out.println("Browser Opened");
	}
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("Browser Closed");
	}
	
	

	@BeforeClass
	public void login()
	{
		System.out.println("Login Done");
	}
	
	
	@BeforeMethod
	public void checkAppStatusUP()
	{
		System.out.println("I am in Before Method");
	}
	
	@AfterMethod
	public void checkAppStatusDown()
	{
		System.out.println("I am in After Method");
	}
	
	
	@Test
	public void payment()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Payment Done");
		
	}
	
	@Test
	public void payment2()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Payment Done");
		
	}
	
	@Test
	public void payment3()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Payment Done");
		
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("Logout Done");
	}
	
}
