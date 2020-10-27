package com.bitrix.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
WebDriver driver;

    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://login2.nextbasecrm.com");

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        /*

         */
    }


    @When("user logs in")
    public void user_logs_in() {
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk3@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser" + Keys.ENTER);

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user should see the page")
    public void user_should_see_the_page() {
        WebElement logo_24_text = driver.findElement(By.xpath("//span[@class='logo-text']"));
        Assert.assertTrue("logo missing", logo_24_text.isDisplayed());
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


}
