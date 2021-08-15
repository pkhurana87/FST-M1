package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LMSActivity1 {
	
	static WebDriver driver;
    static WebDriverWait wait;
    String PageTitle;
    
    @Before
    public void initiate() {
    driver = new FirefoxDriver();
    wait = new WebDriverWait(driver, 15);
    }
    
  
    @Given("^User is on LMS Home Page$")
    public void userIsOnLMSPage() throws Throwable {
        //Create a new instance of the Firefox driver
      
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms/");
    }
    
    @When("^User gets the title$")
    public void getTitle() throws Throwable {
    	wait.until(ExpectedConditions.urlToBe("https://alchemy.hguy.co/lms/"));
    	  PageTitle = driver.getTitle();
	        System.out.println("Page Title :"+PageTitle);
    }
 
    @Then("^Validate if title \"(.*)\" matches close the browser$")
    public void ValMethod(String expected) throws Throwable {
    	System.out.println(expected);
    	Assert.assertEquals(PageTitle.trim(), "Alchemy LMS – An LMS Application");
    	closeTheBrowser();
    	
    	 
    }
     
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
