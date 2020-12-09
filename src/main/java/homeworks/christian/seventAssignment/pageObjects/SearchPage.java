package homeworks.christian.seventAssignment.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class set the word and click the enter for search the links about that
 */
public class SearchPage {

    private WebDriver driver;

    @FindBy(css = "input[title='Buscar']")
    private WebElement boxOfSearch;

    /**
     * constructor method
     * @param driver
     */
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * this method set the word and click the enter for search the links about that
     * @param wordText
     */
    public TextAFirstPage searchWithText(String wordText) {
        boxOfSearch.click();
        boxOfSearch.sendKeys(wordText);
        boxOfSearch.sendKeys(Keys.ENTER);
        return new TextAFirstPage(driver);
    }
}
