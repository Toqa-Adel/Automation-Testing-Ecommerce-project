package org.example.StepDefinitions;

import org.example.Pages.AddToWishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D10_AddToWishlistDef {
    AddToWishlistPage wishlistPage = new AddToWishlistPage();

    @Given("^user logged in to app by \"(.*)\" and \"(.*)\"$")
    public void login(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @When("^user search for product \"(.*)\"$")
    public void searchProduct(String product){
        SharedMethods.Search_for_Product(product);
    }

    @And("user go to a product and press add to wishlist")
    public void addToWishlist(){
        wishlistPage.wishList().click();
    }

    @Then("product would be added to wishlist")
    public void addMsg(){
        String ActualResult = wishlistPage.wishMsg().getText();
        String ExpectedResult = "The product has been added to your";
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }


}
