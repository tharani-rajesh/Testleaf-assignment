package week3.day2;

public class APIClient {

	   
	    public void sendRequest(String endpoint) {
	        System.out.println("Sending Request with 1 Parameter");
	        System.out.println("Endpoint: " + endpoint);
	        System.out.println("Request sent successfully to: " + endpoint);
	    }

	    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
	        System.out.println("Sending Request with 3 Parameters");
	        System.out.println("Endpoint: " + endpoint);
	        System.out.println("Request Body: " + requestBody);
	        
	        if (requestStatus) {
	            System.out.println("Request to " + endpoint + " was successful");
	        } else {
	            System.out.println("Request to " + endpoint + " failed.");
	        }
	    }

	  
	    public static void main(String[] args) {
	        // Create an object of APIClient
	        APIClient client = new APIClient();	       
	        client.sendRequest("endpoint");
	        client.sendRequest("endpoint","requestBody", true);
	        
	    }

	    
	    
	    
	    
	    

		
	}



	