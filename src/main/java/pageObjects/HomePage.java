package pageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        return driver.getTitle();
    }
}