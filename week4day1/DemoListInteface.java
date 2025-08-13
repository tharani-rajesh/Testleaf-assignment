package week4day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoListInteface {
	


public static void main(String[] args) {
		
		//launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Maximize the browser
		driver.manage().window().maximize();
				
		//search for Phone
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("phones");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
       // Get all phone price elements using XPath
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        
		//Extract price into list
		List<Integer> prices1 = new ArrayList<>();


		 // Extract numbers from price elements
        for (WebElement priceElement : price) {
            String priceText = priceElement.getText().replaceAll("[^0-9]", "");
            if (!priceText.isEmpty()) {
                prices1.add(Integer.parseInt(priceText));
            }
        }

        if (!prices1.isEmpty()) {
            Collections.sort(prices1);
            System.out.println("Lowest phone price: " + prices1.get(0));
            
        } else {
            System.out.println("No phone prices found.");
        }

        // Close browser
        driver.quit();
    }


        
        
        
        
        
        
        
        
}
        
        
        
 
        
      