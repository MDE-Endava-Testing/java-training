package homeworks.daniel.fourthAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *  POM implementation for google's results page
 */
public class ResultsPage {

    private WebDriver driver;

    private String anchorsLocator = "//div[@class='yuRUbf']/a[contains(@href,'%s')]";
    /**
     * POM page constructor
     * @param driver webDriver used to find and initialize webElements
     */
    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AnchorSelector selector = (t) ->driver.findElements(By.xpath(String.format(anchorsLocator,t)));
}


