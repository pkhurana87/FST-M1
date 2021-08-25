package SeleniumFST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Activity10_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        
        //title 
        System.out.println("Tittle of page: "+driver.getTitle());
        
        Actions actionobj = new Actions(driver);
        
      //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        //Find the cude
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));
 
        //Left click
        actionobj.click(cube);
        WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());
 
        //Double click
        actionobj.doubleClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal.getText());
        
        //Right click        
        actionobj.contextClick(cube).perform();
        cubeVal = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal.getText());
 
        
        //Close browser
        driver.close();
    }
}