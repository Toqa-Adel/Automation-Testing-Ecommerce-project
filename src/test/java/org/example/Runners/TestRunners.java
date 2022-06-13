package org.example.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/Features",
                glue = {"org/example"},
                plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/return.txt"},
                tags = "@smoke"
        )


public class TestRunners extends AbstractTestNGCucumberTests {
}
