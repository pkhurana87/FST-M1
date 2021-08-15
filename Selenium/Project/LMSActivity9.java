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

public class LMSActivity9 {
	

	WebElement full_name,Email,Subject,message ;
   
	LMSActivity1 lms = new LMSActivity1();
	LMSActivity6 lms1 = new LMSActivity6();
	@When("^User is logged in with username and password\\.$")
	public void user_is_logged_in_with_username_and_password() throws Throwable {
		lms1.get_the_Login_button_on_the_page_and_click_it();
		lms1.find_the_username_field_of_the_login_form_and_enter_the_username_into_that_field();
		lms1.the_password_field_of_the_login_form_and_enter_the_password_into_that_field();
		lms1.get_the_login_button_and_click_it();
	}

	@When("^Select any course\\.$")
	public void select_any_course() throws Throwable {
		lms.driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']/parent::div/p[2]/a")).click();
	}

	@Then("^Click on a lesson in the course and Verify the title of the course\\.$")
	public void click_on_a_lesson_in_the_course_and_Verify_the_title_of_the_course() throws Throwable {
	    lms.driver.findElement(By.xpath("//div[contains(text(),'Deliverability')]")).click();
	    System.out.println("Title of the page "+lms.driver.getTitle());
	}

	@When("^Click the Mark Complete button on the page if available$")
	public void click_the_Mark_Complete_button_on_the_page_if_available() throws Throwable {
	    //lms.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Complete')]")));
		List<WebElement> mark_button = lms.driver.findElements(By.xpath("//button[contains(text(),'Complete')]"));
	    if(mark_button.size()>0) {
	    	mark_button.get(1).click();
	    }
	}

}
