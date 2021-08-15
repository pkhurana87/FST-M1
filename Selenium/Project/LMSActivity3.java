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

public class LMSActivity3 {
	
	String InfoBoxHeading;
	
	LMSActivity1 lms = new LMSActivity1();
	//WebDriver driver = LMSActivity1.driver;
	
    @When("^User gets the title of Info Box$")
    public void getHeading() throws Throwable {
    	 
    	 lms.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h3")));
    	 InfoBoxHeading = lms.driver.findElement(By.xpath("//h3")).getText();
	        System.out.println("Info Box Heading :"+InfoBoxHeading);
    }
 
    @Then("^Validate if title matches with expected \"(.*)\" close the browser$")
    public void ValHandle(String expected) throws Throwable {
    	 if(InfoBoxHeading.trim().contentEquals(expected)) {
    		 lms.closeTheBrowser();
    		 
    	 }
    } 
 
  
   
}
