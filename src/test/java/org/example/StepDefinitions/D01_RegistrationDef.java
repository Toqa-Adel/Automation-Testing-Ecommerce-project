package org.example.StepDefinitions;

import org.example.Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D01_RegistrationDef {
    WebDriver driver = null;
    RegistrationPage register = new RegistrationPage();

//    @When("user click on registration link go to registration page")
//    public void register_link() throws InterruptedException {
//        register.regLinkBut().click();
//        Thread.sleep(5000);
//    }

    @Given("user go to registration page")
    public void registerPage() throws InterruptedException {
        register.regLinkBut().click();
        Thread.sleep(3000);
    }

   @When("^user enter \\\"(.*)\\\" and \\\"(.*)\\\" and \\\"(.*)\\\" and \\\"(.*)\\\" and \\\"(.*)\\\"$")
    public void enter_registration_Data(String ftname, String ltname, String email, String password, String confPass) throws InterruptedException {
   // driver.navigate().to("https://demo.nopcommerce.com/register");

    register.RegisterData(ftname, ltname, email, password, confPass);
       Thread.sleep(2000);
    }

    @And("user clicks on register button")
    public void click_regButton(){
    register.registerButton().click();
    }

    @Then("user could register successfully")
    public void register_success(){
        String ExpectedResult = "Your registration completed";
        String ActualResult = Hooks.driver.findElement(register.result()).getText();

        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }

    @And("return to homepage")
    public void goto_homepage(){
        register.continueBTN().click();
    }
}
