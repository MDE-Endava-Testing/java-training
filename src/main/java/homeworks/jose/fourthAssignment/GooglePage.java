package homeworks.jose.fourthAssignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchingBar;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchPage searchBar(String word) {

        searchingBar.sendKeys(word);
        searchingBar.sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }


}
