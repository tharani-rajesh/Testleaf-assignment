package week3.day2;

public class LoginPage extends BasePage {

	    // Overriding the performCommonTasks method
	    
	    public void performCommonTasks() {
	        System.out.println("LoginPage: Performing login-specific tasks");
	        findElement();    
	        enterText();       
	        clickElement();    
	        System.out.println("LoginPage: Login task completed");
	    }
	
 public static void main(String[] args) {

     // Create object of BasePage and call its methods
     System.out.println(" BasePage Object");
     BasePage basePage = new BasePage();
     basePage.findElement();
     basePage.enterText();
     basePage.clickElement();
     basePage.performCommonTasks();

     // Create object of LoginPage and call its methods
     System.out.println("LoginPage Object");
     LoginPage loginPage = new LoginPage();
     loginPage.findElement();
     loginPage.enterText();
     loginPage.clickElement();
     
  // Calls overridden method
     loginPage.performCommonTasks();  
 }
}


