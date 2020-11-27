package homeworks.andrea.fifthAssignment;

import homeworks.andrea.fourthAssignment.DriversFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains all tests related to the dummy form
 */
public class FormTests {

    private WebDriver driver;
    private FormPage form;

    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.form = new FormPage(driver);
    }

    @Test
    public void fillFormWithValidInformation() {
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();

        Map<String, String> information = new HashMap<>();
        information.put("firstName", "Andrea Testing");
        information.put("lastName", "Vallejo");
        information.put("email", "test@gmail.com");
        information.put("gender", "Male");
        information.put("number", "3052983650");
        information.put("subject", "math");
        information.put("address", "circ 56 #77-28");
        information.put("state", "NCR");
        information.put("city", "Delhi");
        information.put("hobby", "Sports");
        information.put("file","src/main/java/homeworks/andrea/fifthAssignment/photo.jpg");

        form.fillInformationLambdas(information);
    }

    @Test
    public void validateSubmitButtonWithEmptyForm() {
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        Assert.assertFalse("Button is enabled and must be disabled", form.isSubmitButtonEnabled());
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }
}
