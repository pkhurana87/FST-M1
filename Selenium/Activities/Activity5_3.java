package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new instance of the Firefox driver
					WebDriver driver = new FirefoxDriver();
						
					//Open the browser
					driver.get("https://training-support.net/selenium/dynamic-controls");
					
					System.out.println("Page Title: "+driver.getTitle());
					
					//Use findElement() to find the text input element
					WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
					
					//to find the text input element is enabled
					System.out.println("Text input element: "+text.isEnabled());
					
					//Click remove checkbox
					driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
					
					//to find the checkbox input element is enabled
					System.out.println("Text input element: "+text.isEnabled());
						
					//Close the browser
					driver.close();

	}

}
