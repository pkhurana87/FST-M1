package appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity5 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait; 
	@BeforeTest
	public void setUp() throws InterruptedException, IOException {
		        // Set the Desired Capabilities
		        DesiredCapabilities caps = new DesiredCapabilities();
		        caps.setCapability("deviceId", "2eed910sa");
		        caps.setCapability("deviceName", "My Phone");
		        caps.setCapability("platformName", "Android");
		        caps.setCapability("appPackage", "com.google.android.apps.messaging");
		        caps.setCapability("appActivity", ".ui.ConversationListActivity");
		        caps.setCapability("noReset", true);
		        // Instantiate Appium Driver
		        try {
		            // Initialize driver
		            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		            wait = new WebDriverWait(driver, 10);    
		           
		        } catch (MalformedURLException e) {
		            System.out.println(e.getMessage());
		        }
		    }
	
	@Test
	public void addContact() {
        driver.findElementByAccessibilityId("Start chat").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.MultiAutoCompleteTextView[@text='Type a name, phone number or email address']")));
        driver.findElementByXPath("//android.widget.MultiAutoCompleteTextView[@text='Type a name, phone number or email address']").sendKeys("9158104757");
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ListView/android.widget.FrameLayout")));
        driver.findElementByXPath("//android.widget.ListView/android.widget.FrameLayout").click();
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/compose_message_text\")")));
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/compose_message_text\")")).sendKeys("Hello from Appium");
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.messaging:id/send_message_button_icon\")")).click();
        
        // Wait for message to show
        String messageLocator = "resourceId(\"com.google.android.apps.messaging:id/message_text\")";
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator(messageLocator)));
     // Assertion
        String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
        Assert.assertEquals(sentMessageText, "Hello from Appium");
        
       // Assert.assertEquals(driver.findElementById("large_title").getText(), "Aaditya Varma");
       
       
    }
	
 
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
	
}
