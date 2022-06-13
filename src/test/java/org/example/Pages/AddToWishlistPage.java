package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToWishlistPage {

    public WebElement wishList(){
        WebElement wish = Hooks.driver.findElement(By.className("add-to-wishlist-button"));
        return wish;
    }

    public WebElement wishMsg(){
     WebElement  wish =  Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return wish;
    }

}
