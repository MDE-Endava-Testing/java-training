package homeworks.daniel.fourthAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  POM implementation for google's landing page
 */
public class LandingPage {

    WebDriver driver;

    @FindBy(css = "input[title]")
    private WebElement input_SearchField;

    @FindBy(css = "div[class*='FPdoLc'] input[value='Buscar con Google']")
    private WebElement input_SearchButton;
    /**
     * POM page constructor
     * @param driver webDriver used to find and initialize webElements
     */
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    /**
     * Method used for searching a word on the input search field , then click the search button and finally initializing
     * the next page: ResultsPage
     * @param word
     * @return
     */
    public ResultsPage searchWord(String word){
        input_SearchField.sendKeys(word);
        input_SearchButton.click();
        return new ResultsPage(driver);
    }
}
