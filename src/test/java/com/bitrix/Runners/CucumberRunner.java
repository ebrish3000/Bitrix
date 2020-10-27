package com.bitrix.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Features",
        glue = "com/bitrix/stepDefinitions",
        dryRun = false
)
public class CucumberRunner {

}
