package grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleGridTestCase2 {

	@Test
	public void test1() throws MalformedURLException {

		final String USERNAME = "mukeshotwani3";
		final String AUTOMATE_KEY = "s4GTbs4fFzQxJxzpzp2f";
		final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY
				+ "@hub-cloud.browserstack.com/wd/hub";

		DesiredCapabilities cap = DesiredCapabilities.chrome();

		cap.setCapability("os", "Windows");
		
		cap.setCapability("os_version", "XP");

		cap.setCapability("browserstack.debug", "true");

		URL url = new URL(URL);

		WebDriver driver = new RemoteWebDriver(url, cap);

		driver.get("http://learn-automation.com/");

		System.out.println("Title is " + driver.getTitle());

		driver.quit();

	}

}
