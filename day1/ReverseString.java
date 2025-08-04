package week3.day1;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Testleaf";
		
		System.out.println("Normal String is : " + str );
		String reverseStr = " ";
		
		char ch;
		
		
		for (int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			reverseStr = ch + reverseStr;
		}
			
			System.out.println("Reversed String is : " + reverseStr);
			
		}
				
		
	}


