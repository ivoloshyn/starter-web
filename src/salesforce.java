import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class salesforce {
    public static void main(String[] args) {
        //Create Driver object for firefox browser
        //invoke .exe file first
        //gecko driver
        System.setProperty("webdriver.gecko.driver", "D:\\Study\\Selenium+java\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.xpath("//*[@id='Login']")).click();

        // xPath //*[@id="username"] //*[@id="password"] //*[@id="Login"]
    }
}
