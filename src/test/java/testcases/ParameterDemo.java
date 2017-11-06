package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo 
{

	@Parameters("Browser")
	@Test
	public void startBrowser(String browserName)
	{
		
	  WebDriver driver =null;
	  
	  
	  if(browserName.equalsIgnoreCase("Chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }
	  else if(browserName.equalsIgnoreCase("Firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if (browserName.equalsIgnoreCase("IE"))
	  {
		  driver=new InternetExplorerDriver();
	  }
	  else
	  {
		  System.out.println("Sorry this browser is not supported by Selenium Please use Chrome,Firefox,IE");
	  }
		
	  
	   	System.out.println("Test are running on "+browserName +" Browser");
	    
	    System.out.println("Thread which is curruntly running "+Thread.currentThread().getId());
	    
	    System.out.println("Thread which is curruntly running and name is "+Thread.currentThread().getName());
	  
		driver.get("https://www.google.co.in");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.quit();
		
	}
	
	
}
