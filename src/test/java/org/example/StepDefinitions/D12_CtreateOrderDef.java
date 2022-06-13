package org.example.StepDefinitions;

import org.example.Pages.CreateOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D12_CtreateOrderDef {

    CreateOrderPage createOrder = new CreateOrderPage();
    D09_AddToCartDef addToCartDef = new D09_AddToCartDef();

    @Given("^user logged to the app \"(.*)\" and \"(.*)\"$")
    public void loginApp(String email, String password) throws InterruptedException {
        SharedMethods.loginSteps(email, password);
    }

    @And("^user Searched for \"(.*)\"$")
    public void setCreateOrder(String product){
        SharedMethods.Search_for_Product(product);
    }


    @And("user found product and add it to cart")
    public void addToCart(){
        addToCartDef.addProduct();
    }

    @When("user go to cart")
    public void go_toCart(){
        createOrder.cart().click();
    }

    @And("user agree with term")
    public void agreeTerms(){
        createOrder.terms().click();
    }

    @And("user press checkout")
    public void checkout(){
        createOrder.checkoutbtn().click();
    }

    @And("^user enter billing data \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void billingData(String country, String city, String address, String postalCode, String PHnumber) throws InterruptedException {
        createOrder.countryBill().click();
        Thread.sleep(2000);
        createOrder.countryBill().sendKeys(country);
        createOrder.countryBill().click();
        createOrder.cityBill().sendKeys(city);
        createOrder.AddressBill().sendKeys(address);
        createOrder.postCode().sendKeys(postalCode);
        createOrder.phoneNum().sendKeys(PHnumber);
        createOrder.continueBtn().click();
        Thread.sleep(2000);
        createOrder.shipOption().click();
        createOrder.continue2btn().click();
        createOrder.payMethod().click();
        createOrder.continue3btn().click();
        createOrder.continue4btn().click();
        createOrder.confirmBtn().click();
        Thread.sleep(2000);
    }

    @Then("order successfully complete")
    public void orderComplete(){
        String ExpectedResult = "Your order has been successfully processed!";
        String ActualResult =Hooks.driver.findElement(createOrder.confirmMsg()).getText();
        Assert.assertEquals(ActualResult.contains(ExpectedResult), true);
    }



}
