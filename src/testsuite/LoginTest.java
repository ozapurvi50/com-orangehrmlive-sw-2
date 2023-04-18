package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";          //Defined variable to store URL

    @Before
    public void setUp() {
        openBrowser(baseUrl);                    //Method to open browser
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Get Username element from webpage
        WebElement userName;

        //Find element for username
        userName = driver.findElement(By.name("username"));
        //Enter the User name in webpage
        userName.sendKeys("Admin1");

        // Get Password element from webpage
        WebElement password = driver.findElement(By.name("password"));

        //Enter the password in webpage
        password.sendKeys("admin1234");

        //Find element for submit button and perform click method to click the button
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        //Storing expected message from webpage
        String expectedMessage = "Dashboard";

        //Xpath to find element for text
        WebElement actualTextElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));

        //Find the text on webpage and store the text in variable
        String actualMessage = actualTextElement.getText();

        //Comparing the text and printing message in console
        Assert.assertEquals("Invalid Header", expectedMessage, actualMessage);

        driver.close();
    }


}
