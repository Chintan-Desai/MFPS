package pagesObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.Helper;

public class ReportTabLinkPage {
    WebDriver driver;

    public ReportTabLinkPage(WebDriver ldriver) {

        this.driver = ldriver;
    }

    @FindBy(how = How.XPATH, using =".//*[@id='g-header']/div[3]/ul/li[1]/a")
    WebElement ReptTabLink;

    @FindBy(how = How.XPATH, using=".//*[@id='g-navigation-1']/ul/li/ul/li/span/a[1]")
    WebElement ReportViewLink;

    public void IsReptTabDisplay()
    {
        Helper.waitForWebElement(driver,ReptTabLink,30).click();
    }
     public boolean IsReptViewLinkDisplay()
     {
         boolean linkload = false;
         linkload = Helper.waitForWebElement(driver,ReportViewLink,30).isEnabled();
         return linkload;
     }
}
