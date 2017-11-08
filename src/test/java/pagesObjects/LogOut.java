package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Helper;

public class LogOut {

	WebDriver driver;

	public LogOut(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='g-header']/div[1]/div[4]")
	WebElement welcomeUser;

	@FindBy(how = How.XPATH, using = ".//*[@id='name']")
	WebElement loggedInUser;

	@FindBy(how = How.XPATH, using = ".//*[@id='logoutlink']")
	WebElement Logout;

	@FindBy(how = How.XPATH, using =".//*[@id='g-header']/div[3]/ul/li[1]/a")
	WebElement ReptTabLink;

	@FindBy(xpath = "html/body/div[2]/div/span/p[1]")
	WebElement logoutImg;

	public void logOffUser() {

		Helper.waitForWebElement(driver, welcomeUser, 30);
		//Helper.syncElement(driver,welcomeUser,30);
		Helper.waitForWebElement(driver, Logout, 30).click();
		Helper.waitForWebElement(driver, logoutImg, 30);
	}

	public WebElement getLoggedInUser() {
		return loggedInUser;
	}
}