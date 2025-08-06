package week3day2;

public class Chrome extends Browser{
	
	public void openIncognito() {
		System.out.println("Open Incognito in Chrome"); 
	}
	
	public void clearCache() {
		System.out.println("Cache cleared in Chrome");
	}
	
	

	public static void main(String[] args) {
		Chrome chromeOptions = new Chrome();
		 chromeOptions.clearCache();
		 chromeOptions.clearCookies();

	}

	
	
	
	
	
	private void clearCookies() {
		// TODO Auto-generated method stub
		
	}

}
