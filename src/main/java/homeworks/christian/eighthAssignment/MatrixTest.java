package homeworks.christian.eighthAssignment;

import homeworks.christian.eighthAssignment.pageObject.TablePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MatrixTest {

    private WebDriver driver;
    private TablePage tablePage;

    @Before
    public void start(){
        this.driver = DriversFactory.getDriver("chrome");
        this.tablePage = new TablePage(driver);
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
    }

    @After
    public void end(){
        this.driver.close();
    }

    @Test
    public void click(){
        String word = "Female";
//        String word = "Male";
//        String word = "Veronica";
//        String word = "USA";
//        String word = "UK";
        tablePage.selectBoxWithWord(word);
    }
}
