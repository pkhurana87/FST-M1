package appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity4 {
	AppiumDriver<MobileElement> driver = null;
	@BeforeTest
	public void setUp() throws InterruptedException, IOException {
		        // Set the Desired Capabilities
		        DesiredCapabilities caps = new DesiredCapabilities();
		        caps.setCapability("deviceId", "2eed910sa");
		        caps.setCapability("deviceName", "My Phone");
		        caps.setCapability("platformName", "Android");
		        caps.setCapability("appPackage", "com.google.android.contacts");
		        caps.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		        caps.setCapability("noReset", true);
		        // Instantiate Appium Driver
		        try {
		            // Initialize driver
		            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		            //wait = new WebDriverWait(driver, 10);    
		           
		        } catch (MalformedURLException e) {
		            System.out.println(e.getMessage());
		        }
		    }
	
	@Test
	public void addContact() {
        driver.findElementByAccessibilityId("Create contact").click();
        driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");
        driver.findElementByXPath("//android.widget.EditText[@text='Surname']").sendKeys("Varma");
        driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");
        driver.findElementByXPath("//android.widget.TextView[@text='Save']").click();
        
        Assert.assertEquals(driver.findElementById("large_title").getText(), "Aaditya Varma");
       
       
    }
	
 
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
	
}
