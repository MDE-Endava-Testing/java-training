package homeworks.daniel.eighthAssignment;

import homeworks.daniel.fourthAssignment.DriverFactory;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.function.Predicate;

/**
 * Example test for the eighth assignment
 */
public class TestFilter {

    private WebDriver driver;

    /**
     * setUp method that sets the driver and navigates to the testing page
     */
    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriverFactory.getDriver(browser);
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
    }

    /**
     * Testcase using different predicates to select different rows depending on its values
     */
    @Test
    public void TestSelection(){
        Predicate<String> femaleUK = str-> str.contains("Female") && str.contains("UK");
        Predicate<String> female = str-> str.contains("Female") ;
        Predicate<String> UK = str-> str.contains("UK");
        Predicate<String> USA = str-> str.contains("USA");
        Predicate<String> male = str-> str.contains("Male");
        Selector.checkOption(female.or(USA),driver);
    }
}
