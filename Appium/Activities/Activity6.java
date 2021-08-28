package appium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Activity6 {
	
	 // Instantiate Appium Driver
	//AndroidDriver driver;
	AppiumDriver<MobileElement> driver = null;
	
	WebDriverWait wait;
	
	@BeforeClass
    public void setup() throws InterruptedException, IOException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "47aa2ebc");
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);
        
      
        try {
            // Initialize driver
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            System.out.println("Chrome is opened");
            //Initialize wait
            wait = new WebDriverWait(driver, 10);         
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
	
	@Test
	public void getURL() throws InterruptedException {
		String URL = "https://www.training-support.net/selenium/lazy-loading";
	
		//open the URL
		driver.get(URL);
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View/android.view.View/android.widget.Image")));
		List<MobileElement> t = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
		System.out.println("No of images: "+t.size());

		
		//scroll to name
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"helen\"))"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View/android.view.View/android.widget.Image")));
		List<MobileElement> t1 = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
		System.out.println("No of images after scroll: "+t1.size());
	
	}
	
	@AfterClass
	public void last() {
		driver.quit();
	}

}
