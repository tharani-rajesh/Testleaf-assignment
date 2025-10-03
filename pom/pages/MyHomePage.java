package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	WebDriver driver;

    public MyHomePage(WebDriver driver) {
        this.driver = driver;
    }

	public MyAccountPage clickAccountLink() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage(driver);
	    }

	}


