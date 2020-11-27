package homeworks.christian.fiveAssignment;

import homeworks.christian.fiveAssignment.pageObjects.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    private WebDriver driver;
    private LoginPage login;

    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.login = new LoginPage(driver);
    }

    @Test
    public void getAllLinksUsingLambda() {
        String username = "juan.endava";
        String password = "cristian24";
        this.driver.get("https://www.facebook.com");
        login.setWordsLogin(username, password);
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }

}
