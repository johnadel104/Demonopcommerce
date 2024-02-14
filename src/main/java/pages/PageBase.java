package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver){this.driver=driver;}
    public void clickOnElement(By elementlocator) {
        driver.findElement(elementlocator).click();
    }

    public void enterText(By elementlocator, String text) {
        driver.findElement(elementlocator).sendKeys(text);
    }
    public void selectElement(By elementlocator){
        driver.findElement(elementlocator).isSelected();
    }

}
