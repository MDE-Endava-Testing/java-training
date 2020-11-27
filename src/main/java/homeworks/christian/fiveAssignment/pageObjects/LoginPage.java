package homeworks.christian.fiveAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * this class is where are the elements and the process of the tests
 */
public class LoginPage {

    @FindBy(id = "email") WebElement userNameId;
    @FindBy(id = "pass") WebElement passWordId;
    @FindBy(className = "_6ltg") WebElement login;

    private WebDriver driver;

    private Consumer<WebElement> click = WebElement::click;
    private BiConsumer<WebElement, String> sendKeys = WebElement::sendKeys;

    /**
     * Method constructor
     * @param driver
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * method set words login
     * @param data
     */
    public void setWordsLogin(Map<String, String> data) {
        setData(data.get("username"), data.get("password"));
    }

    /**
     * this method set the data of username and password in facebook and then join of this
     * @param username
     * @param password
     */
    private void setData(String username, String password){
        sendKeys.accept(userNameId, username);
        sendKeys.accept(passWordId, password);
        click.accept(login);
    }
}
