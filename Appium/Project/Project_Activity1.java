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



public class Project_Activity1 {
	
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
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);
        
      
        try {
            // Initialize driver
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            //Initialize wait
            wait = new WebDriverWait(driver, 10);         
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void googleTasks() {
    	
    	System.out.println("Google task is opened");
    	//Array with the task name
    	String[] task_name = {"Complete Activity with Google Tasks",
    			"Complete Activity with Google Keep",
    			"Complete the second Activity Google Keep"};
    	//for loop to add task listed in array
    	for(String name:task_name) {
    		//wait for element create new task, if present click	
    		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Create new task"))).click();
        	//wait for adding task tiltle element
        	wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("add_task_title")));
        	MobileElement taskTitle = driver.findElementById("add_task_title");
        	//wait.until(ExpectedConditions.visibilityOf(taskTitle));
        	taskTitle.sendKeys(name); 
        	MobileElement taskDone = driver.findElementById("add_task_done");
        	taskDone.click();

    	}
    	
    	//Verify if task added are present or not
    	for(String assert_test:task_name) {
    	
    	Assert.assertEquals(assert_test,driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\""+assert_test+"\"]/android.view.ViewGroup/android.widget.TextView").getText());

    	}
      	
    }
    
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
    
    
    
    
}
