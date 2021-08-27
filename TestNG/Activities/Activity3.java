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

public class Activity3 {
	
	WebDriver driver;
	 WebElement button;
	 //SoftAssert sf  = new SoftAssert();
	@BeforeClass
	public void browser() {
	driver = new FirefoxDriver();
	}

	
	//Open the browser
	@Test(priority =0)
	public void first() {
	driver.get("https://www.training-support.net/selenium/login-form");
	String title = driver.getTitle();
	
    //Print the title of the page
    System.out.println("Page title is: " + title);
	
      driver.findElement(By.xpath("//input[@id= 'username']")).sendKeys("admin");
      driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("password");
      driver.findElement(By.xpath("//button[text()='Log in']")).click();
      
      Assert.assertEquals(driver.findElement(By.xpath("//div[@id= 'action-confirmation']")).getText(),"Welcome Back, admin");
	}          
 
	
	//Close the browser
	@AfterClass
	public void close() {
	
		driver.close();
		//sf.assertAll();
	}
}
