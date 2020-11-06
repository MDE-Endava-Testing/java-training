package homeworks.daniel.fourthAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *  POM implementation for google's results page
 */
public class ResultsPage {

    private WebDriver driver;

    private String anchorsLocatorXpath = "//div[@class='yuRUbf']/a[contains(@href,'%s')]";
    private String anchorsLocatorCss = ".yuRUbf>a[href*='%s']";
    /**
     * POM page constructor
     * @param driver webDriver used to find and initialize webElements
     */
    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AnchorSelector selectorXpath = (t) ->driver.findElements(By.xpath(String.format(anchorsLocatorXpath,t)));
    public AnchorSelector selectorCss = (t) ->driver.findElements(By.cssSelector(String.format(anchorsLocatorCss,t)));
}


