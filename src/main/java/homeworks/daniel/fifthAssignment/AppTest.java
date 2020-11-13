package homeworks.daniel.fifthAssignment;

import homeworks.daniel.fourthAssignment.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;
    /**
     * Rigorous Test :-]
     */
    @Before
    public void setUp()
    {
        driver = DriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
    }
    @Test
    public void validFormTest()
    {
       StudentFormDataModel studentData = new StudentFormDataModel();
       FormPage formPage = new FormPage(driver);
       formPage.fillForm(studentData);
       assertTrue(formPage.isFormFilledCorrectly.test(studentData));

    }
    public void nullFieldsTest()
    {
        assertTrue( true );
    }
    @After
    public void tearDown()
    {
        driver.close();
    }
}
