package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;


public class WelcomePage extends ProjectSpecificMethods{
	 WebDriver driver;

	    public WelcomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	
public  MyHomePage clickCRMSFA() {
	driver.findElement(By.partialLinkText("CRM")).click();
	return new  MyHomePage(driver) ;
    }


public void clickLogout() {
	// TODO Auto-generated method stub
	
}



}


