package org.example.StepDefinitions;

import org.example.Pages.FilterByColorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D07_FilterByColorDef {
    WebDriver driver;
    FilterByColorPage filter = new FilterByColorPage();

    @Given("^user logged in by \"(.*)\" and \"(.*)\"$")
    public static void preLogin(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @When("user navigate to category Apparel - shoes")
    public void chooseCategory(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/shoes");
    }

    @And("user select color")
    public void selectColor(){
        filter.color().click();
    }

    @Then("products would be filtered by color")
    public void filteredResult(){
        String ActualResult = Hooks.driver.getCurrentUrl();
        String ExpectedResult = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=14";
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }
}
