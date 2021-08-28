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

public class AlertSteps {
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on the page$")
    public void userIsOnGooglePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    
    @When("^User clicks the Simple Alert button$")
    public void SimpleAlert() throws Throwable {
    	driver.findElement(By.id("simple")).click();
    }
 
    @When("^User clicks the Confirm Alert button$")
    public void ConfirmAlert() throws Throwable {
    	driver.findElement(By.id("confirm")).click();
    }
    @When("^User clicks the Prompt Alert button$")
    public void PromptAlert() throws Throwable {
    	driver.findElement(By.id("prompt")).click();
    }
    @Then("^Alert opens$")
    public void Alertopen() throws Throwable {
       
    	System.out.println("Alert is opened");
    }
   
 
	 @And("^Read the text from it and print it$")
    public void readtext() throws Throwable {
		 System.out.println("Alert Text present on Simple: "+driver.switchTo().alert().getText());
    }
    @And("^Close the alert$")
    public void closealert() throws Throwable {
    	 driver.switchTo().alert().accept();
    }
    @And("^Read the result text$")
    public void resulttext() throws Throwable {
    	driver.switchTo().defaultContent();
    	 System.out.println("Result with tag P: "+driver.findElement(By.xpath("//p")).getText());
    }
    
    @And("^Close the alert with Cancel$")
    public void cancel() throws Throwable {
    	 driver.switchTo().alert().dismiss();
   }
    
    @And("^Write a custom message in it$")
    public void send() throws Throwable {
    	 driver.switchTo().alert().sendKeys("Test");
   }
    @And("^Close Browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
