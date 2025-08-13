package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	
public static void main(String[] args) {
	
	// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("https://www.irctc.co.in/");

		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		//click on the "FLIGHTS"
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//get all windows handles
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList<>(windowHandles);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Switch to flights window(new tab)
		driver.switchTo().window(tabs.get(1));
		
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		
		//close the parent tab
		driver.switchTo().window(tabs.get(0));
		
		driver.close();		
		
		
		
		
		
		
}
	
}
