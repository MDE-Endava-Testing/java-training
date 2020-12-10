package homeworks.andrea.eighthAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.function.Predicate;

/**
 * Table interaction using streams + lambdas
 */
public class MyTabPage {

    private WebDriver driver;
    private String keyword;

    public MyTabPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private Predicate<WebElement> isKeywordContained = (e) -> e.getText().contains(keyword);

    private void getLinksWithLambdas(Predicate<WebElement> pred) {
        driver.findElements(By.xpath("/html/body/table/tbody/tr")).stream().filter(pred).forEach(e -> e.findElement(By.tagName("input")).click());
    }

    /**
     * This method allows to click on those rows that contain a keyword
     *
     * @param keyword corresponds to the word that will be used as a filter, in order to click only on those rows that contain this one.
     */
    public void clickOnRowsWithKeyword(String keyword) {
        this.keyword = keyword;
        getLinksWithLambdas(isKeywordContained);

    }

    /**
     * This method allows to select all rows
     */
    public void selectAllRows() {
        driver.findElements(By.tagName("input")).forEach(e -> e.click());
    }

}
