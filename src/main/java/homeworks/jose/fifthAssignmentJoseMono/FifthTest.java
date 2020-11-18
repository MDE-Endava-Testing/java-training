package homeworks.jose.fifthAssignmentJoseMono;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FifthTest {

    private WebDriver driver;
    private PapaJohnsPage papaJohnsPage;

    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriversFactory.getDriver(browser);
        this.papaJohnsPage = new PapaJohnsPage(driver);
    }

    @org.junit.Test
    public void getLinksNoNull() {
        driver.get("https://www.papajohns.com.co/");
        papaJohnsPage.clickOptionMiddleDropDown();

        Supplier<Integer> random = () -> (int) Math.random() * 5 + 2;
        papaJohnsPage.chooseOptionMiddleDropDown(random.get());

        CustomizationPizza customizationPizza = papaJohnsPage.clickCustomizeButton();
        customizationPizza.clickHomeButton();
        customizationPizza.clickNameCity();
        customizationPizza.chooseNameCity();
        customizationPizza.sendAddress("Calle 15 Sur, Cra. 48A #84, Medellín, Antioquia");
        customizationPizza.clickFindButton();
        customizationPizza.clickConfirmButton();
        papaJohnsPage = customizationPizza.clickRequestButton();

        Predicate<String> correctAddress = address -> address.equals("GUAYACAN");

        Assert.assertTrue(correctAddress.test(papaJohnsPage.getAddress()));

    }

    @After
    public void closeDriver() {
        this.driver.close();
    }
}
