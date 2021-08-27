package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity10 {
	
	//span[text()='5']//following::input
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
		driver.get("https://www.training-support.net/selenium/sliders");
		String title = driver.getTitle();
		
		
	    //Print the title of the page
	    System.out.println("Page title is: " + title);
		Reporter.log("Browser is opened");
		}
		
		@Test
		public void middle_value() {
		
		Actions d = new Actions(driver);
		
		d.dragAndDropBy(driver.findElement(By.xpath("//input[@id='slider']")), 0, 10).click().build().perform();
	    Assert.assertEquals("50", driver.findElement(By.xpath("//span[@id='value']")).getText());
	    
	    Reporter.log("drag to middle of slider");
		}
		
		@Test
		public void maximum_value() {
		
		Actions d = new Actions(driver);
		
		d.dragAndDropBy(driver.findElement(By.xpath("//input[@id='slider']")), 75, 0).click().build().perform();
	    Assert.assertEquals("100", driver.findElement(By.xpath("//span[@id='value']")).getText());
	    
	    Reporter.log("drag to max of slider");
		}
		
		@Test
		public void minimum_value() {
		
		Actions d = new Actions(driver);
		
		d.dragAndDropBy(driver.findElement(By.xpath("//input[@id='slider']")), -75, 0).click().build().perform();
	    Assert.assertEquals("0", driver.findElement(By.xpath("//span[@id='value']")).getText());
	    
	    Reporter.log("drag to minimum of slider");
		}
		
		@Test
		public void slider30value() {
		
		Actions d = new Actions(driver);
		
		d.dragAndDropBy(driver.findElement(By.xpath("//input[@id='slider']")), -30, 0).click().build().perform();
	    Assert.assertEquals("30", driver.findElement(By.xpath("//span[@id='value']")).getText());
	    
	    Reporter.log("drag to 30% of slider");
		}
		
		@Test
		public void slider80value() {
		
		Actions d = new Actions(driver);
		
		d.dragAndDropBy(driver.findElement(By.xpath("//input[@id='slider']")), 44, 0).click().build().perform();
	    Assert.assertEquals("80", driver.findElement(By.xpath("//span[@id='value']")).getText());
	    
	    Reporter.log("drag to 80% of slider");
		}
		
		@AfterTest
		public void close() {
			driver.quit();
			Reporter.log("browser closed");
		}

}
