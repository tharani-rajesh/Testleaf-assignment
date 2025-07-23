package week1.day2;

//Check if the given number is prime or not

	public class IsPrime { 
		public static void main(String[] args) {
			
			//declare & initialize variables
			boolean prime = true;
			int n = 13;
			
			//check if the given number is divisible by any of previous numbers
		    for (int i=2; i<n; i++ ) {
		    	if (n%i == 0) {
		    		prime = false;
		    	}
		    }
		    
		    //print whether prime or not prime
		    if (prime==true) {
		    	System.out.println("prime");
		    }
		    else {
		    	System.out.println("not prime");
		    }
		
			
		
			}
		}
		
	


