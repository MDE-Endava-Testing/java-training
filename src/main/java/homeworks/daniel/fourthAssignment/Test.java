package homeworks.daniel.fourthAssignment;

import lessons.lambda.javasam.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
/**
 *
 */
public class Test {
    /**
     * main method which simulates a rapid selenium test execution, first navigating to the google's landing page, then searching the owrd java
     * and separating anchors elements in different lists depending on the input value
     * @param args execution arguments
     */
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getDriver("chrome");
        driver.get("https://www.google.com.co/");

        ResultsPage resultsPage = new LandingPage(driver).searchWord("java");
        createWebElementLists(resultsPage.selectorXpath);
        createWebElementLists(resultsPage.selectorCss);
        driver.close();
    }

    /**
     * creates and prints different lists depending on the input string and type of locator(xpath,css)
     * @param testSelector receives a lambda method to find the WebElements
     */
    public static void createWebElementLists(AnchorSelector testSelector){
        List<WebElement> javaAnchors = testSelector.selectAnchors("java.com");
        List<WebElement> oracleAnchors = testSelector.selectAnchors("oracle.com");
        List<WebElement> wikipediaAnchors = testSelector.selectAnchors("wikipedia.org");
        javaAnchors.forEach(x->System.out.println(x.getAttribute("href")));
        oracleAnchors.forEach(x->System.out.println(x.getAttribute("href")));
        wikipediaAnchors.forEach(x->System.out.println(x.getAttribute("href")));
        System.out.println("--------------------------------");
    }
}
