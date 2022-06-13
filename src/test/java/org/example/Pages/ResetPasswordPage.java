package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {
    WebDriver driver;

public WebElement forgetPW(){
    WebElement forgetpwbtn= Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    return forgetpwbtn;
}

public WebElement recoverbtn() {
    WebElement btn = Hooks.driver.findElement(By.className("password-recovery-button"));
    return btn;
}

    public By recoverMsg()
    {
        return By.cssSelector("p[class=\"content\"]");
    }

//    public WebElement recoverButton(){
//    WebElement rbutton = Hooks.driver.findElement(By.tagName("button[name=\"send-email\"]"));
//    return rbutton;
//    }
}
