package org.example.StepDefinitions;

import org.example.Pages.SelectCategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D06_SelectCategoryDef {
    WebDriver driver = null;
    SelectCategoryPage selectCategory = new SelectCategoryPage();

    @Given("^user logged by \"(.*)\" and \"(.*)\"$")
    public void preSteps(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @When("user navigates to category and select category")
    public void find_category(){
        selectCategory.electronics_category().click();
    }

    @Then("user navigate to sub category")
    public void sub_category(){
        selectCategory.sub_category().click();
    }

    @And("user could review category products")
    public void review_products(){
        String ActualResult = Hooks.driver.getCurrentUrl();
        String ExpectedResult = "https://demo.nopcommerce.com/camera-photo";
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }

}
