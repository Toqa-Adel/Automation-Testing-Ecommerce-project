package org.example.StepDefinitions;

import org.example.Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D04_SearchDef {

   WebDriver driver = null;
    SearchPage search = new SearchPage();

    @Given("^user could login by \"(.*)\" and \"(.*)\"$")
    public void preSteps(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @When("^user go to search box And enter \"(.*)\"$")
    public static void Search_Product(String product){
      SearchPage.searchBox().sendKeys(product);
    }

    @And("click search button")
    public static void clickSearch_btn(){
    SearchPage.searchButton().click();
    }

    @Then("user could see search result page")
    public void resultPage(){
        String ActualResult = Hooks.driver.getCurrentUrl();
        String ExpectedResult = "https://demo.nopcommerce.com/search?q=";
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);    }
}
