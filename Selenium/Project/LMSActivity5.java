package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LMSActivity5 {
	
	String PageTitle;
	
	LMSActivity1 lms = new LMSActivity1();
       
    @When("^User Finds the navigation bar$")
    public void user_Finds_the_navigation_bar() throws Throwable {
    	lms.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='main-navigation']")));
    	lms.driver.findElement(By.xpath("//div[@class='main-navigation']"));
    }

    @Then("^Select the menu item that says \"(.*)\" and click it\\.$")
    public void select_the_menu_item_that_says_My_Account_and_click_it(String action) throws Throwable {
    	if(action.contains("My Account")) {
    	lms.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main-navigation'] // a[contains(@href,'account')]")));
    	WebElement myAcc = lms.driver.findElement(By.xpath("//div[@class='main-navigation'] // a[contains(@href,'account')]"));
    	myAcc.click();
    }
    	if(action.contains("All Courses")) {
    		lms.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main-navigation'] // a[contains(@href,'all-courses')]")));
        	WebElement myAcc = lms.driver.findElement(By.xpath("//div[@class='main-navigation'] // a[contains(@href,'all-courses')]"));
        	myAcc.click();
    	}
    	
    	if(action.contains("Contact")) {
    		lms.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='main-navigation'] // a[contains(@href,'contact')]")));
        	WebElement myAcc = lms.driver.findElement(By.xpath("//div[@class='main-navigation'] // a[contains(@href,'contact')]"));
        	myAcc.click();
    	}
    }
    

    @When("^Get the page title of the Account Page$")
    public void get_the_page_title_of_the_Account_Page() throws Throwable {
    	PageTitle = lms.driver.getTitle();
        System.out.println("Page Title :"+PageTitle);
    }

    @Then("^Validate that user is landed to correct page$")
    public void validate_that_user_is_landed_to_correct_page() throws Throwable {
    	if(PageTitle.trim().contains("Account")){
    		System.out.println("User is on Account Page");
    }
    }

    @Then("^Close the LMS browser$")
    public void close_the_LMS_browser() throws Throwable {
        lms.closeTheBrowser();
        
    }


 
  
   
}
