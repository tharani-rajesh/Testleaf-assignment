package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static ChromeOptions options;
	public static ChromeDriver driver;

@BeforeMethod
public void preConditions() {
	options=new ChromeOptions();
	options.addArguments("guest");
	driver=new ChromeDriver (options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();

}

@AfterMethod
public void postConditions() {
	driver.close();

}


}
