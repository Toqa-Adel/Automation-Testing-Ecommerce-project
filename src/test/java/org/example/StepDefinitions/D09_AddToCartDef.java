package org.example.StepDefinitions;

import org.example.Pages.AddToCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D09_AddToCartDef {

    AddToCartPage addToCartPage = new AddToCartPage();

    @Given("^user login to website \"(.*)\" and \"(.*)\"$")
    public void login(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @When("^user search for a product \"(.*)\"$")
    public void browseProduct(String product){
    SharedMethods.Search_for_Product(product);
    }

    @And("user go to a product and press add to cart")
    public void addProduct(){
    addToCartPage.AddToCartBTN().click();
    }

    @Then("product would be added to cart")
    public void checkAddMsg(){
        String ActualResult = addToCartPage.addMsg().getText();
        String ExpectedResult = "The product has been added to your";
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }




}
