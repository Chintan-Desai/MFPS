package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Helper;
public class LogIn {

    WebDriver driver;

    public LogIn(WebDriver ldriver) {
        this.driver = ldriver;
    }

    @FindBy(xpath = ".//*[@id='loginForm']/input[2]")
    WebElement username;

    @FindBy(xpath = ".//*[@id='loginForm']/input[3]")
    WebElement password;

    @FindBy(xpath = ".//*[@id='loginForm']/a[1]")
    WebElement loginButton;

    public void loginApplication(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }

    public void loginApplicationWithSync(String user, String pass) {
        Helper.waitForWebElement(driver, username, 20).sendKeys(user);
        Helper.waitForWebElement(driver, password, 20).sendKeys(pass);
        Helper.waitForWebElement(driver, loginButton, 20).click();
    }

}