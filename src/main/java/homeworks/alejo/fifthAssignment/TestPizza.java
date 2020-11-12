package homeworks.alejo.fifthAssignment;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestPizza {
    private WebDriver driver;
    private PapaJhonsHomePage papaJhonsHomePage;

    @Before
    public void setDriver() {
        String browser = "chrome";
        this.driver = DriverFactory.getDriver(browser);
        this.papaJhonsHomePage = new PapaJhonsHomePage(driver);
    }

    @Test
    public void selectPizza() {
        driver.get("https://www.papajohns.com.co/");
        papaJhonsHomePage.clickMiddleSizeDropDown();
        Supplier<Integer> random = () -> (int) Math.random() * 5 + 2;
        papaJhonsHomePage.chooseOption(random.get());
        papaJhonsHomePage.clickCustomizeBtn();
        papaJhonsHomePage.clickDom();
        papaJhonsHomePage.chooseCityOption();
        papaJhonsHomePage.setAddress();
        papaJhonsHomePage.clickFindLocal();
        papaJhonsHomePage.clickConfirm();
        papaJhonsHomePage.clickPedir();
        Predicate<String> isTheRightAddress = address -> address.equals("GUAYACAN");
        Assert.assertTrue(isTheRightAddress.test(papaJhonsHomePage.getTxtAddress()));
    }

    @After
    public void closeDriver() {
        this.driver.close();
    }
}
