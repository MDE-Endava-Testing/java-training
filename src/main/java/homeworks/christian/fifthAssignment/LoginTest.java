package homeworks.christian.fifthAssignment;

import homeworks.christian.fifthAssignment.pageObjects.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;

/**
 * this class do a test case for a login in facebook
 */
public class LoginTest {

    private WebDriver driver;
    private LoginPage login;

    /**
     * this method is done at the beginning of the test
     */
    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.login = new LoginPage(driver);
    }

    /**
     * this is the test for do a login in facebook
     */
    @Test
    public void getAllLinksUsingLambda() {
        Map<String, String> data = new HashMap<>();
        data.put("username", "juan.endava");
        data.put("password", "cristian24");
        this.driver.get("https://www.facebook.com");
        login.setWordsLogin(data);
    }

    /**
     * this method is done at the ending of the test and close the browser
     */
    @After
    public void closeDriver() {
        this.driver.close();
    }

}
