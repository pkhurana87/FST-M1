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

public class LMSActivity2 {
	
	String PageHeading;
	
	LMSActivity1 lms = new LMSActivity1();
	//WebDriver driver = LMSActivity1.driver;
	//WebDriverWait wait = LMSActivity1.wait;
    @When("^User gets the Page Heading$")
    public void getHeading() throws Throwable {
    	 
    	 lms.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1")));
    	 PageHeading = lms.driver.findElement(By.xpath("//h1")).getText();
	        System.out.println("Page Heading :"+PageHeading);
    }
 
    @Then("^Validate if heading matches close the browser$")
    public void ValHandle() throws Throwable {
    	 if(PageHeading.trim().contentEquals("Learn from Industry Experts")) {
    		 lms.closeTheBrowser();
    	 }
    } 
 
  
   
}
