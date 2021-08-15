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

public class LMSActivity8 {
	

	WebElement full_name,Email,Subject,message ;
   
	LMSActivity1 lms = new LMSActivity1();
	@Then("^Find the contact form fields$")
	public void find_the_contact_form_fields() throws Throwable {
		
	   full_name = lms.driver.findElement(By.xpath("//label[contains(text(),'Full Name')]/following::input"));
	   Email = lms.driver.findElement(By.xpath("//label[contains(text(),'Email')]/following::input"));
	   Subject = lms.driver.findElement(By.xpath("//label[contains(text(),'Subject')]/following::input"));
	   message = lms.driver.findElement(By.xpath("//label[contains(text(),'Comment or Message')]/following::textarea"));
	}

	@When("^Fill in the information and leave a message$")
	public void fill_in_the_information_and_leave_a_message() throws Throwable {
		full_name.sendKeys("Jia");
		Email.sendKeys("Jia@gmail.com");
		Subject.sendKeys("My subject");
		message.sendKeys("my message");
		
	}

	@Then("^Click on Send message$")
	public void click_on_Send_message() throws Throwable {
		
	    lms.driver.findElement(By.xpath("//button[contains(text(),'Send')]")).click();
	}

	@Then("^Read and print the message displayed after submission\\.$")
	public void read_and_print_the_message_displayed_after_submission() throws Throwable {
	    System.out.println(lms.driver.findElement(By.xpath("//div[contains(@id, 'confirmation')]/p")).getText());
	}
 
  
   
}
