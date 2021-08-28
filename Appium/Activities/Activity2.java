package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {
	
	 // Instantiate Appium Driver
    AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
	
    @BeforeTest
    public void chromeSetUp() throws InterruptedException, IOException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "2eed910sa");
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        
       
        try {
            // Initialize driver
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, 10);    
           
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Test
    public void testSearchAppium() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("https://www.training-support.net/");
 
        String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        System.out.println("Title on Homepage: " + pageTitle);
 
        //new TouchAction(driver).press(PointOption.point(1000, 1050)).waitAction().moveTo(PointOption.point(1000, 500)).release().perform();
       MobileElement aboutButton = driver.findElementByXPath("//android.view.View[@text='About Us']");
        //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("about-link"))).click();
       aboutButton.click();
 
       String newPageTitle = driver
               .findElementByXPath("//android.view.View/android.view.View[2]")
               .getText();
        System.out.println("Title on new page: " + newPageTitle);
 
        // Assertions
        Assert.assertEquals(pageTitle, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }
    
    @AfterTest
    public void TearDown() {
    	driver.quit();
    }
    
}
