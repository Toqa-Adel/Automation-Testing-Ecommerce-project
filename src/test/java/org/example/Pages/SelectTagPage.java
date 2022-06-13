package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectTagPage {

    public WebElement tag(){
        WebElement tag = Hooks.driver.findElement(By.cssSelector("a[href=\"/computer\"]"));
        return tag;
    }
}
