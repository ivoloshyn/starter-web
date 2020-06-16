import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        //Create Driver object for chrome browser
        //invoke .exe file first
        System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium+java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.get("https://yahoo.com");
        driver.navigate().back();
        driver.close(); // closes current browser*/
        //driver.quit(); // all browsers opened by selenium
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.close(); // closes current browser*/


    }
}
