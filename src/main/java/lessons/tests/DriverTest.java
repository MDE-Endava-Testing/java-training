package lessons.tests;

import lessons.lambda.javasam.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static lessons.lambda.javasam.DriverFactory.getDriver;

public class DriverTest {
    private WebDriver driver;


    @Before
    public void setDriver() {
        String browser = "edge";
        this.driver = getDriver(browser);
//        if ("chrome".equals(browser)) {
//            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//            this.driver = new ChromeDriver();
//        } else if ("firefox".equals(browser)) {
//            System.setProperty("webdriver.firefox.driver", "path");
//            this.driver = new FirefoxDriver();
//            System.setProperty("webdriver.edge.driver", "path");
//        } else if ("edge".equals(browser)) {
//            this.driver = new EdgeDriver();
//        }

//        switch (browser) {
//            case "chrome":
//                this.driver = new ChromeDriver();
//            case "firefox":
//                this.driver = new FirefoxDriver();
//            case "edge":
//                this.driver = new EdgeDriver();
//        }
    }

    @Test
    public void googleTest() {
        this.driver.get("https://www.google.com/");
        //quiero todos los  //a que cumplan con la condicion ""
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }

}
