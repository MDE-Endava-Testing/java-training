package homeworks.andrea.firstAssignment.inheritance;

import org.openqa.selenium.WebElement;

/**
 * This class contains the main methods used for interacting with a web or mobile page in order to simulate
 * different and repetitive UI behaviors.
 */

public class PageBase {

    /**
     * Allows to wait until an element is visible and then click on it
     *
     * @param element corresponds to the web element where the click will be applied
     */
    public void clickOnElement(WebElement element) {

        System.out.println("Waiting element to be visible");
        System.out.println("Clicking on element");
    }

    /**
     * Allows to scroll down on a page until a defined element is found inside that page
     *
     * @param element corresponds to the web element that defines the end of the scrolling action
     */
    public void scrollDown(WebElement element) {

        System.out.println("Scrolling down");
        System.out.println("Scroll finished because element was found");
    }

    /**
     * Allows to fill a specific field with a defined value
     *
     * @param element corresponds to the element or field that will receive a specific value
     * @param value   corresponds to the value that will be sent to a specific web element or field
     */
    public void fillInformation(WebElement element, String value) {

        System.out.println("filling value into element");
    }
}
