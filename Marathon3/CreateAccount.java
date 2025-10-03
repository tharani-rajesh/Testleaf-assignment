package Marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount extends BaseClass{
	
	@Test
	@Parameters({"url", "username", "password"})
	    public void createAccount(String url, String username, String password) {
		   
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        WebElement opportunities = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        ((RemoteWebDriver) driver).executeScript("arguments[0].click();",opportunities );
        driver.findElement(By.xpath("//a[@title='New']")).click();
        String accountName = "Tharani T";
        driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys(accountName);
        // WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        //driver.executeScript("arguments[0].click()",ownershipDD);
        driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75,000");
        driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
        WebElement date = driver.findElement(By.xpath("//button[text()='Today']"));
        ((RemoteWebDriver) driver).executeScript("arguments[0].click();",date );
        driver.findElement(By.xpath("//span[text()='--None--']")).click();
        driver.findElement(By.xpath("//span[text()='--None--']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(accountName),"Verify the Account name");
  
    }

}