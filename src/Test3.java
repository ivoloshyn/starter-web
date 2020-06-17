import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {
    public static void main(String[] args) {
        //Create Driver object for IE browser
        //invoke .exe file first
        //IE driver
        System.setProperty("webdriver.ie.driver", "D:\\Study\\Selenium+java\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println("master 1");
    }
}
