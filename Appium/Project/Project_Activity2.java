package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Project_Activity2 {
	
	  // Instantiate Appium Driver
	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

    @BeforeClass
    public void setup() throws InterruptedException, IOException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "47aa2ebc");
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
        
      
        try {
            // Initialize driver
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            System.out.println("Application is opened");
            //Initialize wait
            wait = new WebDriverWait(driver, 10);         
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void googleKeep() {
    	
    	System.out.println("Google keep is opened");
    	
    	
    		//wait for element create new task, if present click	
    		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("New text note"))).click();
        	//wait for adding task tiltle element
        	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("editable_title")));
        	MobileElement textTitle = driver.findElementById("editable_title");
        	//wait.until(ExpectedConditions.visibilityOf(taskTitle));
        	String text_title = "My Title";
        	textTitle.sendKeys(text_title);
        	String text_note = "My note is here";
        	driver.findElementById("edit_note_text").sendKeys(text_note);
        	
        	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Open navigation drawer"))).click();

    	
    	
    	//Verify if title added are present or not
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("index_note_title")));
    	Assert.assertEquals(text_title,driver.findElementById("index_note_title").getText());
    	
    	//Verify if text added are present or not

    	Assert.assertEquals(text_note,driver.findElementById("index_note_text_description").getText());
    	
    	
      	
    }
    
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    
    
    
    
}
