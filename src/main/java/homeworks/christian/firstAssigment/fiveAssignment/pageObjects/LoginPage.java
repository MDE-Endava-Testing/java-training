package homeworks.christian.firstAssigment.fiveAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "email") WebElement userNameId;
    @FindBy(id = "pass") WebElement passWordId;
    @FindBy(className = "_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy") WebElement login;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setWordsLogin(String username, String password) {
        userNameId.sendKeys(username);
        passWordId.sendKeys(password);
        login.click();

    }
}
