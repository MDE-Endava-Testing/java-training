package homeworks.alejo.fifthAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Supplier<WebDriver> chromeSupplier = () -> {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avelasquez\\OneDrive - ENDAVA\\Desktop\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver> firefoxSupplier = () -> {
        System.setProperty("webdriver.firefox.driver", "path");
        return new FirefoxDriver();
    };

    private static final Supplier<WebDriver> edgeSupplier = () -> {
        System.setProperty("webdriver.edge.driver", "path");
        return new EdgeDriver();
    };

    private static final Map<String, Supplier<WebDriver>> MAP = new HashMap<>();

    static {
        MAP.put("chrome", chromeSupplier);
        MAP.put("firefox", firefoxSupplier);
        MAP.put("edge", edgeSupplier);
    }

    public static WebDriver getDriver(String browser) {
        return MAP.get(browser).get();
    }

}