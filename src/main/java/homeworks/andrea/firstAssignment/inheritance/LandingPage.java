package homeworks.andrea.firstAssignment.inheritance;

import org.openqa.selenium.WebElement;

/**
 * This class contains the web elements and methods used for interacting with the landing page in order to simulate the different user actions
 */

public class LandingPage extends PageBase {

    private WebElement searchBox;
    private WebElement confirmSearchButton;
    private WebElement nextPageButton;

    /**
     * This method allows to search a specific product using the search box that is located on the landing page
     *
     * @param product corresponds to the name of a product or word - related that will be searched on the search box
     */
    public void searchAProductWithSearchBox(String product) {

        clickOnElement(searchBox);
        fillInformation(searchBox, product);
        clickOnElement(confirmSearchButton);

    }

    /**
     * This method allows to go to the next result page after searching for a specific product
     */
    public void goToNextProductResultPage() {

        scrollDown(nextPageButton);
        clickOnElement(nextPageButton);
    }
}
