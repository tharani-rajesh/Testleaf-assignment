package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods{
	WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

	public CreateAccountPage clickCreateAccountLink() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage(driver);
	    }
}
