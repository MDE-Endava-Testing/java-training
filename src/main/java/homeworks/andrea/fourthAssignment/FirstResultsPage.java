package homeworks.andrea.fourthAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;
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

    /**
     * Lambda implementation using stream. It gets all links and ignores nulls
     *
     * @return A list of links based on the word searched, without null values
     */
    List<String> getAllLinksLambda() {
        List<String> allLinks = links.stream().filter(element -> Objects.nonNull(element.getAttribute("href"))).map(element -> element.getAttribute("href")).collect(Collectors.toList());
        allLinks.forEach(System.out::println);
        return allLinks;
    }

    /**
     * Lambda implementation using stream. It allows to filter links based on a word Searched
     *
     * @param wordInput corresponds to the word that will be used as a filter in order to obtain only those links that contain this word.
     * @return A list of Strings with those links that contain the word searched
     */
    List<String> getAllLinksWithSpecificWordLambda(String wordInput) {
        List<String> allLinks = links.stream().filter(element -> element.getText().contains(wordInput)).map(element -> element.getAttribute("href")).collect(Collectors.toList());
        allLinks.forEach(System.out::println);
        return allLinks;
    }

    /**
     * Iterator implementation. It allows to filter links based on a word Searched
     *
     * @param word corresponds to the word that will be used as a filter in order to obtain only those links that contain this word.
     * @return A list of Strings with those links that contain the word searched
     */
    public List<String> getAllLinksWithIterator(String word) {
        Iterator<WebElement> myLinks = links.iterator();
        List<String> URLS = new ArrayList<>();

        while (myLinks.hasNext()) {
            URLS.add(myLinks.next().getAttribute("href"));
        }

        URLS.removeAll(Collections.singleton(null));
        URLS.forEach(System.out::println);
        return URLS;
    }


}


