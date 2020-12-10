package homeworks.daniel.eighthAssignment;

import homeworks.daniel.fourthAssignment.DriverFactory;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
     * Testcase using different predicates and combinations to select different rows depending on its values
     */
    @Test
    public void TestSelection(){
        List<String> keywords= Arrays.asList("Female", "UK", "USA","Male");
        Map<String,Predicate<String>> predicates = Selector.getPredicates(keywords);
        Selector.checkOption(predicates.get("Female").and(predicates.get("UK")),driver);
    }
}
