package homeworks.jose.eighthAssignment;

import homeworks.daniel.fourthAssignment.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestTable {

    private WebDriver driver;

    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriverFactory.getDriver(browser);
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
    }

    @Test
    public void TestSelection(){
        StreamTable streamTable = new StreamTable(driver);
        streamTable.getCheckBox("UAE");
    }

    @Test
    public void TestSelection2Option(){
        StreamTable streamTable = new StreamTable(driver);
        streamTable.getCheckBox("a", "Name");
    }

    @Test
    public void TestSelection2Option2(){
        StreamTable streamTable = new StreamTable(driver);
        streamTable.getCheckBox("Female", "Gender");
    }

    @After
    public void downDriver() {
        this.driver.close();
    }
}
