package org.example.StepDefinitions;

import org.example.Pages.CurrenciesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

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

    @And("^user select currency \"(.*)\" and currency switched$")
    public void setCurrency(String curr){
        currency.currBox().sendKeys(curr);
        currency.currBox().click();
    }

}


