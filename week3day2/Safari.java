package week3day2;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("Reader mode is working");
	}
	
	public void fullScreenMode() {
		System.out.println("Full scren mode is working");
	}

	public static void main(String[] args) {
		Safari safariOption = new Safari();
		safariOption.readerMode();
		safariOption.fullScreenMode();
		safariOption.openURL();
		safariOption.closedBrowser();
		safariOption.navigateBack();
		
	
		
	}

	
	
	
	
	 {
		
	}
}
