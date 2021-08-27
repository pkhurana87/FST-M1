package testNGTests;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Activity2 {
	
	WebDriver driver;
	 WebElement button;
	 //SoftAssert sf  = new SoftAssert();
	@BeforeClass
	public void browser() {
	driver = new FirefoxDriver();
	}

	
	//Open the browser
	@Test(priority =0)
	public void get() {
	driver.get("https://www.training-support.net/selenium/target-practice");
	String title = driver.getTitle();
	
    //Print the title of the page
    System.out.println("Page title is: " + title);
	
        //Assertion for page title
    Assert.assertEquals("Target Practice", title);
	}          
    //Assertion for black button
	@Test(priority =1)
	public void button() {
    button = driver.findElement(By.cssSelector("button.black"));
    assertFalse(button.isDisplayed());
    //sf.assertFalse(button.isDisplayed());
    System.out.println("Print this");
	}
	
	@Test(priority =2, enabled = false)
	public void skipcase() {
    
    System.out.println("Test case skipped");
	}
	
	@Test 
	public void aSkipTest() {
	    String condition ="Skip Test";

	    if(condition.equals("Skip Test")){
		throw new SkipException("Skipping - This is not ready for testing ");
	    } else {
		//Execute test case when conditions are satisfied
	    }
	}
		
	//Close the browser
	@AfterClass
	public void close() {
	
		driver.close();
		//sf.assertAll();
	}
}
