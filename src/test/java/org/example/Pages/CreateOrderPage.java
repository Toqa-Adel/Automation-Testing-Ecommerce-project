package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateOrderPage {

    public WebElement cart(){
        WebElement cart = Hooks.driver.findElement(By.className("cart-label"));
        return cart;
    }

    public WebElement terms(){
        WebElement term = Hooks.driver.findElement(By.cssSelector("label[for=\"termsofservice\"]"));
        return term;
    }

    public WebElement checkoutbtn(){
        WebElement btn= Hooks.driver.findElement(By.id("checkout"));
        return btn;
    }

    public WebElement countryBill(){
        WebElement cntry = Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
        return cntry;
    }

    public WebElement cityBill() {
        WebElement city = Hooks.driver.findElement(By.id("BillingNewAddress_City"));
        return city;
    }

    public WebElement AddressBill() {
        WebElement add = Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
        return add;
    }

    public WebElement postCode() {
        WebElement code = Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        return code;
    }

    public WebElement phoneNum() {
        WebElement num = Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        return num;
    }

    public WebElement continueBtn(){
        WebElement btn= Hooks.driver.findElement(By.className("new-address-next-step-button"));
        return btn;
    }

    public WebElement shipOption(){
        WebElement opt= Hooks.driver.findElement(By.id("shippingoption_1"));
        return opt;
    }

    public WebElement continue2btn(){
        WebElement btn = Hooks.driver.findElement(By.className("shipping-method-next-step-button"));
        return btn;
    }

    public WebElement payMethod(){
        WebElement btn = Hooks.driver.findElement(By.id("paymentmethod_0"));
        return btn;
    }

    public WebElement continue3btn(){
        WebElement btn = Hooks.driver.findElement(By.className("payment-method-next-step-button"));
        return btn;
    }

    public WebElement continue4btn(){
        WebElement btn = Hooks.driver.findElement(By.className("payment-info-next-step-button"));
        return btn;
    }

    public WebElement confirmBtn(){
        WebElement btn = Hooks.driver.findElement(By.className("confirm-order-next-step-button"));
        return btn;
    }

    public By confirmMsg()
    {
        return By.className("order-completed");

    }

}
