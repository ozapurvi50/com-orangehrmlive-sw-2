package browserfactory;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;                              //Defining variable

    public void openBrowser(String baseUrl) {                    //Defined method to Open Url
        driver = new ChromeDriver();                             //Storing the Browser driver to variable
        driver.get(baseUrl);                                     //Get Url
        driver.manage().window().fullscreen();                   //Maximize Screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));   //implicit wait
    }
@After
    public void closeBrowser() {
        driver.quit();                                            //close all browser
    }
}