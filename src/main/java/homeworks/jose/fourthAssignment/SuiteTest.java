package homeworks.jose.fourthAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SuiteTest {

    private WebDriver driver;
    private GooglePage googlePage;

    private String word = "Endava";

    @Before
    public void setDriver() {

        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.googlePage = new GooglePage(driver);
    }

    @Test
    public void getLinksNoNull(){
        driver.get("https://www.google.com.co/");
        googlePage.searchBar(word).getAllLinksLambda();
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }
}
