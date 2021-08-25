package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new instance of the Firefox driver
					WebDriver driver = new FirefoxDriver();
						
					//Open the browser
					driver.get("https://training-support.net/selenium/dynamic-controls");
					
					System.out.println("Page Title: "+driver.getTitle());
					
					//Use findElement() to find the checkbox input element
					WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
					
					//to find the checkbox input element is is selected
					System.out.println("Checkbox input element: "+checkbox.isSelected());
					
					//Click remove checkbox
					checkbox.click();
					
					//to find the checkbox input element is selected
					System.out.println("Checkbox input element: "+checkbox.isSelected());
						
					//Close the browser
					driver.close();

	}

}
