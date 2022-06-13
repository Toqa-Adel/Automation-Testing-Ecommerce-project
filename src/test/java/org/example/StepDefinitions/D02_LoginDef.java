package org.example.StepDefinitions;

import org.example.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D02_LoginDef {
    WebDriver driver = null;
    LoginPage login = new LoginPage();


    @Given("user navigates login page")
    public static void navigate_to_loginPAge(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login");
    }


    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public static void enter_valid_data(String email, String password) throws InterruptedException {
        LoginPage.LoginData(email, password);
    }

    @And("user click on login button")
    public static void clickLoginButton() throws InterruptedException {
        LoginPage.loginButton().click();
        Thread.sleep(3000);
    }

    @Then("user could login successfully")
    public void Success_login(){

       String ExpectedResult = "Log out";
       String ActualResult = login.logoutButton().getText();

       Assert.assertTrue(ActualResult.contains(ExpectedResult));
       Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }


    @And("redirected to homepage")
    public static void goto_homepage() throws InterruptedException {
        Assert.assertEquals("https://demo.nopcommerce.com/", Hooks.driver.getCurrentUrl());
        Thread.sleep(3000);
    }



}
