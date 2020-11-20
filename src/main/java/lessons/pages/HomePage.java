package lessons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.function.Consumer;

public class HomePage {
    private WebDriver webDriver;

    @FindBy (xpath="")
    private WebElement element1;

    @FindBy (xpath="")
    public WebElement element2;

    public void clickE1(){
        //webDriver.wait(clickable);
        //reset implitic wait time
        element1.click();
    }

    private Consumer<WebElement> clickWe= e -> e.click();

    private void clickE2(){
        clickWe.accept(element2);
    }









}
