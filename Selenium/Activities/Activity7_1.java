package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new instance of the Firefox driver
					WebDriver driver = new FirefoxDriver();
						
					//Open the browser
					driver.get("https://www.training-support.net/selenium/dynamic-attributes");
					
					System.out.println("Page Title: "+driver.getTitle());
					
					//Use findElement() to find the username input element
					driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("admin");
					
					//Use findElement() to find the password input element 
					driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys("password");
					
					//Click Log in
			        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
			        
					WebDriverWait wait = new WebDriverWait (driver, 20);
					wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='action-confirmation']"))));
					
					String text_displayed = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
					
					System.out.println("Text displayed: "+text_displayed);
						
					//Close the browser
					driver.close();

	}

}
