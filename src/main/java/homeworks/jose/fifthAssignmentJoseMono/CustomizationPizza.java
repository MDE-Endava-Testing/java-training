package homeworks.jose.fifthAssignmentJoseMono;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CustomizationPizza {

    private WebDriver driver;

    @FindBy(xpath = "//button[contains(text(),'Domicilio')]")
    private WebElement homeButton;

    @FindBy(name = "ctl00$ddlCiudadDel")
    private WebElement nameCity;

    @FindBy(id = "ctl00_txtDireccionEntrega")
    private WebElement nameAddress;

    @FindBy(xpath = "//button[text()='Encontrar local']")
    private WebElement findButton;

    @FindBy(xpath = "//button[contains(text(),'Confirmar')]")
    private WebElement confirmButton;

    @FindBy(xpath = "//button[contains(text(),'Pedir')]")
    private WebElement requestButton;

    public CustomizationPizza(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    Consumer<WebElement> clickWait = element -> {
        new WebDriverWait(driver, 120).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    };

    public void clickNameCity() {
        clickWait.accept(nameCity);
    }

    public void chooseNameCity() {
        WebElement wait = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(nameCity));
        Select option = new Select(nameCity);
        option.selectByVisibleText("MEDELLÍN");
    }

    public void sendAddress(String address) {
        nameAddress.sendKeys(address);
    }

    public void clickFindButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(findButton).click().perform();
    }

    public void clickConfirmButton() {
        clickWait.accept(confirmButton);
    }

    public PapaJohnsPage clickRequestButton() {
        requestButton.click();
        return new PapaJohnsPage(driver);
    }

    public void clickHomeButton() {
        clickWait.accept(homeButton);
    }
}
