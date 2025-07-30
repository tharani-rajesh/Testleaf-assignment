package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalTestingCreateAccount{
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Tharani");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industryElement = driver.findElement(By.name("industryEnumId"));
		Select dropdownindu = new Select(industryElement);
		dropdownindu.selectByValue("IND_SOFTWARE");
		driver.findElement(By.name("ownershipEnumId")).click();
		WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
		Select dropdownown = new Select (ownershipElement);
		dropdownown.selectByValue("OWN_SCORP");
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByValue("LEAD_EMPLOYEE");
		driver.findElement(By.id("marketingCampaignId")).click();
		WebElement marketElement = driver.findElement(By.id("marketingCampaignId"));
		Select dropdownmarket = new Select(marketElement);
		dropdownmarket.selectByValue("9000");
		driver.findElement(By.id("generalStateProvinceGeoId")).click();
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdownstate = new Select (stateElement);
		dropdownstate.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
			
		

	}

	
}


 