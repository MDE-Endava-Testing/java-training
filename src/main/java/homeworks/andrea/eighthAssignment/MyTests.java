package homeworks.andrea.eighthAssignment;

import homeworks.andrea.fourthAssignment.DriversFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * This class contains basic tests for MyTabPage class
 * Checking how to interact with a table using Streams + Lambdas
 */
public class MyTests {

    private WebDriver driver;
    private MyTabPage tab;

    @Before
    public void initialSet() {
        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.tab = new MyTabPage(driver);
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        driver.manage().window().maximize();
    }

    @Test
    public void selectRowsWithFemaleAsGender() {
        tab.clickOnRowsWithKeyword("Female");
        Assert.assertEquals(tab.numberOfRowsSelected(), 4);
    }

    @Test
    public void selectRowsWithUSAAsCountry() {
        tab.clickOnRowsWithKeyword("USA");
        Assert.assertEquals(tab.numberOfRowsSelected(), 2);
    }

    @Test
    public void selectAllRows() {
        tab.selectAllRows();
        Assert.assertEquals(tab.numberOfRowsSelected(), 9);
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }
}
