package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
    public static void main(String[] args) {
        //Create Driver object for firefox browser
        //invoke .exe file first
        //gecko driver
        System.setProperty("webdriver.gecko.driver", "D:\\Study\\Selenium+java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com.ua");
        // xPath //*[@id="username"] //*[@id="password"] //*[@id="Login"]
    }
}
