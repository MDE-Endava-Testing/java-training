package homeworks.andrea.fourthAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class represents the first page of the results obtained after searching a word, sentence, URL or something in particular using the Google Search bar.
 */

public class FirstResultsPage {

    private WebDriver driver;

    @FindBy(xpath = "//a")
    private List<WebElement> links;


    public FirstResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getAllLinksNormalWay(String word) {

        Iterator<WebElement> myLinks = links.iterator();
        List<String> URLS = new ArrayList<>();

        while (myLinks.hasNext()) {
            URLS.add(myLinks.next().getAttribute("href"));
        }

        URLS.stream().forEach(link -> System.out.println(link));
    }

    List<String> getAllLinksWithLambda(String word) {

        List<String> allLinks = links.stream().filter(element -> element.getText().contains(word)).map(element -> element.getAttribute("href")).collect(Collectors.toList());
        allLinks.stream().forEach(element -> System.out.println(element));
        return allLinks;
    }


}


