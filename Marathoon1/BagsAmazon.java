package Marathoon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BagsAmazon {

	public static void main(String[] args) {
		
		//Launch Chrome
		ChromeDriver driver = new ChromeDriver();
		
		//Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		// Maximize the browser
		driver.manage().window().maximize();
				
		//add implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Type "Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bags for boys");
        
		//Choose the item in the result (bags for boys)
        driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
        
		//Print the total number of results (like 50000)
        WebElement resultTextElement = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        String resultText = resultTextElement.getText(); 
        WebElement bagTextElement = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        String bagText = bagTextElement.getText(); 
        System.out.println("Total search results: " + resultText + " " + bagText);
	    
        //Select the first 2 brands in the left menu
         driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
        
		//Choose New Arrivals (Sort)
        WebElement sortDropdown = driver.findElement(By.xpath("//span[text()='Sort by:']"));
        sortDropdown.click();
        WebElement newArrivals = driver.findElement(By.xpath("//a[text()='Newest Arrivals']"));
        newArrivals.click();
		
		//Print the first resulting bag info (name, discounted price)
        String bagName = driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[1]/a/h2/span")).getText();
        // String products = productsTextElement.getText();
        String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
       
        System.out.println("Product name: " + bagName);
        System.out.println("Price: " + price);
		
		// Get the page title
        String title = driver.getTitle();
        System.out.println("Title Name: " + title);
        
        //Close Browser
        driver.quit();

	}

}
