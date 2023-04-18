package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {


    String baseUrl = "https://opensource-demo.orangehrmlive.com/";    //Defined variable to store URL

    @Before
    public void setUp() {                                             //Defined method to open browser
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //find the element to click on forgotten password tab and click on it
        driver.findElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']/parent::div")).click();
    }
    @Test
    public void verifyForgotPasswordText() {

        //Expected message
        String expectedMessage = "Forgot Your Password?";

        //Xpath to find element for text
        WebElement actualTextElement = driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));

        //Find the text on webpage and store the text in variable
        String actualMessage = actualTextElement.getText();

        //Comparing the text and printing message in console
        Assert.assertEquals("Invalid password", expectedMessage, actualMessage);

        //receiving failed result as password text is incorrect.
        //Password doesn't match

    }



}
