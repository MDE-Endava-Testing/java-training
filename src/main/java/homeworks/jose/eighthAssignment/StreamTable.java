package homeworks.jose.eighthAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;


public class StreamTable {

    private WebDriver driver;
    private List<String> operationArray;

    @FindBy(xpath = "//tr")
    private List<WebElement> table;

    public StreamTable(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getCheckBox(String word) {
        table.stream().filter(we -> we.getText().contains(word)).forEach(e -> e.findElement(By.tagName("input")).click());
    }

    public void addMapTable(){
        operationArray = Arrays.asList(driver.findElement(By.xpath("(//tr)[1]")).getText().split(" "));
    }

    public void getCheckBox(String word, String type) {
        addMapTable();
        int i = 0;
        for (int j = 0; j < operationArray.size(); j++) {
            if (operationArray.get(j).equals(type)){
                i = j+1;
            }
        }
        String typeChose = "//tr[*]/td["+i+"]";
        List<WebElement> subTable = driver.findElements(By.xpath(typeChose));
        for (int j = 0; j < subTable.size(); j++) {
            if (subTable.get(j).getText().contains(word)) {
                table.get(j+1).findElement(By.tagName("input")).click();
            }
        }
    }
}
