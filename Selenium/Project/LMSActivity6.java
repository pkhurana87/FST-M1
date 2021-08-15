package stepDefinitions;

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

public class LMSActivity6 {
	
	String PageTitle;
	
	LMSActivity1 lms = new LMSActivity1();
       
	@When("^Get the Login button on the page and click it\\.$")
	public void get_the_Login_button_on_the_page_and_click_it() throws Throwable {
		WebElement login = lms.driver.findElement(By.xpath("//a[contains(@class,'login')]"));
		lms.wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}

	@Then("^Find the username field of the login form and enter the username into that field\\.$")
	public void find_the_username_field_of_the_login_form_and_enter_the_username_into_that_field() throws Throwable {
		
		WebElement username =  lms.driver.findElement(By.xpath("//input[@id='user_login']"));
		lms.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='user_login']")));
		username.sendKeys("root");
	}

	@Then("^the password field of the login form and enter the password into that field\\.$")
	public void the_password_field_of_the_login_form_and_enter_the_password_into_that_field() throws Throwable {
		lms.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='user_pass']")));
		WebElement password =  lms.driver.findElement(By.xpath("//input[@id='user_pass']"));
		password.sendKeys("pa$$w0rd");
	}

	@When("^Get the login button and click it\\.$")
	public void get_the_login_button_and_click_it() throws Throwable {
		WebElement submit = lms.driver.findElement(By.xpath("//input[@id='wp-submit']"));
		lms.wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		
	}

	@Then("^Verify that you have logged in\\.$")
	public void verify_that_you_have_logged_in() throws Throwable {
	
	  String display_name = lms.driver.findElement(By.xpath("//span[@class='display-name']")).getText();
	  Assert.assertEquals(display_name, "root");
	  
	}



 
  
   
}
