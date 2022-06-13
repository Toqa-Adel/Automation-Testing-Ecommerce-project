package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCompareListPage {

    public WebElement compareBTN(){
        WebElement btn= Hooks.driver.findElement(By.className("add-to-compare-list-button"));
        return btn;
    }

    public WebElement cmopareMSG(){
        WebElement msg= Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return msg;
    }
}
