package suiteExample;

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

public class Activity5 {
	
	WebDriver driver;
	 WebElement button;
	 //SoftAssert sf  = new SoftAssert();
	@BeforeClass(alwaysRun = true)
	public void browser() {
	driver = new FirefoxDriver();
	}

	
	//Open the browser
	//@Test(groups = {"HeaderTests", "ButtonTests"})
	@Test(priority= 0, groups = {"HeaderTests"})
	public void first() {
	driver.get("https://www.training-support.net/selenium/target-practice");
	String title = driver.getTitle();
	
    //Print the title of the page
    System.out.println("Page title is: " + title);
	
        //Assertion for page title
    Assert.assertEquals("Target Practice", title);
	}   
	//@Test(dependsOnMethods = {"first"}, groups = {"HeaderTests"})
	@Test(groups = {"HeaderTests"})
	public void one() {
    Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Third header");
    System.out.println("Tag 3 is matched");
	}
	
	//@Test(dependsOnMethods = {"first"}, groups = {"HeaderTests"})
	@Test(groups = {"HeaderTests"})
	public void two() {
    String color = driver.findElement((By.tagName("h5"))).getAttribute("class");
    Assert.assertTrue(color.contains("green"));
    System.out.println("Color is matched");
	}
	//@Test(dependsOnMethods = {"first"}, groups = {"ButtonTests"})
	@Test(groups = {"ButtonTests"})
	public void three() {
    String buttontext = driver.findElement(By.cssSelector("button.olive")).getText();
    Assert.assertTrue(buttontext.contentEquals("Olive"));
    
    System.out.println("Print this olive is tested");
	}
	//@Test(dependsOnMethods = {"first"}, groups = {"ButtonTests"})
	@Test(groups = {"ButtonTests"})
	public void four() {
    String color_thrirdrow = driver.findElement(By.xpath("(//div[@class= 'spaced'])[3]/button")).getAttribute("class");
    Assert.assertTrue(color_thrirdrow.contains("brown"));
    System.out.println("Color is matched");
	}
	
	//Close the browser
	@AfterClass(alwaysRun = true)
	public void close() {
	
		driver.close();
		//sf.assertAll();
	}
}
