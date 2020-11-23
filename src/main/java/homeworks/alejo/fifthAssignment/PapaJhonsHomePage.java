package homeworks.alejo.fifthAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Consumer;

public class PapaJhonsHomePage {

    private WebDriver driver;

    @FindBy(id = "txtCondi_11004")
    private WebElement middleSizeDropdown;

    @FindBy(xpath = "(//button[contains(text(),'Personalizar')])[1]")
    private WebElement customizeBtn;

    @FindBy(name = "ctl00$ddlCiudadDel")
    private WebElement nameCity;

    @FindBy(xpath = "//button[contains(text(),'Domicilio')]")
    private WebElement domicilioBtn;

    @FindBy(name = "ctl00$txtDireccionEntrega")
    private WebElement address;

    @FindBy(xpath = "//button[contains(text(),'Encontrar local')]")
    private WebElement findLocal;

    @FindBy(xpath = "//button[contains(text(),'Confirmar')]")
    private WebElement confirmAddress;

    @FindBy(xpath = "//button[contains(text(),'Pedir')]")
    private WebElement pedirBtn;

    @FindBy(xpath = "//span[contains(@class, 'm-right-1 styles_text__3Yjm3')]")
    private WebElement txtLocation;

    By txtThing = By.xpath("//span[contains(@class, 'm-right-1 styles_text__3Yjm3')]");

    Consumer<WebElement> clickWait = element ->{
        new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    };


    public PapaJhonsHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickMiddleSizeDropDown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(middleSizeDropdown).click().perform();
    }

    public void chooseOption(int i) {
        Select option = new Select(middleSizeDropdown);
        option.selectByIndex(i);
    }

    public void clickCustomizeBtn() {
        customizeBtn.click();
    }

    public void cityDropDown() {
        nameCity.click();
    }

    public void clickDom() {
        clickWait.accept(domicilioBtn);
    }

    public void chooseCityOption() {
        WebElement wait = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(nameCity));
        Select option = new Select(nameCity);
        option.selectByVisibleText("MEDELLÍN");
    }

    public void setAddress() {
        address.sendKeys("Calle 15 Sur, Cra. 48A #84");
    }

    public void clickConfirm() {
        clickWait.accept(confirmAddress);
    }

    public void clickPedir() {
        clickWait.accept(pedirBtn);
    }

    public void clickFindLocal() {
        findLocal.click();
    }

    public String getTxtAddress() {
        Boolean wait = new WebDriverWait(driver, 10).until(ExpectedConditions.not(ExpectedConditions.textToBe(txtThing, "Ingrese su dirección")));
        return txtLocation.getText();
    }


}
