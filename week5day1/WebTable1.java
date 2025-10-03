package week5day1;

import java.time.Duration;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		

		//launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://erail.in/");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		//Add implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Enter "MAS" as the "From" station
		WebElement fromSta = driver.findElement(By.id("txtStationFrom"));
        fromSta.clear();
        fromSta.sendKeys("MAS");
		
		//Enter "MDU" as the "To" station
        WebElement toSta = driver.findElement(By.id("txtStationTo"));
        toSta.clear();
        toSta.sendKeys("MDU");
        
        //Uncheck the "Sort on Date" checkbox
        WebElement sortOnDate = driver.findElement(By.id("chkSelectDateOnly"));
        if (sortOnDate.isSelected()) {
            sortOnDate.click();
        }
        
        //Add implicitlyWait
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      		
        //Retrieve the train names from the web table
        List<WebElement> trainNameElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
        System.out.println("Train Names: " +  trainNameElements);

       
        // Check for duplicates
        Set <String> trainSet = new HashSet<String>();
        boolean duplicateTrain = false;
        for (WebElement trainsNames : trainNameElements) {
        	String text = trainsNames.getText();
        	
        	if(!trainSet.add(text)) {
        		System.out.println("Duplicate train names: " + text);
        		duplicateTrain = true;
        	}
        }
        if (!duplicateTrain) {
        	System.out.println("No duplicate train names found");
        }
	
        //Close the driver
        driver.quit();
	}
}



              		
        	


	


