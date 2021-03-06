package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;


    @Before
    public static void openBrowser() throws InterruptedException {
        String path =System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

      // System.setProperty("webdriver.chrome.driver", "C:\\Users\\cw\\IdeaProjects\\automation-project\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
    }

        @After
    public void closeDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
