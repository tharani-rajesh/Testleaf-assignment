package Marathon3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.time.Duration;

public class EditAccount {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Sales@123");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        WebElement opportunities = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        ((RemoteWebDriver) driver).executeScript("arguments[0].click();",opportunities );
        driver.findElement(By.xpath("//input[@placeHolder='Search this list...']")).sendKeys("Tharani T"+Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement oppName = driver.findElement(By.xpath("//table/tbody/tr[2]/th//a"));
        ((RemoteWebDriver) driver).executeScript("arguments[0].click();", oppName);
        //WebElement dropdownIcon = driver.findElement(By.xpath("//a[@role='button' and contains(@title,'Show more actions')]"));
        WebElement dropdownIcon = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border-filled fix-slds-button_icon-border-filled slds-button_last'])[1]"));
        //WebElement dropdownIcon = driver.findElement(By.xpath("//a[contains(text(),'" + oppName + "')]/ancestor::tr//button[contains(@aria-label,'Show more actions')]"));
        dropdownIcon.click();
        // WebElement dropdownElement = driver.findElement(By.xpath("(//button[@part='button button-icon'])[37]"));
        // ((RemoteWebDriver) driver).executeScript("arguments[0].click();",dropdownElement );
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        
        driver.findElement(By.xpath("(//span[text()='2'])[1]")).click();
        
        WebElement typeDD = driver.findElement(By.xpath("//button[@aria-label='Type']"));
        driver.executeScript("arguments[0].click()",typeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click();
        WebElement industryDD = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
        driver.executeScript("arguments[0].click()",industryDD);
        
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
        WebElement biilingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
        biilingStreet.clear();
        biilingStreet.sendKeys("Testleaf, Wipro street, Tek meadows");
        WebElement shippingStreet = driver.findElement(By.xpath("(//label[text()='Shipping Street']/following::textarea"));
        shippingStreet.clear();
        shippingStreet.sendKeys("Testleaf, Wipro street, Tek meadows");
        WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
        driver.executeScript("arguments[0].click()",priorityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
        driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
        WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
        driver.executeScript("arguments[0].click()",activeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        int randomNum1 = (int)(Math.random()*999999);
        int randomNum2 = (int)(Math.random()*999999);
        String phno = ""+randomNum1+randomNum2;
        phno = phno.substring(0,10);
        System.out.println(phno);
        WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
        phnoField.clear();
        phnoField.sendKeys(phno);
        WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
        driver.executeScript("arguments[0].click()",upsellOpportunityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String phnoStr = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
        System.out.println(phnoStr);
        Assert.assertTrue(phnoStr.contains(phno),"verify the mobileNumber");



    }

}
