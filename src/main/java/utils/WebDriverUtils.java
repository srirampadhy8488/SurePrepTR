package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
    public static WebDriver createDriver() {
        return new ChromeDriver();
    }
}
