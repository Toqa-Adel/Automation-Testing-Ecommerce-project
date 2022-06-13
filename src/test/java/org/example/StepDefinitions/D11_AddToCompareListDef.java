package org.example.StepDefinitions;

import org.example.Pages.AddToCompareListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D11_AddToCompareListDef {

    AddToCompareListPage compareListPage = new AddToCompareListPage();

    @Given("^user logged in to app \"(.*)\" and \"(.*)\"$")
    public void loginapp(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @When("^user search product \"(.*)\"$")
    public void search(String product){
        SharedMethods.Search_for_Product(product);
    }

    @And("user go to a product and press add to compare List")
    public void addToCompare(){
        compareListPage.compareBTN().click();
    }


    @Then("product would be added to compare List")
    public void comparelistMSG(){
        String ActualResult = compareListPage.cmopareMSG().getText();
        String ExpectedResult = "The product has been added to your";
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }
}

