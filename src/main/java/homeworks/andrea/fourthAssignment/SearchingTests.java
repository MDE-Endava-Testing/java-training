package homeworks.andrea.fourthAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * This class contains all tests related to searching a word, sentence, url or something else using the Google searching bar.
 */

public class SearchingTests {

    private WebDriver driver;
    private GoogleSearchPage search;

    @Before
    public void setDriver() {

        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.search = new GoogleSearchPage(driver);
    }

    @Test
    public void getAllLinksUsingLambda() {

        String myWordToSearch = "apple";
        this.driver.get("https://www.google.com.co/");
        search.searchOnSearchingBar(myWordToSearch).getAllLinksLambda();
    }

    @Test
    public void getAllLinksRelatedToPizzaUsingLambdas() {

        String myWordToSearch = "pizza";
        this.driver.get("https://www.google.com.co/");
        search.searchOnSearchingBar(myWordToSearch).getAllLinksWithSpecificWordLambda(myWordToSearch);
    }

    @Test
    public void getAllLinksRelatedToPizzaPiccoloUsingLambdas() {

        this.driver.get("https://www.google.com.co/");
        search.searchOnSearchingBar("pizza").getAllLinksWithSpecificWordLambda("piccolo");
    }

    @Test
    public void getAllLinksUsingIterator() {

        String myWordToSearch = "apple";
        this.driver.get("https://www.google.com.co/");
        search.searchOnSearchingBar(myWordToSearch).getAllLinksWithIterator(myWordToSearch);
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }

}
