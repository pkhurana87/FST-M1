package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps233 {
	
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^This is a regression test$")
    public void userrege() throws Throwable {
        //Create a new instance of the Firefox driver
        System.out.println("Regression");
    }
    
    @Given("^This is a blank test$")
    public void userrege1() throws Throwable {
        //Create a new instance of the Firefox driver
        System.out.println("Blank");
    }
    
    @Given("^This is a hit test$")
    public void userrege2() throws Throwable {
        //Create a new instance of the Firefox driver
        System.out.println("Hit");
    }
   
}
