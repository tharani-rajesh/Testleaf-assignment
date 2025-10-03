package week6day1;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.AfterMethod;
	
	
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

	public class ProjectSpecificMethod {

		public ChromeDriver driver;
		public ChromeOptions options;
	    @Parameters({"url","username","password"})
		@BeforeMethod
		public void precondition(String url,String username,String password) {
			// Launch the browser
	    	options=new ChromeOptions();
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			// load the url
			driver.get(url);
			// maximize the browser
			driver.manage().window().maximize();
			// add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			// enter username
			driver.findElement(By.id("username")).sendKeys(username);
			// enter password
			driver.findElement(By.id("password")).sendKeys(password);
			// Click Login
			driver.findElement(By.id("Login")).click();

		}

		@AfterMethod
		public void postCondition() {
			// close the browser
			driver.quit();

		}

	}



