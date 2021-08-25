package SeleniumFST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/selects");
        
        //Chosen option
        WebElement chosen = driver.findElement(By.id("multi-value"));
        //select class
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        System.out.println("if dropdown is multiselect :"+dropdown.isMultiple());
        if(dropdown.isMultiple()==true) {
        dropdown.selectByVisibleText("Javascript");
        System.out.println(chosen.getText());
       /* WebElement option2 = dropdown.getFirstSelectedOption();
        String defaultItem = option2.getText();
        System.out.println(defaultItem );*/
        
        dropdown.selectByValue("node");
        System.out.println(chosen.getText());
      //Select 4,5, and 6 options by index
        for(int i=4; i<=6; i++) {
        	dropdown.selectByIndex(i);
        }
        System.out.println(chosen.getText());

        //Deselect 'NodeJS' by value
        dropdown.deselectByValue("node");
        System.out.println(chosen.getText());
        
        //Deselect 7th opttion by index
        dropdown.deselectByIndex(7);
        System.out.println(chosen.getText());
        
        //Get all selected options
        List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
        //Print all selected options
        for(WebElement selectedOption : selectedOptions) {
            System.out.println("Selected option: " + selectedOption.getText());
        }
        
        //Deselect all options
        dropdown.deselectAll();
        System.out.println(chosen.getText());
        
        }
        //Close browser
        driver.close();

    }
}