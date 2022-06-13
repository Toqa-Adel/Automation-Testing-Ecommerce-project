package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {
  //  WebDriver driver;

    public static WebElement searchBox(){
        WebElement box=Hooks.driver.findElement(By.className("search-box-text"));
        return box;
    }

//    public WebElement searchBox(WebDriver driver){
//        By searchBox = By.className("search-box-text");
//        WebElement searchEle= driver.findElement(searchBox);
//        return searchEle;
//    }

    public static WebElement searchButton(){
        return Hooks.driver.findElement(By.className("search-box-button"));
    }


}
