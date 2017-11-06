package testcases;

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
		String actual = "Welcome to QC Project Testing";

		boolean status = actual.contains("BBH");

		Assert.assertTrue(status, "Error Message is displayed");

	}
}
