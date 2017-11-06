package utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertHelper {

	public static void acceptAlert(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		Alert alt = wait.until(ExpectedConditions.alertIsPresent());

		alt.accept();

		System.out.println("Alert Handled");
	}

	public static void cancelAlert(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		Alert alt = wait.until(ExpectedConditions.alertIsPresent());

		alt.dismiss();

		System.out.println("Alert Dismissed");
	}

	public static String getAlertText(WebDriver driver) 
	{
		String text = driver.switchTo().alert().getText();

		return text;
	}

	public static void validateAlertText(WebDriver driver, String expected) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		Alert alt = wait.until(ExpectedConditions.alertIsPresent());

		String actual = alt.getText();

		Assert.assertEquals(actual, expected);

		System.out.println("Alert Validated");

	}

}
