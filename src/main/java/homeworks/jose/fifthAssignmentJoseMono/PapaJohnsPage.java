package homeworks.jose.fifthAssignmentJoseMono;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class PapaJohnsPage {

    private WebDriver driver;

    @FindBy(id = "txtCondi_11004")
    private WebElement optionMiddleDropDown;

    @FindBy(xpath = "(//button[contains(text(),'Personalizar')])[1]")
    private WebElement customizeButton;

    @FindBy(xpath = "//span[contains(@class, 'm-right-1 styles_text__3Yjm3')]")
    private WebElement address;

    public PapaJohnsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOptionMiddleDropDown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(optionMiddleDropDown).click().perform();
    }

    public void chooseOptionMiddleDropDown(int i) {
        WebElement wait = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(optionMiddleDropDown));
        Select option = new Select(optionMiddleDropDown);
        option.selectByIndex(i);
    }

    public CustomizationPizza clickCustomizeButton() {
        customizeButton.click();
        return new CustomizationPizza(driver);
    }

    public String getAddress() {
        Boolean wait = new WebDriverWait(driver, 60).until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(address, "Ingrese su dirección")));
        return address.getText();
    }
}
