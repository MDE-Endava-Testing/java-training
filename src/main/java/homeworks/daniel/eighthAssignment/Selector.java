package homeworks.daniel.eighthAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.function.Predicate;

/**
 * Class with an util function used for selecting rows depending on the input condition
 */
public class Selector {
    /**
     * method for selecting the respective checkboxes depentind on the filter
     * @param filterCondition predicate statement used for filtering the initial list of webElements
     */
    public static void checkOption(Predicate filterCondition,WebDriver driver){
        driver.findElements(By.cssSelector("tr")).stream().filter(x->{
            return filterCondition.test(x.getText());
        }).forEach(z->z.findElement(By.cssSelector("input")).click());
    }
}
