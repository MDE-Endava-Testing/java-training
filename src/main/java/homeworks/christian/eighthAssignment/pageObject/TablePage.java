package homeworks.christian.eighthAssignment.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class TablePage {

    private WebDriver driver;
    //@FindBy(css = "input")
    //private WebElement box;
    private final Consumer<WebElement> click = c -> c.findElement(By.cssSelector("input")).click();


    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectBoxWithWord(String word) {
        Predicate<WebElement> contained = e -> e.getText().contains(word);
        getLinksWithLambdas(contained);
    }

    private void getLinksWithLambdas(Predicate<WebElement> c){
        this.driver.findElements(By.cssSelector("tr")).stream()
                .filter(c).forEach(click);
    }
}
