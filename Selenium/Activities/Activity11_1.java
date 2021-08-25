package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_1 {
    public static void main(String[] args) throws InterruptedException {
    
    	// Declare new WebDriver
        WebDriver driver = new FirefoxDriver();
        
        // Declare new WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Navigate to the activity page
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        //Title
        System.out.println("Page Title: "+driver.getTitle());
        
        //Click on simple button
        driver.findElement(By.id("simple")).click();
        //switch to alert
        System.out.println("Alert Test present: "+driver.switchTo().alert().getText());
       
        driver.switchTo().alert().accept();
        //
        // Close the browser
        driver.close();
    }
}