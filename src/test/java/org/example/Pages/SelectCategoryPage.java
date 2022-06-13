package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectCategoryPage {


    public WebElement electronics_category(){
    WebElement cat = Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000005_electronics_450.jpeg\"]"));
        return cat;
    }

    public WebElement sub_category(){
        WebElement subcat = Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000006_camera-photo_450.jpeg\"]"));
        return subcat;
    }
}
