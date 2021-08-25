package SeleniumFST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/selects");
        
        //Chosen option
        WebElement chosen = driver.findElement(By.id("single-value"));
        //select class
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='single-select']")));
        dropdown.selectByVisibleText("Option 4");
        System.out.println("Selected option :"+chosen.getText());
        
       /* WebElement option2 = dropdown.getFirstSelectedOption();
        String defaultItem = option2.getText();
        System.out.println(defaultItem );*/
        dropdown.selectByIndex(1);
        System.out.println("Selected option :"+chosen.getText());
        dropdown.selectByValue("6");
        System.out.println("Selected option :"+chosen.getText());
        
        List<WebElement>  options=  dropdown.getOptions();
        for(WebElement option : options) {
        	System.out.println(option.getText());
        }
        //Close browser
        driver.close();

    }
}