package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods{
	WebDriver driver;

    public ViewAccountPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void verifyAccount() {
		System.out.println("Account is created");

	}

}
