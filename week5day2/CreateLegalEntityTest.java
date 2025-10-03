package week5day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLegalEntityTest extends ProjectSpecificMethod {

    @Test
    public void createLegalEntity() throws InterruptedException {
        // Login
        driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Sales@123");
        driver.findElement(By.id("Login")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //click on toggle menu button from left corner
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        
        //Click ViewAll
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //Window Handling
        String mainWindow = driver.getWindowHandle();
        
        //click Legal Entities tab
        //driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
        driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
        
        //click 0 new legalentity
        driver.findElement(By.xpath("//div[text()='New']")).click();
        
        //Enter Company name as TestLeaf
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
        
        //Enter description as "SalesForce"
        driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //select status as Active
        //driver.findElement(By.xpath("//button[@id='combobox-button-423']")).click();
        WebElement statusDropdown = driver.findElement(By.xpath("//button[@id='combobox-button-423']"));
        ((RemoteWebDriver) driver).executeScript("arguments[0].click();", statusDropdown);
        driver.findElement(By.xpath("//span[@title='Active']")).click();
        //driver.findElement(By.xpath("//button[@id='combobox-button-423']")).click();
        //driver.findElement(By.xpath("lightning-basecombobox-item[@data-value='Active']")).click();
        //driver.findElement(By.xpath("//button[@id='combobox-button-423']")).click();
        //click on save
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

    }
}