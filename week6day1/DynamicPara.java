package week6day1;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

public class DynamicPara extends ProjectSpecificMethod {
		@DataProvider
		public String[][] sendData() {
			String[][] data = new String[2][1];
			data[0][0] = "Salesforce Automation by Tharani";
			data[1][0] = "Salesforce Automation by TharaniT";
			return data;
		}

		@Test(dataProvider = "sendData")
		public void legalEntityTest(String legalEntityName) {
			// Click on the toggle menu button from the left corner
			driver.findElement(By.xpath("//button[@title='App Launcher']")).click();

			// Click View All and click Legal Entities from App Launcher
			driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
			WebElement legalElement = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
			driver.executeScript("arguments[0].click();", legalElement);

			// Click on New Legal Entity
			driver.findElement(By.xpath("//div[@title='New']")).click();

			// Enter Name as 'Salesforce Automation by *Your Name*'(Parameterized value)
			driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(legalEntityName);

			// Click on Save
			driver.findElement(By.xpath("//button[text()='Save']")).click();

			// verify the legal entity name
			WebElement legalName = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text"));
			String actualName = legalName.getText();

			if (actualName.equals(legalEntityName)) {
				System.out.println("Legal Entity created successfully: " + actualName);
			} else {
				System.out.println("Legal Entity name mismatch " + actualName);
			}
		}
}
		


