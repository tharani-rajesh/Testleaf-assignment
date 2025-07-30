package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Tharani");
		driver.findElement(By.name("lastname")).sendKeys("Thangaraj");
		driver.findElement(By.name("reg_email__")).sendKeys("6380520043");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Tharani@321");
		WebElement dayElement = driver.findElement(By.id("day"));
		Select dropdownday = new Select(dayElement);
		dropdownday.selectByValue("3");
		WebElement monElement = driver.findElement(By.id("month"));
		Select dropdownmon = new Select(monElement);
		dropdownmon.selectByValue("5");
		WebElement yearElement = driver.findElement(By.id("year"));
		Select dropdownyear = new Select(yearElement);
		dropdownyear.selectByValue("1997");
		driver.findElement(By.id("sex")).click();
		
		
		
		
		
	}
}
