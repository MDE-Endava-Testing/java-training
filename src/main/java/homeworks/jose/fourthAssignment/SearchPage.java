package homeworks.jose.fourthAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchPage {

    private WebDriver driver;

    @FindBy(xpath = "//h3/span")
    private List<WebElement> link;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    List<String> getAllLinksLambda() {
        List<String> result = (List<String>) link.stream().filter(element -> element!=null);
        result.forEach(System.out::println);
        return result;
    }
}
