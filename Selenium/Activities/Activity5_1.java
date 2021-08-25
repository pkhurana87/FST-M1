package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new instance of the Firefox driver
					WebDriver driver = new FirefoxDriver();
						
					//Open the browser
					driver.get("https://training-support.net/selenium/dynamic-controls");
					
					System.out.println("Page Title: "+driver.getTitle());
					
					//Use findElement() to find the checkbox input element
					WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
					
					//to find the checkbox input element is didplayed
					System.out.println("Checkbox input element: "+checkbox.isDisplayed());
					
					//Click remove checkbox
					driver.findElement(By.xpath("//button[text()='Remove checkbox']")).click();
					
					//to find the checkbox input element is didplayed
					System.out.println("Checkbox input element: "+checkbox.isDisplayed());
						
					//Close the browser
					driver.close();

	}

}
