package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public static void waitForPageLoad(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void waitForElement(WebElement element){
//        WebDriverWait wait = new WebDriverWait(driver, 50);
//        wait.until(ExpectedConditions.elementToBeClickable(element));


        //Declare and initialise a fluent wait
        FluentWait wait = new FluentWait(driver);
//Specify the timeout of the wait
        wait.withTimeout(Duration.ofSeconds(40));
//Specify polling time
        wait.pollingEvery(Duration.ofSeconds(5));
//Specify what exceptions to ignore
        wait.ignoring(NoSuchElementException.class);

//This is how we specify the condition to wait on.
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
