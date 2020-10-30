package homeworks.andrea.firstAssignment.inheritance;

import org.openqa.selenium.WebElement;

/**
 * This class contains the web elements and methods used for interacting with the login page
 * It simulates the actions a user will do when trying to log into a web app
 */

public class LoginPage extends PageBase {

    private WebElement nameField;
    private WebElement passwordField;
    private WebElement confirmButton;

    /**
     * This method allows to send credentials on a login form in order to access a web app
     *
     * @param name     corresponds to the user name that is being sent in order to log into the web app
     * @param password corresponds to the user password that is being sent in order to log into the web app
     */
    public void loginIntoThePortal(String name, String password) {

        fillInformation(nameField, name);
        fillInformation(passwordField, password);
        clickOnElement(confirmButton);
    }
}
