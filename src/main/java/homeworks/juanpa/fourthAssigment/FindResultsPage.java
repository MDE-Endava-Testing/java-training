package homeworks.juanpa.fourthAssigment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindResultsPage {

    WebDriver driver;

    /**
     * searchWord search the possibles pages who contains a specific word in a Browser
     * @param word
     */
    public void searchWord(String word){
        WebElement textField = driver.findElement(By.xpath("//input[@title='Buscar']"));
        textField.sendKeys(word);
        textField.sendKeys(Keys.ENTER);
    }

    /**
     * resulsSearching get all the results who has a specific tagName in the html
     * @return
     */
    List<WebElement> resultsSearching(){
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        return elements;
    }

}
