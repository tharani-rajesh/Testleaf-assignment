package week3day2;


public class LoginTestData extends TestData {

 
 public void enterUsername() {
     System.out.println("Entering username");
 }

 
 public void enterPassword() {
     System.out.println("Entering password");
 }

 // Main method to run the program
 public static void main(String[] args) {
     // Create object of subclass
     LoginTestData login = new LoginTestData();

     // Call inherited methods from superclass
     login.enterCredentials();
     login.navigateToHomePage();

     // Call methods defined in subclass
     login.enterUsername();
     login.enterPassword();
 }
}



		    


