package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{
	WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public CreateAccountPage enterAccountName(){
		driver.findElement(By.id("accountName")).sendKeys("Tharani");
		return this;
	}

	public CreateAccountPage enterDescription(){
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		return this;
	}

	public CreateAccountPage enterIndustryId() {
		WebElement industryElement = driver.findElement(By.name("industryEnumId"));
		Select dropdownindu = new Select(industryElement);
		dropdownindu.selectByValue("IND_SOFTWARE");
		return this;
	}

	public CreateAccountPage enterownershipId() {
		driver.findElement(By.name("ownershipEnumId")).click();
		WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
		Select dropdownown = new Select (ownershipElement);
		dropdownown.selectByValue("OWN_SCORP");
		return this;
	}

	public CreateAccountPage enterDataSouceId() {
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		Select dropdown = new Select(sourceElement);
		dropdown.selectByValue("LEAD_EMPLOYEE");
		return this;
	}

	public CreateAccountPage entermarketingCampaignId() {
		driver.findElement(By.id("marketingCampaignId")).click();
		WebElement marketElement = driver.findElement(By.id("marketingCampaignId"));
		Select dropdownmarket = new Select(marketElement);
		dropdownmarket.selectByValue("9000");
		return this;
	}

	public CreateAccountPage entergeneralStateProvinceGeoId() {
		driver.findElement(By.id("generalStateProvinceGeoId")).click();
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdownstate = new Select (stateElement);
		dropdownstate.selectByValue("TX");
		return this;
	}

	public ViewAccountPage clickSubmit(){
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
	}

}
