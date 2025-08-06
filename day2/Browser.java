package week3.day2;

public class Browser {
	
	String browserName = "Chrome";
	int browserVersion = 5;
	
	
	public void openURL() {
		System.out.println("URL opened");
	}

	public void closedBrowser() {
		System.out.println("Browser closed");
	}
	
	public void navigateBack() {
		System.out.println("Navigated back");
	}
	
	public static void main(String[] args) {
		
		Browser browserOptions = new Browser();
		 browserOptions.openURL();
		 browserOptions.clearCache();
		 browserOptions.openIncognito();
		
		
	}

	public void openIncognito() {
		// TODO Auto-generated method stub
		
	}

	public void clearCache() {
		// TODO Auto-generated method stub
		
	}
}

