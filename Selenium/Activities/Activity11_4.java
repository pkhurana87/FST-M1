package SeleniumFST;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        
        WebDriverWait wait = new WebDriverWait(driver, 300000);
        

        //Open browser
        driver.get("https://www.training-support.net/selenium/tab-opener");

        //Print title of page and heading on page
        System.out.println("Page title is: " + driver.getTitle());
        
        //Print window handle
        System.out.println("Page window handle is: " + driver.getWindowHandle());
        
        //Click button
        driver.findElement(By.id("launcher")).click();
        
        Set<String> handles = driver.getWindowHandles();
        //System.out.println("No of windows : "+handles.size());
        
        for(String handle:handles) {
        	Boolean val = handles.iterator().hasNext();     	
        	if(val==true) {
  
        		driver.switchTo().window(handle);
        		 //Print title of page and heading on page
              
                }
               
        	}
        
        //Thread.sleep(2000);
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("Page title is: " + driver.getTitle());
        
        //Print window handle
        System.out.println("window handle is: " + driver.getWindowHandle());
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        driver.findElement(By.id("actionButton")).click();
        
        
        //Click button
        
        Set<String> handles1 = driver.getWindowHandles();
        for(String handle:handles1) {
        	Boolean val = handles.iterator().hasNext();     	
        	if(val==true) {
  
        		driver.switchTo().window(handle);
        		wait.until(ExpectedConditions.titleContains("ab"));
                
                }
               
        }
        
        Thread.sleep(3000);
        
        //Print title of page and heading on page
        System.out.println("Third Page title is: " + driver.getTitle());
        
        //Print window handle
        System.out.println("Third window handle is: " + driver.getWindowHandle());
        
        
      //Close the Browser
        driver.quit();
        }
        
       
        
        
    }
  


