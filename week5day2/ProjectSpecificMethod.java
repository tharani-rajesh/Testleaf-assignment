package week5day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
    public WebDriver driver;

    @BeforeMethod
    public void preCondition() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com");
    }

    @AfterMethod
   void postCondition() {
        //driver.quit();
    }
}


	   
	   
	

