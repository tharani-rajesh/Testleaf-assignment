package week3.day1;

public class OddToUppercase {
	
	public static void main(String[] args) {
		
	
	String Test = "changeme";
	
	//string to character array
	char[] charArray = Test.toCharArray();
	
	//find loop for odd
	for (int i =0;i<charArray.length;i++) {
		
		//check if index is odd
		if(i%2 != 0) {
			
			//to uppercase
			charArray[i]= Character.toUpperCase(charArray[i]);
			
		}
		}
	//change modifier char arr to string
	String result = new String (charArray);
	System.out.println(result);
	}
}
	
	
	
	
	
	
       


