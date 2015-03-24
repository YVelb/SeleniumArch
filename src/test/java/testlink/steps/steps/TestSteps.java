package testlink.steps.steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

/**
 * Created by Yana on 3/20/2015.
 */
public class TestSteps {
    public WebDriver driver;

    public boolean login(String login, String pass){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        return loginPage.login(login, pass).isOpened();
    }
}
