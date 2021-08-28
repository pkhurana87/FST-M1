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

public class LoginTestSteps {
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Login page$")
    public void userIsOnGooglePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @When("^User enters username and password$")
    public void userEnterUsernamePassword() throws Throwable {
    	
    	driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEnterUsernamePassword4(String username, String password) throws Throwable {
    	
    	driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
 
    @Then("^Read the page title and confirmation message$")
    public void showHowManySearchResultsWereShown() throws Throwable {
    	System.out.println("Tittle of Page: " + driver.getTitle());
        String confirm_message = driver.findElement(By.xpath("//div[@id= 'action-confirmation']")).getText();
        System.out.println("Message on UI: " + confirm_message);
    }
 
    @And("^Close the Browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
