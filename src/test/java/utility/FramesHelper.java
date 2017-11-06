package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesHelper 
{

	public static void switchToFrameUsingIndex(WebDriver driver, int index) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));

	}

	public static void switchToFrameUsingWebElement(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

	}

	public static void switchToFrameUsingName(WebDriver driver, String name) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(name));

	}
	
	public static void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();	
	}
	
}
