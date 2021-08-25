package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	 public static void main(String[] args) {
			// Create a new instance of the Firefox driver
			WebDriver driver = new FirefoxDriver();
				
			//Open the browser
			driver.get("https://www.training-support.net");
			
			System.out.println("Page Title: "+driver.getTitle());
			driver.findElement(By.xpath("//*[@id='about-link']")).click();
			
			System.out.println("New Page Title: "+driver.getTitle());
			
				
			//Close the browser
			driver.close();
		    }
}
