package lessons.tests;

import lessons.lambda.javasam.supplierEx.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Predicate;

public class DriverTest {
    private WebDriver driver;

    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriverFactory.getDriver(browser);
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
//                  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
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

    @Test
    public void googleResultsTestConsumer() {
        this.driver.get("https://www.google.com/");
        this.driver.findElements(By.tagName("a"))
                .forEach(e -> System.out.println(e.getText()));

    }

    @Test
    public void googleResultsWithText() {
        String param = "doblepizza";
        this.driver.get("https://www.google.com/");
        List<WebElement> elements = this.driver.findElements(By.tagName("a"));
        //predicate
        Predicate<WebElement> isBlank = e -> e.getText().trim().length() == 0;

        System.out.println("Before :: " + elements.size());

        elements.removeIf(isBlank);

        System.out.println("After :: " + elements.size());

        //with consumer
        elements.forEach(e -> System.out.println(e.getText()));

    }

    @Test
    public void googleResultsWithTextAndContainsParam() {
        String keyWord = "doblepizza";
        this.driver.get("https://www.google.com/");
        WebElement searchTxt = this.driver.findElement(By.xpath("//input[@title='Buscar']"));
        searchTxt.sendKeys("pizzas");
        searchTxt.sendKeys(Keys.ENTER);

        List<WebElement> elements = this.driver.findElements(By.tagName("a"));

        Predicate<WebElement> isBlank = e -> e.getText().trim().length() == 0;
        Predicate<WebElement> hasKeyword = e -> e.getText().toLowerCase().contains(keyWord);

        System.out.println("Before :: " + elements.size());

        //    remove all blanks or withkeyword

        elements.removeIf(isBlank.or(hasKeyword.negate()));

        System.out.println("After :: " + elements.size());

        //with consumer
        elements.forEach(e -> System.out.println("::" + e.getText()));
    }


    public void googleResultsWithTextAndContainsParamSum(String keyword) {
        WebElement searchTxt = this.driver.findElement(By.xpath("//input[@title='Buscar']"));
        searchTxt.sendKeys("pizzas");
        searchTxt.sendKeys(Keys.ENTER);
        List<WebElement> elements = this.driver.findElements(By.tagName("a"));
        Predicate<WebElement> isBlank = e -> e.getText().trim().length() == 0;
        Predicate<WebElement> hasKeyword = e -> e.getText().toLowerCase().contains(keyword);
        elements.removeIf(isBlank.or(hasKeyword.negate()));
        elements.forEach(e -> System.out.println("::" + e.getText()));
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }

}
