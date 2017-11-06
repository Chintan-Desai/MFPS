package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

	public static String captureScreenshot(WebDriver ldriver) {

		String path = System.getProperty("user.dir") + "/Screenshots/MFPS" + System.currentTimeMillis() + ".png";

		TakesScreenshot ts = (TakesScreenshot) ldriver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {

			System.out.println("Unable to capture screenshots " + e.getMessage());
		}

		return path;

	}

	public static void syncElement(WebDriver driver, WebElement ele, int time) {

		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public static void highLightElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}

	public static WebElement waitForWebElement(WebDriver driver, WebElement element, int time) {

		syncElement(driver, element, time);
		highLightElement(driver, element);

		return element;

	}

	public static String getCurrentDateAndTime() {

		Date todayDate = new Date();

		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");

		String timeStamp = customFormat.format(todayDate);

		return timeStamp;

	}

}
