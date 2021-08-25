package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new instance of the Firefox driver
					WebDriver driver = new FirefoxDriver();
						
					//Open the browser
					driver.get("https://www.training-support.net/selenium/target-practice");
					
					System.out.println("Page Title: "+driver.getTitle());
					
					//Find the third header on the page
					System.out.println("Third header: "+driver.findElement(By.xpath("//h3")).getText());
					
					//Find the fifth header on the page and get it's 'colour' CSS Property.
					System.out.println("Fifth header color: "+driver.findElement(By.xpath("//h5")).getCssValue("color"));
					
					
					//Find the violet button on the page and print all the class attribute values.
					System.out.println("Violet button class attributes: "+driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class"));
					
					//Find the grey button on the page with Absolute XPath
					System.out.println("Grey button text value: "+driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText());
					
					
					System.out.println("New Page Title: "+driver.getTitle());
					
						
					//Close the browser
					driver.close();

	}

}
