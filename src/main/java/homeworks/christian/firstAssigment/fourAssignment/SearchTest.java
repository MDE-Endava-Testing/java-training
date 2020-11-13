package homeworks.christian.firstAssigment.fourAssignment;

import homeworks.christian.firstAssigment.fourAssignment.pageObjects.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Predicate;

/**
 * this class doing the test case related with search the word car in the box of text and filter the nulls
 */
public class SearchTest {

    private WebDriver driver;
    private SearchPage search;

    /**
     * this method get the browser and is the first thing that doing
     */
    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.search = new SearchPage(driver);
    }

    /**
     * this tests case search the word car in the box of text and filter the nulls
     */
    @Test
    public void getAllLinksUsingLambda() {
        String wordText = "car";
        this.driver.get("https://www.google.com.co/");
        search.searchWithText(wordText).firstPage();
    }

    /**
     * this method is for closed the driver
     */
    @After
    public void closeDriver() {
        this.driver.close();
    }

}
