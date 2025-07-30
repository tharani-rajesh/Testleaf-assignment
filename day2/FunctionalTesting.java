package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalTesting {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tharani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangaraj");
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(sourceElement);
		//dropdown.selectByIndex(4);
		dropdown.selectByValue("LEAD_DIRECTMAIL");
		//dropdown.selectByVisibleText("Conference");
		WebElement industryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdownind = new Select(industryElement);
		dropdownind.selectByValue("IND_SOFTWARE");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Supervisor");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
		
		
		}	
}
