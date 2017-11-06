package ddt;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	@Test(dataProvider="createUser")
	public void createAccount(String fname, String lname,String type) {

		System.out.println("User First Name is " + fname);
		System.out.println("User Last Name is " + lname);
		System.out.println("Type of the Course "+ type);

	}

	@DataProvider(name="createUser")
	public Object[][] getData() {

		Object[][] arr = new Object[3][3];

		arr[0][0] = "Bank";
		arr[0][1] = "Loan";
		arr[0][2] = "Application";

		arr[1][0] = "Custody";
		arr[1][1] = "Banking";
		arr[1][2] = "Mutual Fund";
		
		
		arr[2][0] = "Shakir";
		arr[2][1] = "Kagzi";
		arr[2][2] = "QA Automation";

		return arr;

	}
	
	@DataProvider(name="createUser")
	public Object[][] getAccounts() {

		Object[][] arr = new Object[3][3];

		arr[0][0] = "Selenium";
		arr[0][1] = "WebDriver";
		arr[0][2] = "Training";

		arr[1][0] = "HP";
		arr[1][1] = "QTP";
		arr[1][2] = "Videos";
		
		
		arr[2][0] = "Sahi";
		arr[2][1] = "Telrik";
		arr[2][2] = "ClassRoom";

		return arr;

	}
	
	
	@DataProvider(name="createUser")
	public Object[][] getCustomer() {

		Object[][] arr = new Object[3][3];

		arr[0][0] = "Selenium";
		arr[0][1] = "WebDriver";
		arr[0][2] = "Training";

		arr[1][0] = "HP";
		arr[1][1] = "QTP";
		arr[1][2] = "Videos";
		
		
		arr[2][0] = "Sahi";
		arr[2][1] = "Telrik";
		arr[2][2] = "ClassRoom";

		return arr;

	}
	
	
	@DataProvider(name="createUser")
	public Object[][] getEmp() {

		Object[][] arr = new Object[3][3];

		arr[0][0] = "Selenium";
		arr[0][1] = "WebDriver";
		arr[0][2] = "Training";

		arr[1][0] = "HP";
		arr[1][1] = "QTP";
		arr[1][2] = "Videos";
		
		
		arr[2][0] = "Sahi";
		arr[2][1] = "Telrik";
		arr[2][2] = "ClassRoom";

		return arr;

	}

}
