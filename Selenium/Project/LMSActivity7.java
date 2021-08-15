package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LMSActivity7 {
	
	String PageTitle;
	
	LMSActivity1 lms = new LMSActivity1();
	 List<WebElement> courses;
	@When("^Get all the courses on the page\\.$")
	public void get_all_the_courses_on_the_page() throws Throwable {
	   courses = lms.driver.findElements(By.xpath("//div[@class='caption']"));
	   for(int i = 1; i<=courses.size(); i++) {
		   String course_title = lms.driver.findElement(By.xpath("(//div[@class='caption'])["+i+"]/h3")).getText();
		   System.out.println("Course Title on this page is: "+course_title);
	   }
	}

	@Then("^Print the number of courses on the page$")
	public void print_the_number_of_courses_on_the_page() throws Throwable {
	    System.out.println("Number of courses on the page: "+courses.size());
	    lms.closeTheBrowser();
	}
	
	
 
  
   
}
