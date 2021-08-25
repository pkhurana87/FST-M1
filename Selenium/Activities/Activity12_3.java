package SeleniumFST;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_3 {
    public static void main(String[] args) {
    
        //Create WebDriver instance
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/popups");

        //Print title of the page
        System.out.println("Title of the page is: " + driver.getTitle());

       
        Actions element1 = new Actions(driver);
      //Find Sign in button
        WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        
       
        element1.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
        
        String toolTip_val = driver.findElement(By.xpath("//button[contains(@class, 'orange')]")).getAttribute("data-tooltip");
        
        System.out.println(toolTip_val);
        
        button.click();
        
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        System.out.println(driver.findElement(By.xpath("//div[contains(@id,'confirmation')]")).getText());
        
        
        
        //Close browser
        driver.close();
    }
}