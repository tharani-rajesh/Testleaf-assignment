package week2.day1;

public class EdgeBrowser { 
	public static void min(String[]args) {
		
	Browser browser = new Browser();
	String browserName = browser.launchBrowser("Edge");
    System.out.println("Launched "+ browserName);
    browser.loadUrl();
}
}
	