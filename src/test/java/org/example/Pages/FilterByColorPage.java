package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterByColorPage {
    WebDriver driver;

    public WebElement color(){
        WebElement color = Hooks.driver.findElement(By.cssSelector("span[style=\"background-color:#8a97a8\"]"));
        return color;
    }
}
