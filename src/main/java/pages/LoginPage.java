package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Yana on 3/20/2015.
 */
public class LoginPage {

    protected WebDriver driver;
    private static final String URL = "http://demo.testlink.org/latest/login.php";

    private static final By loginField = By.id("login");
    private static final By passField = By.name("tl_password");
    private static  final By loginButton = By.name("login_submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("http://demo.testlink.org/latest/login.php");
    }

    public HomePage login(String login, String pass){
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passField).sendKeys(pass);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
