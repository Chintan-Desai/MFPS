package testcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass1 {

	@Test
	public void test1() {

		Assert.assertEquals(12, 14, "Dropdown count is not matching");

	}

	@Test
	public void test2() {

		Assert.assertEquals(12, 12, "Dropdown count is not matching");

	}

	@Test
	public void test3() {

		Assert.assertTrue(true, "Error Message is displayed");

	}

	@Test
	public void test4() 
	{
		String actual = "Welcome to QTP Training";

		boolean status = actual.contains("Selenium");

		Assert.assertTrue(status, "Error Message is displayed");

	}

}
