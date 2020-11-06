package homeworks.daniel.fourthAssignment;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 *  SAM interface used to implemend a lambda function helpful to select various Webelements form a string input
 */
public interface AnchorSelector {
    /**
     * Method helpful for creating a list of webElements based on a string input
     * @param option String input useful to modify locators when finding webElements
     * @return webElement list containing all the elements found by the locator
     */
    List<WebElement> selectAnchors(String option);
}
