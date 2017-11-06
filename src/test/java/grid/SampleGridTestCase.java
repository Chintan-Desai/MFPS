package grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleGridTestCase 
{
	
	
	@Test
	public void test1() throws MalformedURLException
	{
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		
		cap.setPlatform(Platform.WIN8_1);
		
		URL url=new URL("http://192.168.0.102:4444/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url, cap);
		
		driver.get("http://learn-automation.com/");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.quit();
		
	}

}
