package base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseTest {
    protected WebDriver driver;
    private ConfigReader configReader;

   
	@BeforeMethod
    public void setUp() {
        configReader = new ConfigReader();
        System.setProperty("webdriver.chrome.driver", configReader.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(configReader.getProperty("implicit.wait"))));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}