package StepDefination;

import Pages.BasePage;

import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks extends BasePage {
    @Before
    public void startUp() {
        OpenBrowser();
        driver.manage().window().fullscreen();
        HomePage homePage = new HomePage();
        homePage.clickAcceptCookies();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }







    }






