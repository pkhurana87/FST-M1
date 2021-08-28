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

public class Activity3 {
	AppiumDriver<MobileElement> driver = null;
	@BeforeTest
	public void setUp() throws InterruptedException, IOException {
		        // Set the Desired Capabilities
		        DesiredCapabilities caps = new DesiredCapabilities();
		        caps.setCapability("deviceId", "2eed910sa");
		        caps.setCapability("deviceName", "My Phone");
		        caps.setCapability("platformName", "Android");
		        caps.setCapability("appPackage", "com.google.android.calculator");
		        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
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
	public void add() {
        driver.findElementById("digit_5").click();
        //driver.findElementById("op_mul").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementById("digit_9").click();
        driver.findElementById("eq").click();
        
        //Display Result
        String result = driver.findElementById("result_preview").getText();
        System.out.println(result);
        Assert.assertEquals(result, "14");
    }
	@Test
	public void subtract() {
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        //driver.findElementById("op_mul").click();
        driver.findElementByAccessibilityId("minus").click();
        driver.findElementById("digit_5").click();
        driver.findElementById("eq").click();
        
        //Display Result
        String result = driver.findElementById("result_preview").getText();
        System.out.println(result);
        Assert.assertEquals(result, "5");
    }
	
	@Test
	public void multiply() {
        driver.findElementById("digit_5").click();
        //driver.findElementById("op_mul").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("digit_1").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("digit_0").click();
        driver.findElementById("eq").click();
        
        //Display Result
        String result = driver.findElementById("result_preview").getText();
        System.out.println(result);
        Assert.assertEquals(result, "500");
    }
	
	@Test
	public void divide() {
        driver.findElementById("digit_5").click();
        driver.findElementById("digit_0").click();
        //driver.findElementById("op_mul").click();
        driver.findElementByAccessibilityId("divide").click();
        driver.findElementById("digit_2").click();       
        driver.findElementById("eq").click();
        
        //Display Result
        String result = driver.findElementById("result_preview").getText();
        System.out.println(result);
        Assert.assertEquals(result, "25");
    }
 
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
	
}
