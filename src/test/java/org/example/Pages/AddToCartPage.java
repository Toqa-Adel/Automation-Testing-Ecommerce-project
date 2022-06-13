package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {
    WebDriver driver;

    public WebElement AddToCartBTN(){
        WebElement btn = Hooks.driver.findElement(By.className("product-box-add-to-cart-button"));
        return btn;
    }

    public WebElement addMsg(){
        WebElement msg= Hooks.driver.findElement(By.cssSelector("p[class=\"content\""));
        return msg;
    }
}
