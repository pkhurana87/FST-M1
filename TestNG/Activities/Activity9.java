package testNGTests;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Activity9 {
	
	WebDriver driver;
	 WebElement button;
	 //SoftAssert sf  = new SoftAssert();
	@BeforeClass
	public void browser() {
	driver = new FirefoxDriver();
	Reporter.log("Driver is initiated");
	
	}

	
	//Open the browser
	@Test(priority=-1)
	public void get() {
	driver.get("https://www.training-support.net/selenium/javascript-alerts");
	String title = driver.getTitle();
	
	
    //Print the title of the page
    System.out.println("Page title is: " + title);
	Reporter.log("Browser is opened");
     
	}
	
	@Test()
	public void simpleAlertTestCase() {
	//Click on simple button
    driver.findElement(By.id("simple")).click();
    Reporter.log("simpleAlert button is clicked");
    //switch to alert
    System.out.println("Alert Text present on Simple: "+driver.switchTo().alert().getText());
    Reporter.log("simpleAlert tesxt is checked");
    driver.switchTo().alert().accept();
    Reporter.log("SimpleAlert is tested");
	}
	
	//@Test(dependsOnMethods = {"get"})
	@Test
	public void confirmAlertTestCase() {
		 driver.findElement(By.id("confirm")).click();
		 Reporter.log("ConfirmAlert button is clicked");
		    //switch to alert
		    System.out.println("Alert Text present on Confirm: "+driver.switchTo().alert().getText());
		    Reporter.log("ConfirmAlert text is checked");
		    driver.switchTo().alert().accept();
		    Reporter.log("ConfirmAlert is tested");
	}
	
	@Test()
	public void promptAlertTestCase() {
		 driver.findElement(By.id("prompt")).click();
		    //switch to alert
		 driver.switchTo().alert().sendKeys("Test");
		   
		    driver.switchTo().alert().accept();
		    Reporter.log("PromptAlert is tested");
	}
	
	//Close the browser
	@AfterClass
	public void close() {
	
		driver.close();
		//sf.assertAll();
	}
}
