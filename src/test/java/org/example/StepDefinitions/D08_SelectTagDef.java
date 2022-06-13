package org.example.StepDefinitions;

import org.example.Pages.SelectCategoryPage;
import org.example.Pages.SelectTagPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D08_SelectTagDef {
    WebDriver driver = null;
    SelectTagPage selectTagPage = new SelectTagPage();
    SelectCategoryPage selectCategoryPage = new SelectCategoryPage();

    @When("browse any category")
    public void browseCategory(){
        selectCategoryPage.electronics_category().click();
    }

    @And("user select tag")
    public void selectTag(){
        selectTagPage.tag().click();
    }

    @Then("Products tagged with selected tag")
    public void taggedResults(){
        String ActualResult = Hooks.driver.getCurrentUrl();
        String ExpectedResult = "https://demo.nopcommerce.com/computer";
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }
}
