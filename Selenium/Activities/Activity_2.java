package SeleniumFST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
			
		//Open the browser
		driver.get("https://www.training-support.net");
		
		//driver.navigate().to("https://www.training-support.net");
		
		System.out.println("Page Title: "+driver.getTitle());
		/*
		id()
		className()
		linkText()
		cssSelector()*/
		
		System.out.println("ID value: "+driver.findElement(By.id("about-link")).getText());
		
		System.out.println("class value: "+driver.findElement(By.className("green")).getText());
		
		System.out.println("link value: "+driver.findElement(By.linkText("About Us")).getText());
		
		System.out.println("class value: "+driver.findElement(By.cssSelector("#about-link")).getText());
		
		//Close the browser
		driver.close();
}
}
