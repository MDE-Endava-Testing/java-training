package homeworks.daniel.seventhAssignment;

import homeworks.daniel.fourthAssignment.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Predicate;

public class PizzaStreams {
    private WebDriver driver;

    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriverFactory.getDriver(browser);
        this.driver.get("https://www.google.com/");
    }

    @Test
    public void googleTest(){
        googleResultsWithTextAndContainsParamSum("pizzas");
        googleResultsWithTextAndContainsParamSumStream("pizzas");
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }

    public void googleResultsWithTextAndContainsParamSum(String keyword) {
        WebElement searchTxt = this.driver.findElement(By.cssSelector("input[title='Buscar']"));
        searchTxt.clear();
        searchTxt.sendKeys(keyword);
        searchTxt.sendKeys(Keys.ENTER);
        List<WebElement> elements = this.driver.findElements(By.tagName("a"));
        Predicate<WebElement> isBlank = e -> e.getText().trim().length() == 0;
        Predicate<WebElement> hasKeyword = e -> e.getText().toLowerCase().contains(keyword);
        elements.removeIf(isBlank.or(hasKeyword.negate()));
        elements.forEach(e -> System.out.println("::" + e.getText()));
    }

    public void googleResultsWithTextAndContainsParamSumStream(String keyword){
        WebElement searchTxt = this.driver.findElement(By.cssSelector("input[title='Buscar']"));
        searchTxt.clear();
        searchTxt.sendKeys(keyword);
        searchTxt.sendKeys(Keys.ENTER);
        Predicate<WebElement> isBlank = e -> e.getText().trim().length() == 0;
        Predicate<WebElement> hasKeyword = e -> e.getText().toLowerCase().contains(keyword);
        this.driver.findElements(By.tagName("a")).stream().filter(isBlank.or(hasKeyword.negate()).negate()).forEach(e -> System.out.println("::" + e.getText()));
    }

}
