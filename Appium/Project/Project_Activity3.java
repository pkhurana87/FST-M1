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

public class Project_Activity3 extends Project_Activity2 {
	
	@Test
	public void Reminder() {
		//Clicking note created in activity2
		driver.findElementById("index_note_title").click();
		//wait for the element reminder and click
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("menu_reminder"))).click();
		//Click on choose date and time
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Choose a date & time\")"))).click();
		//click on the dropdown to select afternoon
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.LinearLayout[contains(@content-desc,'Time: – Currently selected')]"))).click();
		//driver.findElementByXPath("//android.widget.LinearLayout[contains(@content-desc,'Time: – Currently selected')]").click();;
		//click afternoon
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("text(\"Afternoon\")"))).click();
		
		//click on save
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("save"))).click();
		//
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Open navigation drawer"))).click();
		
		Assert.assertTrue(driver.findElementById("reminder_chip_text").getText().contains("1:00"));
		
		
		
		
	}
    
    
}
