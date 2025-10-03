package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public  ChromeOptions options;
	public  WebDriver driver;

@BeforeMethod
public void preConditions() {
	options=new ChromeOptions();
	options.addArguments("guest");
	driver=new ChromeDriver (options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@AfterMethod
public void postConditions() {
	driver.close();

}


}

