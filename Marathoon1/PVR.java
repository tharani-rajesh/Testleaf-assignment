package Marathoon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class PVR {

	public static void main(String[] args) {
		
		//launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//choose the location
		driver.findElement(By.xpath("//div[@class='show-desktop-view']")).click();
		driver.findElement(By.xpath("//h6[contains(text(),'Chennai')]")).click();
       
		//click on cinema under quick book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		// Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();	
		
		//Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();     
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//select your movie
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='THALAIVAN THALAIVII']")).click();        
		
		//Select Your Show Time
		driver.findElement(By.xpath("//span[text()='07:05 PM']")).click();
		
		//Click on Book Button 
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-gNZgCX hrwxnG bgColor filter-btn']")).click();
		
		//Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[@class='sc-dkBYrC cNsERm reject-terms']")).click();
		
		//Click any one available seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:10']")).click();
		
		//Click Proceed Button
		driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
		
		//Print the Seat info under book summary
		WebElement seatInfo = driver.findElement(By.xpath("//p[text()='D10']"));
        System.out.println("Seat Info: " + seatInfo.getText());
        
        //Print the grand total under book summary
        WebElement grandTotal = driver.findElement(By.xpath("//span[text()='214.48']"));
        System.out.println("Grand Total: " + grandTotal.getText());
        
        //Click continue and proceed Button
        driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //Close the popup
        driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
     
        //Print Your Current Page title
        String title = driver.getTitle();
        System.out.println(title);
        //Close Browser
        driver.quit();
	}	
}
