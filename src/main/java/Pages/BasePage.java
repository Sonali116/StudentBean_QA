package Pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
    public static String Baseurl = "https://studentbeans.com/";
    public static WebDriver driver;

    public void OpenBrowser(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
        driver.get(Baseurl);}

    public void closeBrowser() {
        driver.quit();
    }






}
