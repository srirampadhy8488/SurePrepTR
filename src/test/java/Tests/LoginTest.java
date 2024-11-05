package Tests;

import base.BaseTest;
import pageObjects.LoginPage;
import utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        ConfigReader configReader = new ConfigReader();
        driver.get(configReader.getProperty("login.url"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "testpassword");

        String expectedTitle = configReader.getProperty("home.page.title");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Login failed or title mismatch");
    }
}