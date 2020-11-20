package homeworks.christian.fourthAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.function.Predicate;

public class TextAFirstPage {

    @FindBy(xpath = "//a")
    private List<WebElement> elements;

    private WebDriver driver;

    public TextAFirstPage(WebDriver driver) {
        this.driver = driver;
    }

    public void firstPage(){
        Predicate<WebElement> text = e -> e.getText().trim().length() != 0;
        System.out.println("Before :: " + elements.size());
        elements.stream().filter(text).forEach(e -> System.out.println("::" + e.getText()));
        elements.removeIf(text.negate());
        System.out.println("After :: " + elements.size());
        elements.forEach(e -> System.out.println("::" + e.getText()));
    }
}
