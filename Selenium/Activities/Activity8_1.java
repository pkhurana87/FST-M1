package SeleniumFST;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/tables");
        
        //Find username and password fields
        List<WebElement> rows = driver.findElements(By.xpath("//th[contains(text(),'Git Repository')]/following::tbody[1]/tr"));
        int noOfRows = rows.size();
        System.out.println("Number of Rows: "+noOfRows);
        
        List<WebElement> column = driver.findElements(By.xpath("//th[contains(text(),'Git Repository')]/following::tbody[1]/tr[1]/td"));
        int noOfColumns = column.size();
        System.out.println("Number of Column: "+noOfColumns);
        
        List<WebElement> column1 = driver.findElements(By.xpath("//th[contains(text(),'Git Repository')]/following::tbody[1]/tr[3]/td"));
        int noOfColumnsin3 = column1.size();
        for(int i=1;i<=noOfColumnsin3;i++ ) {
        	
        	String val = driver.findElement(By.xpath("//th[contains(text(),'Git Repository')]/following::tbody[1]/tr[3]/td["+i+"]")).getText();
        	System.out.println("Cell value: "+val);
        }
        
        
        String cell_val_row2col2 = driver.findElement(By.xpath("//th[contains(text(),'Git Repository')]/following::tbody[1]/tr[2]/td[2]")).getText();
        System.out.println("Cell value of row2 col2: "+cell_val_row2col2);
        //Close browser
        driver.close();

    }
}