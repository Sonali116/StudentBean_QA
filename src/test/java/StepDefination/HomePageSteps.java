package StepDefination;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HomePageSteps {
    HomePage homePage = new HomePage();



    @Given("^I am on the studentbeans homepage$")
    public void iamonstudentbeanshomepage() {
        Assert.assertTrue(homePage.isUserOnHomePage());
    }


    @When("^I open the search bar$")
    public void openSearchBar() {
        homePage.openSearchBox();
    }

    @And("^I enter (.*)$")
    public void enterData(String brandName) {
        homePage.enterSearchKeyword(brandName);
    }

    @Then("^I should be shown a search listing for (.*)$")
    public void listingDisplay(String brandName) {
        System.out.println("brandName status: " + homePage.isBrandNameDisplayed(brandName));
        Assert.assertTrue(homePage.isBrandNameDisplayed(brandName));
    }
}


