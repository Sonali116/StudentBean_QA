package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

        @FindBy(css = "button#onetrust-accept-btn-handler")
        WebElement AcceptCookies;

        @FindBy(css = "[href*='homepage_promobox']")
        WebElement HomePagePromos;
        @FindBy(css = "[name='query']")
        WebElement searchField;
        @FindBy(css = "[type='text'][placeholder='Start typing...']")
        WebElement TypeData;


    public HomePage() {
            PageFactory.initElements(driver, this);
        }

        public boolean isUserOnHomePage() {
            Utils.waitForPageLoad();
            return HomePagePromos.isDisplayed();

        }

        public void clickAcceptCookies() {
            AcceptCookies.click();
        }

        public void openSearchBox() {
            searchField.click();
        }

        public void enterSearchKeyword(String brandName) {
            TypeData.sendKeys(brandName);
        }
        public boolean brandLinkPresent;

        public boolean isBrandNameDisplayed(String brandName) {
            List<WebElement> brandLink = driver.findElements(By.cssSelector("a[href^='/student-discount/uk'][class='_mtchbu']"));

            for (WebElement webElement : brandLink) {

                Utils.waitForElement(webElement);
                brandLinkPresent = webElement.getText().replaceAll("[\\t\\n\\r]+", " ").contains(brandName);
            }
            return brandLinkPresent;
        }

    }





