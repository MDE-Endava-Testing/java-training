package homeworks.daniel.fifthAssignment;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * POM page containing the form elements, locators and related methods
 */
public class FormPage {
    WebDriver driver;

    @FindBy(css = "#firstName")
    private WebElement input_firstName;

    @FindBy(css = "#lastName")
    private WebElement input_lastName;

    @FindBy(css = "#userEmail")
    private WebElement input_userEmail;

    private String radioBtn_GenderLocatorXpath = "//label[text()='%s']";

    @FindBy(css = "#userNumber")
    private WebElement input_userNumber;

    @FindBy(css = "#dateOfBirthInput")
    private WebElement input_dateOfBirthInput;

    private String subjectsDropdownXpath = "//div[text()='%s']";

    private String hobbiesXpath = "//label[text()='%s']";

    @FindBy(css = "#currentAddress")
    private WebElement text_currentAddress;

    @FindBy(css = "#uploadPicture")
    private WebElement input_uploadPicture;

    @FindBy(css = "#subjectsInput")
    private WebElement input_Subjects;

    private String dropDown_StateAndCity = "#%s";

    private String dropDownElements="//div[text()='%s']";

    @FindBy(css = "#submit")
    private WebElement submitBtn;

    @FindBy(css = "tr>td:nth-child(2)")
    private List<WebElement> tableValues;

    /**
     * POM page constructor
     * @param driver webDriver used to find and initialize webElements
     */
    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    /**
     *  Method used for filling all the form fields
     * @param studentData input object containing al the data needed to fill the form
     */
    public void fillForm(StudentFormDataModel studentData){
        input_firstName.sendKeys(studentData.getFirstName());
        input_lastName.sendKeys(studentData.getLastName());
        input_userEmail.sendKeys(studentData.getEmail());
        WebElement genderRadioBtn = driver.findElement(By.xpath(String.format(radioBtn_GenderLocatorXpath,studentData.getGender())));
        genderRadioBtn.click();
        input_userNumber.sendKeys(studentData.getMobile().toString());
        input_dateOfBirthInput.sendKeys(Keys.CONTROL + "a");
        input_dateOfBirthInput.sendKeys(studentData.getDateOfBirth());
        inputSubjects(studentData.getSubjects());
        selectHobbies(studentData.getHobbies());
        input_uploadPicture.sendKeys(studentData.getPicturePath());
        text_currentAddress.sendKeys(studentData.getCurrentAddress());
        selectStateAndCity(dropDown.state,studentData.getState());
        selectStateAndCity(dropDown.city,studentData.getCity());
        submitBtn.click();
    }

    /**
     * Adds the List of subjects randomly selected to the hobbies field
     * @param subjects random List containing the subjects of the student object
     */
    private void inputSubjects(List<String> subjects){
        Consumer<String> selectDropdownItem = (value)->{
          input_Subjects.click();
          input_Subjects.sendKeys(value.substring(0,1));
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          WebElement item = driver.findElement(By.xpath(String.format(subjectsDropdownXpath,value)));
          item.click();
        };
        subjects.forEach(selectDropdownItem);
    }

    /**
     * Adds the List of hobbies randomly selected to the hobbies field
     * @param hobbies andom List containing the hobbies of the student object
     */
    private void selectHobbies(List<String> hobbies){
        Consumer<String> checkHobbies = (value)->{
            By xpathLocator = By.xpath(String.format(hobbiesXpath,value));
            driver.findElement(xpathLocator).click();
        };
        hobbies.forEach(checkHobbies);
    }

    /**
     * Does the selection for the dropdown elements
     * @param stateOrCity indicates the dropDown to select (state or city)
     * @param value indicates de value that will be selected in the dropdown
     */
    private void selectStateAndCity(dropDown stateOrCity,String value){
        WebElement dropDownElement = driver.findElement(By.cssSelector(String.format(dropDown_StateAndCity,stateOrCity)));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",dropDownElement);
        dropDownElement.click();
        By xpathLocator = By.xpath(String.format(dropDownElements,value));
        driver.findElement(xpathLocator).click();
    }
    /**
     * predicate used to compare the student data against the submitted form
     */
    Predicate<StudentFormDataModel> isFormFilledCorrectly = (studentData)->{
        if(!tableValues.get(0).getText().contains(studentData.getFirstName()) ||
           !tableValues.get(0).getText().contains(studentData.getLastName()))
           {return false;}
    return true;
    };
    enum dropDown{state,city}
}
