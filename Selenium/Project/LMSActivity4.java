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

public class LMSActivity4 {
	
	String CourseTitle;
	
	LMSActivity1 lms = new LMSActivity1();
    
    @When("^User gets the title of Second Popular Course$")
    public void getHeading() throws Throwable {
    	lms.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//div[@class='caption'])[2]/h3")));
    	 CourseTitle = lms.driver.findElement(By.xpath("(//div[@class='caption'])[2]/h3")).getText();
	        System.out.println("Info Box Heading :"+CourseTitle);
    }
 
    @Then("^Validate if Course title matches with expected \"(.*)\" close the browser$")
    public void ValHandle(String expected) throws Throwable {
    	 if(CourseTitle.trim().contentEquals(expected)) {
    		 lms.closeTheBrowser();
    	 }
    } 
 
  
   
}
