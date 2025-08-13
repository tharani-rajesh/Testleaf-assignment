package week4day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {
public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);

		// Load the url - get
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switch to the frame 
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@id,  'iframeResult')]"));
		driver.switchTo().frame(frameElement);
		
		//Click the "Try It" button inside the frame 
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		//click Ok/Cancel in the alert appears
		Alert promptAlert = driver.switchTo().alert();
		String name = "Tharani";
		promptAlert.sendKeys("Tharani");
		promptAlert.accept();
		
		//verifying the text displayed
		String resultText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
	
		if (resultText.contains(name)) {
			System.out.println("Text Displayed - "+ resultText  );
					}
        
		//close browser
		driver.quit();
}
}