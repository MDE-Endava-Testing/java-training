package homeworks.andrea.fifthAssignment;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * This class corresponds to a dummy form used for automation practicing purposes.
 */
public class FormPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id='userEmail']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id='genterWrapper']//div//label")
    private List<WebElement> genderFields;

    @FindBy(xpath = "//*[@id='userNumber']")
    private WebElement mobileField;

    @FindBy(xpath = "//form[@id='userForm']/div[@id='dateOfBirth-wrapper']")
    private List<WebElement> BirthField;

    @FindBy(xpath = "//form[@id='userForm']/div[@id='subjectsWrapper']//input[@id='subjectsInput']")
    private WebElement subjectField;

    @FindBy(xpath = "//form[@id='userForm']/div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    private List<WebElement> hobbiesFields;

    @FindBy(xpath = "//form[@id='userForm']/div[@id='mt-2 row']")
    private List<WebElement> chooseFileField;

    @FindBy(xpath = "//*[@id='currentAddress']")
    private WebElement addressField;

    @FindBy(xpath = "//form[@id='userForm']/div[@id='stateCity-wrapper']//div[@id='state']//input")
    private WebElement stateField;

    @FindBy(xpath = "//form[@id='userForm']/div[@id='stateCity-wrapper']//div[@id='city']//input")
    private WebElement cityField;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private Consumer<WebElement> sendEnter = e -> e.sendKeys(Keys.ENTER);
    private Consumer<WebElement> clickElement = WebElement::click;
    private BiConsumer<WebDriver, WebElement> scrollDown = (d, e) -> ((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView(true);", e);
    private BiConsumer<WebElement, String> sendKeys = WebElement::sendKeys;
    private BiPredicate<WebElement, String> isTextEqual = (e, text) -> e.getText().equalsIgnoreCase(text);
    private Predicate<WebElement> isEnabled = WebElement::isEnabled;

    /**
     * Method that allows to fill all fields inside the form
     *
     * @param information corresponds to a map that contains all values that will be sent to the form fields
     */
    public void fillInformationLambdas(Map<String, String> information) {
        fillBasicUserInformation(information.get("firstName"), information.get("lastName"), information.get("email"),
                information.get("gender"), information.get("number"));
        fillAdditionalInformation(information.get("subject"), information.get("hobby"));
        scrollDown.accept(driver, addressField);
        fillPlaceInformation(information.get("address"), information.get("state"), information.get("city"));
        clickElement.accept(submitButton);
    }

    /**
     * Method that allows to fill all fields related to the basic user information
     *
     * @param address corresponds to the user address
     * @param state   where the user is located
     * @param city    where the user is located, inside the state selected
     */
    private void fillPlaceInformation(String address, String state, String city) {
        sendKeys.accept(addressField, address);
        sendKeys.accept(stateField, state);
        sendEnter.accept(stateField);
        sendKeys.accept(cityField, city);
        sendEnter.accept(cityField);
    }

    /**
     * Method that allows to fill all fields related to the basic user information
     *
     * @param firstName    of user
     * @param lastName     of user
     * @param email        of the user where some information can be sent
     * @param gender       of the user
     * @param mobileNumber where the user can be located
     */
    private void fillBasicUserInformation(String firstName, String lastName, String email, String gender, String mobileNumber) {
        sendKeys.accept(firstNameField, firstName);
        sendKeys.accept(lastNameField, lastName);
        sendKeys.accept(emailField, email);
        genderFields.stream().filter(e -> isTextEqual.test(e, gender)).forEach(clickElement);
        sendKeys.accept(mobileField, mobileNumber);
    }

    /**
     * Method that allows to fill all fields related to the basic user information
     *
     * @param subject selected by the user
     * @param hobby   selected by the user
     */
    private void fillAdditionalInformation(String subject, String hobby) {
        sendKeys.accept(subjectField, subject);
        sendEnter.accept(subjectField);
        hobbiesFields.stream().filter(e -> isTextEqual.test(e, hobby)).forEach(clickElement);
    }

    /**
     * Method that allows to fill all fields related to the basic user information
     *
     * @return true if submitButton is enabled and false if it is not enabled
     */
    public boolean isSubmitButtonEnabled() {
        scrollDown.accept(driver, submitButton);
        return isEnabled.test(submitButton);
    }

}