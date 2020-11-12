package homeworks.christian.firstAssigment.fourAssignment.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.function.Predicate;

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
    public void searchWithText(String wordText) {
        boxOfSearch.click();
        boxOfSearch.sendKeys(wordText);
        boxOfSearch.sendKeys(Keys.ENTER);
        List<WebElement> elements = this.driver.findElements(By.tagName("a"));
        Predicate<WebElement> text = e -> e.getText().trim().length() != 0;
        System.out.println("Before :: " + elements.size());

        elements.stream().filter(text).forEach(e -> System.out.println("::" + e.getText()));
        elements.removeIf(text.negate());

        System.out.println("After :: " + elements.size());
        elements.forEach(e -> System.out.println("::" + e.getText()));
    }
}
