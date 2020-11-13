package homeworks.juanpa.fourthAssigment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Predicate;

import static lessons.lambda.javasam.supplier.DriverFactory.getDriver;

public class SearchTest {

    private WebDriver driver;
    private FindResultsPage findResultsPage;


    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = getDriver(browser);
    }

    @Test
    public void searchWordOnGoogle(){
       String word = "pizza";
       String expectedWord = "doblepizza";
       this.driver.get("https://www.google.com/");
       findResultsPage.searchWord(word);

        /**
         * To save all the result in a list
         */
        List<WebElement> results = findResultsPage.resultsSearching();

        /**
         * To search in a list all the elements who length is 0
         */
       Predicate<WebElement> isVoid = sentence -> sentence.getText().trim().length() == 0;

        /**
         * To search in a list alll the elements and turns on lower case all their text
         */
        Predicate<WebElement> hasExpectedWord = sentence -> sentence.getText().toLowerCase().contains(expectedWord);

        /**
         * To remove from a specific list of elements all the elements who has elements voids or hasn't the expected word
         */
       results.removeIf(isVoid.and(hasExpectedWord.negate()));

        /**
         * print all the text elements in the list
         */
       results.forEach(sentence -> System.out.println("::" + sentence.getText()));
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }
}
