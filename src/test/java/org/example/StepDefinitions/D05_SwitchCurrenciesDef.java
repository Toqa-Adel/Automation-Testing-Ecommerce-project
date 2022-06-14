package org.example.StepDefinitions;

import io.cucumber.java.en.Then;
import org.example.Pages.CurrenciesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D05_SwitchCurrenciesDef {
    WebDriver driver = null;
    CurrenciesPage currency = new CurrenciesPage();

    @Given("^user could logged by \"(.*)\" and \"(.*)\"$")
    public void preSteps(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @When("user go to currencies options")
    public void optionsBox() throws InterruptedException {
    currency.currBox().click();
    Thread.sleep(2000);
    }

    @And("^user select currency \"(.*)\"$")
    public void setCurrency(String curr){
        currency.currBox().sendKeys(curr);
        currency.currBox().click();
    }

    @And("navigate to any category")
    public void search_category(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/shoes");
    }

    @Then("currency switched")
    public void currency_check(){
        String Actual = Hooks.driver.findElement(By.className("actual-price")).getText();
        //System.out.println("********actual result is: "+Actual);
        String Expected = "€";
        Assert.assertEquals(Actual.contains(Expected), true);
    }

}


