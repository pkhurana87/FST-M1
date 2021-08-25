package SeleniumFST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/tables");
        
        //Find username and password fields
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tbody/tr"));
        int noOfRows = rows.size();
        System.out.println("Number of Rows: "+noOfRows);
        
        List<WebElement> column = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tbody/tr[1]/td"));
        int noOfColumns = column.size();
        System.out.println("Number of Column: "+noOfColumns);
          
        
        String cell_val_row2col2 = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Cell value of row2 col2: "+cell_val_row2col2);
        
        driver.findElement(By.xpath("//table[@id = 'sortableTable']/thead/tr/th")).click();
        
      
        
        String cell_val_row2col2_after_sorted = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Cell value of row2 col2: "+cell_val_row2col2_after_sorted);
        
        for(int i=1;i<=noOfColumns;i++) {
        	System.out.println("Foot values: "+driver.findElement(By.xpath("//table[@id = 'sortableTable']/tfoot/tr/th["+i+"]")));
        }
        //Close browser
        driver.close();

    }
}