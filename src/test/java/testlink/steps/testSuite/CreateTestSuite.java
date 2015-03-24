package testlink.steps.testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import testlink.steps.steps.TestSteps;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yana on 3/20/2015.
 */
public class CreateTestSuite extends TestSteps {
    @BeforeTest
    public void init() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void createSuite() {
        Assert.assertTrue(login("admin", "admin"), "Login Failed");
    }

    @AfterTest
    public void close() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }

}
