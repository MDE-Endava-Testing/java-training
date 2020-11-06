package homeworks.andrea.fourthAssignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Google searching page or Google main page.
 * Here user can simulate searching a word, sentence, URL or something in particular by using the Search bar.
 * Additionally it contains a direct access to services such as Gmail, images searching page, Google account, google tools and favorite pages.
 */

public class GoogleSearchPage {

    private WebDriver driver;

    @FindBy(css = "input[title='Buscar']")
    private WebElement searchingBar;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    /**
     * This method allows to search a specific word using the Google searching bar.
     *
     * @param word corresponds to the word, url or sentence that will be written on the Google search bar in order to get
     *             all results related to that word.
     * @return this method allows to go to the next page, which is the First Results Page
     */
    public FirstResultsPage searchOnSearchingBar(String word) {

        searchingBar.click();
        searchingBar.sendKeys(word);
        searchingBar.sendKeys(Keys.ENTER);
        return new FirstResultsPage(driver);
    }


}
