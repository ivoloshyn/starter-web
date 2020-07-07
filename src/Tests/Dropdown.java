package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\Study\\Selenium+java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("");
    }
}
