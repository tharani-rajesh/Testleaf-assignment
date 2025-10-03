package Marathon2;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Tatacliq {

	public static void main(String[] args) throws InterruptedException {
		
		        //Launch Chrome
				ChromeDriver driver = new ChromeDriver();
				
				//Load https://www.amazon.in/
				driver.get("https://www.tatacliq.com/");
				
				// Maximize the browser
				driver.manage().window().maximize();
						
				//add implicitlyWait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Click No,Thanks button Alert
				driver.findElement(By.xpath("//button[@id='moe-dontallow_button']")).click();
				
				//MouseHover on 'Brands'
				WebElement mouseHoverEle = driver.findElement(By.xpath("//div[text()='Brands']"));
				Actions act = new Actions(driver);
				act.moveToElement(mouseHoverEle).perform();
				
				//MouseHover on 'Watches & Accessories'
				WebElement mouseHoverElem = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
				Actions acti = new Actions(driver);
				act.moveToElement(mouseHoverElem).perform();
				
				//add implicitlyWait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
			    // Choose the first option from the 'Featured brands'.
				driver.findElement(By.xpath("//div[text()='Casio']")).click();
				
				// Select sortby: New Arrivals
				WebElement sortDropdown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		        sortDropdown.click();
		        WebElement newArrivals = driver.findElement(By.xpath("//option[text()='New Arrivals']"));
		        newArrivals.click();
		        
		        //choose men from catagories filter
		        driver.findElement(By.xpath("//div[text()='Men']")).click();
		        
		       //add implicitlyWait
				Thread.sleep(5000);
				
				//print all price of watches
				List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));

				for (int i = 0; i < elements.size(); i++) {
				    System.out.println(elements.get(i).getText());
				}
			
				//add implicitlyWait
				Thread.sleep(5000);
				
				//  WebElement firstWatch = driver.findElement(By.xpath("((//div[@class='ProductModule__content'])[1]"));
			    WebElement firstWatch = driver.findElement(By.xpath("//h2[text()='Casio MTP-SN2KD-1A Enticer Analog Watch For Men']"));
			    ((RemoteWebDriver) driver).executeScript("arguments[0].click();", firstWatch);
	            //firstWatch.click();

	            System.out.println("First watch clicked successfully!");
	            
	            //Window Handling
	            String mainWindow = driver.getWindowHandle();
	            
	            Set<String> allWindows = driver.getWindowHandles();
	            for (String winHandle : allWindows) {
	                if (!winHandle.equals(mainWindow)) {
	                    driver.switchTo().window(winHandle);
	            
	            //compare two price are similar 
	            WebElement firstWatchPrice = driver.findElement(By.xpath("//h3[text()='MRP:  ₹4995']"));
	            System.out.println("First Watch Price: " + firstWatchPrice.getText());
	            
	            //click Add to cart and get count from the cart icon.
	            driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	            List<WebElement> cartElements = driver.findElements(By.xpath("//div[@class='DesktopHeader__myBagShow']"));
	            System.out.println("Number of items with 'Add to Cart': " + cartElements.size());
	            
	            //Click on the cart
	            driver.findElement(By.className("DesktopHeader__myBagShow")).click();
	            
	            // Close All the opened windows one by one.
	            String mainWindow1 = driver.getWindowHandle();
	            Set<String> allWindowHandles = driver.getWindowHandles();

	            for (String handle : allWindowHandles) {
	                if (!handle.equals(mainWindow1)) {
	                    driver.switchTo().window(handle);
	                    driver.close();
	                }
	            }

	            // Switch back to main window (if needed)
	            driver.switchTo().window(mainWindow1);
	            driver.quit();
	            
	            
	            
	            
	            
	            

	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            
	            

		        

				
				
				
				
	                }
	            }
	}
	}

