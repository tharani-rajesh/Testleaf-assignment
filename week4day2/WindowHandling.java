package week4day2;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click on contact button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//click on merge button
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		//click on widget of the "From Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		 // Handle window switching for From Contact
        String mainWindow = driver.getWindowHandle();
        
        Set<String> allWindows = driver.getWindowHandles();
        for (String winHandle : allWindows) {
            if (!winHandle.equals(mainWindow)) {
                driver.switchTo().window(winHandle);
                break;
            }
        }

        // Click on first resulting contact
        driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
        
        //switch to main window
        for (String winHandle : allWindows) {
            if (winHandle.equals(mainWindow)) {
                driver.switchTo().window(winHandle);
                break;
            }
        }
        
        
        //click on the widget of the 'To contact'
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

       // Handle window switching for From Contact
        String mainWindow1 = driver.getWindowHandle();
        Set<String> allWindows1 = driver.getWindowHandles();

        for (String winHandle : allWindows1) {
            if (!winHandle.equals(mainWindow1)) {
                driver.switchTo().window(winHandle);
                break;
            }
        }
        // Click on second resulting contact
        driver.findElement(By.xpath("//a[text()='FrenchCustomer']")).click();
        
        // Switch back to main window
        driver.switchTo().window(mainWindow1);
        
        //Click on the Merge Button
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        
        //Switch to Alert
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.accept();
		
        //Verify The Title of the Page
        String title = driver.getTitle();
        System.out.println("Title Of The Page: " + title);
	}
}
