package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Yana on 3/20/2015.
 */
public class HomePage {
    protected WebDriver driver;
    private static final By headerFrame = By.name("titlebar");
    private static final By version = By.cssSelector("span.bold");


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isOpened(){
        driver.switchTo().frame(driver.findElement(headerFrame));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(version));
        return driver.getTitle().contains("TestLink");
    }

}
