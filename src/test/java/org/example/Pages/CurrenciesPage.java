package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrenciesPage {
    WebDriver driver;

    public WebElement currBox(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement currentCurr(){
        WebElement cur = Hooks.driver.findElement(By.className("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fregisterresult%2F1%3FreturnUrl%3D%2Fpasswordrecovery\""));
        return cur;
    }
}
