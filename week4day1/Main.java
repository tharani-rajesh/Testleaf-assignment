package week4day1;

public class Main {

	    public static void main(String[] args) {
	    	
	        // Create an object of JavaConnection
	    	
	        DatabaseConnection database = new JavaConnection();

	        
	        // Call connect 
	        database.connect();     
	        
	        // Call executeUpdate
	        database.executeUpdate();  
	        
	        // Call disconnect 
	        database.disconnect();       
	    }
	}



