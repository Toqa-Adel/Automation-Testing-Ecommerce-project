package org.example.StepDefinitions;

import org.example.Pages.LoginPage;
import org.example.Pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D03_ResetPasswordDef {

    WebDriver driver = null;
    ResetPasswordPage resetPassword = new ResetPasswordPage();


    @When("user click forget password")
    public void forgetPass(){
        resetPassword.forgetPW().click();
    }

    @And("^enter email \"(.*)\"$")
    public void enterEmail(String email){
      //  Hooks.driver.findElement(By.id("Email")).sendKeys(email);
        LoginPage.email().sendKeys(email);
    }

    @And("user enter recover")
    public void click_recoverButton(){
        resetPassword.recoverbtn().click();
      //  LoginPage.email().sendKeys(Keys.ENTER);
    }

    @Then("confirmation message appears")
    public void confirmMSG(){
        String ExpectedResult = "Email with instructions has been sent to you";
        String ActualResult =Hooks.driver.findElement(resetPassword.recoverMsg()).getText();

        Assert.assertTrue(ActualResult.contains(ExpectedResult));
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }

//    @When("user go to my account page")
//    public void myAccount() throws InterruptedException {
//       driver.findElement(By.className("ico-account")).click();
//      //  driver.navigate().to("https://demo.nopcommerce.com/customer/info");
//        Thread.sleep(3000);
//
//    }

//    @And("user select change password")
//    public void clickChangePWtab(){
//        driver.findElement(By.cssSelector("a[href=\"/customer/changepassword\"]")).click();
//
//    }

//    @Then("^user enter old pw \"(.*)\" and new pw \"(.*)\" and confirm pw \"(.*)\"$")
//    public void changePassSteps(String oldPass, String newPass, String confPass){
//        driver.findElement(By.id("OldPassword")).sendKeys(oldPass);
//        driver.findElement(By.id("NewPassword")).sendKeys(newPass);
//        driver.findElement(By.id("ConfirmNewPassword")).sendKeys(confPass);
//        driver.findElement(By.className("change-password-button")).click();
//    }


    @Given("^user login to website by \"(.*)\"$")
    public void preLogin(String email) throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login");
        LoginPage.email().sendKeys(email);
        Thread.sleep(3000);
    }


}
