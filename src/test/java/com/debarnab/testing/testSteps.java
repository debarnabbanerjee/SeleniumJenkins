package com.debarnab.testing;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testSteps {

//    public static void main(String[] args) {
//        System.out.println("Read Specific Enviornment Variable");
//        System.out.println("User Name Value:- " + System.getenv("BROWSERSTACK_USERNAME"));
//        System.out.println("User Name Value:- " + System.getenv("BROWSERSTACK_PASSWORD"));
//
//
//    }

    WebDriver driver;

    @Given("^I open \"([^\"]*)\"$")
    public void i_open(String arg1) throws Throwable {
       System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//MicrosoftWebDriver.exe");
        driver = new EdgeDriver();
    }

    @Then("^I navigate to url$")
    public void i_navigate_to_url() throws Throwable {
        driver.navigate().to("https://beta.base7booking.com/login");
    }

    @Then("^I login using credentials$")
    public void i_login_using_credentials() throws Throwable {
//        String username = System.getenv("BROWSERSTACK_USERNAME");
//        String password = System.getenv("BROWSERSTACK_PASSWORD");
        String username = System.getProperty("BROWSERSTACK_USERNAME");
        String password = System.getProperty("BROWSERSTACK_PASSWORD");
        System.out.println("User Name Value:- " + username);
        System.out.println("User Name Value:- " + password);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='root']/div/div/div[2]/form/input[1]")).sendKeys("debarnabb");
        driver.findElement(By.cssSelector(".content > form:nth-child(1) > input:nth-child(2)")).sendKeys(username);
        driver.findElement(By.cssSelector(".content > form:nth-child(1) > input:nth-child(3)")).sendKeys(password);
//
       driver.findElement(By.cssSelector(".login-button")).click();

    }

}
